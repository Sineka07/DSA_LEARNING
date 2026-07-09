package Day_21;

import java.util.*;

import java.util.ArrayList;

// * Definition for a binary tree node.
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

class DiameterOfBinaryTree {
    int height(TreeNode root)
    {
        if(root==null)
            return 0;
        int lef=height(root.left);
        int rig=height(root.right);
        return 1+Math.max(lef,rig);
    }
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null)
            return 0;
        int leftHeight=height(root.left);
        int rightHeight=height(root.right);
        int ans1=leftHeight+rightHeight;
        int ans2=diameterOfBinaryTree(root.left);
        int ans3=diameterOfBinaryTree(root.right);
        return Math.max(ans1,Math.max(ans2,ans3));
    }
}