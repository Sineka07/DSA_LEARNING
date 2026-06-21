//Time Complexity: O(n)
//Space Complexity: O(1)   

class Solution {
    public int maxArea(int[] height) {
        int l=0,r=height.length-1;
        int max=0;
        while(l<r)
        {
            int a=Math.min(height[l],height[r]);
            int b=r-l;
            int area=a*b;
            max=Math.max(max,area);
            if(height[l]<height[r])
                l++;
            else
                r--;
            
        }
        return max;
    }
}
