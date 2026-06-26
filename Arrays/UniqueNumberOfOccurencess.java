package Arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Hashtable;

public class UniqueNumberOfOccurencess {
    public static void main(String[] args) {
         int [] arr = {1,2,3,3,4};
         boolean ans = uniqueOccurrences(arr);
        System.out.println(ans);
    }

    static boolean uniqueOccurrences(int[] arr) {
        Hashtable <Integer,Integer> ht = new Hashtable<>();
        for(int i : arr){
            ht.put(i,ht.getOrDefault(i,0) + 1);
        }
        HashSet<Integer> set = new HashSet<>(ht.values());
        return ht.size() == set.size();
    }
}
