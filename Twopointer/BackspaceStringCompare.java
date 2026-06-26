package Twopointer;

import java.util.Stack;

public class BackspaceStringCompare {
    public static void main(String[] args) {
        String s = "#";
        String b = "c#d#";
        boolean ans = backspaceCompare1(s,b);
        System.out.println(ans);
    }

    static boolean backspaceCompare1(String s, String t) {
        StringBuilder st1 = new StringBuilder(s);
        StringBuilder st2 = new StringBuilder(t);


        for(int i=0; i<st1.length(); i++){
            if(st1.charAt(i) == '#'){
                if(0 <= i-1){
                    st1.replace(i-1,i+1,"");
                    i = 0;
                }
            }
        }

        for(int i=0; i<st2.length(); i++){
            if(st2.charAt(i) == '#'){
                if(0 <= i-1){
                    st2.replace(i-1,i+1,"");
                    i = 0;
                }
            }
        }

        return String.valueOf(st1).equals(String.valueOf(st2));
    }



    //In this aproach I used Stack for the simplicity in above code snipit I used Two pointer approach.

    static boolean backspaceCompare(String s, String t) {
        return isValid(s).equals(isValid(t));
    }

    static String isValid(String str){
        Stack<Character> st = new Stack<>();
        for(char i : str.toCharArray()){
            if(i != '#'){
                st.push(i);
            }else if (!st.isEmpty()){
                st.pop();
            }
        }
        return String.valueOf(st);
    }
}
