package Searching;

//This is basic problem of binary search.
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 5, 87, 98, 104 };
        int target = 1;
        int ans = Binary(arr, target);
        System.out.print(ans);
    }

    static int Binary(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (end >= start) {
            int mid = (start + end) / 2;
            if (target == arr[mid]) {
                return mid;
            }

            else if (arr[mid] > target) {
                end = mid - 1;
            } else
                start = mid + 1;
        }

        return -1;
    }
}
