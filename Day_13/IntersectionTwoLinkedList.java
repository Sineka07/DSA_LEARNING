package Day_13;


 //* Definition for singly-linked list.
  public class ListNode {
     int val;
     ListNode next;
     ListNode(int x) {
         val = x;
         next = null;
     }
 }
 
public class IntersectionTwoLinkedList {
    int calculate(ListNode head)
    {
        ListNode temp=head;
        int cnt=0;
        while(temp!=null)
        {
            cnt++;
            temp=temp.next;
        }
        return cnt;
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode temp1=headA;
        ListNode temp2=headB;
        while(temp1!=temp2)
        {
            if(temp1==null)
            {
                temp1=headB;
            }
            else
            {
                temp1=temp1.next;
            }
            if(temp2==null)
            {
                temp2=headA;
            }
            else
            {
                temp2=temp2.next;
            }
        }
        return temp1;
        
    //    ListNode temp1=headA;
    //    ListNode temp2=headB;
    //    int len1=calculate(temp1);
    //    int len2=calculate(temp2);
    //    if(len1>=len2)
    //    {
    //      int diff=(len1-len2);
    //      while(temp1!=null && diff>0 )
    //      {
    //         temp1=temp1.next;
    //         diff--;
    //      }
    //    }
    //    else
    //    {
    //         int diff=len2-len1;
    //         while(temp2!=null && diff>0)
    //         {
    //             temp2=temp2.next;
    //             diff--;
    //         }
    //    }
    //    while(temp1!=null && temp2!=null)
    //    {
    //       if(temp1==temp2)
    //       {
    //         return temp1;
    //       }
    //       temp1=temp1.next;
    //       temp2=temp2.next;
    //    }
    //    return null;
    }
}
