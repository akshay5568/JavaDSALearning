package HashMap;

import java.util.HashMap;
import java.util.List;

public class CheckSubArraySum {
    public static void main(String[] args) {
        int [] nums = {23,2,6,4,7};
        System.out.println(checkSubarraySum(nums,6));
    }

    static boolean checkSubarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(0, -1);

        int sum = 0;
        System.out.println(map);
        for (int i = 0; i < nums.length; i++) {

            sum += nums[i];

            int rem = sum % k;

            if (map.containsKey(rem)) {
                System.out.println(map);
                if (i - map.get(rem) >= 2)
                    return true;

            } else {
                map.put(rem, i);
                System.out.println(map);
            }
        }

        return false;
    }

}
