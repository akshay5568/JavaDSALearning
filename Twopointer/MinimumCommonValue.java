package Twopointer;

public class MinimumCommonValue {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,6};
        int [] nums2 = {2,3,4,5};
        int ans = getCommon(nums1,nums2);
        System.out.println(ans);
    }

//    static int getCommon(int[] nums1, int[] nums2) {
//        int minValue = Integer.MAX_VALUE;
//        for(int i=0; i<nums1.length; i++){
//            int temp = Integer.MAX_VALUE;
//            for(int j=0; j<nums2.length; j++){
//                if(nums1[i] == nums2[j]){
//                    temp = nums1[i];
//                }
//            }
//            minValue = Math.min(minValue,temp);
//        }
//        return minValue;
//    }


    static int getCommon(int[] nums1, int[] nums2) {
        int minValue = Integer.MAX_VALUE;
        for(int i=0; i<nums2.length; i++){

            int target = nums2[i];
            int start = 0;
            int end = nums1.length-1;

            while(end >= start){
                int mid = start + (end - start) / 2;
                if(nums1[mid] == target){
                    minValue = Math.min(target,minValue);
                    break;
                }
                else if(nums1[mid] > target){
                    end = mid - 1;
                }
                else {
                    start = mid + 1;
                }
            }

        }
        return (minValue == Integer.MAX_VALUE) ? -1 : minValue;
    }
}
