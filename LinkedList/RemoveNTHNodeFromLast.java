package LinkedList;

public class RemoveNTHNodeFromLast {
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

//    public ListNode removeNthFromEnd(ListNode head, int n) {
//        if(head == null) return head;
//        ListNode sentinal = new ListNode();
//        sentinal.next = head;
//        ListNode prev = sentinal;
//
//
//        int length = 0;
//        ListNode temp = head;
//        while(temp != null){
//            temp = temp.next;
//            length++;
//        }
//
//
//        int index = (length - n);
//        for(int i=0; i<index; i++){
//            prev = prev.next;
//        }
//        prev.next = prev.next.next;
//        return sentinal.next;
//    }

    /**
     * Second Approach to solve this problem it is known as First pass and above that problem known as Second pass.
     * ListNode Sentinal = new ListNode();
     *
     * Sentinal.next = head;
     * ListNode first = Sentinal;
     * for(int i=0; i<n; i++){
     *     first = first.next;
     * }
     *
     * ListNode second = Sentinal;
     * while(first.next != null){
     *    first = first.next;
     *    second = second.next;
     * }
     * second.next = second.next.next;
     *
     * return Sentinal.next;
     */


}

