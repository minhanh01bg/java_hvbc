import java.util.Scanner;
import java.util.Vector;

public class SapXepNoiBotLietKeNguoc {
    public static Scanner sc = new Scanner(System.in);

    public static boolean check(int a[], int n) {
        for (int i = 0; i < n - 1; i++) {
            if (a[i] > a[i + 1])
                return false;
        }
        return true;
    }

    public static void bbsort(int a[], int n) {
        for (int i = 0; i < n - 1; i++) {
            if (a[i] > a[i + 1]) {
                int x = a[i];
                a[i] = a[i + 1];
                a[i + 1] = x;
            }
        }
    }

    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t > 0) {
            Vector<String> res = new Vector<String>();
            int n = sc.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = sc.nextInt();
            for (int i = 0; i < n; i++) {
                String str = "";
                str += ("Buoc " + (i + 1) + ": ");
                bbsort(a, n);
                for (int k = 0; k < n; k++)
                    str += (a[k] + " ");
                res.add(str);
                if (check(a, n))
                    break;
            }
            for (int i = res.size() - 1; i >= 0; i--) {
                System.out.println(res.get(i));
            }

            t -= 1;
        }

    }
}
