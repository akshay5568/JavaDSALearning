package StackAndQueues;

import java.util.LinkedList;
import java.util.Queue;

public class MyStack {
        private Queue<Integer> e;
        public MyStack() {
            e = new LinkedList<>();
        }

        public void push(int x) {
            e.offer(x);
        }

        public int pop() {
            for(int i=0; i<e.size()-1; i++){
                int temp = e.poll();
                e.offer(temp);
            }
            int pop = e.poll();
            return pop;
        }

        public int top() {
            for(int i=0; i<e.size()-1; i++){
                int temp = e.poll();
                e.offer(temp);
            }
            int pop = e.poll();
            e.offer(pop);
            return pop;
        }

        public boolean empty() {
            return e.isEmpty();
        }

}
