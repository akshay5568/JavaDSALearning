package LinkedList;

class ListNode {
      int val;
     ListNode next;
     ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

public class PartitionList {
    public static void main(String[] args) {

    }

    static ListNode partition(ListNode head, int x) {
        ListNode ans = new ListNode();
        ListNode temp = head;
        ListNode ans2 = ans;

        while(temp != null){
            if(temp.val < x){
                ans.next = new ListNode(temp.val);
                ans = ans.next;
            }
            temp = temp.next;
        }

        ListNode temp2 = head;

        while(temp2 != null){
            if(temp2.val >= x){
                ans.next = new ListNode(temp2.val);
                ans = ans.next;
            }
            temp2 = temp2.next;
        }

        return ans2.next;
    }
}


