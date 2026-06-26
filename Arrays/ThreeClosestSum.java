package Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ThreeClosestSum {
    public static void main(String[] args) {
        int [] arr = {0,1,2};
        int ans = threeSumClosest(arr,1);     
        System.out.println(ans);
    }

    static int threeSumClosest(int[] nums, int target) {
        int n = nums.length;
        int ans = nums[0] + nums[1] + nums[2]; // start with first 3 numbers

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    int sum = nums[i] + nums[j] + nums[k];

                    // Compare absolute differences from target
                    if (Math.abs(sum - target) < Math.abs(ans - target)) {
                        ans = sum;
                    }
                }
            }
        }
        return ans;
    }

}
