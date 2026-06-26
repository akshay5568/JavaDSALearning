package Arrays;

public class LongestContinous {
    public static void main(String[] args) {

    }

    static int findLengthOfLCIS(int[] nums) {
        if (nums.length == 0) return 0;

        int ans = 1;
        int count = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] < nums[i]) {
                count++;
            } else {
                count = 1;
            }
            ans = Math.max(ans, count);
        }

        return ans;
    }
}
