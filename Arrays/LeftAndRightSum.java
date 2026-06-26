package Arrays;

import java.util.Arrays;

public class LeftAndRightSum {
    public static void main(String[] args) {
        int [] arr = {10,4,8,3};
        int [] ans = leftRightDifference(arr);
        System.out.println(Arrays.toString(ans));
    }

    static int[] leftRightDifference(int[] nums) {
        if(nums.length == 1){
            return new int[]{0};
        }
        int [] leftSum = new int[nums.length];
        int [] rightSum = new int[nums.length];
        int count = 1;
        int rightCount = nums.length-2;

        for(int i=0; i<leftSum.length-1; i++){
            leftSum[count] = leftSum[count-1] + nums[i];
            count++;
        }
        for(int j=nums.length-1; j>0; j--){
            rightSum[rightCount] = rightSum[rightCount + 1] + nums[j];
            rightCount--;
        }

        for(int k=0; k<leftSum.length; k++){
            int total = leftSum[k] - rightSum[k];
            if(total >= 0){
                nums[k] = total;
            }else{
                nums[k] = total * -1;
            }
        }
        return nums;
    }
}
