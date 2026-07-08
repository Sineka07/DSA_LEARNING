import java.util.*;
public class BinarySearchTree {
    BinarySearchTree root;

    static class BinarySearchTree {
        int data;
        BinarySearchTree left, right;

        BinarySearchTree (int value) {
            data = value;
            left = null;
            right = null;
        }
    }
    void display(BinarySearchTree root) {
        if (root == null) {
            return;
        }
        System.out.println("root.data: " + root.data);
        System.out.println("root.left: " + root.left.data);
        System.out.println("root.right: " + root.right.data);
        
    }
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.root = new BinarySearchTree(10);
        tree.root.left = new BinarySearchTree(5);
        tree.root.right = new BinarySearchTree(15);
        tree.display(tree.root);
    }

    
    
}