package BinarySearchTreeBST;

import Recursion.Patterns.PathSum2;

import java.util.TreeMap;

public class KThSmallestElementInBST {
    public static void main(String[] args){

    }

//    static int kthSmallest(TreeNode root, int k) {
//        TreeMap<Integer,Integer> list = new TreeMap<>();
//
//        loop(root,list);
//        int index = 1;
//        System.out.print(list);
//        for(Map.Entry<Integer,Integer> entry : list.entrySet()){
//            if(index == k){
//                return entry.getKey();
//            }
//            index++;
//        }
//        return -1;
//    }
//
//    static void loop(PathSum2.TreeNode node, TreeMap<Integer,Integer> list){
//        if(node == null) return;
//        if(list.containsKey(node.val)){
//            list.put(node.val,list.get(node.val) + 1);
//        }else {
//            list.put(node.val,1);
//        }
//        loop(node.left,list);
//        loop(node.right,list);
//    }
}
