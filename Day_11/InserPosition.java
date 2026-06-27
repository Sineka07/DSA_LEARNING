/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
*/
class InsertPosition 00000000 {
    public Node insertPos(Node head, int pos, int val) {
        // code here
        if(pos==1)
        {
           Node newNode=new Node(val);
           Node temp=head;
           newNode.next=temp;
           head=newNode;
           return head;
        }
        int cnt=1;
        Node temp=head;
        while(temp!=null && cnt<pos-1)
        {
            temp=temp.next;
            cnt++;
        }
        //if we are reaching here it means temp node points to (i-1) node
        //create a new node with the val;
        Node newNode=new Node(val);
        if(temp!=null)
        {
            newNode.next=temp.next;
            temp.next=newNode;

        }
        return head;
        
    }
}