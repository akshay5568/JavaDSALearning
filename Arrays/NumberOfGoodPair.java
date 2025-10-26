package Arrays;

import java.util.Enumeration;

public class NumberOfGoodPair {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7};
        int ans = numIdenticalPairs(arr);
        System.out.println(ans);
    }


        static int numIdenticalPairs(int[] nums) {
            int count = 0;
            for(int i=0; i<nums.length; i++){
                for(int j=1+i; j<nums.length; j++){
                    if(nums[i] == nums[j]){
                        count++;
                    }
                }
            }
            return count;
        }

}
