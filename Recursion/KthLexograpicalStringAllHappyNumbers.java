package Recursion;

import java.util.ArrayList;
import java.util.List;

public class KthLexograpicalStringAllHappyNumbers {
    public static void main(String[] args) {
        String ans = getHappyString(3,3);
        System.out.println(ans);
    }

    public static String getHappyString(int n, int k) {
          List<String> ans = new ArrayList<>();
          List<String> temp = new ArrayList<>();
          getHappyRec("","abc",n,ans);
          return ans.size() < k ? "" : ans.get(k);
    }

    public static void getHappyRec(String p, String un, int n, List<String> ans){
        if(p.length() == n){
            ans.add(p);
            System.out.println(ans);
            return;
        }
        for (int i=0; i<un.length(); i++){
            char ch = un.charAt(i);
            getHappyRec(p+ch,un.substring(1),n,ans);
            getHappyRec(p,un.substring(1),n,ans);
        }
    }
}
