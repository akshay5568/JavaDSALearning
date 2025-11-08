package LinkedList;

public class BaiscLinkedList {
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

     void addFirst(int data){
         Node n1 = new Node(data);
         if (head == null){
             head = n1;
             tail = n1;
             return;
         }
         n1.next = head;
         head = n1;
    }


    void addLast(int data){
          Node n1 = new Node(data);
          if(head == null){
              head = tail = n1;
              return;
          }
          tail.next = n1;
          tail = n1;
    }

    void display(){
        Node temp  = head;
           while(temp != null){
               System.out.println(temp.data);
               temp = temp.next;
           }
    }

    public static void main(String[] args) {
            BaiscLinkedList ll = new BaiscLinkedList();
        ll.addFirst(6);
        ll.addFirst(7);
        ll.addLast(8);
       ll.display();

    }

}
