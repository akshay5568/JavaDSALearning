package Recursion;

import java.util.ArrayList;
import java.util.List;

public class KthLexograpicalStringAllHappyNumbers {
    public static void main(String[] args) {
        String ans = getHappyString(3,9);
        System.out.println(ans);
    }

    public static String getHappyString(int n, int k) {
          List<String> ans = new ArrayList<>();
          getHappyRec("",n,ans);
          return ans.size() < k ? "" : ans.get(k-1);
    }

    public static void getHappyRec(String p, int n, List<String> ans){
        if (p.length() == n){
            ans.add(p);
            System.out.println(p);
            return;
        }
        for (char charAt = 'a'; charAt<='c'; charAt++){
            if (!p.isEmpty() && p.charAt(p.length()-1) == charAt) continue;
            getHappyRec(p+charAt,n,ans);
        }
    }
}
