package String;

import java.util.Arrays;

public class HasSameDigit {
    public static void main(String[] args) {
        int [][]k = new int[9][9];
        System.out.println(Arrays.deepToString(k));
        System.out.println(hasSameDigits("3902"));
    }

    static boolean hasSameDigits(String s) {
        while(s.length() != 2){
            String str = "";
            int temp = 0;
            for(int i=1; i<s.length(); i++){
                temp = (s.charAt(i) - '0') + (s.charAt(i-1) - '0');
                temp = temp % 10;
                str += String.valueOf(temp);
            }
            s = "";
            s += str;
        }

        int a = s.charAt(0);
        int b = s.charAt(1);
        return a == b;
    }
}
