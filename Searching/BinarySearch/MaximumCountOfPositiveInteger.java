package Searching.BinarySearch;

public class MaximumCountOfPositiveInteger {
    public static void main(String[] args) {
            int [] nums = {-2,-1,-1,1,2,3};
            int ans = maximumCount(nums);
        System.out.println(ans);
    }
//  Lenear approch.
//    static int maximumCount(int[] nums) {
//        int neg = 0;
//        int pos = 0;
//        int index = 0;
//        // for(int i=0; i<nums.length; i++){
//        //     if(nums[i] > 0){
//        //         pos++;
//        //     }
//        //     else if(nums[i] < 0){
//        //         neg++;
//        //     }
//        // }
//        return Math.max(neg,pos);
//    }


    //Binary Search.
    static int maximumCount(int[] nums) {
        int neg = lowerBound(nums);
        int pos = upperBound(nums);
        return Math.max(neg,nums.length - pos);
    }

    static int upperBound(int [] nums){
        int start = 0;
        int end = nums.length-1;
        int index = nums.length;
        while(end >= start){
            int mid = (start + end) / 2;
            if(nums[mid] > 0){
                index = mid;
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return index;
    }

    static int lowerBound(int [] nums){
        int start = 0;
        int end = nums.length-1;
        int index = nums.length;
        while(end >= start){
            int mid = (start + end) / 2;
            if(nums[mid] >= 0){
                index = mid;
                end = mid - 1;
            }else {
                start = mid + 1;
            }
        }
        return index;
    }


}
