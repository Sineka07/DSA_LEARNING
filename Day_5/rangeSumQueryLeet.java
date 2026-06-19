//Time Complexity: O(n) where n is the size of the array
//Space Complexity: O(n)
class NumArray {
    public int prefix[]=new int[100000];
    public NumArray(int[] nums) {
        int n=nums.length;
        prefix[0]=nums[0];
        for(int i=1;i<n;i++)
        {
            prefix[i]+=prefix[i-1]+nums[i];
        }
    }
    public int sumRange(int left, int right) {
        if(left==0)
           return prefix[right];
        int sum=prefix[right]-prefix[left-1];
        return sum;
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */