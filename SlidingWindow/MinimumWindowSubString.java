package SlidingWindow;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class MinimumWindowSubString {
    public static void main(String[] args) {
        String str = "ADOBECODEBANC";
        String ans = minWindow(str,"ABC");
        System.out.println(ans);
    }

    static String minWindow0(String s, String t) {
        if (t.length() > s.length()) return "";
        int index = 0;

        Hashtable<Character,Integer> ht = new Hashtable<>();

        StringBuilder ans = new StringBuilder(s);
        boolean isLoopStart = false;

        for(int i=0; i<s.length(); i++){
            String temp = s.substring(index,i+1);
            boolean isContains = false;

            for(int j=0; j<t.length(); j++){
                    if(!temp.contains(String.valueOf(t.charAt(j)))){
                        isContains = true;
                        break;
                    }
                    if (!(temp.length() >= t.length())){
                        isContains = true;
                    }
            }

            if(isContains){
               continue;
            }else {
                if (temp.length() <= ans.length()){
                    isLoopStart = true;
                    ans.replace(0,ans.length(),"");
                    ans.append(temp);
                }
                index++;
                i = index;
            }
        }
        if (!isLoopStart) return "";
        return String.valueOf(ans);
    }

    static String minWindow2(String s , String t){
        if (t.length() > s.length()) return "";


        int index = 0;
        StringBuilder str = new StringBuilder(s);

        for(int i=0; i<s.length(); i++){
            Hashtable<Character,Integer> ht = new Hashtable<>();
            boolean isValid = false;

            if (!ht.contains(s.charAt(i))){
                ht.put(s.charAt(i),1);
            }else{
                int temp = ht.get(s.charAt(i));
                ht.put(s.charAt(i),++temp);
            }



            for (int j=0; j<t.length(); j++){
                if (!ht.containsKey(t.charAt(j))){
                    isValid = true;
                    break;
                }
            }

            if (isValid){
                continue;
            }else{
                index++;
                String temp = s.substring(index,i+1);
                if (str.length() >= temp.length()){
                    str.delete(0,str.length());
                    str.append(temp);
                }
                i = index;
            }

        }
        return String.valueOf(str);
    }

        //I have to understand this code.
        static String minWindow(String s, String t) {
            if (s.length() < t.length()) {
                return "";
            }

            Map<Character, Integer> charCount = new HashMap<>();
            for (char ch : t.toCharArray()) {
                charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);
            }

            int targetCharsRemaining = t.length();
            int[] minWindow = {0, Integer.MAX_VALUE};
            int startIndex = 0;

            for (int endIndex = 0; endIndex < s.length(); endIndex++) {
                char ch = s.charAt(endIndex);
                if (charCount.containsKey(ch) && charCount.get(ch) > 0) {
                    targetCharsRemaining--;
                }
                charCount.put(ch, charCount.getOrDefault(ch, 0) - 1);

                if (targetCharsRemaining == 0) {
                    while (true) {
                        char charAtStart = s.charAt(startIndex);
                        if (charCount.containsKey(charAtStart) && charCount.get(charAtStart) == 0) {
                            break;
                        }
                        charCount.put(charAtStart, charCount.getOrDefault(charAtStart, 0) + 1);
                        startIndex++;
                    }

                    if (endIndex - startIndex < minWindow[1] - minWindow[0]) {
                        minWindow[0] = startIndex;
                        minWindow[1] = endIndex;
                    }

                    charCount.put(s.charAt(startIndex), charCount.getOrDefault(s.charAt(startIndex), 0) + 1);
                    targetCharsRemaining++;
                    startIndex++;
                }
            }

            return minWindow[1] >= s.length() ? "" : s.substring(minWindow[0], minWindow[1] + 1);
        }

}
