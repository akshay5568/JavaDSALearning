package BinarySearchTreeBST;

public class ConstructBonaryTreeUsingPreorderTraversal {
    public static void main(String[] args) {
        /**
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
//        public TreeNode bstFromPreorder(int[] preorder) {
//            TreeNode root = new TreeNode(preorder[0]);
//
//            for(int i=1; i<preorder.length; i++){
//                TreeNode temp = root;
//                TreeNode parent = null;
//
//                while(temp != null){
//                    parent = temp;
//                    if(temp.val > preorder[i]){
//                        temp = temp.left;
//                    }else{
//                        temp = temp.right;
//                    }
//                }
//
//                if(parent.val > preorder[i]){
//                    parent.left = new TreeNode(preorder[i]);
//                }else{
//                    parent.right = new TreeNode(preorder[i]);
//                }
//            }
//            return root;
//        }
    }
}
