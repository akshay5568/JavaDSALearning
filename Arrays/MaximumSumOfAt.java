package Arrays;

import java.util.*;

public class MaximumSumOfAt {
    public static void main(String[] args) {
        int [] arr = {1,1,1,2,2,2};
        int [] ans = maxKDistinct(arr,6);
        System.out.println(Arrays.toString(ans));
    }

    static int[] maxKDistinct(int[] nums, int k) {
        for(int i=0; i<nums.length; i++){
            for(int j=1; j<nums.length; j++){
                if(nums[j-1] < nums[j]){
                    int temp = nums[j-1];
                    nums[j-1] = nums[j];
                    nums[j] = temp;
                }
            }
        }

        Set<Integer> set = new LinkedHashSet<>();
        for(int l : nums){
            set.add(l);
        }

        List<Integer> list = new ArrayList<Integer>(set);
        int size  = Math.min(k,list.size());
        int [] ans = new int[size];

        for (int j=0; j<size; j++){
            ans[j] = list.get(j);
        }

        return ans;
    }
}
