package Recursion;

import java.util.*;

public class CombinationSum2 {
    public static void main(String[] args) {
        List<List<Integer>> ans = combinationSum2(new int[]{10,1,2,7,6,1,5},8);
        System.out.println(ans);
    }

    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<Integer> temp = new ArrayList<>();
        Set<List<Integer>> remove = new HashSet<>();
        Arrays.sort(candidates);
        combinationSum2Rec(candidates,0,target,remove,temp);
        return new ArrayList<>(remove);
    }



    //Before I was using Set<> to avoids duplicates but that was not efficient therefore, I had to avoids while recursion time. that's why I used an if condition inside loop.

    public static void combinationSum2Rec(int [] candidates, int start, int target,Set<List<Integer>> remove, List<Integer> temp){
        if(target <= 0){
            if(target == 0) {
                System.out.println(temp);
                remove.add(new ArrayList<>(temp));
            };
            return;
        }
        for(int i=start; i<candidates.length; i++){
           if (i != start && candidates[i] == candidates[i-1]) continue;
           temp.add(candidates[i]);
           target = target - candidates[i];
           combinationSum2Rec(candidates,i+1,target,remove,temp);
           target = target + temp.getLast();
           temp.removeLast();
        }
    }
}
