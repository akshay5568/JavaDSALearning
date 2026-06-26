package HashMap;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicString {
    public static void main(String[] args) {

    }

    //This problem is same as WordPattern problem. But in that problem I used Hashtable and in this problem i used HashMap because it is
    // more faster as compare to hashtable.

    static boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> ht = new HashMap<>();

        for(int i=0; i<s.length(); i++){
            if(!ht.containsKey(s.charAt(i))){
                if(ht.containsValue(t.charAt(i))){
                    for(Map.Entry<Character,Character> entry : ht.entrySet()){
                        if(!entry.getKey().equals(s.charAt(i)) && entry.getValue().equals(t.charAt(i))){
                            return false;
                        }
                    }
                }
                ht.put(s.charAt(i),t.charAt(i));
            }
        }

        for(int i=0; i<t.length(); i++){
            if(ht.get(s.charAt(i)) != t.charAt(i)){
                return false;
            }
        }
        return true;
    }
}
