import java.util.*;

public class ToanLopBa {
    public static char[] n1, n2, n3, op;

    static int gc(char x, int num) {
        if (x == '?')
            return num;
        return x - '0';
    }

    static char gop(char x, int num) {
        if (x == '?') {
            if (num != 0)
                return '+';
            return '-';
        }
        return x;
    }

    static void solve() {
        if (op[0] == '/' || op[0] == '*') {
            System.out.println("WRONG PROBLEM!");
            return;
        }
        for (int i = 1; i < 10; i++) {
            int s1 = gc(n1[0], i);
            for (int j = 0; j < 10; j++) {
                int s2 = s1 * 10 + gc(n1[1], j);
                for (int m = 1; m < 10; m++) {
                    int a1 = gc(n2[0], m);
                    for (int n = 0; n < 10; n++) {
                        int a2 = a1 * 10 + gc(n2[1], n);
                        for (int x = 1; x < 10; x++) {
                            int b1 = gc(n3[0], x);
                            for (int y = 0; y < 10; y++) {
                                int b2 = b1 * 10 + gc(n3[1], y);
                                for (int k = 0; k < 2; k++) {
                                    char oprt = gop(op[0], k);
                                    if (oprt == '+') {
                                        if (s2 + a2 == b2) {
                                            System.out.println(s2 + " + " + a2 + " = " + b2);
                                            return;
                                        }
                                    } else {
                                        if (s2 - a2 == b2) {
                                            System.out.println(s2 + " - " + a2 + " = " + b2);
                                            return;
                                        }
                                    }
                                }
                                b2 -= b2;
                            }
                        }
                        a2 -= a2;
                    }
                }
                s2 -= s2;
            }
        }
        System.out.println("WRONG PROBLEM!");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t != 0) {
            t -= 1;
            String s = sc.nextLine();
            n1 = new char[2];
            n2 = new char[2];
            op = new char[1];
            n3 = new char[2];
            n1[0] = s.charAt(0);
            n1[1] = s.charAt(1);
            op[0] = s.charAt(3);
            n2[0] = s.charAt(5);
            n2[1] = s.charAt(6);
            n3[0] = s.charAt(10);
            n3[1] = s.charAt(11);
            solve();
        }
        sc.close();
    }
}