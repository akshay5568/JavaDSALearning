package Strings;

import java.util.Arrays;

public class TowStringArrayAreEqulant {
    public static void main(String[] args) {
        String[] str1 = {"a", "cb"};
        String []str2 = {"ab", "c"};
        boolean ans  = arrayStringsAreEqual(str1,str2);
        System.out.println(ans);
    }

    static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String str1= "";
        String str2 = "";
        for (int i = 0; i <word1.length; i++) {
            str1 += word1[i];
        }
        for (int j = 0; j <word2.length; j++) {
            str2 += word2[j];
        }
        return str2.equals(str1);
    }
}
