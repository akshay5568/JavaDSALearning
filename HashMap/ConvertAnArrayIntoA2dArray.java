package HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConvertAnArrayIntoA2dArray {
    public static void main(String[] args) {
        List<List<Integer>> ans = findMatrix(new int[]{8,8,8,8,2,4,4,2,4});
        System.out.println(ans);
    }

    static List<List<Integer>> findMatrix(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i : nums){
            if(!hm.containsKey(i)) hm.put(i,1);
            else {
                int temp = hm.get(i);
                hm.put(i,++temp);
            }
        }

        while (!hm.isEmpty()){
            List<Integer> list = new ArrayList<>();
            List<Integer> toBeRemoved = new ArrayList<>();
            for(Map.Entry<Integer,Integer> entry : hm.entrySet()){
                int temp = hm.get(entry.getKey());
                if(temp == 0){
                    toBeRemoved.add(entry.getKey());
                }else {
                    list.add(entry.getKey());
                    hm.put(entry.getKey(),--temp);
                }
            }
            for (Integer integer : toBeRemoved) {
                hm.remove(integer);
            }
            if (!list.isEmpty()) ans.add(list);
        }
        return ans;
    }

}
