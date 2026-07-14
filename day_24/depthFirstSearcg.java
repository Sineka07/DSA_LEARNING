package day_24;

import java.util.*;
public class depthFirstSearcg {
    static void dfs(ArrayList<ArrayList<Integer>> res,int sv,boolean[] visited)
    {
        System.out.println("Sv"+sv);
        visited[sv]=true;
        for(int neighbour:res.get(sv))
        {
            if(!visited[neighbour])
            {
                dfs(res,neighbour,visited);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int V=sc.nextInt();
        int e=sc.nextInt();
        ArrayList<ArrayList<Integer>> arr=new ArrayList<>();
        for(int i=0;i<=V;i++)
        {
            arr.add(new ArrayList<>());
        }
        System.out.println("Enter V and E: ");
        for(int i=1;i<=e;i++)
        {
            int u=sc.nextInt();
            int v=sc.nextInt();
            System.out.println("Enter u and v: ");
            arr.get(u).add(v);
            arr.get(v).add(u);   //Storing neighbours
        }
        boolean[] visited=new boolean[V+1];
        dfs(arr,1,visited);
        sc.close();


    }
}
