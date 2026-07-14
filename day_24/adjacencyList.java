package day_24;

import java.util.*;
public class adjacencyList {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int V=sc.nextInt();
        System.out.println("Enter no of Vertices: "+V);
        int e=sc.nextInt();
        System.out.println("Enter no of Edges: "+e);
        ArrayList<ArrayList<Integer>> arr=new ArrayList<>();
        for(int i=0;i<=V;i++)
        {
            arr.add(new ArrayList<>());
        }
        for(int i=1;i<=e;i++)
        {
            int u=sc.nextInt();
            int v=sc.nextInt();
            System.out.println("Enter u and v: ");
            arr.get(u).add(v);
            arr.get(v).add(u);   //Storing neighbours
        }
        for(int i=1;i<=V;i++)
        {
            System.out.println("Neighbors of "+i+"->");
            int n=arr.get(i).size();
            for(int j=0;j<n;j++)
            {
                System.out.print(arr.get(i).get(j));
            }
            System.out.println("");

        }
        //     System.out.println("Enter arr[u]="+arr[u]);
        //     System.out.println("Enter arr[v}="+arr[v]);
        // }

    }
}
