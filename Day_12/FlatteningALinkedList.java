//Time Complexity: O(N*M) where N is the number of nodes in the linked list and M is the number of nodes in the bottom linked list
//Space Complexity: O(1)
class Node {
    int data;
    Node next;
    Node bottom;

    Node(int x) {
        data = x;
        next = null;
        bottom = null;
    }
}
class Solution {
    public Node merge(Node head1,Node head2)
    {
        Node dummy=new Node(-1);
        Node tail=dummy;
        
        Node list1=head1;
        Node list2=head2;
        while(list1!=null && list2!=null)
        {
            if(list1.data<=list2.data)
            {
                tail.bottom=list1;
                list1=list1.bottom;
            }
            else
            {
                tail.bottom=list2;
                list2=list2.bottom;
            }
            tail=tail.bottom;
        }
        if(list1!=null)
        {
            tail.bottom=list1;
        }
        if(list2!=null)
        {
            tail.bottom=list2;
        }
        return dummy.bottom;
    }

    public Node flatten(Node root) {
        // code here
        if(root==null ) return root;
        if(root.next==null)
        {
            return root;
        }
        root.next=flatten(root.next);
        return merge(root,root.next);
        
        
    }
}