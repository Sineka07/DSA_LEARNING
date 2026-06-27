/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class MiddleofTheLinkedList {
    public int calculateLength(ListNode head)
    {
        int cnt=0;
        ListNode temp=head;
        while(temp!=null)
        {
            cnt++;
            temp=temp.next;
        }
        return cnt;
    }
    public ListNode middleNode(ListNode head) {
        int length=calculateLength(head);
        int mid=(length/2)+1;
        ListNode temp=head;
        int cnt=1;
        while(temp!=null && cnt<mid)
        {
            temp=temp.next;
            cnt++;

        }
        return temp;
     

    }
}
//Two pointer approach

// class Solution {   
//     /
// public:
//     ListNode* middleNode(ListNode* head) {
//         ListNode* sp=head;
//         ListNode* fp=head;
//         while(fp!=NULL && fp->next!=NULL)
//         {
//             sp=sp->next; 
//             fp=fp->next->next;
//         }
//         return sp;
//     }
// };
