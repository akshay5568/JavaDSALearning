package StackAndQueues;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Basic {
    public static void main(String[] args) {
//        Stack s = new Stack();
//        s.push(4);
//        System.out.println(s.empty());
//        System.out.println(s.size());
//        System.out.println(s);
        Queue q = new LinkedList();
        q.add(4);
        q.offer(7);
        q.poll();
        System.out.println(q);
        boolean ans = q.isEmpty();
        System.out.println(ans);
    }
}
