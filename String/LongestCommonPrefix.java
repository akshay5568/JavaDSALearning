package String;

public class LongestCommonPrefix {
    public static void main(String[] args) {
            String  [] strs = {"flower","flow","flight"};
            String ans = longestCommonPrefix(strs);
        System.out.println(ans);
    }

    static String longestCommonPrefix(String[] strs) {
       String ans = "";
        for (int i = 0; i < strs.length; i++) {
            for (int j=0; j<strs[i].length(); j++){
                if (strs.length > j && strs[j].charAt(j) == strs[j+1].charAt(j)){
                    ans += strs[j].charAt(j);
                }
            }
        }


       return ans;

    }
}
