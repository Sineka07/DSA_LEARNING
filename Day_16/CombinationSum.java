package Day_16;
//Time Complexity: O(2^n)
//Space Complexity: O(n)
import java.util.ArrayList;
import java.util.List;
class CombinationSum {
    void getAllSubset(int nums[],int idx,int target,List<Integer>ans,List<List<Integer>>finalans)
    {
        if(idx==nums.length)
        {
            if(target==0)
            {
                finalans.add(new ArrayList<>(ans));
            }
            return;
        }


        if(nums[idx]<=target)
        {
            ans.add(nums[idx]);
            getAllSubset(nums,idx,target-nums[idx],ans,finalans);
            ans.remove(ans.size()-1);
        }
        getAllSubset(nums,idx+1,target,ans,finalans);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        int n=candidates.length;
        List<List<Integer>>finalans=new ArrayList<>();
        List<Integer>ans=new ArrayList<>();
        getAllSubset(candidates,0,target,ans,finalans);
        return finalans;
        
    }
}
