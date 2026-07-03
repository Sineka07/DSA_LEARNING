package Day_16;
//Time Complexity: O(2^n)
//Space Complexity: O(n)
import java.util.ArrayList;
import java.util.Arrays;
public class SubSetII {
    void getAllSubsets(int nums[],int idx,ArrayList<Integer>output,List<List<Integer>>finalOutput){
        //base case
        if(idx==nums.length){
            finalOutput.add(new ArrayList<>(output));
            return;
        }
        output.add(nums[idx]);
        getAllSubsets(nums,idx+1,output,finalOutput);
        output.remove(output.size()-1);
        int nextIdx=idx+1;
        while(nextIdx<nums.length &&nums[nextIdx]==nums[idx]){
            nextIdx++;
        }
        getAllSubsets(nums,nextIdx,output,finalOutput);
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        List<List<Integer>>finalans=new ArrayList<>();
        List<Integer>ans=new ArrayList<>();
        getAllSubsets(nums,0,ans,finalans);
        return finalans; 
    }
}
