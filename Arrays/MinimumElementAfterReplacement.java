package Arrays;

import java.util.Arrays;

public class MinimumElementAfterReplacement {
    public static void main(String[] args) {
        int [] arr = {10,12,13,14};
        int ans = minElement(arr);
        System.out.println(ans);
    }

    static int minElement(int[] nums) {
        int count = 0;
        for(int i=0; i<nums.length; i++){
            int sumDigit = sumDigits(nums[i]);
            nums[count] = sumDigit;
            count++;
        }

        int min = nums[0];
        for(int j=0; j<nums.length; j++){
            if(min > nums[j]){
                min = nums[j];
            }
        }
        return min;
    }


    static int sumDigits(int digit){
        String str = String.valueOf(digit);
        int ans = 0;
        for(int i=0; i<str.length(); i++){
            ans = ans + str.charAt(i) - '0';
        }
        return ans;
    }
}
