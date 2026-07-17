package day_27;

public class RodCuttingMemoization {

    int maxProfit(int price[],int n,int len[],int l,int dp[][])
    {
        if(n==0 || l==0)
            return 0;
        if(dp[n][l]!=-1)
        {
            return dp[n][l];
        }
        if(len[n-1]<=l)
        {
            int include=price[n-1]+maxProfit(price,n,len,l-len[n-1],dp);
            int exclude=maxProfit(price,n-1,len,l,dp);
            dp[n][l]= Math.max(include,exclude);
        }
        else
        {
            dp[n][l]= maxProfit(price,n-1,len,l,dp);
        }
        return dp[n][l];
    }
    public int cutRod(int[] price) {
        // code here
        int n=price.length;
        int length[]=new int[n];
        for(int i=0;i<n;i++)
        {
            length[i]=i+1;
        }
        int l=n;
        int dp[][]=new int[n+1][l+1];
        for(int i[]:dp)
        {
            Arrays.fill(i,-1);
        }
        return maxProfit(price,n,length,n,dp);
        
    }
}
