package Sorting;

import java.util.Arrays;

public class ValidAnagram {
    public static void main(String[] args) {
       String atr = "anagram";
       String str2 = "nagaram";
       boolean ans = isAnagram(atr,str2);
        System.out.println(ans);
    }

    static boolean isAnagram(String s, String t) {
            char ch[] = t.toCharArray();
            char ch2[] = s.toCharArray();

            Arrays.sort(ch);
            Arrays.sort(ch2);

            return Arrays.equals(ch,ch2);


    }
}
