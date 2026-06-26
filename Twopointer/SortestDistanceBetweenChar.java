package Twopointer;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SortestDistanceBetweenChar {
    public static void main(String[] args) {
            String s = "loveleetcode";
            int [] ans = shortestToChar(s,'e');
        System.out.println(Arrays.toString(ans));
    }

    static int[] shortestToChar(String s, char c) {
        int [] answer = new int[s.length()];

        for(int i=0; i<s.length(); i++){
            int temp = Integer.MAX_VALUE;
            for(int j=0; j<s.length(); j++){
                if(s.charAt(j) == c){
                    temp = Math.min(temp,Math.abs(j - i));
                }
            }
            answer[i] = temp;
        }

        return answer;
    }
}
