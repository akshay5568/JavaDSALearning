package SlidingWindow;

public class NumOfSubArrays {
    public static void main(String[] args) {
        int [] arr = {11,13,17,23,29,31,7,5,2,3};
        int ans = numOfSubarrays(arr,3,5);
        System.out.println(ans);
    }

    public static int numOfSubarrays(int[] arr, int k, int threshold) {
        int r=0; int l=0;
        int totalSubArrays = 0;
        int count = 0;
        while(r < arr.length){
            while(r < k){
                count += arr[r];
                r++;
            }
            count = (count)/k;
            if(count >= threshold) totalSubArrays++;
            r++;
            count += arr[r];
            count -= arr[l];
            l++;
        }
        return totalSubArrays;
    }
}
