package String;

import java.util.*;

public class GroupAnagrams {
    public static void main(String[] args) {
        String [] arr = {"",""};
        List<List<String>> ans = groupAnagrams(arr);
        System.out.println(ans);
    }

    static List<List<String>> groupAnagrams(String[] strs) {
        Map <String, List<String>> mt = new HashMap<>();

        for (String i : strs){
            char a [] = i.toCharArray();
            Arrays.sort(a);
            String temp = new String(a);
            if (!mt.containsValue(temp)){
                mt.put(temp,new ArrayList<>());
            }
            mt.get(temp).add(i);
        }

        return new ArrayList<>(mt.values());
    }
}
