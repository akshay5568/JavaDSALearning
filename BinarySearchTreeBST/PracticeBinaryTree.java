package BinarySearchTreeBST;

class Node{
    int val = 0;
    Node left; Node right;

    public Node(int val) {
        this.val = val;
        left = right = null;
    }
}

class BinaryTree{
    Node root;
    public void PreOrder(Node tree){
        if (tree == null) return;
        System.out.println(tree.val);
        PreOrder(tree.left);
        PreOrder(tree.right);
    }

    public void InOrder(Node tree){
        if (tree == null) return;
        InOrder(tree.left);
        System.out.println(tree.val);
        InOrder(tree.right);
    }

    public void PostOrder(Node tree){
        if (tree == null) return;
        PostOrder(tree.left);
        PostOrder(tree.right);
        System.out.println(tree.val);
    }
}


public class PracticeBinaryTree {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right = new Node(3);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);
        tree.InOrder(tree.root);
    }
}
