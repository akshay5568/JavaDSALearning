package Arrays;

public class MinimumOprationToMakeArraySum {
    public static void main(String[] args) {
        int [] arr = {3,2};
        int ans  = minOperations(arr,6);
        System.out.println(ans);
    }

    static int minOperations(int[] nums, int k) {
        int count = 0;
        boolean ansFind = true;
        while(ansFind) {
            int sumOF = 0;
            for (int j = 0; j < nums.length; j++) {
                sumOF = sum(nums);
                System.out.println(sumOF);
                if (sumOF % k == 0) {
                    break;
                }
                nums[j] = nums[j] - 1;
                count++;
            }
            if (sumOF % k == 0){
                 return count;
            }
        }

        return count;
    }

    static int sum(int [] nums){
        int ans = 0;
        for(int i=0; i<nums.length; i++){
            ans += nums[i];
        }
        return ans;
    }
}
