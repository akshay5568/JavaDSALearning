package LinkedList;

public class InsertGreatestCommenDviseber {
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

//    public ListNode insertGreatestCommonDivisors(ListNode head) {
//        if(head == null || head.next == null) return head;
//        ListNode first = head;
//        ListNode second = head.next;
//        while(second != null){
//            int middileElement = GCD(first.val,second.val);
//            ListNode middileNode = new ListNode(middileElement);
//            ListNode temp = first.next;
//            first.next = middileNode;
//            middileNode.next = temp;
//            first = second;
//            second = second.next;
//        }
//        return head;
//    }
//    public int GCD(int a,int b){
//        if(a % b == 0){
//            return b;
//        }
//        int ans = 0;
//        int remainder = 0;
//        while(b != 0){
//            if(remainder > 0){
//                ans = remainder;
//            }
//            remainder = a % b;
//            a = b;
//            b = remainder;
//        }
//        return ans;
//    }
}
