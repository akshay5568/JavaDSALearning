package LinkedList;

import java.util.HashMap;

class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}

public class CopyListWithRandomPointers {
    public static void main(String[] args) {

    }

    static Node copyRandomList(Node head) {
        HashMap<Node,Node> hm = new HashMap<>();

        Node curr = head;
        while(curr != null){
            hm.put(curr, new Node(curr.val));
            curr = curr.next;
        }

        curr = head;
        while(curr != null){
            hm.get(curr).next = hm.get(curr.next);
            hm.get(curr).random = hm.get(curr.random);
            curr = curr.next;
        }

        return hm.get(head);
    }
}
