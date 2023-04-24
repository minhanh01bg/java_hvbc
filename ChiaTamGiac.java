import java.util.Scanner;
import java.lang.Math;

public class ChiaTamGiac {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int h = sc.nextInt();
            for (int i = 1; i <= n - 1; i++) {
                Double x = h * Math.sqrt((double) i / n);
                System.out.printf("%.6f ", x);
            }

            System.out.println();
            t -= 1;
        }
    }
}