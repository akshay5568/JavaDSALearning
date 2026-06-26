package Arrays;

public class CountingNumberOfPairAbsoluteDiff {
    public static void main(String[] args) {
        int [] arr = {3,2,1,5,4};
        int k = 2;
        int ans  =countKDifference(arr,k);
        System.out.println(ans);
    }

    static int countKDifference(int[] nums, int k) {
        int count = 0;
        for(int i=0; i<nums.length; i++){
            for(int j=0+i; j<nums.length; j++){
                if(Math.abs(nums[i] - nums[j]) == k){
                    count++;
                }
            }
        }
        return count;
    }
}
