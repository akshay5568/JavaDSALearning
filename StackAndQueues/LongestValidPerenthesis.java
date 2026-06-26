package StackAndQueues;

import java.util.Stack;

public class LongestValidPerenthesis {
    public static void main(String[] args) {
        String s = "((()()())))";
        int ans = longestValidParentheses(s);
        System.out.println(ans);
    }

    static int longestValidParentheses(String s) {
        Stack<Integer> st = new Stack<>();
        st.push(-1);
        int valid = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '('){
                st.push(i);
                System.out.println(st);
            }
            else{
                st.pop();
                System.out.println(st);
                if(st.isEmpty()){
                    st.push(i);
                }else{
                    valid = Math.max(valid,i - st.peek());
                }
            }
        }
        return valid;
    }
}
