package Day_21;
import java.util.*;
imoprt java.util.ArrayList;
//Time Complexity: O(n) where n is the number of nodes in the binary tree
//Space Complexity: O(n) where n is the number of nodes in the binary tree

//efinition for Node
class Node
{
    int data;
    Node left;
    Node right;

    Node(int val)
    {
        this.data = val;
        left = null;
        right = null;
    }
}


class Solution {
    public void solve(Node root,ArrayList<Integer>ans,ArrayList<ArrayList<Integer>>finalans)
    {
        if(root==null)
            return;
        ans.add(root.data);
         if(root.left==null && root.right==null)
         {
             finalans.add(new ArrayList<>(ans));
         }
         solve(root.left,ans,finalans);
         solve(root.right,ans,finalans);
         ans.remove(ans.size()-1);
          
    }
    public ArrayList<ArrayList<Integer>> Paths(Node root) {
        // code here
         ArrayList<ArrayList<Integer>>finalans=new ArrayList<>();
         ArrayList<Integer>ans=new ArrayList<>();
         solve(root, ans, finalans);
         return finalans;
    }
}