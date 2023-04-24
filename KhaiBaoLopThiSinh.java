import java.util.Scanner;

public class KhaiBaoLopThiSinh {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {
        String hoTen = sc.nextLine();
        String ngaySinh = sc.nextLine();
        float tongDiem = 0;
        for (int i = 0; i < 3; i++) {
            String tmp = sc.nextLine();
            float diemMon = Float.parseFloat(tmp);
            tongDiem += diemMon;
        }

        System.out.printf("%s %s %.1f", hoTen, ngaySinh, tongDiem);

    }

}