package StackAndQueues;

import java.util.Objects;
import java.util.Stack;

public class CrawlerLogFolder {
    public static void main(String[] args) {
        String [] s = {"d1/","../","../","../"};
        int ans = minOperations(s);
        System.out.println(ans);
    }

    static int minOperations(String[] logs) {
        Stack<String> list = new Stack<>();
        for(int i=0; i<logs.length; i++){
            if(Objects.equals(logs[i], "../")){
                if(!list.isEmpty()){
                    list.pop();
                }
            }else if(Objects.equals(logs[i], "./")){
                continue;
            }else{
                list.add(logs[i]);
            }
        }
        return list.size();
    }
}
