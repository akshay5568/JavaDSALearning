package Recursion.Patterns;

import LinkedList.BaiscLinkedList;
import org.graalvm.collections.EconomicMap;

import java.util.ArrayList;
import java.util.List;

public class LetterCasePurmutation {
    public static void main(String[] args) {
        List<String> ans = letterCasePermutation("3z4");
        System.out.println(ans);
    }

    public static List<String> letterCasePermutation(String s) {
         boolean[] used = new boolean[s.length()];
         Back("",new StringBuilder(s),used,0);
         return new ArrayList<>();
    }

    public static void Back(String p, StringBuilder up,boolean[] used,int start){
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }
        for (int i=start; i<up.length(); i++){
            char ch = up.charAt(i);
            if (Character.isLetter(ch)){
                if (used[i]) {
                    used[i] = true;
                    Back(p+Character.toUpperCase(ch),new StringBuilder(up.substring(0,i)+up.substring(i+1,up.length())),used,i);
                    used[i] = false;
               }else {
                    used[i] = true;
                    Back(p+Character.toLowerCase(ch),new StringBuilder(up.substring(0,i)+up.substring(i+1,up.length())),used,i);
                }
            }else{
                Back(p+ch,new StringBuilder(up.delete(i,i+1)),used,i);
            }
        }
    }

}
