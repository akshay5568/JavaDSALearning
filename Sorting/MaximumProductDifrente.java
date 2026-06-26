package Sorting;

public class MaximumProductDifrente {
    public static void main(String[] args) {
        int [] arr = {5,6,2,7,4};
        int asn = maxProductDifference(arr);
        System.out.println(asn);
    }

    static int maxProductDifference(int[] nums) {
        int ans = 0;
        int max = 0;
        int min = 0;
        for(int i=0; i<nums.length; i++){
            for(int j= 1+i; j<nums.length; j++){
                if(nums[i] * nums[j] > max){
                    max = nums[i] * nums[j];
                }
            }
        }
        min = max;
        for(int k=0; k<nums.length; k++){
            for(int j=1+k; j<nums.length; j++){
                if(nums[j] * nums[k] < min){
                    min = nums[j] * nums[k];
                }
            }
        }
        System.out.println(min);
        System.out.println(max);
        ans = max - min;
        return ans;

    }
}
