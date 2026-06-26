package SlidingWindow;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class FindXSumAllLongKInteger {
    public static void main(String[] args) {
        int [] arr = {1,1,2,2,3,4,2,3};
        int [] ans = findXSum(arr,6,2);
        System.out.println(Arrays.toString(ans));
    }

    static int[] findXSum(int[] nums, int k, int x) {
        int [] ans = new int [nums.length - k + 1];

        int r=k-1;
        int l =0;
        while(r < nums.length){
            int total = sum(nums,l,r);
            ans[l] = total;
            l++; r++;
        }
        return ans;
    }

    static int sum(int [] arr, int l, int r){
        int maxElement = Integer.MIN_VALUE;
        int total = 0;
        TreeMap<Integer,Integer> tt = new TreeMap<>();

        for(int i=l; i<=r; i++){
            if(!tt.containsKey(arr[i])){
                tt.put(arr[i],1);
            }else{
                int temp = tt.get(arr[i]);
                tt.put(arr[i],++temp);
            }
        }

        System.out.println(tt);
        int count = 0;
        for(Map.Entry<Integer,Integer> entry : tt.entrySet()){
            maxElement = Math.max(maxElement,entry.getKey());
            if(entry.getValue() > 1){
                count++;
                total += entry.getValue() * entry.getKey();
            }
        }

        if(!(count > 1)){
            total += maxElement;
        }
        return total;
    }
}
