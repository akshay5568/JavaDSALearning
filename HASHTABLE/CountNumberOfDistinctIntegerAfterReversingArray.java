package HASHTABLE;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class CountNumberOfDistinctIntegerAfterReversingArray {
    public static void main(String [] args){
        int ans = countDistinctIntegers(new int[] {1,13,10,12,31});
        System.out.println(ans);
    }



    static int countDistinctIntegers(int[] nums) {
        int [] temp = new int[nums.length * 2];
        int index = 0;

        for(int i : nums){
            temp[index] = i;
            index++;
        }

        for(int i=0; i<nums.length; i++){
            if(nums[i] >= 1 && nums[i] <= 9) {
                temp[index] = nums[i];
                index++;
            }else {
                int reversDigit = reversInteger(nums[i]);
                temp[index] = reversDigit;
                index++;
            }
        }
        Set<Integer> set = new HashSet<>();
        for(int i : temp){
            set.add(i);
        }
        return set.size();
    }

    static int reversInteger(int digit){
        String str = String.valueOf(digit);
        StringBuilder str1 = new StringBuilder(str);
        digit = Integer.parseInt(String.valueOf(str1.reverse()));
        return digit;
    }
}
