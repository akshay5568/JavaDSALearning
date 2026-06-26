package Searching.BinarySearch;

public class PractiseBinary {
    public static void main(String[] args) {
        int [] arr = {4,5,6,7,0,1,2};
        int ans = searchs(arr,0);
        System.out.println(ans);
    }

//    static int search(int[] nums, int target) {
//        int start = 0;
//        int end = nums.length-1;
//        while(end >= start){
//            int mid = start + (end - start) / 2;
//            if(nums[mid] == target) return mid;
//            if(nums[mid] > target && nums[start] <= target){
//                end = mid - 1;
//            }else{
//                start = mid + 1;
//            }
//        }
//        return -1;
//    }
    static int searchs(int[] nums, int target) {

        int start = 0;
        int end = nums.length-1;

        while (start <= end){

            int mid = (start + end) / 2;

            if (nums[mid] == target){
                return mid;
            }

            if (nums[start] <= nums[mid]){
                if (target >= nums[start] && target < nums[mid]){
                    end = mid - 1;
                }
                else {
                    start = mid + 1;
                }
            }
            else {
                if (target > nums[mid] && target <= nums[end]){
                    start = mid + 1;
                }
                else{
                    end = mid - 1;
                }
            }

        }

        return -1;

    }
}
