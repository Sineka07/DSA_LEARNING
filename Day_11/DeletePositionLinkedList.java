//Node Structure
class Node {
    int data;
    Node next;
    Node(int x) {
        data = x;
        next = null;
    }
}


class DeletePositionLinkedList {
    public Node deleteAtPosition(Node head, int pos) {
        // code here
        if(head==null)
           return null;
        if(pos==1)
        {
           return head.next;
        }
        Node temp=head;
        int cnt=1;
        while(temp!=null && cnt<pos-1)
        {
            temp=temp.next;
            cnt++;
        }
        if(temp!=null && temp.next!=null)
        {
            temp.next=temp.next.next;
        }
        return head;
    }
}