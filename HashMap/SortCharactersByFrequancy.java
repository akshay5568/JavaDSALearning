package HashMap;

import java.util.*;

public class SortCharactersByFrequancy {
    public static void main(String[] args){
        System.out.println(frequencySort("Aabb"));
    }

    static String frequencySort(String s) {
        Map<Character,Integer> hm = new LinkedHashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<s.length(); i++){
            if(hm.containsKey(s.charAt(i))){
                hm.put(s.charAt(i),1 + hm.get(s.charAt(i)));
            }else {
                hm.put(s.charAt(i),1);
            }
        }

        System.out.println(hm);
        StringBuilder str = new StringBuilder();
        for (Map.Entry<Character,Integer> entry : hm.entrySet()){
            list.add(entry.getValue());
        }

        System.out.println(list);

        Collections.sort(list);

        System.out.println(list);


        for (int i=list.size()-1; i>=0; i--){
            int temp = list.get(i);
            for (Map.Entry<Character,Integer> entry : hm.entrySet()){
                 if (entry.getValue() == temp){
                     for (int j=0; j<temp; j++) str.append(entry.getKey());
                     hm.remove(entry.getKey());
                     break;
                 }
            }
        }
        return String.valueOf(str);
    }
}
