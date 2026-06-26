package Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MinimumPairRemovaltoSortArrayI {
    public static void main(String[] args) {
        int [] arr = {1,2,2,6,5,4,3,3,5,6,7,5};
        int ans =minimumPairRemoval(arr);
        System.out.println(ans);
    }

    static int minimumPairRemoval(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int count = 0;

        for (int l : nums) list.add(l);


        while (!isSorted(list)){
            int min = Integer.MAX_VALUE;
            int index=0;
            for (int i=0; i<list.size()-1; i++){
                int temp = (int)list.get(i) + (int)list.get(i+1);
                if (temp < min){
                    min = temp;
                    index = i;
                }
            }
            list.remove(index);
            list.remove(index);
            list.add(index,min);
            System.out.println(list);
            count++;
        }
        return count;
    }

    static boolean isSorted(List list){
        for (int i=0; i<list.size()-1; i++){
            if((int)list.get(i) > (int)list.get(i+1)) return false;
        }
        return true;
    }

}
