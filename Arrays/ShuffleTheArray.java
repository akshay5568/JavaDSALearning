package Arrays;

public class ShuffleTheArray {
    public static void main(String[] args) {

    }


        static int[] shuffle(int[] nums, int n) {
            int [] ans = new int [nums.length];
            int index = 0;
            int count = 0;
            for(int i=0; i<nums.length/2; i++){
                ans[index] = nums[count];
                index++;
                ans[index] = nums[n];
                index++;
                n++;
                count++;
            }
            return ans;
    }
}
