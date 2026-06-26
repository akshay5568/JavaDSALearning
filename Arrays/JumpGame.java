package Arrays;

public class JumpGame {
    public static void main(String[] args) {
        int [] arr = {2,4,5,3,3,45};
        boolean ans = canJump(arr);
        System.out.println(ans);
    }


    //I already solved this problem but I have to revise again it, therefore I created this file.

    static boolean canJump(int[] nums) {
        if (nums.length == 1) return true;
        int r = 0;
        for (int i=0; i<nums.length; i++){
            if (i > r) return false;
            r = Math.max(r , Math.max(r , nums[i] + i));
            if (r >= nums.length-1) return true;
        }
        return true;
    }
}
