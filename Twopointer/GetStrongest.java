package Twopointer;

import java.util.Arrays;

public class GetStrongest {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        int [] ans = getStrongest(arr, 2);
        System.out.println(Arrays.toString(ans));
    }

    static int[] getStrongest(int[] arr, int k) {
        Arrays.sort(arr);
        int mid = arr[((arr.length - 1) / 2)];
        int i =0;
        int j = arr.length-1;
        int index = 0;
        int [] ans = new int[k];
        while(k > index){
            if(mid - arr[i] > arr[j] - mid){
                ans[index++] = arr[i++];
            }else{
                ans[index++] = arr[j--];
            }
        }
        return ans;
    }
}
