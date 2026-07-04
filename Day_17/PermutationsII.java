package Day_17;

class PermutationsII {
    void getAllPermutation(List<Integer>nums,List<Integer>ans,List<List<Integer>>finalans)
    {
        if(nums.size()==0)
        {
            finalans.add(new ArrayList<>(ans));
            return;
        }
        HashSet<Integer>res=new HashSet<>();
        for(int i=0;i<nums.size();i++)
        {
            int j=nums.get(i);
            if(!res.contains(j))
            {
                res.add(j);
                ArrayList<Integer>newIp=new ArrayList<>(nums);
                newIp.remove(i);
                ArrayList<Integer>newOp=new ArrayList<>(ans);
                newOp.add(j);
                getAllPermutation(newIp,newOp,finalans);
            }
            
        }
    }
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<Integer>res=new ArrayList<>();
        for(int i: nums)
        {
            res.add(i);
        }
        List<List<Integer>>finalans=new ArrayList<>();
        List<Integer>ans=new ArrayList<>();
        getAllPermutation(res,ans,finalans);
        //Collections.sort(finalans);
        return finalans;
    }
}