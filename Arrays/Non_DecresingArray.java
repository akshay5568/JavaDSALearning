package Arrays;

public class Non_DecresingArray {
    public static void main(String[] args) {
            int [] arr = {-1,4,3,1};
            boolean ans = checkPossibility(arr);
        System.out.println(ans);
    }

    static boolean checkPossibility(int[] nums) {
        int count = 0;

        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i] > nums[i + 1]) {
                count++;
                if(count > 1) return false;

                if(i == 0 || nums[i - 1] <= nums[i + 1]){
                    nums[i] = nums[i + 1];
                } else {
                    nums[i + 1] = nums[i];
                }
            }
        }

        return true;
    }
}
