package HashMap;

import java.util.HashMap;
import java.util.Map;

public class FindTheDiffrence {
    public static void main(String[] args) {
        System.out.println(findTheDifference("abcd","abcde"));
    }

    static char findTheDifference(String s, String t) {
        HashMap<Character,Integer> hm = new HashMap<>();
        HashMap<Character,Integer> ht = new HashMap<>();

        for(int i=0; i<s.length(); i++){
            if(hm.containsKey(s.charAt(i))){
                int temp = hm.get(s.charAt(i));
                hm.put(s.charAt(i),++temp);
            }else {
                hm.put(s.charAt(i),0);
            }
        }

        for(int i=0; i<t.length(); i++){
            if(ht.containsKey(t.charAt(i))){
                int temp = ht.get(t.charAt(i));
                ht.put(t.charAt(i),++temp);
            }else {
                ht.put(t.charAt(i),0);
            }
        }

        for(Map.Entry<Character,Integer> entry : ht.entrySet()){
            if(hm.containsKey(entry.getKey())){
                if(hm.get(entry.getKey()) != entry.getValue()){
                    return entry.getKey();
                }
            }else {
                return entry.getKey();
            }
        }
        return '.';
    }
}
