package Arrays;

import java.util.HashSet;
import java.util.Set;

public class MaximumNumberOfIntegerChoose {
    public static void main(String[] args) {
        int [] arr = {1,6,5};
        int ans = maxCount(arr,5,6);
        System.out.println(ans);
    }

    static int maxCount(int[] banned, int n, int maxSum) {
        Set<Integer> list = new HashSet<>();
        for(int k : banned){
            list.add(k);
        }
        int ans = 0;
        for(int i=1; i<=n; i++){
            if(list.contains(i)) continue;
            if(maxSum - i < 0) return ans;
            maxSum -= i;
            ans++;
//            if(maxSum >= ans){
//                ans++;
//            }else return ans;
        }
        return ans;
    }
}
