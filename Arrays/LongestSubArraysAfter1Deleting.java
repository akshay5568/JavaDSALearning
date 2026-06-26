package Arrays;

public class LongestSubArraysAfter1Deleting {
    public static void main(String[] args) {
        int [] arr = {1,1,0,1,1};
        int ans = longestSubarray(arr);
        System.out.println(ans);
    }

    static int longestSubarray(int[] nums) {
        int prev = 0;
        int curr = 0;
        int ans = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                curr++;
            } else {
                ans = Math.max(ans, prev + curr);
                prev = curr;
                curr = 0;
            }
        }

        ans = Math.max(ans, prev + curr);

        if (ans == nums.length) return ans - 1;
        return ans;
    }

}
