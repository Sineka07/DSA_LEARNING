package Day_22;

import java.util.*;
//Definition for Node
class Node {
    int data;
    Node left, right;

    Node(int val) {
        this.data = val;
        this.left = null;
        this.right = null;
    }
}


class RightViewBinaryTree {
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
                if(i==size-1)
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
    public ArrayList<Integer> rightView(Node root) {
        // code here
        ArrayList<Integer>finalans=new ArrayList<>();
        solve(root,finalans);
        return finalans;
    }
}