package Recursion;

import javax.swing.event.ListDataListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CombinationSum {
    public static void main(String[] args) {
        int [] candidates= {2,3,6,7};
        List<List<Integer>> ans = combinationSum(candidates,7);
        System.out.println(ans);
    }

    public static  List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        combinationSumRec(candidates,0,target,ans,temp);
        return ans;
    }

    public static void combinationSumRec(int[] candidates,int start,  int target, List<List<Integer>> ans, List<Integer> temp){
        if(target <= 0){
            if(target == 0) {
                ans.add(new ArrayList<>(temp));
            }
            return;
        }

        for(int i=start; i<candidates.length; i++){
            temp.add(candidates[i]);
            target = target - candidates[i];
            combinationSumRec(candidates,i,target,ans,temp);
            target = target + temp.getLast();
            temp.removeLast();
        }
    }
}
