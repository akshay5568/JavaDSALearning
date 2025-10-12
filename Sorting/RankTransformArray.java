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
        int count = 0;
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

        int [] anss = new int [arr.length];
        int a = 1;
        for(int y=0; y<ans.length; y++){
            for(int z=0; z<ans.length; z++){
                if(arr[y] == ans[z]){
                    if (z == 0) {
                        anss[count] = y+1;
                    }
                    anss[count] = y;
                    count++;
                }
            }
        }
        return anss;
    }
}
