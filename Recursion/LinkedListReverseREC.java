package Recursion;


import java.util.List;

class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }


public class LinkedListReverseREC {
    public static void main(String[] args) {
        ListNode temp = new ListNode(1);
        ListNode head = temp;
        temp.next = new ListNode(2);
        temp = temp.next;
        temp.next = new ListNode(3);
        temp = temp.next;
        temp.next = new ListNode(4);
        temp = temp.next;
        temp.next = new ListNode(5);

        ListNode ans = reverseList(head);
        while (ans != null){
            System.out.println(ans.val);
            ans = ans.next;
        }
    }

    public static ListNode reverseList(ListNode head) {
        ListNode temp = head;
        ListNode prev = null;
        // while(temp != null){
        //     ListNode temp2 = temp.next;
        //     temp.next = prev;
        //     prev = temp;
        //     temp = temp2;
        // }
        prev = RecusiveMethodToReverse(prev,temp);
        head = prev;
        return head;
    }

    public static ListNode RecusiveMethodToReverse(ListNode p,ListNode temp){
        if(temp == null) return p;
        ListNode t2 = temp.next;
        temp.next = p;
        p = temp;
        temp = t2;
        return RecusiveMethodToReverse(p,temp);
    }

}
