package StackAndQueues;

import java.util.Stack;

public class ClearDigits {
    public static void main(String[] args) {

    }

    public String clearDigits(String s) {
        Stack <Character> st = new Stack<>();
        for(int i =0; i<s.length(); i++){
            boolean isINT = isDigit(s.charAt(i));
            if(!isINT){
                st.push(s.charAt(i));
            }else{
                if(!st.isEmpty()){
                    st.pop();
                }
            }
        }

        StringBuilder ans = new StringBuilder();
        if(!st.isEmpty()){
            while(!st.empty()){
                ans.append(st.pop());
            }
        }
        return String.valueOf(ans.reverse());
    }

    public boolean isDigit(char str){
        try {
            Integer.parseInt(String.valueOf(str));
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
