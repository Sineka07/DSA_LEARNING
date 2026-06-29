//Time Complexity: O(n*m) where n is the number of queries and m is the size of the array
//Space Complexity: O(1)
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.*;
import java.util.stream.Collectors;
class Solution {
    public ArrayList<Integer> rangeSumQueries(int[] arr, int[][] queries) {
        // code here
        int n=queries[0][0];
        int m=queries[0][1];
        int sum=0;
        int res=0;
        for(int j=0;j<queries.length;i++)
        {
            for(int i=n;i<=m;i++)
            {
                sum+=arr[i];
            }
            for(int i=queries[1][0];i<queries[1][1];i++)
            {
                res+=arr[i];
            }
            
        return new int[]{sum,res};
        
        }
        return new int[]{};
        
        
    }
}
