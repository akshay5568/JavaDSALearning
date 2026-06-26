package HashMap;


import java.util.LinkedHashMap;
import java.util.Map;

public class FindUniqueChart {
    public static void main(String[] args) {
        String st = "kjnsvkdnkjankankandkjadnk";
        int ans = firstUniqChar(st);
        System.out.println(ans);
    }

    static int firstUniqChar(String s) {

        //Before i tried to implement this problem code using loops but i coused some problem in loop implementation.
        // Altough also I have used hasMap but it was not sotring elements in a storing procedure then
        // i found a solution on google in this situation we can use LinkedHashMap it stores value in order that we put.

        Map<Character, Integer> ht = new LinkedHashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (ht.containsKey(s.charAt(i))) {
                int temp = ht.get(s.charAt(i));
                ht.put(s.charAt(i), ++temp);
            } else {
                ht.put(s.charAt(i), 0);
            }
        }
        for (Map.Entry<Character, Integer> list : ht.entrySet()) {
            if (list.getValue() == 0) {
                return s.indexOf(list.getKey());
            }
        }
        return -1;
    }
}
