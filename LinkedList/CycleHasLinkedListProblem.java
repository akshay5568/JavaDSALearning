package LinkedList;

import java.util.HashSet;
import java.util.Set;


/**
 //  * Definition for singly-linked list.
 //  * class ListNode {
 //  *     int val;
 //  *     ListNode next;
 //  *     ListNode(int x) {
 //  *         val = x;
 //  *         next = null;
 //  *     }
 //  * }
 //  */


public class CycleHasLinkedListProblem {
    public static void main(String[] args) {
        HashSet set = new HashSet();
        Set list = new HashSet();
    }

//    public boolean hasCycle(ListNode head) {
//        HashSet set = new HashSet();
//        ListNode temp = head;
//        while(temp != null){
//            boolean isTrue = set.contains(temp);
//            set.add(temp);
//            if(isTrue) return true;
//            temp = temp.next;
//        }
//        return false;
//    }
}
