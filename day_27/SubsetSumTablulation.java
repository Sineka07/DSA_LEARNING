package day_27;

public class SubsetSumTablulation {

    static boolean sumSubset(int arr[],int sum,int n,Boolean dp[][])
    {
        if(sum==0)
           return true;
        if(n==0)
           return false;
        if(dp[n][sum]!=null)
         {
               return dp[n][sum];
         }
        if(arr[n-1]<=sum)
        {
            boolean include=sumSubset(arr,sum-arr[n-1],n-1,dp);
            boolean exclude=sumSubset(arr,sum,n-1,dp);
            dp[n][sum]=include || exclude;
        }
        else
        {
            dp[n][sum]= sumSubset(arr,sum,n-1,dp);
        }
        return dp[n][sum];
    }
    static boolean isSubsetSum(int arr[], int sum) {
        // code here
        // int n=arr.length;
        // Boolean dp[][]=new Boolean[n+1][sum+1];
        
        // return sumSubset(arr,sum,n,dp);
        int n=arr.length;
        boolean dp[][]=new boolean[n+1][sum+1];
        for(int i=0;i<n+1;i++)
        {
            dp[i][0]=true;
        }
      // dp[0][0]=true;;
        for(int i=1;i<n+1;i++)
        {
            for(int j=1;j<sum+1;j++)
            {
                if(arr[i-1]<=j)
                {
                    boolean include=dp[i-1][j-arr[i-1]];
                    boolean exclude=dp[i-1][j];
                    dp[i][j]=include||exclude;
                }
                else
                {
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        return dp[n][sum];
    }
}