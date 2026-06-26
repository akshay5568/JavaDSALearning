package String;

import java.util.Arrays;

public class ReversWorkInAString2 {
    public static void main(String[] args) {
            String str = "s'teL ekat edoCteeL tsetnoc";
            String ans = reverseWords(str);
        System.out.println(ans);
    }

    static String reverseWords(String s) {
         String [] word = s.split(" ");
        String ans = "";
         for (int i = 0; i<word.length; i++){
               char[] ch = word[i].toCharArray();
              for (int j = ch.length-1; j>=0; j--){
                  ans += ch[j];
              }
             if (i != word.length-1){
                 ans += " ";
             }
         }
       return ans;
    }
}
