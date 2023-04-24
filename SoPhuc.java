import java.util.*;

public class SoPhuc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(), d = sc.nextInt();
            int ans1 = a + c;
            int ans2 = b + d;
            // (a+bi)*(ans1+ans2i);
            int ans3 = a * ans1 - b * ans2;
            int ans4 = a * ans2 + b * ans1;
            So C = new So(ans3, ans4);
            System.out.print(C + ", ");
            int ans5 = ans1 * ans1 - ans2 * ans2;
            int ans6 = ans1 * ans2 + ans2 * ans1;
            So D = new So(ans5, ans6);
            System.out.println(D);
        }
        sc.close();
    }
}

class So {
    private int a, b;

    public So(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public String toString() {
        if (b >= 0)
            return a + " + " + b + "i";
        else
            return a + " - " + Math.abs(b) + "i";
    }
}
