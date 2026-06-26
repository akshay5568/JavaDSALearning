package Recursion.Patterns;

class Node{
    Node left;
    Node right;
    int data;

    Node(int data){
        this.data = data;
        left = null;
        right = null;
    }
}


public class BinaryTreeImplementation {
    public static void main(String[] args) {
        Node tt = new Node(1);
        tt.left = new Node(2);
        tt.right = new Node(3);
        tt.left.left = new Node(4);
        tt.right.right = new Node(5);
        dis(tt);
    }


    static void dis(Node node){
        if (node == null) return;
        System.out.println(node.data);
        dis(node.left);
        dis(node.right);
    }
}
