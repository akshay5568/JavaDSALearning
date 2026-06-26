package Arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MaxNumberOfKSumPair {
    public static void main(String[] args) {
        int [] nums = {1,2,3,4};
        int ans = maxOperations(nums,5);
        System.out.println(ans);
    }

    static int maxOperations(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;

        for (int num : nums) {
            int target = k - num;

            if (map.getOrDefault(target, 0) > 0) {
                count++;
                map.put(target, map.get(target) - 1);
            } else {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
        }
        return count;
    }


}
