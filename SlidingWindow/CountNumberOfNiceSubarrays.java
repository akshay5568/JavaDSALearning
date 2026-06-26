package SlidingWindow;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountNumberOfNiceSubarrays {
    public static void main(String[] args) {
        int [] arr = {2,2,2,1,2,2,1,2,2,2};
        int ans = numberOfSubarrays(arr,2);
        System.out.println(ans);
    }


    // Itretaive approach
    static int numberOfSubarrays1(int[] nums, int k) {
        int numberOfSub = 0;
        for(int i=0; i<nums.length; i++){
            List<Integer> list = new ArrayList<>();
            for(int j=i; j<nums.length; j++){
                if(nums[j] % 2 != 0){
                    list.add(nums[j]);
                    if(list.size() > k){
                        break;
                    }
                }

                if (list.size() == k)
                {
                    numberOfSub++;
                }
            }
        }
        return numberOfSub;
    }

    static int numberOfSubarrays(int [] nums, int k){
        int oodnum = 0;
        Map<Integer,Integer> hm = new HashMap<>();
        hm.put(0,1);

        int result = 0;
        for (int num : nums){
            System.out.println(hm);
            if (num % 2 == 1) oodnum++;
            if (hm.containsKey(oodnum - k)){
                result += hm.get(oodnum - k);
            }
            System.out.println(result);
            hm.put(oodnum,hm.getOrDefault(oodnum,0)+1);
            System.out.println(hm);
        }
        return result;
    }
}
