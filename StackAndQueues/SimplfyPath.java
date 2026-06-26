package StackAndQueues;

import org.graalvm.collections.EconomicMap;

import java.util.Arrays;
import java.util.Stack;

public class SimplfyPath {
    public static void main(String[] args) {
        String path = "/..";
        String ans = simplifyPath2(path);
        System.out.println(ans);
    }


    //Fist I tried this method so solve this LeetCode problem but was unable to solve this with it.
    // Although I had Passed most of the test cases but i was unable to solve entrie this problem;
    static String simplifyPath(String path) {
        int dot = 0;
        Stack<Character> st = new Stack<>();
        for(int i=0; i<path.length(); i++){
            if(path.charAt(i) == '.'){
                dot++;
            }
            if(dot >= 3){
                for(int l=0; l<3; l++){
                    st.push('.');
                }
                dot = 0;
            }

            if(dot == 2){
                while(true){
                    if (st.size() == 1 && st.peek() == '/') break;
                    st.pop();
                    if (st.isEmpty() || st.peek() == '/'){
                        break;
                    }
                }
                dot = 0;
            }

            if(path.charAt(i) == '/'){
                dot = 0;
                if(!st.isEmpty() && st.peek() == '/'){
                    continue;
                }else{
                    st.push('/');
                }
            }
            int a = path.charAt(i);
            if (a >= 97 && a <= 122 || a >= 65 && a<= 90) {
                st.push(path.charAt(i));
            }
        }
        if (st.size() > 2 && st.peek() == '/') st.pop();
        StringBuilder str = new StringBuilder();
        while(!st.isEmpty()){
            str.append(st.pop());
        }
        str.reverse();
        return String.valueOf(str);
    }


    //Then I tried this method to solve this problem that is very good and easy to read.
    static String simplifyPath2(String path) {
        Stack<String> st = new Stack<>();
        String [] parts = path.split("/");

        for (String part : parts){
            if (part.equals("") || part.equals(".")){
                continue;
            }

            if (part.equals("..")){
                if (!st.isEmpty()){
                    st.pop();
                }
            }
            else{
                st.push(part);
            }
        }

        StringBuilder str = new StringBuilder();
        for (String dir : st){
            str.append("/");
            str.append(dir);
        }
        return str.isEmpty() ? "/" : str.toString();
    }
}
