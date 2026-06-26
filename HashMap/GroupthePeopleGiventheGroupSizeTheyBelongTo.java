package HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupthePeopleGiventheGroupSizeTheyBelongTo {
    public static void main(String[] args) {
            int [] arr = {2,2,1,1,1,1,1,1};
            List<List<Integer>> ans = groupThePeople(arr);
        System.out.println(ans);
    }

    static List<List<Integer>> groupThePeople(int[] groupSizes) {
        List<List<Integer>> list = new ArrayList<>();
        HashMap<Integer,List<Integer>> hm = new HashMap<>();

        for(int i=0; i<groupSizes.length; i++){
            if(!hm.containsKey(groupSizes[i])){
                hm.put(groupSizes[i],new ArrayList<>());
            }
            List<Integer> ans = hm.get(groupSizes[i]);
            ans.add(i);

            if(groupSizes[i] == ans.size()){
                list.add(ans);
                hm.remove(groupSizes[i]);
            }
        }
        return list;
    }

}
