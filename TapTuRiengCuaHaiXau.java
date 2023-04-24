import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.Scanner;

public class TapTuRiengCuaHaiXau {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t != 0) {
            t -= 1;
            String s1 = sc.nextLine();
            String[] str1 = s1.split(" ");
            String s2 = sc.nextLine();
            String[] str2 = s2.split(" ");
            Set<String> setA = new HashSet<String>();
            for (int i = 0; i < str1.length; i++) {
                boolean check = true;
                for (int j = 0; j < str2.length; j++) {
                    if (str1[i].equals(str2[j])) {
                        check = false;
                        break;
                    }
                }
                if (check == true) {
                    setA.add(str1[i]);
                }
            }
            Iterator<String> iterator = setA.iterator();
            while (iterator.hasNext()) {
                System.out.print((String) iterator.next() + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
