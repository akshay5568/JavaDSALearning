package Shorting;

import java.util.Arrays;

public class SortArrayByParite2 {
    public static void main(String[] args) {
        int nums[] = {4,2,5,7};
        sortArrayByParityII(nums);
    }

    static void  sortArrayByParityII(int[] nums) {
         int even[] = new int[nums.length/2];
         int odd [] = new int[nums.length/2];
         int counter = 0;
         int oddcounter = 0;
         for (int i=0; i<nums.length; i++){
             if (nums[i] % 2 ==0){
                 even[counter] = nums[i];
                 counter++;
             }else {
                 odd[oddcounter] = nums[i];
                 oddcounter++;
             }
         }
        System.out.print(Arrays.toString(even));
        System.out.println(Arrays.toString(odd));

        int end = nums.length-1;
        for (int j=1; j<nums.length/2; j++){
             nums[j] = even[j];
             nums[j-1] = odd[j-1];
        }

        System.out.println(Arrays.toString(nums));
    }
}
