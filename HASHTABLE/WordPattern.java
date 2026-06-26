package HASHTABLE;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.Set;

public class WordPattern {
    public static void main(String[] args) {
        String pattern = "abba";
        String s = "dog dog dog dog";
        boolean ans = wordPattern(pattern,s);
        System.out.println(ans);
    }

    static boolean wordPattern(String pattern, String s) {
        String [] str = s.split(" ");
        Hashtable<Character,String> ht = new Hashtable<>();
        Set<Character> list = new HashSet<>();

        for (int i=0; i<str.length; i++){
            if (!ht.containsKey(pattern.charAt(i)) && !ht.containsValue(str[i])){
                ht.put(pattern.charAt(i),str[i]);
            }
            list.add(pattern.charAt(i));
        }

        if (list.size() != ht.size()) return false;


        for(int i=0; i<str.length; i++){
                String temp = ht.get(pattern.charAt(i));
                if (!temp.equals(str[i])){
                    return false;
                }
        }
    return true;
    }
}
