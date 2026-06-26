package Twopointer;

public class LengthOfLongestSubstring {
    public static void main(String[] args) {
     int ans = lengthOfLongestSubstring("nkjvbskjbvbdsvkvbkbskvbvbdbbvkb");
      System.out.println(ans);
    }

    static int lengthOfLongestSubstring(String s) {
        String str = "";
        int r = 0, l = 0;
        if (!s.isEmpty()){
            s = s.trim();
            if(s.isEmpty()) return 1;
        }
        int longestChar = 0;
        int index = 1;
        while(r < s.length()){
            if(str.contains(String.valueOf(s.charAt(r)))){
                int length = str.length();
                str = str.substring(index,length);
            }else {
                str += s.charAt(r);
                r++;
            }
            longestChar = Math.max(longestChar,str.length());
        }
        return longestChar;
    }
}
