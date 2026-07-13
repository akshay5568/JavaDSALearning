package StackAndQueues;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class CustomStack {
    private ArrayList<Integer> st;
    private int maxSize = 0;
    public CustomStack(int maxSize) {
        this.maxSize = maxSize;
        st = new ArrayList<>();
    }

    public void push(int x) {
        if(st.size() <= maxSize){
            st.add(x);
        }
    }

    public int pop() {
        if(st.isEmpty()){
            return -1;
        }else {
            int temp = st.getLast();
            st.removeLast();
            return temp;
        }
    }

    public void display(){
        System.out.println(st);
    }

    public void increment(int k, int val) {
        if(st.size() < k){
            for(int i=0; i<st.size(); i++){
                int temp = st.get(i);
                st.add(i,temp+val);
            }
        }else {
            for(int i=0; i<st.size(); i++){
                if(k != i){
                    int temp = st.get(i);
                    st.add(i,temp+val);
                }
            }
        }
    }
}



public class DesignAStackWithAIncrementOpration {
    public static void main(String[] args) {
        CustomStack st = new CustomStack(5);
        st.push(1); st.push(2); st.push(3);
        st.display();
        st.pop();
        st.display();
    }
}
