package HASHTABLE;

import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;

//class LRUCaches {
//
//    Hashtable<Integer, Integer> h;
//    LinkedList<Integer> link;
//    int capacity = 0;
//
//    public LRUCaches(int capacity) {
//        this.capacity = capacity;
//        h = new Hashtable<>(capacity);
//        link = new LinkedList<>();
//    }
//
//    public int get(int key) {
//        if (h.containsKey(key)) {
//            return h.get(key);
//        } else {
//            return -1;
//        }
//    }
//
//    public void put(int key, int value) {
//        if (h.containsKey(key)) {
//            h.put(key, value);
//        } else {
//            if (h.size() == capacity) {
//                 int keyForDelete = link.getLast();
//                 h.remove(keyForDelete);
//                 link.removeLast();
//                 h.put(key,value);
//                 link.addFirst(key);
//            } else {
//                h.put(key, value);
//                link.add(key);
//            }
//        }
//    }
//
//}

public class LRUCache {
    Node head,tail;
    class Node {
        int key,value;
        Node prev,next;
    }

    void addNode(Node node){
        node.prev = head;
        node.next = head.next;
        head.next.prev = node;
        head.next = node;
    }

    void removeNode(Node node){
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    void moveToHead(Node node){
        removeNode(node);
        addNode(node);
    }

    Hashtable<Integer,Node> h;
    int capacity;

    LRUCache(int capacity){
        this.capacity = capacity;
        h = new Hashtable<>();
        head = new Node();
        tail = new Node();
        head.next = tail;
        tail.prev = head;
    }

    int get(int key){
        Node node = h.get(key);
        if (node == null) return -1;
        moveToHead(node);
        return node.value;
    }

    void put(int key, int value){
        Node node = h.get(key);
        if (node != null){
            node.value = value;
            moveToHead(node);
        }else{
            Node newNode = new Node();
            newNode.key = key;
            newNode.value = value;
            h.put(key,newNode);
            addNode(newNode);
            if (h.size() >capacity){
                Node lru = tail.prev;
                h.remove(lru.key);
                removeNode(lru);
            }
        }
    }

}
