//Time complexity: O(nlog2n)
//space complexity: O(n)
class Solution {
    class Pair{
        int val;
        int ind;
        public Pair(int val,int ind)
        {
         this.val=val;
            this.ind=ind;
        }
    }
    public int[] twoSum(int[] numbers, int target) {
        int n=numbers.length;
        Pair num[]=new Pair[n];
        for(int i=0;i<num.length;i++)
        {
            num[i]=new Pair(numbers[i],i);
        }
        int s=0;
        int e=num.length-1;
        while(s<e)
        {
            int temp=num[s].val+num[e].val;
            if(temp==target)
            {
                return new int[]{num[s].ind+1,num[e].ind+1};
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
        
    }
