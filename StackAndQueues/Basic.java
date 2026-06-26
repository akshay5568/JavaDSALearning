package StackAndQueues;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Basic {
    public static void main(String[] args) {
        Stack <Integer> s = new Stack<>();
        Queue<Integer> q = new LinkedList<>();
        s.push(8);
        s.push(7);
        s.push(6);
        s.push(5);
        System.out.println(s);
        System.out.println(s.peek());
        q.add(1);
        q.add(1);
        q.add(0);
        System.out.println(q);
        System.out.println(q.peek());
        System.out.println(q.poll());
        System.out.println(q);
    }
}
