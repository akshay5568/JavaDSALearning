package Recursion.Patterns;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    public static void main(String[] args) {
        int []arr = {2,3,6,7};
        List<List<Integer>> ans = com(arr,7);
        System.out.println(ans);
    }


    static void combination(int index, int [] arr, int target, List<List<Integer>> ans,List<Integer> temp){
            if (index == arr.length){
                if (target == 0){
                    ans.add(new ArrayList<>(temp));
                }
                return;
            }

            if (target >= arr[index]){
                temp.add(arr[index]);
                combination(index,arr,target-arr[index],ans,temp);
                temp.removeLast();
            }
            combination(index+1,arr,target,ans,temp);
    }

    static List<List<Integer>> com(int [] arr, int target){
        List<List<Integer>> ans = new ArrayList<>();
        combination(0,arr,target,ans,new ArrayList<>());
        return ans;
    }
}
