package Arrays;

import java.util.Arrays;

public class FinalArrayState {
    public static void main(String[] args) {
        int [] arr = {1,2};
        int [] ans = getFinalState(arr,3,4);
    }

    static int[] getFinalState(int[] nums, int k, int multiplier) {
        for(int i=1; i<=k; i++){
            int minIndex = minElement(nums);
            nums[minIndex] = nums[minIndex] * multiplier;
            System.out.println(Arrays.toString(nums));
        }
        return nums;
    }

    static int minElement(int [] arr){
        int ans = arr[0];
        int min = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] < ans){
                ans = arr[i];
                min = i;
            }
        }
        return min;
    }
}
