package Recursion;

import java.util.Collections;
import java.util.Stack;

public class DecodeString {
    public static void main(String[] args) {
        System.out.println(decodeString("100[leetcode]"));
    }

    public static String decodeString(String s) {
        Stack<Character> ch = new Stack<>();
        Stack<Integer> it = new Stack<>();
        int brackCount = 0;
        StringBuilder ans = new StringBuilder();
        boolean isFirstChars = false;
        int k = 0;


        for (int i=0; i<s.length(); i++){
            if (Character.isDigit(s.charAt(i))){
                if (isFirstChars){
                    while (!ch.isEmpty()){
                        ans.append(ch.pop());
                    }
                    ans.reverse();
                }
                k = k * 10 + Integer.parseInt(String.valueOf(s.charAt(i)));
            }else if (s.charAt(i) == '['){
                it.push(k);
                brackCount++;
            }else if(s.charAt(i) == ']') {
                brackCount--;
                if (brackCount == 0){
                    StringBuilder str= new StringBuilder();
                    while (!it.isEmpty() && !ch.isEmpty()){
                        if (it.size() == 1){
                            while(!ch.isEmpty()){
                               str.append(ch.pop());
                            }
                            str.reverse();
                            for (int j=0; j<it.peek(); j++){
                                ans.append(str);
                            }
                            it.pop();
                        }else{
                            char temp = ch.pop();
                            for (int j=0; j<it.peek();j++){
                                str.append(temp);
                            }
                            it.pop();
                        }
                    }
                }
            }else{
                if (i == 0){
                    isFirstChars = true;
                }
                ch.push(s.charAt(i));
            }
        }
        StringBuilder temp = new StringBuilder();
        while (!ch.isEmpty()){
            temp.append(ch.pop());
        }
        temp.reverse();
        ans.append(temp);
        return String.valueOf(ans);
    }
}
