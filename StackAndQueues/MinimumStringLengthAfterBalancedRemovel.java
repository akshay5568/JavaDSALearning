package StackAndQueues;

import java.util.Stack;

public class MinimumStringLengthAfterBalancedRemovel {
    public static void main(String[] args) {
        String s = "";
        int ans = minLengthAfterRemovals(s);
        System.out.println(ans);
    }

    static int minLengthAfterRemovals(String s) {
        if(s.length() == 1) return s.length();
        if(!s.contains("a")){
            return s.length();
        }
        Stack<Character> st = new Stack<>();
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i) == 'a'){
                st.push(s.charAt(i));
            }
        }
        int length = s.length();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == 'b'){
                if(!st.isEmpty()){
                    st.pop();
                    length = length - 2;
                }
            }
        }
        return length;
    }
}
