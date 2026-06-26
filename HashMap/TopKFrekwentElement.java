package HashMap;

import java.util.*;

public class TopKFrekwentElement {
    public static void main(String[] args) {
        int [] arr = {1,1,1,2,2,3};
        int [] ans = topKFrequent(arr,2);
        System.out.println(Arrays.toString(ans));
    }

    static int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> tt = new HashMap<>();

        for(int i : nums){
            if(!tt.containsKey(i)){
                tt.put(i,1);
            }else{
                int temp = tt.get(i);
                tt.put(i,++temp);
            }
        }

        System.out.println(tt);

        int [] ans = new int [k];
        for (int i=0; i<k; i++){
            int maxElement = Integer.MIN_VALUE;
            int key = 0;
            for (Map.Entry<Integer,Integer> e : tt.entrySet()){
                if (maxElement < e.getValue()){
                    maxElement = e.getValue();
                    key = e.getKey();
                }
            }
            tt.put(key,Integer.MIN_VALUE);
            ans[i] = key;
        }
        return ans;
    }
}
