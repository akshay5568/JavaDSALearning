package Twopointer;

public class MinimumLegnthAfterRemovingSubstring {
    public static void main(String[] args) {
        String str = "ABFCACDB";
        int ans = minLength(str);
        System.out.println(ans);
    }

    static int minLength(String s) {
        StringBuilder st = new StringBuilder(s);
        int r = 1;
        int l = 0;
        while(r < st.length()){
            if(st.substring(l,r+1).equals("AB") || st.substring(l,r+1).equals("CD")){
                st.replace(l,r+1,"");
                r = 1;
                l = 0;
                continue;
            }else{
                l++;
                r++;
            }
        }
        return st.length();
    }
}
