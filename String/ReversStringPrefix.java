package String;

public class ReversStringPrefix {
    public static void main(String[] args) {
        String str= "hey";
        String ans = reversePrefix(str,1);
        System.out.println(ans);
    }

    static String reversePrefix(String s, int k) {
        StringBuilder st = new StringBuilder(s);
        String temp = revers(st.substring(0,k));
        st.replace(0,k,"");
        return temp + String.valueOf(st);
    }

    static String revers(String str){
        int e = str.length()-1;
        StringBuilder st = new StringBuilder();
        while(e != -1){
            st.append(String.valueOf(str.charAt(e)));
            e--;
        }
        return String.valueOf(st);
    }
}
