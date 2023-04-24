import java.util.Scanner;
public class DienTichDaGiac {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();
        while (t-- > 0){
            int n=sc.nextInt();
            double[] a=new double[n];
            double[] b=new double[n];
            
            for (int i = 0; i < n; i++) {
                a[i] =sc.nextInt();
                b[i] =sc.nextInt();  
            }
            double s = 0;
            for (int i = 0; i < n - 1; i++)
                s += (a[i] * b[i + 1] - a[i + 1] * b[i]);
            s += (a[n - 1] * b[0] - b[n - 1] * a[0]);
            s = Math.abs(s) / 2;
            System.out.println(String.format("%.3f",s));
        }
        sc.close();
    }    
}
