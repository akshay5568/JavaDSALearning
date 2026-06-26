package Recursion.Patterns;

import com.sun.source.tree.BinaryTree;
import com.sun.source.tree.ExpressionTree;
import com.sun.source.tree.TreeVisitor;

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.List;

public class PathSum2 {
    public static void main(String[] args) {
        TreeNode root1 = new TreeNode(5);
        TreeNode temp1 = root1;
        root1.left = new TreeNode(4).left = new TreeNode(11).right = new TreeNode(2).left = new TreeNode(7);
        root1.right = new TreeNode(8);
        List<List<Integer>> ans = pathSum(temp1,22);
        System.out.println(ans);
    }



      public static class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode() {}
          TreeNode(int val) { this.val = val; }
          TreeNode(int val, TreeNode left, TreeNode right) {
              this.val = val;
              this.left = left;
              this.right = right;
          }
      }

        public static List<List<Integer>> pathSum(TreeNode root, int targetSum) {
            List<List<Integer>> ans = new ArrayList<>();
            BackTrack(ans,new ArrayList<>(),targetSum,root);
            return ans;
        }
        public static void BackTrack(List<List<Integer>> ans, List<Integer> temp, int targetSum, TreeNode root){
            if(root.left == null || targetSum <= 0 || root.right == null) {
                if(targetSum == 0 && !temp.isEmpty()) ans.add(new ArrayList<>(temp));
                return;
            }
            temp.add(root.val);
            targetSum -= root.val;
            BackTrack(ans,temp,targetSum,root.left);
            targetSum += root.val;
            temp.removeLast();
            BackTrack(ans,temp,targetSum,root.right);
        }
}
