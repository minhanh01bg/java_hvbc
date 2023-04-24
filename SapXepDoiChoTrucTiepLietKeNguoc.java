import java.util.Scanner;
import java.util.Vector;

public class SapXepDoiChoTrucTiepLietKeNguoc {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int t = sc.nextInt();
        while (t > 0) {
            Vector<String> res = new Vector<String>();
            int n = sc.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = sc.nextInt();
            for (int i = 0; i < n - 1; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (a[j] < a[i]) {
                        int x = a[i];
                        a[i] = a[j];
                        a[j] = x;
                    }
                }
                String str = "";
                str += ("Buoc " + (i + 1) + ": ");
                for (int k = 0; k < n; k++)
                    str += (a[k] + " ");
                res.add(str);
            }

            for (int i = res.size() - 1; i >= 0; i--) {
                System.out.println(res.get(i));
            }
            t -= 1;
        }
    }

}
