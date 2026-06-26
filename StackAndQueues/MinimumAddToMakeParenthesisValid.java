package StackAndQueues;

import java.util.Stack;

public class MinimumAddToMakeParenthesisValid {
    public static void main(String[] args) {

    }

    static int minAddToMakeValid(String s) {
        Stack<Character> st = new Stack<>();
        int count = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '('){
                st.push(s.charAt(i));
            }
            else if(!st.isEmpty()){
                st.pop();
            }else{
                count++;
            }
        }
        return count + st.size();
    }
}
