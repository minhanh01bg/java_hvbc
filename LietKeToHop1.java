import java.util.Scanner;

public class LietKeToHop1 {
    private int i, n, k, a[];
    public static int dem = 0;
    public static Scanner sc = new Scanner(System.in);

    public void Init() {
        this.n = sc.nextInt();
        this.k = sc.nextInt();
        a = new int[n + 1];
        for (int j = 1; j <= this.k; j++)
            a[j] = j;
    }

    public void Result() {
        for (int j = 1; j <= k; j++)
            System.out.print(a[j] + " ");
        System.out.println();
    }

    public void sinhToHop() {
        do {
            dem++;
            Result();
            this.i = this.k;
            while (this.i > 0 && a[i] == this.n - this.k + i)
                --i;
            if (this.i > 0) {
                a[i]++;
                for (int j = i + 1; j <= this.k; j++) {
                    a[j] = a[j - 1] + 1;
                }
            }

        } while (this.i != 0);

    }

    public static void main(String[] agrs) {
        LietKeToHop1 tohop = new LietKeToHop1();
        tohop.Init();
        tohop.sinhToHop();
        System.out.println("Tong cong co " + dem + " to hop");
        System.gc();
    }
}