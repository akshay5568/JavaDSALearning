package String;

import java.util.HashSet;
import java.util.Set;

public class GreatestCommonDivisorString {
    public static void main(String[] args) {
        String str = "ABABAB";
        String ans = gcdOfStrings(str,"ABAB");
        System.out.println(ans);
    }

    static String gcdOfStrings(String str1, String str2) {
        String str = str1 + str2;
        String str3 = str2 + str1;
        if(!(str.equals(str3))){
            return "";
        }

        int gcdLength = GCD(str1.length(),str2.length());

        return str1.substring(0,gcdLength);
    }

    static int GCD(int a, int b){
        if(b == 0) return a;
        return GCD(b, a%b);
    }
}
