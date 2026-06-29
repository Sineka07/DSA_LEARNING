package Day_12;
//Time Complexity: O(n)
//Space Complexity: O(1)
// Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class RemoveNthNode {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null)
        {
            return null;
        }
        ListNode temp=head;
        int length=0;
        while(temp!=null)
        {
            temp=temp.next;
            length++;
        }
        if(n==length)
        {
            return head.next;
        }

        temp=head;
        int cnt=1;
        while(temp!=null && cnt<length-n)
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
