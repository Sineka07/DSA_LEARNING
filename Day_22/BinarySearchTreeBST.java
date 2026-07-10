 package Day_22;

public class BinarySearchTreeBST {
    public static class Node
    {
        int data;
        Node left;
        Node right;
        Node(int data)
        {
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
     Node insert(Node root,int data)
     {
            if(root==null)
            {
                 return new Node(data);
            }
            if(data<root.data)
            {
                root.left=insert(root.left,data);
            }
            else
            {
                root.right=insert(root.right,data);
            }
            return root;
     }
    public static void main()
    {
        BinarySearchTreeBST bst=new BinarySearchTreeBST();
        Node root=null;
        root=bst.insert(root,50);
        bst.insert(root,10);
        bst.insert(root,30);
        bst.insert(root,40);
        bst.insert(root,60);
        bst.insert(root,70);
        bst.insert(root,80);
        bst.insert(root,55);
        bst.insert(root,90);
    }
}
