package String;

import java.util.Stack;

public class RemoveStars {
    public static void main(String[] args) {
        String str = "erase*****";
        String ans = removeStars(str);
        System.out.println(ans);
    }

    static String removeStars(String s) {
        Stack <String> st = new Stack<>();
        for(int i=0; i<s.length(); i++){
            if (s.charAt(i) == '*'){
                st.pop();
            }else{
                st.push(String.valueOf(s.charAt(i)));
            }
        }
        StringBuilder str = new StringBuilder();
        System.out.println(st.size());
        while (!st.isEmpty()){
            str.append(st.pop());
        }
        return String.valueOf(str.reverse());
    }
}
