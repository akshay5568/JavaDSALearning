package Arrays;

public class SpecialArray {
    public static void main(String[] args) {

    }
    static boolean isArraySpecial(int[] nums) {
        for(int i=0; i<nums.length-1; i++){
            if(nums[i] % 2 == nums[i+1] % 2){
                return false;
            }
        }
        return true;
    }
}
