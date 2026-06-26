package Recursion.Patterns;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePaths {
    public static void main(String[] args) {

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
    public static List<String> binaryTreePaths(TreeNode root) {
        List<String> ans = new ArrayList<>();
        BackTrack(root,ans,"");
        return ans;
    }

    public static void BackTrack(TreeNode root,List<String> ans,String str){
        str += root.val;
        if(root.left == null && root.right == null) {
            ans.add(str);
            return;
        };
        str += "->";
        if(root.left != null) BackTrack(root.left,ans,str);
        if(root.right != null) BackTrack(root.right,ans,str);
    }
}
