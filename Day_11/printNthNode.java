import java.util.Scanner;
//Time Complexity: O(n) where n is the number of nodes in the linked list       
//Space Complexity: O(1) as we are not using any extra space
public class LinkedList {
    static Scanner sc = new Scanner(System.in);

    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            next = null;
        }
    }
    static void printLL(Node head){
        Node temp = head;
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
    static int calculateLength(Node head){
        Node temp = head;
        int count = 0;
        while(temp != null){
            count++;
            temp = temp.next;
        }
        return count;
    }

    static Node takeInput() // this takes tc is O(n^2) as we are traversing the linked list to find the last node every time we add a new node
    {
        int data=sc.nextInt();
        System.out.println("Enter data: ");
        Node head=null;
        while(data!=-1)
        {
            Node newNode=new Node(data);
            if(head==null)
            {
                head=newNode;
            }
            else
            {
                Node temp=head;
                while(temp.next!=null)
                {
                    temp=temp.next;
                }
                temp.next=newNode;
            }
            System.out.println("Enter data again:");
            data=sc.nextInt();
        }
        return head;
    }
    static Node takeInputBetter() //this takes tc is O(n) as we are maintaining a tail pointer to add new nodes at the end of the linked list
    {
        int data=sc.nextInt();
        System.out.println("Enter data: ");
        Node head=null;
        Node tail=null;
        while(data!=-1)
        {
            //create a new node with the data
            Node newNode=new Node(data);
            if(head==null)
            {
                head=newNode;
                tail=newNode;
            }
            else
            {
                tail.next=newNode;
                tail=newNode;
            }
            System.out.println("Enter data again:");
            data=sc.nextInt();
        }
        return head;
    }
    static void printNthNode(Node head, int n){
        Node temp = head;
        int count = 0;
        while(temp != null){
            if(count == n){
                System.out.println(temp.data);
                return;
            }
            count++;
            temp = temp.next;
        }
        System.out.println("Index " + n + " is out of bounds.");
    }
    public static void main(String[] args) {
        Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);
        Node n4 = new Node(40);
        
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;

        // Node head = n1;
        // System.out.println("Printing head's data:");
        // System.out.println(head.data); // printing head's data

        // // print n2 data using n1
        // System.out.println("n2 data using n1: ");
        // System.out.println(n1.next.data);

        // printLL(head);
        // int length = calculateLength(head);
        // System.out.println("Length of linked list is: " + length);

        // Node updatedHead = takeInput();
        // printLL(updatedHead);

        Node betterHead = takeInputBetter();
        printLL(betterHead);

        printNthNode(betterHead, 2);
    }
}