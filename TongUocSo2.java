import java.util.*;

public class TongUocSo2 {
    public static boolean check(int n) {
        int k = 0;
        for (int j = 2; j <= Math.sqrt(n); j++) {
            if (n % j == 0) {
                if (j == (n / j))
                    k += j;
                else
                    k += (j + (n / j));
            }
        }
        if (k > n)
            return true;
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        int cnt1 = 0, cnt2 = 0;
        int K = 247545;// count từ 1 đến 1000000
        sc.close();
        if (b - a > 100000) {
            for (int i = 1; i < a; i++)
                if (check(i))
                    cnt1++;
            for (int i = b + 1; i <= 1000000; i++)
                if (check(i))
                    cnt2++;
            K = K - cnt1 - cnt2;
            System.out.print(K);
        } else {
            for (int i = a; i <= b; i++) {
                if (check(i)) {
                    cnt1++;
                }
            }
            System.out.println(cnt1);
        }
    }
}
