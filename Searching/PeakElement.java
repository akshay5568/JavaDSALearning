package Searching;

import java.util.Arrays;

public class PeakElement {
    public static void main(String[] args) {
        int [] arr = {4,5,6,7,0,1,2,3};
        int [] arr2 = {7,9,10,11,1,2,3,4,5,6};
        int [] nums = {0,1,2,3,4,5,6,7};    

        int ans =peakElement(arr2);
        System.out.print(ans);
        
    }

    static int peakElement(int [] arr){
        int start = 0;
        int end = arr.length-1;

        while (end > start) {
            if (arr[end] >= arr[start]) {   
                return end;
            }
            int mid = (start + end) / 2;

            if (arr[mid] > arr[start]) {
                start = mid;
            }
            else end = mid - 1;
        }
     return start;
    }
}
