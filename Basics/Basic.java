package Basics;

import java.util.Stack;

public class Basic {
    public static void main(String[] args) {
//        String s = "AsaSs";
//        String ans = makeGood(s);
//        System.out.println(ans);
        StringBuilder st = new StringBuilder("Aditya");
        st.replace(1,2,"5");

        System.out.println(st);

    }

    static String makeGood(String s) {
        Stack<Character> st = new Stack<>();
        for(int i=0; i<s.length(); i++) {
            int temp = s.charAt(i);
            if(temp < 97){
                st.push(s.charAt(i));
            }
        }
        int i=0;
        StringBuilder str = new StringBuilder();

        for(int j=0; j<s.length(); j++){
            str.append(s.charAt(j));
        }

        while(!st.isEmpty()){
            String temp = st.peek().toString().toLowerCase();
            boolean isTrue = false;
            if(str.charAt(i) == temp.charAt(0)){
                int index = str.indexOf(String.valueOf(st.peek()));
                str.delete(i,i+1);
                str.delete(index,index+1);
                st.pop();
                isTrue = true;
                System.out.println(st);
                System.out.println(str);
            }
            if (isTrue){
                i=0;
            }else{
                i++;
            }
        }
        return String.valueOf(str);
    }
}
