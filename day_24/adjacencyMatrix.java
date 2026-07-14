package day_24;

//Time Complexity: O(V+E)
//Space Complexity: O(V+E)
import java.util.*;
public class adjacencyMatrix
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int V=sc.nextInt();
        System.out.println("Enter no of vertices: "+V);
        int e=sc.nextInt();
        System.out.println("Enter no of Edges: "+e);
        boolean arr[][]=new boolean[V+1][V+1];
        for(int i=1;i<=e;i++)
        {
            int u,v;
            System.out.println("Enter u and v: ");
            u=sc.nextInt();
            v=sc.nextInt();
            arr[u][v]=true;
            arr[v][u]=true;
        }
        for(int i=1;i<=V;i++)
        {
            for(int j=1;j<=V;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
