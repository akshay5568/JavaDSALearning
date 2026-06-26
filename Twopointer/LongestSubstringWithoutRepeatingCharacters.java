package Twopointer;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        String str = "kjbkbbkbjkbkbjkbugniuyg";
        int ans =lengthOfLongestSubstring(str);
        System.out.println(ans);
    }

    static int lengthOfLongestSubstring(String s) {
        String str = "";
        int r = 0;
        int maxLen = 0;

        while(r < s.length()){
            if (!str.contains(String.valueOf(s.charAt(r)))){
                str += s.charAt(r);
            }else{
                maxLen = Math.max(maxLen,str.length());
                str = "";
                s.substring(0,r-1);
                System.out.println(s);
                r = r-1;
                continue;
            }
            r++;
        }
        return maxLen;
    }
}
