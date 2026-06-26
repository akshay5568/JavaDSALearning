package Twopointer;

import java.util.Arrays;

public class DIStringMatch {
    public static void main(String[] args) {
        String s = "DII";
        int [] ans = diStringMatch(s);
        System.out.println(Arrays.toString(ans));
    }

    static int[] diStringMatch(String s) {
        int prem [] = new int [s.length() + 1];


        int low = 0;
        int high = s.length();

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == 'I'){
                prem[i] = low++;
            }else{
                prem[i] = high--;
            }
        }
        prem[s.length()] = low;
        return prem;
    }
}
