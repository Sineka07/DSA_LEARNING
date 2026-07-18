package day_27;

//TOP DOWN APPROCH
import java.util.*;
public class CountSubsetofTargetMemoziation {
    static int countSubset(int arr[],int target,int n,int dp[][])
    {
        if(n==0)
        {
            if(target==0)
               return 1;
            return 0;
        }
        if(dp[n][target]!=-1)
        {
            return dp[n][target];
        }
        if(arr[n-1]<=target)
        {
            int include=countSubset(arr,target-arr[n-1],n-1,dp);
            int exclude=countSubset(arr,target,n-1,dp);
            dp[n][target]= include+exclude;
        }
        else 
        {
            dp[n][target]=countSubset(arr,target,n-1,dp);
        }
        return dp[n][target];
        
    }
    static int perfectSum(int[] arr, int target) {
        // codint e here
        int n=arr.length;
        int dp[][]=new int[n+1][target+1];
        for(int i[]:dp)
        {
            Arrays.fill(i,-1);
        }
        return countSubset(arr,target,n,dp);
        
        
    }
}
