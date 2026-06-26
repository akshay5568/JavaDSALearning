package StackAndQueues;

import java.util.Stack;

public class SimpleyfyPaths {
    public static void main(String[] args) {
        String str =  "/.../a/../b/c/../d/./";
        String ans = simplifyPath(str);
        System.out.println(ans);
    }

    static String simplifyPath(String path) {
        Stack<Character> st = new Stack<>();
        for(int i=0; i<path.length(); i++){
            char temp = '.' + '.';
            if(path.length()-1 != i && path.charAt(i) == '/'){
                if(!st.isEmpty()){
                    if(st.peek() != '/') st.push('/');
                }else{
                    st.push('/');
                }
                continue;
            }
            else if(path.charAt(i) == temp){
                for(int j=0; j<2; j++){
                    if(!st.isEmpty()){
                        st.pop();
                    }
                }
                continue;
            }
            else if(path.charAt(i) == '.') continue;
            st.push(path.charAt(i));
        }
        if(!st.isEmpty()) {
            if(st.peek() == '/') st.pop();
        }
        StringBuilder s = new StringBuilder();

        while(!st.isEmpty()){
            s.append(st.pop());
        }
        s.reverse();
        return String.valueOf(s);
    }
}
