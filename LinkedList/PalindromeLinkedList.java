package LinkedList;

import Basics.ListNode;

public class PalindromeLinkedList {
    public static void main(String[] args) {
        /**
         * Definition for singly-linked list.
         * public class ListNode {
         *     int val;
         *     ListNode next;
         *     ListNode() {}
         *     ListNode(int val) { this.val = val; }
         *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
         * }
         */
    }

//    static boolean isPalindrome(ListNode head) {
//
//        //First we have to find middile point of the LinkedList. So we used fast and slow pointer techniqe to find middile point of list.
//        ListNode slow = head;
//        ListNode fast = head;
//        while(fast != null && fast.next != null){
//            slow = slow.next;
//            fast = fast.next.next;
//        }
//
//
//        //After find middile node from list we have to revers our half of the list from our middile point so i used that method for to convert list in revers order.
//        ListNode prev = null;
//        ListNode curr = slow;
//        while(curr != null){
//            ListNode temp = curr.next;
//            curr.next = prev;
//            prev = curr;
//            curr = temp;
//        }
//
//        //This is main and last loop of the function it will find our list is in plaindrome order or not?
//        ListNode firstList = head;
//        ListNode secondList = prev;
//        while(secondList != null){
//            if(secondList.val != firstList.val){
//                return false;
//            }
//            firstList = firstList.next;
//            secondList = secondList.next;
//        }
//        return true;
//    }
}
