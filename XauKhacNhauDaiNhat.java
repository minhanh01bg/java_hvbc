import java.util.*;

public class XauKhacNhauDaiNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t != 0) {
            t -= 1;
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            int cnt1 = 0, cnt2 = 0;
            for (int i = 0; i < s1.length(); i++) {
                boolean check = true;
                for (int j = 0; j < s2.length(); j++) {
                    if (s1.charAt(i) == s2.charAt(j)) {
                        check = false;
                        break;
                    }
                }
                if (check == true) {
                    cnt1++;
                }
            }
            for (int i = 0; i < s2.length(); i++) {
                boolean check = true;
                for (int j = 0; j < s1.length(); j++) {
                    if (s2.charAt(i) == s1.charAt(j)) {
                        check = false;
                        break;
                    }
                }
                if (check == true) {
                    cnt2++;
                }
            }
            if (cnt1 > cnt2) {
                System.out.println(cnt1);
            } else
                System.out.println(cnt2);
        }
        sc.close();
    }
}