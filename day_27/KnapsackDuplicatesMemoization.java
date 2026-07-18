package day_27;

import java.util.Arrays;

//TOP DOWN APPROCH - MEMOIZATION
public class KnapsackDuplicatesMemoization {
    
    int helper(int val[],int wt[],int n,int w,int dp[][])
    {
        if(n==0 || w==0)
            return 0;
        if(dp[n][w]!=-1)
           return dp[n][w];
        if(wt[n-1]<=w)
        {
            int include=val[n-1]+helper(val,wt,n,w-wt[n-1],dp);
            int exclude=helper(val,wt,n-1,w,dp);
            dp[n][w]=Math.max(include,exclude);
        }
        else
        {
            dp[n][w]=helper(val,wt,n-1,w,dp);
        }
        return dp[n][w];
        
    }
    public int knapSack(int val[], int wt[], int capacity) {
        // code here
        int n=val.length;
        int dp[][]=new int[n+1][capacity+1];
        for(int i[]:dp)
        {
            Arrays.fill(i,-1);
        }
        return helper(val,wt,n,capacity,dp);
        
    }
}
