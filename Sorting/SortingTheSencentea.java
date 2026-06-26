package Sorting;

import java.util.Arrays;

public class SortingTheSencentea {
    public static void main(String[] args) {
        String str = "is2 sentence4 This1 a3";
        String ans = sortSentence(str);
        System.out.println(ans);
    }

    static String sortSentence(String s) {
        String [] str = s.split(" ");
        int [] indexes = new int[str.length];
        String ans = "";
        for(int i=0; i<str.length; i++){
            indexes[i] = Integer.parseInt(String.valueOf(str[i].charAt(str[i].length()-1)));
            str[i] = str[i].substring(0,str[i].length()-1);
        }
        for(int j=0; j<str.length; j++){
            for(int k=1; k<str.length; k++){
                if(indexes[k-1] > indexes[k]){
                    String temp = str[k-1];
                    str[k-1] = str[k];
                    str[k] = temp;

                    int tempForint = indexes[k-1];
                    indexes[k-1] = indexes[k];
                    indexes[k] = tempForint;
                }
            }
        }

        for(int p=0; p<str.length; p++){
            for(int j=p; j<p+1; j++){
                ans += str[p];
            }
            ans += " ";
        }
        return ans.trim();
    }

}
