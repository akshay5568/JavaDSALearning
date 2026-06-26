package Arrays;

import java.util.Arrays;

public class DegreeOfAnArray {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,3};
        int ans = findShortestSubArray(arr);
        System.out.println(ans);
    }

    static int findShortestSubArray(int[] nums) {
        int max = -1;
        int element = 0;

        int length = Integer.MAX_VALUE;
        int ans = Integer.MAX_VALUE;
        for(int i=0; i<nums.length; i++){
            int count = 0;
            for (int j=i; j<nums.length; j++){
                if (nums[i] == nums[j]){
                    count++;
                }
            }
            if (max <= count && count != 1){
                max = Math.max(max,count);
                element = nums[i];
                int start = 0;
                int end = nums.length-1;

                while (end >= start){
                    if (nums[start] != element){
                        start++;
                    }
                    else if(nums[end] != element){
                        end--;
                    }
                    else  {
                        break;
                    }
                }
                length = end - start + 1;

                if (count > max) {
                    max = count;
                    ans = length;
                } else if (count == max) {
                    ans = Math.min(ans, length);
                }

            }
        }
        return ans == Integer.MAX_VALUE ? 1 : ans;
    }
}
