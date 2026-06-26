package Recursion;

public class SumODDnumbersInArray {
    public static void main(String[] args) {
        int [] nums = {2,3,4,5,6,9};
        int ans = sumODD(nums,0);
        System.out.println(ans);
    }

    static int sumODD(int [] nums, int index){
        if (index == nums.length-1){
             if (nums[index] % 2 != 0){
                 return nums[index];
             }else {
                 return 0;
             }
        }
        if (nums[index] % 2 != 0){
             return nums[index] + sumODD(nums,++index);
        }
        return sumODD(nums,++index);
    }
}
