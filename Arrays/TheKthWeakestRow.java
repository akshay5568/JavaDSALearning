package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TheKthWeakestRow {
    public static void main(String[] args) {
        int [] [] arr = {
                {1,1,0,0,0},
                {1,1,1,1,0},
                {1,0,0,0,0},
                {1,1,0,0,0},
                {1,1,1,1,1}
        };
        int [] ans = kWeakestRows(arr,3);
        System.out.println(Arrays.toString(ans));
    }


    static int[] kWeakestRows(int[][] mat, int k) {
        int [] arr = new int[k];
        List<Integer> list = new ArrayList<Integer>();
        for(int i=0; i<mat.length; i++){
            int total = 0;
            for(int j=0; j<mat[i].length; j++){
                total += mat[i][j];
            }
            list.add(total);
        }

        int count = 0;
        System.out.println(list);
        for (int j=0; j<list.size(); j++){
            for(int p=j+1; p<list.size(); j++){
                if (list.get(j) > list.get(p)){
                    arr[count] = list.get(p);
                    count++;
                    if (count == k) return arr;
                }
            }
        }
        return arr;
    }
}
