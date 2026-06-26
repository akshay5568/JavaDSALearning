package Recursion.Patterns;

public class Purmetation {
    public static void main(String[] args) {
            String str = "abc";
            purmeutation(str,"");

    }

    static void purmeutation(String str, String st){
            if (str.isEmpty()) {
                System.out.println(st);
                return;
            };
                char ch = str.charAt(0);
                for (int  i=0; i<=st.length(); i++){
                    String first = st.substring(0,i);
                    String sec = st.substring(i);
                    purmeutation(str.substring(1),first + ch + sec);
                }
    }
}
