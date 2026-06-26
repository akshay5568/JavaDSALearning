package Twopointer;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class NumberOfDistinctAvarage {
    public static void main(String[] args) {
        int [] arr = {9,5,7,8,7,9,8,2,0,7};
        int ans = distinctAverages(arr);
        System.out.println(ans);
    }
    static int distinctAverages(int[] nums) {
        Arrays.sort(nums);
        int i = 0;
        int end = nums.length-1;
        Set<Float> st = new HashSet<>();
        while(end > i){
            float temp = (float) (nums[i] + nums[end]) / 2;
            st.add(temp);
            i++;
            end--;
        }
        return st.size();
    }

}
