package Searching.BinarySearch;

import java.util.Arrays;

public class FindFirstAndLastPositionInSortedArray {
    public static void main(String[] args) {
        int [] ans = searchRange(new int[]{5,7,7,8,8,10},8);
        System.out.println(Arrays.toString((ans)));
    }

    static int[] searchRange(int[] nums, int target) {
        int[] result = new int[2];
        result[0] = findFirst(nums, target);
        result[1] = findLast(nums, target);
        return result;
    }

    static int findFirst(int[] nums, int target) {
        int index = -1, low = 0, high = nums.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] >= target) high = mid - 1;
            else low = mid + 1;
            if (nums[mid] == target) index = mid;
        }
        return index;
    }

    static int findLast(int[] nums, int target) {
        int index = -1, low = 0, high = nums.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] <= target) low = mid + 1;
            else high = mid - 1;
            if (nums[mid] == target) index = mid;
        }
        return index;
    }
}
