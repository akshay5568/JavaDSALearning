package Recursion.Patterns;

import java.util.ArrayList;
import java.util.List;

public class PalindromePartitioning {
    public static void main(String[] args) {
        BackTrack("","aab",new ArrayList<>(),0);
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
    public static void BackTrack(String s, String temp, List<String> list,int start){
        if (temp.isEmpty()){
            System.out.println(s);
            System.out.println(list);
            return;
        }
        for (int i=start; i<temp.length(); i++){
            s = s + temp.charAt(i);
            list.add(s);
            BackTrack(s,temp.substring(0,i)+temp.substring(i+1,temp.length()),list,i);
        }
    }
}
