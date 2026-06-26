package LinkedList;

//
//public class ListNode {
//    int val;
//    ListNode next;
//    ListNode() {}
//    ListNode(int val) { this.val = val; }
//    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//}


//I have to solve this Leetcode problem.
//Today did not solve this problem because of some reason now I will solve Tommoraw;

public class ReverseLinkedList2 {
    public static void main(String[] args) {
           int [] arr = {3,5};
           ListNode node = new ListNode();
           ListNode head = node;
           for (int i=0; i<arr.length; i++){
               node.next = new ListNode(arr[i]);
               node = node.next;
           }
           ListNode ans = reverseBetween(head.next,1,2);
           while (ans != null){
               System.out.println(ans.val);
               ans = ans.next;
           }
    }


    static ListNode reverseBetween(ListNode head, int left, int right) {
        if(right == left) return head;
        ListNode L1 = head;
        ListNode prevLeft = null;

        int index = 1;

        while (index != left) {
            index++;
            prevLeft = L1;
            L1 = L1.next;
        }


        ListNode curr = L1;
        ListNode prev = null;


        for (int i = left; i<= right; i++) {
                ListNode temp = curr.next;
                curr.next = prev;
                prev = curr;
                curr = temp;
        }

        if (prevLeft != null){
            prevLeft.next = prev;
        }else{
            head = prev;
        }

        L1.next = curr;

        return head;
    }
}


