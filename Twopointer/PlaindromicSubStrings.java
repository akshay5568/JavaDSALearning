package Twopointer;

public class PlaindromicSubStrings {
    public static void main(String[] args) {
        String str = "madam";
        int ans = countSubstrings(str);
        System.out.println(ans);
    }

    static int countSubstrings(String s) {
        int ans = 0;
        for(int i=0; i<s.length(); i++){
            int r = i;
            while (r < s.length()){
                String temp = s.substring(i,r+1);
                boolean isPalin = palin(temp);
                if (isPalin) ans++;
                r++;
            }
        }
        return ans;
    }

    static boolean palin(String str){
        int r = 0;
        int l = str.length()-1;
        while(r < l){
            if(str.charAt(r) != str.charAt(l)){
                return false;
            }
            r++;
            l--;
        }
        return true;
    }
}
