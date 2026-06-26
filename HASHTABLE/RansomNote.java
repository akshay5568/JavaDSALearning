package HASHTABLE;

import java.util.Hashtable;
import java.util.Objects;

public class RansomNote {
    public static void main(String[] args) {
        boolean ans = canConstruct("bg","efjbdfbdgfjhhaiigfhbaejahgfbbgbjagbddfgdiaigdadhcfcj");
        System.out.println(ans);
    }

    static boolean canConstruct(String ransomNote, String magazine) {
        Hashtable<Character,Integer> h = new Hashtable<>();
        Hashtable<Character,Integer> R = new Hashtable<>();

        for(int i =0; i<magazine.length(); i++){
            if(h.containsKey(magazine.charAt(i))){
                int count = h.get(magazine.charAt(i));
                h.put(magazine.charAt(i),++count);
            }else {
                h.put(magazine.charAt(i),1);
            }
        }

        for(int i=0; i<ransomNote.length(); i++){
            if(R.containsKey(ransomNote.charAt(i))){
                int count = R.get(ransomNote.charAt(i));
                R.put(ransomNote.charAt(i),++count);
            }else {
                R.put(ransomNote.charAt(i),1);
            }
        }

        System.out.println(h);
        System.out.println(R);

        for(int i =0; i<ransomNote.length(); i++){
            if( h.get(ransomNote.charAt(i)) == null || !(R.get(ransomNote.charAt(i)) <= h.get(ransomNote.charAt(i)))){
                return false;
            }
        }
        return true;
    }
}
