package StackAndQueues;

import java.util.ArrayList;
import java.util.List;

public class MinStack {
    public static void main(String[] args) {
        List <Integer> list = new ArrayList<>();
        list.add(7);
        list.add(8);
        System.out.println(list);
        System.out.println(list.indexOf(0));
    }

//
//    List <Integer> list;
//    public MinStack() {
//        list = new ArrayList<>();
//    }
//
//    public void push(int val) {
//        list.add(val);
//    }
//
//    public void pop() {
//        list.remove(list.size()-1);
//    }
//
//    public int top() {
//        return list.get(list.size()-1);
//    }
//
//    public int getMin() {
//        int min = Integer.MAX_VALUE;
//        for(int i=0; i<list.size(); i++){
//            if(list.get(i) < min){
//                min = list.get(i);
//            }
//        }
//        return min;
//    }

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
}
