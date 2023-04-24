import java.util.Scanner;

public class DayConLienTiepCoTongBangK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t != 0) {
            t -= 1;
            int n = sc.nextInt();
            long k = sc.nextLong();
            long[] a = new long[n];
            int test = -1;
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
                if (a[i] == 0)
                    test = 0;
            }
            if (k == 0 && test == 0) {
                System.out.println("YES");
                continue;
            } else if (k == 0 && test == -1) {
                System.out.println("NO");
                continue;
            }
            long x = 0;
            int idx = 0;
            boolean check = false;
            for (int i = 0; i < n; i++) {
                x += a[i];
                while (x > k && idx < i) {
                    x -= a[idx++];
                }
                if (x == k) {
                    check = true;
                    break;
                }
            }
            if (check == true)
                System.out.println("YES");
            else
                System.out.println("NO");

        }
        sc.close();
    }
}