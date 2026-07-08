import java.util.*;


 // Definition for a binary tree node.
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
 
class Solution {
    int height(TreeNode root)
    {
        if(root==null) return 0;
        int lf=height(root.left);
        int rg=height(root.right);
        return 1+Math.max(lf,rg);
    
    }
    public boolean isBalanced(TreeNode root) {
        if(root==null) 
             return true;
        int x=height(root.left);
        //max1=Math.max(max1,x);
        int y=height(root.right);
        //max2=Math.max(max2,y);
        int k=Math.abs(x-y);
        boolean islef=isBalanced(root.left);
        boolean isrig=isBalanced(root.right);

        if(k<=1 && islef && isrig)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}