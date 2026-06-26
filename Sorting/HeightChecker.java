package Sorting;

import java.util.Arrays;

public class HeightChecker {
    public static void main(String[] args) {
        int nums [] = {1,1,4,2,1,3};
        int ans = heightChecker(nums);
        System.out.println(ans);
    }

     static int heightChecker(int[] heights) {
        int [] expected = new int [heights.length];
        int count = 0;
        for(int i=0; i<heights.length; i++){
            expected[i]=heights[i];
        }

        System.out.print(Arrays.toString(expected));

        for(int j=0; j<expected.length-1; j++){
            for(int k=j+1; k>0; k--){
                if(expected[k-1] > expected[k]){
                    int temp = expected[k-1];
                    expected[k-1] = expected[k];
                    expected[k]=temp;
                }

            }
        }

        for(int p=0; p<expected.length; p++){
            if(expected[p] != heights[p]){
                count++;
            }
        }
    return count;
    }
}
