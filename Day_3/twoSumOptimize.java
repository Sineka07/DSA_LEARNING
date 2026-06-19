package Day_3;
//Time complexity: O(nlog2n)
//space complexity: O(n)
import java.util.Arrays;

public class Solution {
    class Pair{
        int val;
        int ind;
        public Pair(int val,int ind)
        {
            this.val=val;
            this.ind=ind;
        }
    }
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        
        Pair num[]=new Pair[n];
        for(int i=0;i<num.length;i++)
        {
             num[i]=new Pair(nums[i],i);
        }
        Arrays.sort(num,(a,b)->Integer.compare(a.val,b.val));
        int s=0;
        int e=n-1;
        while(s<e)
        {
            int temp=num[e].val+num[s].val;
            if(temp==target)
            {
                return new int[]{num[s].ind,num[e].ind};
            }
            else if(temp<target)
            {
                s++;
            }
            else
            {
                e--;
            }
        }
        return new int[]{};

        
    }
} {
    
}
