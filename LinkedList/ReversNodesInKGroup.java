package LinkedList;




class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}


public class ReversNodesInKGroup {
    public static void main(String[] args) {

        int [] arr = {1,2,3,4,5};
        ListNode n = new ListNode(arr[0]);
        ListNode head = n;

        for (int i=1; i<arr.length; i++){
            n.next = new ListNode(arr[i]);
            n = n.next;
        }


        ListNode ans = reverseKGroup(head,2);
        while (ans != null){
            System.out.println(ans.val);
            ans = ans.next;
        }

    }



    static ListNode reverseKGroup(ListNode head, int k) {
        int length = 0;
        ListNode temp = head;
        ListNode ans = new ListNode();
        ListNode ans1 = ans;

        while(temp != null){
            length++;
            temp = temp.next;
        }

        int totalCountOfK = k;
        ListNode r = head;
        ListNode l = null;
        int index = 1;

        while(length >= totalCountOfK){

            index = 1;
            l = r;

            while(index != k){
                l = l.next;
                index++;
            }

            ListNode LNext = null;
            if (l != null) {
                LNext = l.next;
            }

            ListNode curr = r;
            ListNode prev = null;

            for (int i=0; i<k; i++){
                ListNode temp1 = curr.next;
                curr.next = prev;
                prev = curr;
                curr = temp1;
            }

            while(prev != null){
                ans.next = prev;
                prev = prev.next;
                ans = ans.next;
            }

            r = LNext;
            totalCountOfK += k;
            if (totalCountOfK > length){
                ans.next = r;
            }
        }
        head = ans1.next;
        return head;
    }
}
