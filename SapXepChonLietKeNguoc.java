import java.util.Scanner;
import java.util.Vector;

public class SapXepChonLietKeNguoc {
    public static Scanner sc = new Scanner(System.in);

    public static void xuat(int a[], int n) {
        for(int i=0;i<n;i++) System.out.print(a[i]+" ");
    }

    public static void main(String[] args) {
        Vector<String> res = new Vector<String>(); 
        int n = sc.nextInt();
        int a[] = new int [n];
        int idx;
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        for(int i=0;i<n-1;i++){
            idx=i;
            for(int j=i+1;j<n;j++){
                if(a[j]<a[idx]){
                    idx=j;
                }
            }
            int x=a[i];
            a[i]=a[idx];
            a[idx]=x;
            String str = "";
            str +=("Buoc " + (i+1) + ": ");
            for(int k=0;k<n;k++) str+=(a[k]+" ");
            res.add(str);
        }
        for (int i = res.size()-1; i >= 0; i--) {
            System.out.println(res.get(i));
        }
    }
}
