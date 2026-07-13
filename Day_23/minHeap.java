package Day_23;

import java.util.*;

public class minHeap
{
    int heap[]=new int[100];
    int hsize=0;
    int getSize(int[] nums)
    {
        return nums.length;
    }

    boolean isEmpty(int[] nums)
    {
        return nums.length == 0;
    }

    int getMin(int[] nums)
    {
        if(isEmpty(nums))
        {
            return -1;
        }
        else
        {
            return nums[0];
        }
    }

    void insert(int val)
    {
        heap[hsize]=val;
        int childidx=hsize-1;
        hsize++;
        while(childidx>0)
        {
            int parentidx=(childidx-1)/2;
            if(heap[childidx]<heap[parentidx])
            {
                int temp=heap[childidx];
                heap[childidx]=heap[parentidx];
                heap[parentidx]=temp;
            }
            else
            {
                break;
            }
            childidx=parentidx;
        }
    }

    int removeMin(int[] nums)
    {
        if(isEmpty(nums))
        {
            return -1;
        }
        int min = nums[0];
        heap[0]=heap[hsize-1];
        hsize--;
        int parnetidx=0;
        int leftchildidx=2*parnetidx+1;
        int rightchildidx=2*parnetidx+2;

        while(leftchildidx<hsize)
        {
            int minidx=parnetidx;
            if(heap[leftchildidx]<heap[minidx])
            {
                minidx=leftchildidx;
            }
            if(rightchildidx<hsize && heap[rightchildidx]<heap[minidx])
            {
                minidx=rightchildidx;
            }
            if(minidx==parnetidx)
            {
                break;
            }
            int temp=heap[parnetidx];
            heap[parnetidx]=heap[minidx];
            heap[minidx]=temp;

            parnetidx=minidx;
            leftchildidx=2*parnetidx+1;
            rightchildidx=2*parnetidx+2;
        }
        return min;
    }

    public void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<=n;i++)
        {
            int val;
            System.out.println("Enter the value to be inserted in the heap: ");
            val=sc.nextInt();
            insert(val);
            System.out.println("The minimum value in the heap is: "+getMin(heap));
            System.out.println("Removing the minimum value from the heap: "+removeMin(heap));   



            while(!isEmpty(heap))
            {
                System.out.println("The minimum value in the heap is: "+getMin(heap));
                System.out.println("Removing the minimum value from the heap: "+removeMin(heap));
            }

        }
    }

}
