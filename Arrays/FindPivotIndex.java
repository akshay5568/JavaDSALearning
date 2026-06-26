package Arrays;

public class FindPivotIndex {
    public static void main(String[] args) {
    }

    static int pivotIndex(int[] nums) {
        int left = 0;
        int total = 0;
        int right = 0;
        for(int sum : nums){
            total += sum;
        }

        for(int i=0;i<nums.length; i++){
            right = (total - left - nums[i]);
            if(left == right){
                return i;
            }else {
                left += nums[i];
            }
        }
        return -1;
    }
}
