package LinkedList;

public class MyLinkdList {


        class Node {
            int value;
            Node next;

            public Node(int value){
                this.value = value;
                this.next = null;
            }
        }

        Node head;
        Node tail;
        int size = 0;

        public int get(int index) {
            if(index < 0 || index >= size){
                return -1;
            }

            Node curr = head;
            for(int i=0; i<index; i++){
                curr = curr.next;
            }
            return curr.value;
        }

        public void addAtHead(int val) {
            Node node = new Node(val);
            if(head == null){
                head = node;
                tail = node;
                size++;
                return;
            }
            node.next = head;
            head = node;
            size++;
        }

        public void addAtTail(int val) {
            Node node = new Node(val);
            if(head == null){
                head = tail = node;
                size++;
                return;
            }
            tail.next = node;
            tail = node;
            size++;
        }

        public void addAtIndex(int index, int val) {
            if(index > size) return;
            if(index == 0) {
                addAtHead(val);
                return;
            }

            if(index == size) {
                addAtTail(val);
                return;
            }
            Node node = new Node(val);
            Node curr = head;
            for(int i=0; i<index-1; i++){
                curr = curr.next;
            }
            node.next = curr.next;
            curr.next = node;
            size++;
        }

        public void deleteAtIndex(int index) {
            if(index < 0 || index >= size) {
                return;
            }
            if(index == 0){
                head = head.next;
                size--;
                if(size == 0) tail = null;
                return;
            }
            Node curr = head;
            for(int i=0; i<index-1; i++){
                curr = curr.next;
            }

            if(curr.next == tail){
                tail = curr;
            }
            curr.next = curr.next.next;
            size--;
        }
    }

