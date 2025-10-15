package Arrays;

import java.util.Arrays;

public class ReversSum {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4};
        for (int  i=0; i< arr.length-1; i++){
            if (i > 0) {
                arr[i] = arr[i] + arr[i-1];
            }
        }
        System.out.print(Arrays.toString(arr));
    }
}
