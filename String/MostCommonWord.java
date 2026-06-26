package String;

import java.util.Arrays;

public class MostCommonWord {
    public static void main(String[] args) {
        String paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.";
        String [] banned = {"hit"};
        String ans = mostCommonWord(paragraph,banned);
        System.out.println(ans);
    }

    static String mostCommonWord(String paragraph, String[] banned) {
        String [] str = paragraph.toLowerCase().split(" ");
        System.out.println(Arrays.toString(str));
        int ans = 0;
        int index = 0;
        for(int i=0; i<str.length; i++ ){
            int temp = 0;
            for(int j=1+i; j<str.length; j++){
                 if(str[j-1].equals(str[j])){
                     for (int k=0; k<banned.length; k++){
                          if (!str[j].equals(banned[k])){
                               temp++;
                          }
                     }
                 }
                 if(temp > ans){
                      ans = temp;
                      index = i;
                 }
            }
        }
        return str[index];
    }
}
