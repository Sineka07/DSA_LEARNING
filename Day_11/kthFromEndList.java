//Node Structure
class Node {
    int data;
    Node next;
    Node(int x) {
        data = x;
        next = null;
    }
} 

class Solution {
    public int calculateLength(Node head)
    {
        int cnt=0;
        Node temp=head;
        while(temp!=null)
        {
            cnt++;
            temp=temp.next;
        }
        return cnt;
    }
    public int getIthFromStart(Node head,int pos)
    {
        int cnt=1;
        Node temp=head;
        while(temp!=null)
        {
            if(cnt==pos)
                return temp.data;
            cnt++;
            temp=temp.next;
        }
        return -1;
    }
    public Node createNode(int x) {
        return new Node(x);
    }
    public int getKthFromLast(Node head, int k) {
        // code here
        int length=calculateLength(head);
        int pos=length-k+1;
        int output=getIthFromStart(head, pos);
        return output;
    }
}