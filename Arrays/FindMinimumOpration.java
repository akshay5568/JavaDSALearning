package Arrays;

public class FindMinimumOpration {
    public static void main(String[] args) {

    }


        static int minimumOperations(int[] nums) {
            int count = 0;
            for(int i=0; i<nums.length; i++){
                if((nums[i] + 1) % 3 == 0){
                    count++;
                }
                else if((nums[i] - 1) % 3 == 0){
                    count++;
                }
            }
            return count;
        }

}
