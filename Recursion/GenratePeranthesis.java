package Recursion;

import java.util.ArrayList;
import java.util.List;

public class GenratePeranthesis {
    public static void main(String[] args) {
        List<String> list = generateParenthesis(3);
        System.out.println(list);
    }


    /*
    Input: n = 3
    Output: ["((()))","(()())","(())()","()(())","()()()"]
    */

    public static List<String> generateParenthesis(int n) {    
         List<String> ans = new ArrayList<>();
         Rec(n,0,0,"",ans);
         return ans;
    }

    public static void Rec(int n,int opening, int closing,String str,List<String> ans){
        if (str.length() == n * 2) {
            ans.add(str);
            return;
        }
         if (opening < n){
             Rec(n,opening+1,closing,str + "(",ans);
         }
         if (opening > closing){
             Rec(n,opening,closing+1,str + ")",ans);
         }
    }

}
