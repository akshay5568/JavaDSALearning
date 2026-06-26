package LinkedList;

public class SwappingANodeInALinkedList {
    public static void main(String[] args) {

    }/**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode() {}
     *     ListNode(int val) { this.val = val; }
     *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
//
//    static ListNode swapNodes(ListNode head, int k) {
//        ListNode a = null;
//        ListNode temp = head;
//        int length = 0;
//
//        while(temp != null){
//            length++;
//            temp = temp.next;
//        }
//
//        ListNode temp2 = head;
//        ListNode b = null;
//        ListNode ans = temp2;
//
//        for(int i =1; i<=length; i++){
//            if(i == (length - k) + 1){
//                b = temp2;
//            }
//
//            if(i == k){
//                a = temp2;
//            }
//
//            temp2 = temp2.next;
//        }
//        int tempVal = a.val;
//        a.val = b.val;
//        b.val = tempVal;
//        return head;
//    }
}
