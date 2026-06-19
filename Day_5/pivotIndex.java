public class pivotIndex {
    
}
class Solution {
    int suffix[]=new int[]{100000};
    int prefix[]=new int[]{100000};
    public int pivotIndex(int[] nums) {
        int n=nums.length;
        int tot=0;
        for(int i=0;i<n;i++){
            
            tot+=nums[i];
        }
        int left_sum=0;
        int right_sum=0;
        for(int i=0;i<n;i++){
            
            right_sum=tot-left_sum-nums[i];
            if(left_sum==right_sum){
                return i;
            }
            left_sum+=nums[i];
        }
            
        return -1;
    }
}