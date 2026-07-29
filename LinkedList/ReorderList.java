package LinkedList;

import java.util.*;

public class ReorderList {
    public static void main(String[] args) {

    }

    public void reorderList(ListNode head) {
        Queue<ListNode> q = new ArrayDeque<>();
        Stack<ListNode> s = new Stack<>();
        ListNode temp = head;
        int size = 0;

        while(temp != null){
            q.add(temp);
            s.push(temp);
            size++;
            temp = temp.next;
        }



        int index = 0;
        ListNode ans = q.poll();
        ListNode ans2 = ans;

        while(index != size){
            if (index % 2 != 0){
                ans2.next = q.poll();
            }else {
                ans2.next = s.pop();
            }
            index++;
            ans2 = ans2.next;
        }
        head = ans;
    }
}
