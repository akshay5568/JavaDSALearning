package Twopointer;

public class AppendCharacterToStringToMakSubsequence {
    public static void main(String[] args) {

    }

    static int appendCharacters(String s, String t) {
        int r = 0;
        int l = 0;
        int count = 0;
        int temp = 0;
        while(r < s.length() && l < t.length()){
            if(s.charAt(r) == t.charAt(l)){
                temp++;
                l++;
                r++;
            }else{
                r++;
            }
            count = Math.max(count,temp);
        }
        return t.length()-count;
    }
}
