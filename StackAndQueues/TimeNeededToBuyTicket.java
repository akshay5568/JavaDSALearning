package StackAndQueues;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class TimeNeededToBuyTicket {
    public static void main(String[] args) {
            int [] arr = {2,3,2};
            int ans = timeRequiredToBuy(arr,02);
        System.out.println(ans);
    }
    static int timeRequiredToBuy(int[] tickets, int k) {
        Queue<Integer> q = new LinkedList<>();
        for (int i=0; i<tickets.length; i++) q.add(i);
        int count = 0;
        while(!q.isEmpty()){
            System.out.println(q);
           count++;
           int f = q.poll();
           tickets[f]--;
           if (k == f && tickets[f] == 0) return count;
           if (tickets[f] != 0) q.add(f);
        }
        return count;
    }
}
