package Arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RankTranfformAnArray {
    public static void main(String[] args) {
         int [] arr = {37,12,28,9,100,56,80,5,12};
         int [] ans = arrayRankTransform(arr);
        System.out.println(Arrays.toString(ans));
    }

    static int[] arrayRankTransform(int[] arr) {
        int ans [] = new int [arr.length];

        int [] copySortArr = new int[arr.length];

        System.arraycopy(arr, 0, copySortArr, 0, arr.length);

        Arrays.sort(copySortArr);

        Set<Integer> list = new HashSet<>();

        int rank = 1;
        for(int i=0; i<arr.length; i++){
            int temp =0;
            if (!list.contains(copySortArr[i])){
                for(int j=0; j<arr.length; j++){
                    if(copySortArr[i] == arr[j]){
                        temp++;
                        ans[j] = rank;
                        list.add(arr[j]);
                    }
                }
                rank++;
            }
            if (temp == ans.length) break;
        }
        return ans;
    }
}
