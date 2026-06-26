package Recursion.Patterns;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PalindromePartitioning {
    public static void main(String[] args) {
        List<List<String>> ans = new ArrayList<>();
        BackTrack("aab",new ArrayList<>(),0,ans);
        System.out.println(ans);
    }


//    Input: s = "aab"
//    Output: [["a","a","b"],["aa","b"]]

    public static boolean isPalin(String temp){
        if (temp.isEmpty()) return false;
        int r = 0; int l = temp.length()-1;
        while (l >= r){
            if (temp.charAt(r) != temp.charAt(l)) return false;
            l--; r++;
        }
        return true;
    }
    public static void BackTrack(String temp, List<String> list,int start, List<List<String>> ans){
        if (start == temp.length()){
            System.out.println(list);
            ans.add(new ArrayList<>(list));
            return;
        }
        for (int i=start; i<temp.length(); i++){
            System.out.println("Call Stack" + " " + start);
            String sub = temp.substring(start,i+1);
            if (isPalin(sub)){
                list.add(sub);
                BackTrack(temp,list,i+1,ans);
                list.removeLast();
            }
        }
    }
}
