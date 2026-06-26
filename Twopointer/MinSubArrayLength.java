package Twopointer;

public class MinSubArrayLength {
    public static void main(String[] args) {
        int [] arr = {2,3,1,1,1,1,1};
        int ans = minSubArrayLen(5,arr);
        System.out.println(ans);
    }

    static int minSubArrayLen(int target, int[] nums) {
        // int minLength = Integer.MAX_VALUE;
        // for(int i=0; i<nums.length-1; i++){
        //     if(nums[i] >= target){
        //         minLength = 1;
        //         continue;
        //     }
        //     if((nums[i] + nums[i+1]) >= target){
        //         minLength = Math.min(2,minLength);
        //     }
        // }
        // if(minLength == Integer.MAX_VALUE) return 0;
        // return minLength;

//        int l = 0;
//        int total = 0;
//        for(int i : nums){
//            total += i;
//        }
//
//        while(total > target){
//            total = total - nums[l];
//            l++;
//        }
//
//        return nums.length - l;


        int r = 0,l = 0;
        int total = 0;
        int minLength = Integer.MAX_VALUE;
        boolean isEnter = false;
        while(r < nums.length){
            total += nums[r++];
            if(total >= target) {
                while (total >= target) {
                    isEnter = true;
                    total = total - nums[l];
                    l++;
                }
                minLength = Math.min(minLength, (r - l) + 1);
            }
        }

        if(!isEnter) {
            if(total == target) return nums.length;
            else return 0;
        }
        return minLength;
    }
}
