package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumAbsulouteDiff {
    public static void main(String[] args) {
        int [] arr = {4,3,2,1};
        List<List<Integer>> list = minimumAbsDifference(arr);
        System.out.println(list);
    }

    static List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> list = new ArrayList<>();
        int temp = Integer.MAX_VALUE;
        for(int i=0; i<arr.length-1; i++){
            int diff = arr[i+1] - arr[i];
            if (diff < temp) {
                list.clear();
                temp = diff;
            }

            if(diff == temp){
                List<Integer> list1 = new ArrayList<Integer>();
                temp = arr[i+1] - arr[i];
                list1.add(arr[i]);
                list1.add(arr[i+1]);
                list.add(list1);
            }
        }
        return list;
    }
}
