package Recursion;

public class SumOfArraysElements {
    public static void main(String[] args) {
        int [] nums = {2,3,4,5,6,7};
        int ans = sumArrayElement(nums,0);
        System.out.println(ans);
    }

    static int sumArrayElement(int [] nums, int indexPointer){
           if (nums.length == 0) return 0;
           if (indexPointer  == nums.length-1){
               return nums[indexPointer];
           }
           return nums[indexPointer] + sumArrayElement(nums,++indexPointer);
    }
}
