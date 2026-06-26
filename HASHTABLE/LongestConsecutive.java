package HASHTABLE;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Hashtable;

public class LongestConsecutive {
    public static void main(String[] args) {
       int [] arr = {1,0,1,2};
       int ans = longestConsecutive(arr);
        System.out.println(ans);
    }

    static int longestConsecutive(int[] nums) {
        HashSet<Integer> h = new HashSet<>();

        for (int num : nums){
            h.add(num);
        }

        System.out.println(h);
        int ans = 0;
        for (int i=0; i<h.size(); i++){
            System.out.println(Arrays.toString(nums));
            System.out.println(nums[i] - 1);
            if (!h.contains(nums[i] - 1)){
                int index = 1;
                int curruntElement = nums[i];
                while (true) {
                     if (h.contains(curruntElement + 1)){
                         curruntElement++;
                         index++;
                     }else{
                         break;
                     }
                }
                ans = Math.max(index,ans);
            }
        }
        return ans;
    }
}
