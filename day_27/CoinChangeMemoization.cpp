package day_27;

//TOP DOWN APPROCH

public class CoinChangeMemoization {
 //top-down approach

    int countWays(vector<int>& coins,int sum,int n,vector<vector<int>>& dp){
        if(n==0) return 0;
        if(sum==0) return 1;
        if(dp[n][sum]!=-1){
            return dp[n][sum];
        }
        if(coins[n-1]<=sum){
            int include=countWays(coins,sum-coins[n-1],n,dp);
            int exclude=countWays(coins,sum,n-1,dp);
            dp[n][sum]=include+exclude;
        }else{
            dp[n][sum]=countWays(coins,sum,n-1,dp);
        }
        return dp[n][sum];
    }
  public:
    int count(vector<int>& coins, int sum) {
        int n=coins.size();
        vector<vector<int>> dp(n+1,vector<int>(sum+1,-1));
        return countWays(coins,sum,n,dp);
    }
};

//IN JAVA CODE


// class Solution {
//     static int sumCoin(int arr[],int sum,int n,int dp[][])
//     {
//         if(sum==0)
//            return 0;
//         if(n==0)
//            return Integer.MAX_VALUE;
//         if(dp[n][sum]!=-1)
//          {
//                return dp[n][sum];
//          }
//         if(arr[n-1]<=sum)
//         {
//             int include=sumCoin(arr,sum-arr[n-1],n,dp);
//             if(include!=Integer.MAX_VALUE)
//             {
//                 include=1+include;
//             }
//             int exclude=sumCoin(arr,sum,n-1,dp);
//             dp[n][sum]=Math.min(include,exclude);
//         }
//         else
//         {
//             dp[n][sum]= sumCoin(arr,sum,n-1,dp);
//         }
//         return dp[n][sum];
//     }

//     public int minCoins(int coins[], int sum) {
//         // code here
//         int n=coins.length;
//         int dp[][]=new int[n+1][sum+1];
//         for(int i[] : dp)
//         {
//             Arrays.fill(i,-1);
//         }
//         int ans= sumCoin(coins,sum,n,dp);
//         return ans==Integer.MAX_VALUE ? -1 : ans;
        
//     }
// }
