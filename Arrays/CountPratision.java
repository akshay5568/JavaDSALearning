package Arrays;

public class CountPratision {
    public static void main(String[] args) {
        int arr [] = {10,10,3,7,6};
        int ans = countPartitions(arr);
        System.out.println(ans);
    }

    static int countPartitions(int[] nums) {
        int sum = 0;
        int count = 0;
        for(int i : nums){
            sum += i;
        }

        for(int j=0; j<nums.length-1; j++){
            int temp2 = 0;
            int sum2 = 0;
            for(int i= 0; i<=j; i++){
                temp2 += nums[i];
                sum2 = sum - temp2;
            }
            if((sum2 - temp2) % 2 == 0){
                count++;
            }
        }
        return count;
    }
}
