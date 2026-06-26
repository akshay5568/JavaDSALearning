package Arrays;

public class FindDigitIfCanBeWon {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,10};
        boolean ans = canAliceWin(arr);
        System.out.println(ans);
    }

    static boolean canAliceWin(int[] nums) {
        int ans = 0;
        int maxNum = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] < 10){
                ans += nums[i];
            }
            if(nums[i] >= 10){
                maxNum += nums[i];
            }
        }
        return ans != maxNum;
    }
}
