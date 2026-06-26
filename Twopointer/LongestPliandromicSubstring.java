package Twopointer;

public class LongestPliandromicSubstring {
    public static void main(String[] args) {
        String str = "nakbjakbvbkbaaaaaakbbkkbkbkbk";
        String ans = longestPalindrome(str);
        System.out.println(ans);
    }
//I have to solve this problem enterly.

    static String longestPalindrome2(String s) {
        StringBuilder st = new StringBuilder(s);
        int r = 1;
        int l = 0;
        int maxLength = 0;
        String ans = "";
        while(r < st.length()){
            if(r == st.length()-1){
                l++;
                r = l + 1;
                continue;
            }
            StringBuilder temp = new StringBuilder(st.substring(l, r + 1));
            String isP = isPalin(temp);
            if(!isP.isEmpty()){
                if(maxLength < isP.length()){
                    maxLength = isP.length();
                    ans = isP;
                }
            }
            r++;
        }
        return ans;
    }


    static String longestPalindrome(String s) {
        StringBuilder st = new StringBuilder(s);
        int maxLength = 0;
        String ans = "";
        for(int i=0; i<st.length(); i++){
            for(int j=i+1; j<st.length(); j++){
                StringBuilder temp = new StringBuilder(st.substring(i,j+1));
                String is = isPalin(temp);
                if(!is.isEmpty()){
                    if(is.length() > maxLength){
                        maxLength = is.length();
                        ans = is;
                    }
                }
            }
        }
        return ans;
    }

    static String isPalin(StringBuilder str){
        int i = 0;
        int e = str.length()-1;
        while(e > i){
            if(str.charAt(e) != str.charAt(i)){
                return "";
            }
            i++;
            e--;
        }
        return String.valueOf(str);
    }
}
