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
                List <Integer> temp = new ArrayList<>();
                temp.add(i);
                hm.put(groupSizes[i],temp);
            }
            else {
                List <Integer> temp = hm.get(groupSizes[i]);
                temp.add(i);
                hm.put(groupSizes[i],temp);
            }
        }
        System.out.println(hm);
        for(Map.Entry<Integer,List<Integer>> entry : hm.entrySet()){
            List <Integer> temp = entry.getValue();
            System.out.println(temp);
            int count = 0;
            if(temp.size() > entry.getKey()){
                for(int i=0;i<temp.size()/entry.getKey(); i++){
                    List<Integer> ans = new ArrayList<>();
                    for(int j=0; j<3; j++){
                        ans.add(temp.get(count));
                        count++;
                    }
                    System.out.println(ans);
                    list.add(ans);
                    System.out.println(list);
                }
            }else{
                list.add(temp);
                System.out.println(temp);
                System.out.println(list);
            }
        }

        return list;
    }}
