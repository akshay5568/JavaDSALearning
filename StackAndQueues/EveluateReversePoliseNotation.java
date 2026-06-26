package StackAndQueues;

import java.util.Objects;
import java.util.Stack;

public class EveluateReversePoliseNotation {
    public static void main(String[] args) {
        String [] str = {"10","6","9","3","+","-11","*","/","*","17","+","5","+"};
        int ans = evalRPN2(str);
        System.out.println(ans);
    }

    static int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        for(int i=0; i<tokens.length; i++){
            if(!st.isEmpty() && Objects.equals(tokens[i], "+")){
                int a = 0;
                for(int j=0; j<2; j++){
                    int temp =0;
                    if(!st.isEmpty()){
                        temp = st.pop();
                        a += temp;
                    }else{
                        a = a + a;
                        break;
                    }
                }
                st.push(a);
            }else if (!st.isEmpty() && Objects.equals(tokens[i], "*")){
                int a = 1;
                for(int j=0; j<2; j++){
                    int temp = 0;
                    if(!st.isEmpty()){
                        temp = st.pop();
                        a *= temp;
                    }else{
                        a = a * a;
                        break;
                    }
                }
                st.push(a);
            }else if(!st.isEmpty() && Objects.equals(tokens[i], "-")){
                int a = 0;
                int b=  0;
                boolean isBreak = false;
                for(int j=0; j<2; j++){
                    int temp = 0;
                    if(!st.isEmpty()){
                        if(j == 1){
                            temp = st.pop();
                            b = temp;
                        }else{
                            temp = st.pop();
                            a = temp;
                        }
                    }else{
                        isBreak = true;
                    }
                }
                if(isBreak){
                    int sub = a - a;
                    st.push(sub);
                }else{
                    int sub = b - a;
                    st.push(sub);
                }
            }else if (!st.isEmpty() && Objects.equals(tokens[i], "/")){
                int a = 0;
                int b = 0;
                boolean isBreak = false;
                for(int j=0; j<2; j++){
                    int temp = 0;
                    if(!st.isEmpty()){
                        temp = st.pop();
                        if(j == 1){
                            b = temp;
                        }else{
                            a = temp;
                        }
                    }else{
                        isBreak = true;
                        break;
                    }
                }
                if(isBreak){
                    int div = a / a;
                    st.push(div);
                }else{
                    int div = b / a;
                    st.push(div);
                }
            }else{
                st.push(Integer.parseInt(tokens[i]));
            }
        }
        if(!st.isEmpty()){
            return st.pop();
        }else{
            return -1;
        }
    }


    static int evalRPN2(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        for(int i=0; i<tokens.length; i++){
            if(!st.isEmpty() && Objects.equals(tokens[i], "+")){
                int a = st.pop();
                int b = st.pop();
                st.push(a + b);
            }else if (!st.isEmpty() && Objects.equals(tokens[i], "*")){
                int a = st.pop();
                int b = st.pop();
                st.push(a * b);
            }else if(!st.isEmpty() && Objects.equals(tokens[i], "-")){
                int a = st.pop();
                int b= st.pop();
                st.push(b - a);
            }else if (!st.isEmpty() && Objects.equals(tokens[i], "/")){
                int a = st.pop();
                int b = st.pop();
                st.push(b / a);
            }else{
                st.push(Integer.parseInt(tokens[i]));
            }
        }
        if(!st.isEmpty()){
            return st.pop();
        }else{
            return -1;
        }
    }
}
