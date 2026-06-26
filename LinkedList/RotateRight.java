package LinkedList;

public class RotateRight {
    public static void main(String[] args) {

    }

//    public ListNode rotateRight(ListNode head, int k) {
//        if(head == null || head.next == null) return head;
//        ListNode len = head;

     //Here I calculated length of the list.
//        int length = 0;
//        while(len != null){
//            length++;
//            len = len.next;
//        }

    //Here i ignored unnecessary rotate using %.
//        if(k % length == 0) return head;
//        k = k % length;
//        ListNode temp = head;
//        ListNode newHead = null;

    //Here i find my last element of list and connected to targeted element.
//        for(int i=0; i<length - k; i++){
//            if(i == length - (k + 1)){
//                newHead = temp.next;
//                temp.next = null;
//                break;
//            }
//            temp = temp.next;
//        }
//        ListNode ans = newHead;
//        while(newHead.next != null){
//            newHead = newHead.next;
//        }
//        newHead.next = head;
//        return ans;
//    }
}
