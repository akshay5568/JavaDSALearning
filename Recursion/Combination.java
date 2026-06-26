package Recursion;

import java.util.ArrayList;
import java.util.List;

public class Combination {
    public static void main(String[] args) {
       List<List<Integer>> ans =  combine(4,4);
        System.out.println(ans);
    }

    public static List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        combineRec(n,k,ans,temp);
        return ans;
    }

    public static void combineRec(int n,int k,List<List<Integer>> ans, List<Integer> temp){
        if (temp.size() == k){
            ans.add(new ArrayList<>(temp));
            System.out.println(ans);
            return;
        }
        for (int i=1; i<=n; i++){
            if (temp.isEmpty()) temp.add(i);
            else {
                if (temp.getLast() < i) temp.add(i);
                else continue;
            };
            combineRec(n,k,ans,temp);
            temp.removeLast();
        }
    }
}
