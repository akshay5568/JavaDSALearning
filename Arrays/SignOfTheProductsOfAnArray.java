package Arrays;

public class SignOfTheProductsOfAnArray {
    public static void main(String[] args) {

    }
        static int arraySign(int[] nums) {
            int x = 0;
            for(int i=0; i<nums.length; i++){
                if(nums[i] == 0){
                    return 0;
                }
                if(nums[i] < 0) x++;
            }
            return x % 2 == 0 ? 1 : -1;
        }
}
