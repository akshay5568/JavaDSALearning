package SlidingWindow;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class CountCompleteSubArrayInAnAray {
    public static void main(String[] args) {
        int [] arr = {1,3,1,2,2};
        int ans = countCompleteSubarrays(arr);
        System.out.println(ans);
    }

    public static int  countCompleteSubarrays(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i : nums){
            if(!hm.containsKey(i)) hm.put(i,1);
            else {
                int temp = hm.get(i);
                hm.put(i,++temp);
            }
        }
        int r =0; int l=0; int count = 0;
        while(r < nums.length){
            if(isValidArray(nums,l,r,hm)){
                count++;
                if(r < nums.length-1){
                    count += (nums.length-1) - r;
                }
                l++;
                continue;
            }
            r++;
        }

        return count;
    }

    public static boolean isValidArray(int [] nums, int r, int e,HashMap<Integer,Integer> hm){
        Set<Integer> set = new HashSet<>();
        for(int i=r; i<=e; i++){
            set.add(nums[i]);
        }
        return hm.size() == set.size();
    }
}
