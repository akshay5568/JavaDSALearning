package String;

import java.util.Arrays;

public class ReversWordInString {
    public static void main(String[] args) {
          String s = "a good   example";
          String ans = reverseWords(s);
        System.out.println(ans);
    }

    static String reverseWords(String s) {
        String [] str = s.replaceAll("\\s+", " ").trim().split(" ");
        System.out.println(Arrays.toString(str));
        int end = str.length-1;
        StringBuilder ans = new StringBuilder();
        while(end != -1){
            ans.append(str[end]);
            if(end == 0) break;
            ans.append(" ");
            end--;
        }
        return String.valueOf(ans);
    }
}
