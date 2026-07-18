package day_27;

//BOTTOM UP APPROCH
public class CountSubsetofTargetTabulation {

    // {
    //     if(n==0)
    //     {
    //         if(target==0)
    //           return 1;
    //         return 0;
    //     }
    //     if(dp[n][target]!=-1)
    //     {
    //         return dp[n][target];
    //     }
    //     if(arr[n-1]<=target)
    //     {
    //         int include=countSubset(arr,target-arr[n-1],n-1,dp);
    //         int exclude=countSubset(arr,target,n-1,dp);
    //         dp[n][target]= include+exclude;
    //     }
    //     else 
    //     {
    //         dp[n][target]=countSubset(arr,target,n-1,dp);
    //     }
    //     return dp[n][target];
        
    // }
    static int perfectSum(int[] arr, int target) {
        // codint e here
        // int n=arr.length;
        // int dp[][]=new int[n+1][target+1];
        // for(int i[]:dp)
        // {
        //     Arrays.fill(i,-1);
        // }
        // return countSubset(arr,target,n,dp);
        
        int n=arr.length;
        int dp[][]=new int[n+1][target+1];
        dp[0][0]=1;
        for(int i=1;i<n+1;i++)
        {
            for(int j=0;j<target+1;j++)
            {
                if(arr[i-1]<=j)
                {
                    int include=dp[i-1][j-arr[i-1]];
                    int exclude=dp[i-1][j];
                    dp[i][j]= include+exclude;
                }
                else
                {
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        return dp[n][target];
        
        
    }
}
