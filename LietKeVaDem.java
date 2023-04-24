import java.util.*;

public class LietKeVaDem {

    public static HashMap<String, Integer> sortByValue(HashMap<String, Integer> hm) {
        List<Map.Entry<String, Integer>> list = new LinkedList<Map.Entry<String, Integer>>(hm.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return (o1.getValue()).compareTo(o2.getValue())*-1;
            }
        });
        HashMap<String, Integer> temp = new LinkedHashMap<String, Integer>();
        for (Map.Entry<String, Integer> aa : list) {
            temp.put(aa.getKey(), aa.getValue());
        }
        return temp;
    }

    static boolean checkNumber(String a) {
        for (int i = 0; i < a.length() - 1; i++) {
            if (Integer.valueOf(a.charAt(i)) > Integer.valueOf(a.charAt(i + 1))) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> arr = new HashMap<String, Integer>();
        ArrayList<String> allWord = new ArrayList<String>();
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            if (line.equals("")) {
                break;
            }
            String[] word = line.trim().split("\\s+");
            for (int i = 0; i < word.length; i++) {
                if (checkNumber(word[i]) == true) {
                    allWord.add(word[i]);
                    if (!arr.containsKey(word[i]))
                        arr.put(word[i], 0);
                    arr.put(word[i], arr.get(word[i]) + 1);
                }
            }
        }
        Map<String, Integer> hm = sortByValue(arr);
        // for (String i: allWord) {
        // if (arr.get(i) != 0) {
        // System.out.println(i + " " + arr.get(i));
        // arr.put(i, 0);
        // }
        // }
        for (Map.Entry<String, Integer> en : hm.entrySet()) {
            System.out.println(en.getKey() + " " + en.getValue());
        }
        sc.close();
    }
}
/*
123 321 23456 123 123 23456 3523 123 321 4567 8988 78 7654 9899 3456 123 678
999 78 3456 987654321 4546 63543 4656 13432 4563 123471 659837 454945 34355
9087 9977 98534 3456 23134
 */