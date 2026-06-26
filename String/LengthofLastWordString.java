package String;

import java.util.Arrays;

public class LengthofLastWordString {
    public static void main(String[] args) {
            String str = "   fly me   to   the moon  ";
           int ans = lengthOfLastWord(str);
        System.out.println(ans);
    }

    static int lengthOfLastWord(String s) {
            String word [] = s.split(" ");
            int ans = word[word.length-1].length();
            return ans;
    }
}
