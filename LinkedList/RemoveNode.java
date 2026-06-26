package LinkedList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class RemoveNode {

    static class ListNode{
        int val;
        ListNode next;
        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
        ListNode(){};

   }
    public static void main(String[] args) {
            ListNode l1 = new ListNode(8);
            ListNode temp = l1;
            l1.next = new ListNode(3);
            l1 = l1.next;
            l1.next = new ListNode(13);
            l1 = l1.next;
            l1.next = new ListNode(2);
            l1 = l1.next;
            l1.next = new ListNode(5);
            ListNode ans = removeNodes(temp);
            while (ans != null){
                System.out.println(ans.val);
                ans = ans.next;
            }
    }

    static ListNode removeNodes(ListNode head) {
        Stack<Integer> st = new Stack<>();
        ListNode temp = head;
        while(temp != null){
            if(!st.isEmpty() && temp.val > st.peek()){
                st.pop();
                continue;
            }else{
                st.push(temp.val);
                temp = temp.next;
            }
        }
        System.out.print(st);

        ArrayList<Integer> list = new ArrayList<>();

        while (!st.isEmpty()){
            list.add(st.pop());
        }

        ListNode result = new ListNode();
        head = result;
        for (int i =list.size()-1; i>=0; i--){
            result.next = new ListNode(list.get(i));
            result = result.next;
        }
        System.out.println(st);
        return head.next;
    }
}
