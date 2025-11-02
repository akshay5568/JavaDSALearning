package Arrays;

public class ApplyOprationsToAnArray {
    public static void main(String[] args) {

    }

    static int[] applyOperations(int[] nums) {
        for(int i=0; i<nums.length-1; i++){
            if(nums[i] == nums[i+1]){
                nums[i] = nums[i] * 2;
                nums[i+1] = 0;
            }
        }

        for(int j=0; j<nums.length; j++){
            for(int i=1; i<nums.length; i++){
                if(nums[i-1] == 0){
                    int temp = nums[i-1];
                    nums[i-1] = nums[i];
                    nums[i] = temp;
                }
            }
        }

        return nums;
    }
}
