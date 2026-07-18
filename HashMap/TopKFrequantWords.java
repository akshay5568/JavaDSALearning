package HashMap;

import java.util.*;
import java.util.stream.Collectors;

public class TopKFrequantWords {
    public static void main(String[] args){
        List<String> ans = topKFrequent(new String[]{"i","love","leetcode","i","love","coding"},2);
    }

    static List<String> topKFrequent(String[] words, int k) {
        TreeMap<String,Integer> hm = new TreeMap<>();

        for(int i=0; i<words.length; i++){
            if(hm.containsKey(words[i])){
                hm.put(words[i],hm.get(words[i]) + 1);
            }else {
                hm.put(words[i],1);
            }
        }

        Map<String,Integer> e = hm.entrySet()
                .stream().sorted(Map.Entry.<String, Integer>comparingByValue()
                        .reversed())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue,
                        LinkedHashMap::new // Preserves the descending stream order   
                ));



        List<String> list = new ArrayList<>();

        for(Map.Entry<String,Integer> entry : e.entrySet()){
            if(list.size() < k){
                list.add(entry.getKey());
            }
        }

        return list;
    }
}
