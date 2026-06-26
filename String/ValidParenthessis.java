package String;

import java.util.Stack;

public class ValidParenthessis {
    public static void main(String[] args) {
        String str= "}";
        boolean ans = isValid(str);
        System.out.println(ans);
    }

    static boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == ')'){
                if(!(st.isEmpty()) && st.peek() == '('){
                    st.pop();
                }else return false;
            }
            else if(s.charAt(i) == ']' ){
                if(!(st.isEmpty()) && st.peek() == '['){
                    st.pop();
                }else return false;
            }
            else if(s.charAt(i) == '}'){
                if(!(st.isEmpty()) && st.peek() == '{'){
                    st.pop();
                }else return false;
            }else {
                st.push(s.charAt(i));
            }
        }
        return st.isEmpty();
    }
}
