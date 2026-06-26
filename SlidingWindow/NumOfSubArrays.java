package SlidingWindow;

public class NumOfSubArrays {
    public static void main(String[] args) {
        int [] arr = {11,13,17,23,29,31,7,5,2,3};
        int ans = numOfSubarrays(arr,3,5);
        System.out.println(ans);
    }

    public static int numOfSubarrays(int[] arr, int k, int threshold) {
        int r=k; int l=0;
        int totalSubArrays = 0;
        int count = 0;
        for (int i=l; i<r; i++){
            count += arr[i];
        }
        if ((count)/k >= threshold) totalSubArrays++;
        while(r < arr.length){
            count += arr[r];
            r++;
            count -= arr[l];
            l++;
            if ((count)/k >= threshold) totalSubArrays++;
        }
        return totalSubArrays;
    }
}
