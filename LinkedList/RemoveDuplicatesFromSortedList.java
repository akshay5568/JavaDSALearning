package LinkedList;

public class RemoveDuplicatesFromSortedList {
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
//    public ListNode deleteDuplicates(ListNode head) {
//        ListNode tempNode = head;
//        ArrayList <Integer> arr = new ArrayList<>();
//        while(tempNode != null){
//            arr.add(tempNode.val);
//            tempNode = tempNode.next;
//        }
//        HashMap hs = new HashMap();
//        for(int i=0; i<arr.size(); i++){
//            if(hs.containsKey(arr.get(i))){
//                int temp = (int) hs.get(arr.get(i));
//                hs.put(arr.get(i),++temp);
//            }else {
//                hs.put(arr.get(i),0);
//            }
//        }
//        ArrayList<Integer> list = new ArrayList<>();
//        for(int i=0; i<arr.size(); i++){
//            if ((int)hs.get(arr.get(i)) == 0){
//                list.add(arr.get(i));
//            }
//        }
//
//        ListNode ans = new ListNode();
//        ListNode temp = ans;
//        for(int i=0; i<list.size(); i++){
//            ans.next = new ListNode(list.get(i));
//            ans = ans.next;
//        }
//        return temp.next;
//    }
}
