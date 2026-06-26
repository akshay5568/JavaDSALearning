package Arrays;

public class AlternatingSum {
    public static void main(String[] args) {

    }

    static int alternatingSum(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }
        int ans = nums[0];
        for(int i=0; i<nums.length; i++){
            if(i > 0 && i % 2 != 0){
                ans = ans - nums[i];
            }
            if(i > 0 && i % 2 == 0){
                ans = ans + nums[i];
            }
        }
        return ans;
    }
}
