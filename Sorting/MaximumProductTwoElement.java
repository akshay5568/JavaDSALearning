package Sorting;

public class MaximumProductTwoElement {
    public static void main(String[] args) {

    }

    static int maxProduct(int[] nums) {
        int ans = 0;
        for(int i=0; i<nums.length; i++){
            for(int j=1+i; j<nums.length; j++){
                if((nums[i] - 1)*(nums[j] - 1) > ans){
                    ans = (nums[i] - 1) * (nums[j] - 1);
                }
            }
        }
        return ans;
    }
}
