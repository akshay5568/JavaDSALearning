package Recursion.Patterns;

import java.util.ArrayList;
import java.util.List;

public class Purmetation {
    public static void main(String[] args) {
            String str = "abc";
//           purmeutation(new int[]{1,2,3},new ArrayList<>(),new boolean[]{false,false,false});
//          boolean[] used = new boolean[str.length()];
            StringPurmutation("",str);
    }


    static void purmeutation(int [] arr, List<Integer> temp, boolean [] used) {
            if (temp.size() >= arr.length) {
                System.out.println(temp);
                return;
            }
            for (int i=0; i<arr.length; i++){
                if (used[i]) continue;
                temp.add(arr[i]);
//                System.out.println("I : "+i + " " + temp);
                used[i] = true;
                purmeutation(arr,temp,used);
                temp.removeLast();
//                System.out.println("I : "+i + " " + temp);
                used[i] = false;
            }
    }

    static void StringPurmutation(String p,String up){
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }
        for (int i=0; i<up.length(); i++){
            StringPurmutation(p+up.charAt(i),up.substring(0,i) + up.substring(i+1,up.length()));
        }
    }
}
