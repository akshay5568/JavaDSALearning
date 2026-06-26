package String;

import java.util.Arrays;

public class TruncateString {
    public static void main(String[] args) {
       String s = "Hello how are you Contestant";
       int k = 4;
       String ans = truncateSentence(s,k);
        System.out.println(ans);
    }

    static String truncateSentence(String s, int k) {
        String [] str = s.split(" ");
       String ans = "";
       if (str.length < k){
           return s;
       }
       for (int i=0; i<k; i++){
           ans += str[i];
           if (i==k-1){
               return ans;
           }
           ans += " ";
       }
       return ans;
    }
}
