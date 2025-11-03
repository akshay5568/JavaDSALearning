package Arrays;

public class NumberOFArithmeticTriplet {
    public static void main(String[] args) {

    }

    static int arithmeticTriplets(int[] nums, int diff) {
        int count = 0;
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                for(int k=1+j; k<nums.length; k++){
                    if(i<j && j < k && nums[j] - nums[i] == diff && nums[k] - nums[j] == diff)           {
                        count++;
                    }
                }
            }
        }
        return count;
    }
}
