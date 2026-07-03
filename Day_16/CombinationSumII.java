package Day_16;
import java.util.ArrayList;
import java.util.Arrays;
class Solution {
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
            getAllSubset(nums,idx+1,target-nums[idx],ans,finalans);
            ans.remove(ans.size()-1);
        }
        int nextidx=idx+1;
        while(nextidx<nums.length && nums[idx]==nums[nextidx])
        {
            nextidx++;
        }
        getAllSubset(nums,nextidx,target,ans,finalans);
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>>finalans=new ArrayList<>();
        List<Integer>ans=new ArrayList<>();
        getAllSubset(candidates,0,target,ans,finalans);
        return finalans;
    }
}
