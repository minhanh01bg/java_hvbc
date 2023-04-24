import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class TimTuThuanNghichDaiNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> arr = new HashMap<String, Integer>();
        ArrayList<String> allword = new ArrayList<String>();
        String line;
        Integer count = 0;
        while (sc.hasNextLine()) {
            line = sc.nextLine();
            if (line.equals(""))
                break;
            String[] s1 = line.trim().split("\\s+");
            for (int i = 0; i < s1.length; i++) {
                StringBuilder str = new StringBuilder(s1[i]);
                if (!arr.containsKey(s1[i]) && str.reverse().toString().trim().equals(s1[i].trim()))
                    arr.put(s1[i], 0);

                if (str.toString().trim().equals(s1[i].trim())) {
                    arr.put(s1[i], arr.get(s1[i]) + 1);
                    count = Math.max(count, s1[i].length());
                    allword.add(s1[i]);
                }
            }
        }
        // 1120125

        for (String i : allword) {
            if (i.length() == count && arr.get(i) != 0) {
                System.out.println(i + " " + arr.get(i));
                arr.put(i, 0);
            }
        }
        sc.close();
    }
}
