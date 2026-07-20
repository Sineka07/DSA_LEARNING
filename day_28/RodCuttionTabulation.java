package day_28;

//Bottom Up Approch

public class RodCuttionTabulation {
    // int maxProfit(int price[],int n,int len[],int l,int dp[][])
    // {
    //     if(n==0 || l==0)
    //         return 0;
    //     if(dp[n][l]!=-1)
    //     {
    //         return dp[n][l];
    //     }
    //     if(len[n-1]<=l)
    //     {
    //         int include=price[n-1]+maxProfit(price,n,len,l-len[n-1],dp);
    //         int exclude=maxProfit(price,n-1,len,l,dp);
    //         dp[n][l]= Math.max(include,exclude);
    //     }
    //     else
    //     {
    //         dp[n][l]= maxProfit(price,n-1,len,l,dp);
    //     }
    //     return dp[n][l];
    // }
    public int cutRod(int[] price) {
        // code here
        // int n=price.length;
        // int length[]=new int[n];
        // for(int i=0;i<n;i++)
        // {
        //     length[i]=i+1;
        // }
        // int l=n;
        // int dp[][]=new int[n+1][l+1];
        // for(int i[]:dp)
        // {
        //     Arrays.fill(i,-1);
        // }
        // return maxProfit(price,n,length,n,dp);
        
        //Bottom-up(tabulation)
        int n=price.length;
        int dp[][]=new int[n+1][n+1];
       // dp[0][0]=1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(i<=j)
                {
                    int include=price[i-1]+dp[i][j-i];
                    int exclude=dp[i-1][j];
                    dp[i][j]=Math.max(include,exclude);
                }
                else
                {
                    dp[i][j]=dp[i-1][j];
                }
            }
            
        }
        return dp[n][n];
        
    }
}
