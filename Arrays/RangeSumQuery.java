package Arrays;

import java.util.Arrays;

public class RangeSumQuery {
    public static void main(String[] args) {

    }
}

class NumArray {
    int [] arr;
    public NumArray(int[] nums) {
        arr = nums;
    }

    public int sumRange(int left, int right) {
        int totalSum = 0;
        for(int i=left; i<=right; i++){
            totalSum += arr[i];
        }
        return totalSum;
    }
}
