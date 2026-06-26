package Recursion.Patterns;

import javax.swing.*;
import java.util.*;

public class LetterCombinationOfAPhoneNumbers {
    public static void main(String[] args) {
        List<String> ans = letterCombinations("236");
        System.out.println(ans);
    }

    public static List<String> letterCombinations(String digits) {
        Map<Character,String> hm = new HashMap<>();
        hm.put('2',"abc"); hm.put('3',"def"); hm.put('4',"ghi"); hm.put('5',"jkl"); hm.put('6',"mno"); hm.put('7',"pqrs"); hm.put('8',"tuv"); hm.put('9',"wxyz");
        System.out.println(hm);
        List<String> ans = new ArrayList<>();
        BackTrackFunction(ans,new StringBuilder(),digits,0,hm);
        return ans;
    }

    public static void BackTrackFunction(List<String> ans, StringBuilder p, String digits,int index,Map<Character,String> hm){
         if(index == digits.length()){
             System.out.println(p);
             ans.add(String.valueOf(p));
             return;
         }

         String ch = hm.get(digits.charAt(index));
         for (char c : ch.toCharArray()){
             p.append(c);
             BackTrackFunction(ans,p,digits,index+1,hm);
             p.deleteCharAt(index);
         }
    }
}
