package HashMap;

import java.util.HashMap;

public class LongestRepeatingCharacterReplacement {
    public static void main(String[] args) {
        System.out.println(characterReplacement("AABABBA",1));
    }

    static int characterReplacement(String s , int k ){
        int l = 0; int maxLength = 0; int result = 0;
        HashMap<Character,Integer> hm = new HashMap<>();

        for (int r=0; r<s.length(); r++){
            char ch = s.charAt(r);
            hm.put(ch,hm.getOrDefault(ch,0) + 1);
            maxLength = Math.max(maxLength, hm.get(ch));

            while ((r - l + 1) - maxLength > k){
                char left = s.charAt(l);
                hm.put(left,hm.get(left) - 1);
                l++;
            }

            result = Math.max(result, r - l + 1);
        }
        return result;
    }
}
