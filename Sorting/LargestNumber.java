
package Sorting;

public class LargestNumber {
    public static void main(String[] args) {
        int [] nums = {10,2};
        String ans = largestNumber(nums);
        System.out.println(ans);
    }

    static String largestNumber(int[] nums) {
        String s = "";
        for(int i = nums.length-1; i>=0; i--){
            s = s + (nums[i]);
        }
        return s;
    }
}