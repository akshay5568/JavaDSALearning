package SlidingWindow;

public class MaxConsecutiveOnes3 {
    public static void main(String[] args) {
        int [] nums = {1,1,1,0,0,0,1,1,1,1,0};
        int ans = longestOnes(nums,2);
        System.out.println(ans);
    }

    public static int longestOnes(int[] nums, int k) {
        int r=0; int l=0; int maxLength = Integer.MIN_VALUE; int zero = 0;
        while (r < nums.length){
            if (nums[r] == 0) zero++;
            if (zero > k){
                while (nums[l] != 0){
                    l++;
                }
                zero--;
                l++;
            }
            if (zero <= k){
                r++;
                maxLength = Math.max(maxLength,(r-l));
            }
        }
        return maxLength;
    }
}
