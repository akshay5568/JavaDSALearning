package String;

import java.util.Arrays;

public class OrderlyQued {
    public static void main(String[] args) {

    }


        static String orderlyQueue(String s, int k) {
            // Case 1: when k == 1 → we can only rotate the string
            if (k == 1) {
                String ans = s;
                for (int i = 1; i < s.length(); i++) {
                    // rotate the string by moving first i characters to the end
                    String rotated = s.substring(i) + s.substring(0, i);
                    // check if this rotation is lexicographically smaller
                    if (rotated.compareTo(ans) < 0) {
                        ans = rotated;
                    }
                }
                return ans;
            }
            // Case 2: when k > 1 → we can sort the characters
            else {
                char[] charArr = s.toCharArray();
                Arrays.sort(charArr);
                String ans = "";
                for (char ch : charArr) {
                    ans += ch; // same building logic you used
                }
                return ans;
            }
    }

}
