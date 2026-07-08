    
class Node {
    int data;
    Node left, right;
    Node(int item){
        data = item;
        left = right = null;
    }
}


class InorderTraversalBT {
    public void insorder(Node root, List<Integer> res) {
        if (root != null) {
            insorder(root.left, res);
            res.add(root.data);
            insorder(root.right, res);
        }
    }
    public ArrayList<Integer> inOrder(Node root) {
        // code here
        ArrayList<Integer> res = new ArrayList<>();
        insorder(root, res);
        return res;
    }
}