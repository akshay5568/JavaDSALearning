package LinkedList;

import Basics.ListNode;

import java.util.ArrayList;
import java.util.Collections;

public class MergeLinkedListProblem {
    public static void main(String[] args) {

    }

//    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
//
//        ArrayList<Integer> list = new ArrayList<Integer>();
//        ListNode first = list1;
//        ListNode second = list2;
//
//        while(first != null){
//            list.add(first.val);
//            first = first.next;
//        }
//        while(second != null){
//            list.add(second.val);
//            second = second.next;
//        }
//        if(list.size() == 0) return null;
//        Collections.sort(list);
//        ListNode NodeList = new ListNode(list.get(0));
//        ListNode temp = NodeList;
//        for(int i=1; i<list.size(); i++){
//
//            temp.next = new ListNode(list.get(i));
//            temp = temp.next;
//        }
//        return NodeList;
//    }
}
