package LinkedList;


class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}


//I have to solve this Leetcode problem.
//Today did not solve this problem because of some reason now I will solve Tommoraw;

public class ReverseLinkedList2 {
    public static void main(String[] args) {
           int [] arr = {1,2,3,4,5};
           ListNode node = new ListNode();
           ListNode head = node;
           for (int i=0; i<arr.length; i++){
               node.next = new ListNode(arr[i]);
               node = node.next;
           }
        System.out.println(head.next.val);
           ListNode ans = reverseBetween(head.next,2,4);
           while (ans != null){
               System.out.println(ans.val);
               ans = ans.next;
           }
    }


    static ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode prevLeft = null;
        ListNode L1 = head;
        ListNode R1 = head;
        int index = 1;

        while (index != left) {
            index++;
            prevLeft = L1;
            L1 = L1.next;
        }

        index = 1;

        while (index != right) {
            index++;
            R1 = R1.next;
        }


        ListNode curr = L1;
        ListNode prev = null;

        if (L1.val <= R1.val) {
            for (int i=left; i<= right; i++){
                ListNode temp = curr.next;
                curr.next = prev;
                prev = curr;
                curr = temp;
            }
        }
        ListNode temp = prev;
        while (temp.next != null){
            temp = temp.next;
        }

        prevLeft.next = prev;
        temp.next = R1.next;

        return head;
    }
}


