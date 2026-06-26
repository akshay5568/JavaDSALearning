package StackAndQueues;

import java.util.Stack;

public class RemoveAllAdjcentDupilcatesInString {
    public static void main(String[] args) {
        String str = "abbaca";
        String ans = removeDuplicates(str);
        System.out.println(ans);
    }

    static String removeDuplicates(String s) {
        Stack<Character> ST = new Stack<>();
        StringBuilder str = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            if(ST.isEmpty()){
                ST.push(s.charAt(i));
            }else{
                if(ST.peek() == s.charAt(i)){
                    ST.pop();
                }else{
                    ST.push(s.charAt(i));
                }
            }
        }

        while(!(ST.isEmpty())){
            str.append(ST.pop());
        }
        return String.valueOf(str.reverse());
    }
}
