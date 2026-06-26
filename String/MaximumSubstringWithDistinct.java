package String;

import java.util.HashSet;
import java.util.Set;

public class MaximumSubstringWithDistinct {
    public static void main(String[] args) {
        String s = "abbb";
        int ans = maxDistinct(s);
        System.out.println(ans);
    }

    static int maxDistinct(String s) {
        Set <Character> list = new HashSet<>();
        for(int i=0; i<s.length(); i++){
            list.add(s.charAt(i));
        }
        return list.size();
    }
}
