package Day_18;
import java.util.Scanner;
public class ibm {
    public int sum(int nums[],int idx,int n)
    {
        //base case
        if(idx==n)
        {
            return 0;
        }
        //recursive call or Hypothesis
        return nums[idx]+sum(nums,idx+1,n);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int nums[]=new int[n];
        for(int i=0;i<n;i++)
        {
            nums[i]=sc.nextInt();
        }   
        ibm obj=new ibm();
        int ans=obj.sum(nums,0,n);
        System.out.println(ans);
    }
    
}
