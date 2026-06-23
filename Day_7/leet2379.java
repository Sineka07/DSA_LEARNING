//Time Complexity: O(n)
//Space Complexity: O(1)
class Solution {
    public int minimumRecolors(String blocks, int k) {
        int n=blocks.length();
        int i=0,j=0;
        int cnt=0;
        int min=Integer.MAX_VALUE;
        while(j<n)
        {
            if(blocks.charAt(j)=='W')
            {
                cnt++;
            }
            if(j-i+1<k)
            {
                j++;
            }
            else if(j-i+1==k)
            {
                min=Math.min(min,cnt);
                if(blocks.charAt(i)=='W')
                {
                    cnt--;
                }
                i++;
                j++;
            }
        }
        return min;
    }
}