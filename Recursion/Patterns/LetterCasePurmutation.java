package Recursion.Patterns;

import LinkedList.BaiscLinkedList;
import org.graalvm.collections.EconomicMap;

import java.util.*;

public class LetterCasePurmutation {
    public static void main(String[] args) {
        List<String> ans = letterCasePermutation("Cc");
        System.out.println(ans);
    }

    public static ArrayList<String> letterCasePermutation(String s) {
         Set<String> ans = new HashSet<>();
         Back("",new StringBuilder(s),ans,0);
         return new ArrayList<>(ans);
    }

    public static void Back(String p, StringBuilder up,Set<String> ans,int start){
        if (p.length() == up.length()){
            ans.add(p);
            System.out.println(ans);
            return;
        }

        for (int i=start; i<up.length(); i++){
             char ch = up.charAt(i);
             Back(p + ch,up,ans,i+1);
             if (Character.isLetter(up.charAt(i))){
                 char temp = up.charAt(i);
                 if (Character.isLowerCase(temp)){
                     p += String.valueOf(temp).toUpperCase();
                     Back(p,up,ans,i+1);
                 }else {
                     p += String.valueOf(temp).toLowerCase();
                     Back(p,up,ans,i+1);
                 }
             }
        }
    }

}
