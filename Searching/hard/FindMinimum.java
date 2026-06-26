package Searching.hard;

public class FindMinimum {
    public static void main(String[] args) {
        int[] nums = {3,1,3};
        int anss = findMinimum(nums);
        System.out.print(anss);

    }

    static int findMinimum(int[] arr) {
            int start = 0;
            int end = arr.length-1;
            while (start < end) {
                int mid = (start + end) / 2;
                if (arr[mid] > arr[end]) {
                    start = mid+1;
                }
                else if (arr[end] > arr[mid]) {
                    end = mid-1;
                }
                else end--;
            }
            return arr[start];

    }
  
}
