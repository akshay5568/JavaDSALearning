package String;

import java.util.Arrays;

public class NumberOfLinesToWriteString {
    public static void main(String[] args) {
        int [] arr = {4,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10};
        String s = "bbbcccdddaaa";
        int [] ans = numberOfLines(arr,s);
        System.out.println(Arrays.toString(ans));
    }

    static int[] numberOfLines(int[] widths, String s) {
        int count = 1;
        int sum = 0;
        for(char c : s.toCharArray()){
            int w = widths[c - 'a'];
            sum += w;
            if(sum > 100){
                count++;
                sum = w;
            }
        }
        return new int [] {count,sum};
    }
}
