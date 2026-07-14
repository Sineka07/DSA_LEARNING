package day_24;


import java.util.PriorityQueue;

public class minHeap {

    // Constructor
    PriorityQueue<Integer>pq;
    
    public minHeap() {
        // Initialize your data members
        pq=new PriorityQueue<>();
    }

    public void push(int x) {
        // Insert x into the heap
        pq.add(x);
    }

    public void pop() {
        // Remove the top (minimum) element
        if(!pq.isEmpty())
        {
            pq.remove();
        }
    }

    public int peek() {
        // Return the top element or -1 if empty
        if(pq.isEmpty())
        {
            return -1;
        }
        else
        {
            return pq.peek(); 
        }
    }

    public int size() {
        // Return the number of elements in the heap
        return pq.size();
    }
} 