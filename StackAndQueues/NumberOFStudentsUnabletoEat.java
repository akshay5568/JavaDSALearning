package StackAndQueues;

import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;
import java.util.Stack;

public class NumberOFStudentsUnabletoEat {
    public static void main(String[] args) {
        int [] students = {1,1,1,0,0,1};
        int [] sand = {1,0,0,0,1,1};
        int ans = countStudents(students,sand);
        System.out.println(ans);
    }

    static int countStudents(int[] students, int[] sandwiches) {
        Stack<Integer> st = new Stack<>();
        Queue<Integer> qu = new LinkedList<>();
        for(int i=sandwiches.length-1; i>=0; i--){
            st.push(sandwiches[i]);
        }
        for(int i=0; i<students.length; i++){
            qu.add(students[i]);
        }
        while(!qu.isEmpty()){
            if(Objects.equals(st.peek(), qu.peek())){
                st.pop();
                qu.poll();
            }else{
                if (!qu.contains(st.peek())){
                    break;
                }
                int temp = qu.poll();
                qu.add(temp);
            }
        }
        return qu.size();
    }
}
