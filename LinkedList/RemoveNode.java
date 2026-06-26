package LinkedList;

import java.util.ArrayList;
import java.util.Arrays;

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
            ListNode ans = removeNodes(l1);
    }

    static ListNode removeNodes(ListNode head) {
        ArrayList <Integer> list = new ArrayList<>();
        ListNode first = head;
        ListNode second = head.next;
        while(second != null){
            if(second.val >= first.val){
                list.add(second.val);
            }
            second = second.next;
            first = first.next;
        }
        ListNode ans = new ListNode();
        System.out.println(list);
        return head;
    }
}
