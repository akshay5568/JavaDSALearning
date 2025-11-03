package Arrays;

import java.util.Arrays;

public class SumOfVariableLengthArray {
    public static void main(String[] args) {

    }

    static int subarraySum(int[] nums) {
        int ans = 0;
        for(int i=0; i<nums.length; i++){
            if(0 <= i && i < nums.length){
                int start = Math.max(0,i - nums[i]);
                int [] sub = Arrays.copyOfRange(nums,start,i);
                for(int j=0; j<sub.length; j++){
                    ans += sub[j];
                }
            }
            ans += nums[i];
        }
        return ans;
    }
}
