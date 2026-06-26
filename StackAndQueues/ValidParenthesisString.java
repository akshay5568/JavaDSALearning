package StackAndQueues;

import java.util.Stack;

public class ValidParenthesisString {
    public static void main(String[] args) {
    String str = "(*))";
    boolean ans = checkValidString(str);
    System.out.println(ans);
    }

//    static boolean checkValidString(String s) {
//        int count = 0;
//        Stack<Character> st =  new Stack<>();
//
//        for(int i=0; i<s.length(); i++){
//            if(s.charAt(i) == ')' && !st.isEmpty()){
//                st.pop();
//            }else if(s.charAt(i) == '('){
//                st.push(s.charAt(i));
//            }else{
//                count++;
//            }
//        }
//
//        if(st.isEmpty()) return true;
//
//        while(!st.isEmpty()){
//            if(count > 0 && !st.isEmpty()){
//                st.pop();
//                count--;
//            }else{
//                break;
//            }
//        }
//        if(!st.isEmpty() || count > 0) return false;
//        return true;
//    }


    static boolean checkValidString(String s){
        int maxOpen = 0;
        int minOpen = 0;

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '('){
                maxOpen++;
                minOpen++;
            }else if(s.charAt(i) == ')'){
                minOpen--;
                maxOpen--;
            }else {
                minOpen--;
                maxOpen++;
            }


            if(maxOpen < 0){
                return false;
            }

            if(minOpen < 0){
                minOpen = 0;
            }
        }

        return minOpen == 0;
    }
}
