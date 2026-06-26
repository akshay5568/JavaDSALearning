package StackAndQueues;

import java.util.Stack;

public class RemoveOuterMostParrenthesis {
    public static void main(String[] args) {
        String str = "(()())(())(()(()))";
        String ans = removeOuterParentheses(str);
        System.out.println(ans);
    }

    static String removeOuterParentheses(String s) {
        Stack <Character> st = new Stack<>();
        StringBuilder str = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '('){
                st.push(s.charAt(i));
                if(st.size() > 1){
                    str.append(s.charAt(i));
                }
            }
            else{
                if(st.size() > 1){
                    str.append(s.charAt(i));
                }
                st.pop();
            }
        }
        return String.valueOf(str);
    }
}
