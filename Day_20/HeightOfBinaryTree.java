import java.util.*; 
//Definition for Node
class Node {
    int data;
    Node left, right;

    Node(int val)
    {
        data = val;
        left = right = null;
    }
}


class HeightOfBinaryTree {
    public int height(Node root) {
        // code here
        if (root == null) return 0;
        int lefts = height(root.left);
        int rights = height(root.right);
        return Math.max(rights, lefts) + 1;
    }
}