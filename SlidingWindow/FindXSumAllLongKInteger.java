package SlidingWindow;

import java.util.*;

public class FindXSumAllLongKInteger {
    public static void main(String[] args) {
        int [] arr = {1,4,4,4};
        int [] ans = findXSum(arr,3,2);
        System.out.println(Arrays.toString(ans));
    }

    static int[] findXSum(int[] nums, int k, int x) {
        int [] ans = new int [nums.length - k + 1];

        if(k == x){
            int r = k-1;
            int l =0;
            int total = 0;
            while(r < nums.length){
                total = 0;
                for(int i=l; i<=r; i++){
                    total += nums[i];
                }
                ans[l] = total;
                l++;
                r++;
            }
            return ans;
        }

        int r=k-1;
        int l =0;
        while(r < nums.length){
            int total = sum(nums,l,r,x);
            ans[l] = total;
            l++; r++;
        }
        return ans;
    }

    static int sum(int [] arr, int l, int r, int x){

        int total = 0;
        HashMap<Integer,Integer> tt = new LinkedHashMap<>();
        List<Integer>  temp = new ArrayList<>();

        for(int i=l; i<=r; i++){
            temp.add(arr[i]);
        }
        Collections.sort(temp);
        System.out.println(temp);

        for(int i=temp.size()-1; i>=0; i--){
            if(!tt.containsKey(temp.get(i))){
                tt.put(temp.get(i),1);
            }else{
                int temp2 = tt.get(temp.get(i));
                tt.put(temp.get(i),++temp2);
            }
        }
        System.out.println(tt);
        int count = 0;

        while (count < x && !tt.isEmpty()){
            int higestValue = Integer.MIN_VALUE;
            int element = 0;
            boolean isTrue = true;
            for (int i=temp.size()-1; i>=0; i--){
                if (tt.containsKey(temp.get(i))){
                    if (higestValue < tt.get(temp.get(i))){
                        higestValue = tt.get(temp.get(i));
                        element = temp.get(i);
                        if (isTrue) {
                            count++;
                            isTrue = false;
                        }
                    }
                }
            }
            tt.remove(element);
            total += element * higestValue;
        }
        return total;
    }

}
