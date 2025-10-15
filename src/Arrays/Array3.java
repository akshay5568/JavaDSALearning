package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class Array3 {
    public static void main(String[] args) {
//         int [] arr = {18,29,38,59,98,100,99,98,90};
//        int start = 0;
//        int end = arr.length - 1;
//        int ans = -1;
//        while(start <= end){
//            int mid = (start + end) / 2;
//            if(arr[mid] <= arr[mid+1]){
//                start = mid + 1;
//            }
//            else if(arr[mid] <= arr[mid-1]){
//                end = mid-1;
//            }
//            else {
//                ans = mid;
//                System.out.print(ans);
//                return;
//            };
//        }
        int [] nums = {2,5,6,0,0,1,2};
        int target = 0;
        boolean ans = false;
        int start = 0;
        int end = nums.length - 1;
        int pivot = pivotFind(nums);

        while(start <= end){
            if(nums[pivot] == target){
                ans = true;
                System.out.print(ans);
            }
            else if(nums[pivot-1] < target){
                end = pivot-1;
            }
            else start = pivot+1;
        }

        ans = false;
        System.out.print(ans);

    }

    static int pivotFind(int [] nums){
        int start = 0;
        int end = nums.length-1;
        int pivot = 0;
        while(start <= end){
            int mid = (start + end) / 2;
            if(nums[mid] < nums[mid-1]){
                end = mid - 1;
            }
            else if(nums[mid+1] > nums[mid]){
                start = mid + 1;
            }
            else pivot = mid;
        }
        return pivot;
    }

}


