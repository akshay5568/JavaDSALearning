package HASHTABLE;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class WordPattern {
    public static void main(String[] args) {
        String pattern = "abba";
        String s = "dog cat cat dog";
        boolean ans = wordPattern(pattern,s);
        System.out.println(ans);
    }

    static boolean wordPattern(String pattern, String s) {

        String [] str = s.split(" ");
        if (str.length != pattern.length()) return false;
        Hashtable<Character,String> ht = new Hashtable<>();

        int index = Math.min(s.length(),pattern.length());

        for (int i=0; i<index; i++){
            if (!ht.containsKey(pattern.charAt(i))){
                if (ht.containsValue(str[i])){
                    for (Map.Entry<Character,String> entry : ht.entrySet()){
                        if (!entry.getKey().equals(pattern.charAt(i)) && entry.getValue().equals(str[i])){
                            return false;
                        }
                    }
                }
                ht.put(pattern.charAt(i),str[i]);
            }
        }

        for(int i=0; i<index; i++){
                String temp = ht.get(pattern.charAt(i));
                if (!temp.equals(str[i])){
                    return false;
                }
        }
    return true;
    }
}
