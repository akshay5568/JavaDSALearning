package SlidingWindow;

public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        String ans = longestPalindrome("cbbd");
        System.out.println(ans);
//        String ans = "abc";
//        System.out.println(ans.substring(1,3));
    }

    static String longestPalindrome(String s) {
        if (s.length() == 1) return s;
        int r=1; int l=0;
        String ans = "";
        String temp = "";
        while(r <= s.length()){
            temp = s.substring(l,r);
            if (isPalin(temp)){
                if(temp.length() > ans.length()){
                    ans = temp;
                }
            }else {
                temp = "";
            }
            if (r == s.length()) l++;
            if (l >= s.length()) break;
            if (r != s.length()){
                r++;
            }
        }
        return ans;
    }

    static boolean isPalin(String str){
        int i = 0;
        int e = str.length()-1;
        while(e > i){
            if(str.charAt(e) != str.charAt(i)){
                return false;
            }
            i++;
            e--;
        }
        return true;
    }
}
