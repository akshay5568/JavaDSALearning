package Twopointer;

public class ReversStringPrefix {
    public static void main(String[] args) {
String s = "abcd";
String ans = reversePrefix(s,2);
        System.out.println(ans);
    }

    static String reversePrefix(String s, int k) {
        StringBuilder st = new StringBuilder(s);
        System.out.println(st);
        StringBuilder temp = st.replace(0,k,"");
        System.out.println(temp);
        temp.reverse();
        System.out.println(temp);
        st.append(temp);
        return String.valueOf(st);
    }
}
