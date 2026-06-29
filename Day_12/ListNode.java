//Time Complexity: O(nlogn) + O(n) + O(n) ~ O(nlogn)
//Space Complexity: O(n)
 // Definition for singly-linked list.
import java.util.ArrayList;
import java.util.Collections;
  public class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
 
class MergeSortLinkedList {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ArrayList<Integer>res=new ArrayList<>();
        if(list1==null) return list2;
        if(list2==null) return list1;
        ListNode temp=list1;
        while(temp!=null)
        {
            res.add(temp.val);
            temp=temp.next;
        }

        ListNode temp1=list2;
        while(temp1!=null)
        {
            res.add(temp1.val);
            temp1=temp1.next;
        }        
        Collections.sort(res);
        
        ListNode dummy=new ListNode(-1);
        ListNode tail=dummy;
        for(int i=0;i<res.size();i++)
        {
            ListNode newNode=new ListNode(res.get(i));
            tail.next=newNode;
            tail=tail.next;
        }
        return dummy.next;
    }
}