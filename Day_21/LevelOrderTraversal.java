package Day_21;
import java.util.LinkedList;
import java.util.Queue; 
import java.util.Scanner;
public class LevelOrderTraversal {
    class BinaryTreeNode
    {
        int data;
        BinaryTreeNode left;
        BinaryTreeNode right;
        BinaryTreeNode(int data)
        {
            this.data=data;
            left=null;
            right=null;
        }
    }
    private BinaryTreeNode takeInputLevelWise()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter root data");
        int rootdata=sc.nextInt();
        if(rootdata==-1)
            return null;
        BinaryTreeNode root=new BinaryTreeNode(rootdata);
        Queue<BinaryTreeNode> pendingnodes=new LinkedList<>();
        pendingnodes.add(root);
        while(!pendingnodes.isEmpty())
        {
            BinaryTreeNode front=pendingnodes.poll();
            System.out.println("Enter left child of "+front.data);
            int leftchild=sc.nextInt();
            if(leftchild!=-1)
            {
                BinaryTreeNode child=new BinaryTreeNode(leftchild);
                front.left=child;
                pendingnodes.add(child);
            }
            System.out.println("Enter right child of "+front.data);
            int rightchild=sc.nextInt();
            if(rightchild!=-1)
            {
                BinaryTreeNode child=new BinaryTreeNode(rightchild);
                front.right=child;
                pendingnodes.add(child);
            }
        }
        return root;
    }
    private void printLevelOrder(BinaryTreeNode root)
    {
        if(root==null)
            return;
        Queue<BinaryTreeNode> pendingnodes=new LinkedList<>();
        pendingnodes.add(root);
        while(!pendingnodes.isEmpty())
        {
            BinaryTreeNode front=pendingnodes.poll();
            pendingnodes.remove();
            System.out.print(front.data+" ");
            if(front.left!=null)
                pendingnodes.add(front.left);
            if(front.right!=null)
                pendingnodes.add(front.right);
        }
    }
    public static void main(String[] args) {
        LevelOrderTraversal obj=new LevelOrderTraversal();
        BinaryTreeNode root=obj.takeInputLevelWise();
        System.out.println("Level order traversal of binary tree is:");
        obj.printLevelOrder(root);
    }
}
