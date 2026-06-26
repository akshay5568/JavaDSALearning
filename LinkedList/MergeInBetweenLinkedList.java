package LinkedList;

public class MergeInBetweenLinkedList {
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
//    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
//        ListNode firstNode = null;
//        ListNode secondNode = null;
//        ListNode temp = list1;
//        ListNode temp1 = list1;
//        for(int i=0; i<a; i++){
//            firstNode = temp;
//            temp = temp.next;
//        }
//        for(int j=0; j<=b; j++){
//            secondNode = temp1;
//            temp1 = temp1.next;
//        }
//        ListNode secondList = list2;
//        while(secondList.next != null){
//            secondList = secondList.next;
//        }
//        firstNode.next = list2;
//        secondList.next = secondNode.next;
//        return list1;
//    }
}

