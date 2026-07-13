package Day_23;

import java.util.*;

//* Definition for a binary tree node.
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

class ConvertSortedArraytoBST {
    public TreeNode solve(int nums[],int left,int right)
    {
        if(left>right)
        {
            return null;
        }
        int mid=left+(right-left)/2;
        TreeNode node=new TreeNode(nums[mid]);
        node.left=solve(nums,left,mid-1);
        node.right=solve(nums,mid+1,right);
        return node;
    }
    public TreeNode sortedArrayToBST(int[] nums) {
        int n=nums.length;
        return solve(nums,0,n-1);
    }
}
