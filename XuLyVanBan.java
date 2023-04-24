import java.util.Scanner;

public class XuLyVanBan {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String s = "";
        while (sc.hasNextLine()) {
            String x = sc.nextLine();
            if (x.equals("")) break;
            s += x;
        }

        String[] res = s.trim().split("\\!|\\?|\\.");

        for (String i : res) {
            i = i.trim().toLowerCase().replaceAll("\\s+", " ");
            System.out.println(Character.toUpperCase(i.charAt(0)) + i.substring(1));
        }
        sc.close();
    }
}
