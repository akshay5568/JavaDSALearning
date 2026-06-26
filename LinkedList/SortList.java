package LinkedList;

public class SortList {
    public static void main(String[] args) {

    }
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

//    public ListNode sortList(ListNode head) {
//        if(head == null) return head;
//        ArrayList<Integer> list = new ArrayList<Integer>();
//        ListNode temp = head;
//        while(temp != null) {
//            list.add(temp.val);
//            temp = temp.next;
//        }
//        Collections.sort(list);
//        ListNode node = new ListNode(list.get(0));
//        ListNode ans = node;
//        for(int i=1; i<list.size(); i++){
//            node.next = new ListNode(list.get(i));
//            node = node.next;
//        }
//        return ans;
//    }
}
