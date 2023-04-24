import java.util.Scanner;
import java.util.Vector;
import java.util.Collections;

public class SapXepChenLietKeNguoc {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Vector<String> res = new Vector<String>();
        int n = sc.nextInt();
        Vector<Integer> s = new Vector<>();
        int a[] = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();
        for (int i = 0; i < n; i++) {
            s.add(a[i]);
            Collections.sort(s);
            String str = "";
            str += ("Buoc " + i + ": ");
            for (int j = 0; j < s.size(); j++) {
                str += (s.get(j) + " ");
            }
            res.add(str);
        }
        for (int i = res.size() - 1; i >= 0; i--) {
            System.out.println(res.get(i));
        }
    }
}
