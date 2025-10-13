package Sorting;

import java.util.Arrays;

public class RankTransformArray {
    public static void main(String[] args) {
        int [] nums = {40,10,20,30};
        int [] ans  = arrayRankTransform(nums);
        System.out.print(Arrays.toString(ans));
    }

     static int[] arrayRankTransform(int[] arr) {
        int [] ans = new int [arr.length];
        for(int i=0; i<arr.length; i++){
            ans[i] = arr[i];
        }

        for(int o=0; o<ans.length-1; o++){
            for(int j=1+o; j>0; j--){
                if(ans[j-1] > ans[j]){
                    int temp = ans[j-1];
                    ans[j-1] = ans[j];
                    ans[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(ans));

        int [] actualAns = new int[ans.length];
        int count = 0;

        for (int index = 0; index < arr.length; index++) {
            for (int i = 1; i < ans.length; i++) {
                 if (arr[index] == ans[i]) {
                    actualAns[count] = i;
                 }
            }
        }

        return actualAns;


    }
}
