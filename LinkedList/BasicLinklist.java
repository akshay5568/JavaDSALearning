package LinkedList;

public class BasicLinklist {

    static public class Node{
        int value;
        Node next;
        Node(int value){
             this.value = value;
             this.next = null;
        }
    }

    Node head;
    Node tail;

    public void insert(int value){
        Node node = new Node(value);
         if (head == null){
             head = node;
             tail = node;
             return;
         }
         node.next = head;
         head = node;
    }

    public void displayNodes(){
         Node node = head;
         while(node != null){
             System.out.println(node.value);
             node = node.next;
         }
        System.out.println("End");
    }

    public static void main(String[] args) {
            BasicLinklist LL = new BasicLinklist();
            LL.insert(87);
            LL.insert(97);
            LL.displayNodes();
    }
}
