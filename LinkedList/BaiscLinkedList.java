package LinkedList;

public class BaiscLinkedList {
    public static Object Node;

    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public Node head;
    public Node tail;
    int size = 0;


    public void addAtHead(int val){
        Node node = new Node(val);
        if (head == null){
            head = tail = node;
            size++;
            return;
        }
        node.next = head;
        head = node;
        size++;
    }

    public void addAtTail(int val){
        Node node = new Node(val);
        if (head == null){
            head = tail = node;
            size++;
            return;
        }
        tail.next = node;
        tail = node;
        size++;
    }

    public void add(int val){
        Node node = new Node(val);
        if (head == null){
            head = tail = node;
            size++;
            return;
        }
        Node index = tail;
        index.next = node;
        tail = node;
        size++;
    }

    public void addAtIndex(int val, int index){
        if(index > size) {
            System.out.println("index does not exist yet");
            return;
        }
         Node node = new Node(val);
         if(head == null){
             head = tail = node;
             size++;
             return;
         }

         if (index == 0){
             addAtHead(val);
             return;
         }
         if (index == size){
             addAtTail(val);
             return;
         }

         Node curr = head;
         for(int i=0; i<index-1; i++){
             curr = curr.next;
         }
         node.next = curr.next;
         curr.next = node;
         size++;
    }

    public void deleteAtIndex(int index){
        if (index > size) {
            return;
        }
        if(index == 0){
            head = head.next;
            return;
        }
        Node curr = head;
        for(int i =0; i<index-1; i++){
            curr = curr.next;
        }
       curr.next = curr.next.next;
        size--;
    }

    public int get(int index){
        if (index > size){
            return -1;
        }
        Node curr = head;
        for(int i=0; i<index; i++){
            curr = curr.next;
        }
        return curr.data;
    }

    void display(){
           Node temp = head;
           while(temp != null){
               System.out.println(temp.data);
               temp = temp.next;
           }
    }

    public static void main(String[] args) {
            BaiscLinkedList ll = new BaiscLinkedList();
            ll.addAtHead(7);
        ll.addAtHead(2);
        ll.addAtHead(1);
       ll.addAtIndex(0,3);
            ll.deleteAtIndex(2);
            ll.addAtHead(6);
            ll.addAtTail(6);
        System.out.println(ll.get(4));
        ll.addAtHead(4);
        ll.addAtIndex(0,5);
        ll.addAtHead(6);
           ll.display();

    }

}
