package day_27;

public class KnapsackDuplicatesTabulation {

    // int helper(int val[],int wt[],int n,int w,int dp[][])
    // {
    //     if(n==0 || w==0)
    //         return 0;
    //     if(dp[n][w]!=-1)
    //       return dp[n][w];
    //     if(wt[n-1]<=w)
    //     {
    //         int include=val[n-1]+helper(val,wt,n,w-wt[n-1],dp);
    //         int exclude=helper(val,wt,n-1,w,dp);
    //         dp[n][w]=Math.max(include,exclude);
    //     }
    //     else
    //     {
    //         dp[n][w]=helper(val,wt,n-1,w,dp);
    //     }
    //     return dp[n][w];
        
    // }
    public int knapSack(int val[], int wt[], int capacity) {
        // code here
        // int n=val.length;
        // int dp[][]=new int[n+1][capacint n=val.length;
        int n=val.length;
        int dp[][]=new int[n+1][capacity+1];
        for(int j=0;j<capacity+1;j++)
        {
            dp[0][j]=0;
        }
        
        for(int i=0;i<n+1;i++)
        {
            dp[i][0]=0;
        }
        for(int i=1;i<n+1;i++)
        {
            for(int j=1;j<capacity+1;j++)
            {
                if(wt[i-1]<=j)
                {
                    int include=val[i-1]+dp[i][j-wt[i-1]];
                    int exclude=dp[i-1][j];
                    dp[i][j]=Math.max(include, exclude);
                }
                else
                {
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        return dp[n][capacity];
        
    }
}
