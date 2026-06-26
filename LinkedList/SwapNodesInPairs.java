package LinkedList;



public class SwapNodesInPairs {
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

//        public ListNode swapPairs(ListNode head) {
//            if(head == null) return head;
//            ListNode temp = head;
//            ListNode first = temp;
//            ListNode second = null;
//
//            if(temp.next != null){
//                second = temp.next;
//            }
//            while(second != null){
//                int val = first.val;
//                first.val = second.val;
//                second.val = val;
//                if(second.next != null){
//                    first = first.next.next;
//                    second = second.next.next;
//                }else{
//                    break;
//                }
//            }
//            return head;
//        }
    }
}
