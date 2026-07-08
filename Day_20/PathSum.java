import java.util.*;

//Time Complexity: O(n)
//Space Complexity: O(n)
 //Definition for a binary tree node.
  public class TreeNode {
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

class PathSum {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null)
           return false;
        if(root.left==null && root.right==null)
        {
            return root.val==targetSum;
        }
        boolean lefts=hasPathSum(root.left,targetSum-root.val);
        boolean rights=hasPathSum(root.right,targetSum-root.val);
        return lefts || rights;
        
    }
}