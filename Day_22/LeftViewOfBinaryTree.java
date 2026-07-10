import java.util.*;
class Node {
    int data;
    Node left, right;

    Node(int val) {
        this.data = val;
        this.left = null;
        this.right = null;
    }
}

class Solution {
    public static class Pair
    {
        Node node;
        int hd;
        Pair(Node node,int hd)
        {
            this.node=node;
            this.hd=hd;
        }
    }
    void solve(Node root,ArrayList<Integer>finalans)
    {
        if(root==null)
            return;
        Queue<Node>pend=new LinkedList<>();
        pend.add(root);
        while(!pend.isEmpty())
        {
            int size=pend.size();
            for(int i=0;i<size;i++)
            {
                
                Node node=pend.poll();
                if(i==0)
                    finalans.add(node.data);
              
                if(node.left!=null)
                {
                    pend.add(node.left);
                }
                if(node.right!=null)
                {
                    pend.add(node.right);
                }
            }
        }
        return;
    }
    public ArrayList<Integer> leftView(Node root) {
        // code here
        ArrayList<Integer>finalans=new ArrayList<>();
        solve(root,finalans);
        return finalans;
        
    }
}