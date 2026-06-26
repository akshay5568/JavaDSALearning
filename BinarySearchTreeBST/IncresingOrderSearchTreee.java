package BinarySearchTreeBST;

public class IncresingOrderSearchTreee {
    public static void main(String[] args) {

    }/**
     * Definition for a binary tree node.
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode() {}
     *     TreeNode(int val) { this.val = val; }
     *     TreeNode(int val, TreeNode left, TreeNode right) {
     *         this.val = val;
     *         this.left = left;
     *         this.right = right;
     *     }
     * }
     */
//    public TreeNode increasingBST(TreeNode root) {
//        List <Integer> list = new ArrayList<>();
//        List sortedList = inOrder(root,list);
//        TreeNode ans = new TreeNode((int)(sortedList.get(0)));
//        TreeNode temp = ans;
//        for(int i=1; i<sortedList.size(); i++){
//            temp.right = new TreeNode((int)(sortedList.get(i)));
//            temp = temp.right;
//        }
//        return ans;
//    }
//
//    List<Integer> inOrder(TreeNode root,List list){
//        if(root == null){
//            return list;
//        }
//        inOrder(root.left,list);
//        list.add(root.val);
//        inOrder(root.right,list);
//        return list;
//    }
}
