package Recursion.Patterns;

import java.util.ArrayList;
import java.util.List;

public class Purmetation {
    public static void main(String[] args) {
            String str = "cat";
            purmeutation(new int[]{1,2,3},new ArrayList<>(),new boolean[]{false,false,false});
    }

    static void purmeutation(int [] arr, List<Integer> temp, boolean [] used) {
            if (temp.size() >= arr.length) {
                System.out.println(temp);
                return;
            }
            for (int i=0; i<arr.length; i++){
                if (used[i]) continue;
                temp.add(arr[i]);
                used[i] = true;
                purmeutation(arr,temp,used);
                temp.removeLast();
                used[i] = false;
            }
    }
}
