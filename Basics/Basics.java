package Basics;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Node{
    int val;
    Node next = null;

    Node(int val) {
        this.val = val;
    }

}

public class Basics {
    public static void main(String[] args) {
         Node node = new Node(1);
         Node temp = node;

         node.next = new Node(2);
         node.next.next = new Node(7);
         node.next.next.next = new Node(87);


         Node loop = temp;

         int valueToBeDelete = 7;
         Node slow = null;
         Node fast = temp;

         while(temp != null){
             if(temp.val == valueToBeDelete){
                 break;
             }
             slow = fast;
             fast = temp.next;
             temp = temp.next;
         }

         if (temp == null) {
             System.out.println("-1");
             return;
         }

         if (slow == null){
             loop = loop.next;
         }else slow.next = fast.next;


         while(loop != null){
             System.out.println(loop.val);
             loop = loop.next;
         }


    }



    public void reversingLinkedList(Node node){

//        Node node = new Node(1);
        Node temp = node;

        node.next = new Node(2);
        node.next.next = new Node(7);
        node.next.next.next = new Node(87);


        Node loop = temp;


        System.out.println("Before Reversing!");
        while(loop != null){
            System.out.println(loop.val);
            loop = loop.next;
        }

        Node prev = null;


        System.out.println("After reversing!");
        while(temp != null){
            Node temp1 = temp.next;
            temp.next = prev;
            prev = temp;
            temp = temp1;
        }

        while(prev != null){
            System.out.println(prev.val);
            prev = prev.next;
        }

    }
}

