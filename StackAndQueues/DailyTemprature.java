package StackAndQueues;

import java.util.Arrays;
import java.util.Stack;

public class DailyTemprature {
    public static void main(String[] args) {
        int [] arr = {30,40,50,60};
        int [] ans = dailyTemperatures(arr);
        System.out.println(Arrays.toString(ans));
    }

    static int [] dailyTemperatures(int [] temperatures){
        int [] answer = new int[temperatures.length];
        Stack<Integer> st = new Stack<>();

        for (int i=0; i<temperatures.length; i++){
            while (!st.isEmpty() && temperatures[st.peek()] < temperatures[i]){
                answer[st.peek()] = i - st.pop();
            }
            st.push(i);
        }
        return answer;
    }
}
