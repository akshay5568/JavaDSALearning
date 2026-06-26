package SlidingWindow;

import java.util.*;

public class CountGoodSubStrings {
    public static void main(String[] args) {
       String s = "aababcabc";
       int ans = countGoodSubstrings(s);
        System.out.println(ans);
        TreeMap<Integer,Integer> tt = new TreeMap<>();
    }
    // Set <Character> set = new HashSet<>();

    // while(r < s.length()){
    //     set.add(s.charAt(r));
    //     r++; count++;
    //     if(count == 3){
    //         if(set.size() == 3){
    //             goodSub++;
    //             set.remove(s.charAt(l));
    //         }
    //         l++; count--;
    //     }
    // }

    static int countGoodSubstrings(String s) {
        int r = 0; int l =0 ; int goodSub = 0; int count = 0;
        HashMap<Character,Integer> hm = new HashMap<>();


        while(r < s.length()){
            if (!hm.containsKey(s.charAt(r))){
                hm.put(s.charAt(r),1);
            }else{
                int temp = hm.get(s.charAt(r));
                hm.put(s.charAt(r),++temp);
            }
            r++; count++;

            if (count == 3){
                boolean isGoodSub = true;
                for (Map.Entry<Character,Integer> entry : hm.entrySet()){
                    if (entry.getValue() > 1)
                    {
                        isGoodSub = false;
                        break;
                    }
                }
                if (isGoodSub) goodSub++;
                int removeCount = hm.get(s.charAt(l));
                hm.put(s.charAt(l),--removeCount);
                l++; count--;
            }

        }
        return goodSub;
    }
}
