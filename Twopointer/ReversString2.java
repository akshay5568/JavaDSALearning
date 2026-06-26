package Twopointer;

public class ReversString2 {
    public static void main(String[] args) {
        String s = "abjnbkbjbjhbhjhbjbbcdef";
        String ans = reverseStr(s,5);
        System.out.println(ans);
    }

    static String reverseStr(String s, int k) {
        int r = k-1;
        int l = 0;
        StringBuilder st = new StringBuilder(s);
        int count = 1;
        while(r < s.length()){
            StringBuilder rever = new StringBuilder(st.substring(l,r+1)).reverse();
            st.replace(l,r+1, String.valueOf(rever));
            count = count + 2;
            r = count * k - 1;
            l = (count * k) - k;
        }
        if (l < s.length()){
            StringBuilder rever = new StringBuilder(st.substring(l,s.length())).reverse();
            System.out.println(rever);
            st.replace(l,s.length(), String.valueOf(rever));
        }
        return String.valueOf(st);
    }
}
