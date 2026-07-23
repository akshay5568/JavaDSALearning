package Recursion;

import java.util.ArrayList;
import java.util.List;

public class PermutationInString {
    public static void main(String[] args){
        checkInclusion("","sdhbdjhbabc");
    }

    static boolean checkInclusion(String s1, String s2) {
        List<String> list = new ArrayList<>();
        permutation("abc","",list);
        System.out.println(list);
        for (int i=0; i<list.size(); i++)
        {
            if (s2.contains(list.get(i))) {
                return true;
            }
        }
        return false;
    }

    static void permutation(String str,String up,List<String> list){
        if (str.isEmpty()){
            list.add(up);
            return;
        }

        for (int i=0; i<str.length(); i++){
            permutation(str.substring(0,i) + str.substring(i+1,str.length()),up + str.charAt(i),list);
        }
    }
}
