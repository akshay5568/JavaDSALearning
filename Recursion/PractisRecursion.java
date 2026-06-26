package Recursion;

import Searching.BinarySearch.BinarySearch;

import java.util.ArrayList;
import java.util.List;

public class PractisRecursion {
    public static class binaryTree{
         int val;
         binaryTree left;
         binaryTree right;


        binaryTree(){
            this.right = null;
            this.left = null;
        }

         binaryTree(int val){
             this.val = val;
             this.left = null;
             this.right = null;
         }




        binaryTree root;

        void add(int val){
            binaryTree temp = new binaryTree(val);
            if(root == null){
                root = temp;
            }else {
                binaryTree tr = root;
                binaryTree perent = null;
                while (tr != null){
                    perent = tr;
                    if (tr.val > val){
                        tr = tr.left;
                    }else {
                        tr = tr.right;
                    }
                }

                if (perent.val > val){
                    perent.left = new binaryTree(val);
                }else {
                    perent.right = new binaryTree(val);
                }
            }

        }

        void dispaly(){
            binaryTree temp = root;
            System.out.println("Root :" + " " + root.val);
            List<Integer> list = new ArrayList<>();
            List<Integer> ans = inOrder(temp,list);
            System.out.println(ans);
        }

        List<Integer> inOrder(binaryTree root, List list){
            if (root == null){
                return list;
            }
            inOrder(root.left,list);
            list.add(root.val);
            inOrder(root.right,list);
            return list;
        }

        static int totalEelemnt = 0;

        int counterIndex(){
            binaryTree temp = root;

            count(temp);
            return totalEelemnt;
        }

         void count(binaryTree temp){
            if (temp == null){
                return;
            }
            totalEelemnt++;
            count(temp.left);
            count(temp.right);
        }
     }



    public static void main(String[] args) {
            binaryTree bb;
            bb= new binaryTree();
        bb.add(2);
        bb.add(4);
        bb.add(5);
        bb.add(6);
        bb.add(1);
        bb.dispaly();
        System.out.println(bb.counterIndex());
    }
}
