package LinkedList;

public class MergeNodesInBetweenZeros {
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

//    public ListNode mergeNodes(ListNode head) {
//        ListNode temp = head.next;
//        int ans = 0;
//        ListNode nodes = new ListNode(ans);
//        ListNode ansWerNode = nodes;
//        while(temp != null){
//            if(temp.val == 0){
//                nodes.next = new ListNode(ans);
//                ans = 0;
//                nodes = nodes.next;
//            }
//            ans += temp.val;
//            temp = temp.next;
//        }
//        return ansWerNode.next;
//    }
}
