package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SubSet {
    public static void main(String[] args) {
//        sub("","abc");
//        ArrayList<String> ans = subArrayList("","abc");
//        System.out.println(ans);
          List<List<Integer>> ans = new ArrayList<>();
          List<Integer> temp = new ArrayList<>();
          SubSet(new int[]{1,2,2},0,ans,temp);
          System.out.println(ans);
    }

    public static void sub(String p,String up){
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        sub(p+ch,up.substring(1));
        sub(p,up.substring(1));
    }


    static ArrayList<String> subArrayList(String p, String up){
        if (up.isEmpty()){
            ArrayList<String> temp = new ArrayList<>();
            temp.add(p);
            return temp;
        }
         char ch = up.charAt(0);
         ArrayList <String> temp = new ArrayList<>();
         temp.addAll(subArrayList(p+ch,up.substring(1)));
         temp.addAll(subArrayList(p,up.substring(1)));
         return temp;
    }

//    static void SubSetWithArgumentList(String p, String up, List<String> list){
//        if (up.isEmpty()){
//            list.add(p);
//            return;
//        }
//        char ch = up.charAt(0);
//        ArrayList<String> temp = new ArrayList<>();
//        SubSetWithArgumentList(p+ch,up.substring(1),list);
//        SubSetWithArgumentList(p,up.substring(1),list);
//    }

    static void SubSet(int [] nums, int index, List<List<Integer>> ans, List<Integer> temp){
        if (index >= nums.length){
            ans.add(new ArrayList<>(temp));
            System.out.println(ans);
            return;
        }
        temp.add(nums[index]);
        SubSet(nums,index+1,ans,temp);
        temp.removeLast();
        SubSet(nums,index+1,ans,temp);
    }





}
