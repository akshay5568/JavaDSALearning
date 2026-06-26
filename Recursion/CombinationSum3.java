package Recursion;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum3 {
    public static void main(String[] args) {
        List<List<Integer>> ans = combinationSum3(3,7);
        System.out.println(ans);
    }

    public static List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        combinationSum3Rec(ans,temp,k,n);
        return ans;
    }

    public static void combinationSum3Rec(List<List<Integer>> ans,List<Integer> temp, int k, int n){
        if(temp.size() == k){
            int sum = 0;
            for(int i=0; i<temp.size(); i++) sum += temp.get(i);
            if(sum == n) {
                ans.add(new ArrayList<>(temp));
                System.out.println(ans);
            }
            return;
        }

        for(int i=1; i<=9; i++){
            if(temp.isEmpty()) temp.add(i);
            else {
                if(temp.getLast() < i) temp.add(i);
                else continue;
            }
            combinationSum3Rec(ans,temp,k,n);
            temp.removeLast();
        }
    }
}
