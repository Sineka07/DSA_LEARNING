import java.util.*;
import


//Definition for Node
class Node {
    int data;
    Node left;
    Node right;

    Node(int val) {
        data = val;
        left = right = null;

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
        Queue<Pair>pend=new LinkedList<>();
        pend.add(new Pair(root,0));
        TreeMap<Integer,Integer>map=new TreeMap<>();
        while(!pend.isEmpty())
        {
            Pair front=pend.poll();
            //pend.remove(pend.size()-1);
            Node node=front.node;
            int hd=front.hd;
          //  if(!map.containsKey(hd))
            //{
                map.put(hd,node.data);
            //}
          
            if(node.left!=null)
            {
                pend.add(new Pair(node.left,hd-1));
            }
            if(node.right!=null)
            {
                pend.add(new Pair(node.right,hd+1));
            }
        }
        for(int lev: map.values())
        {
            finalans.add(lev);
        }
       // return finalans;
        
    }
    public ArrayList<Integer> bottomView(Node root) {
        // code here
        ArrayList<Integer>finalans=new ArrayList<>();
        solve(root,finalans);
        return finalans;
        
    }
}