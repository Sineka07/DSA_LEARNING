//Time Complexity: O(n)
//Space Complexity: O(1)
import java.util.*;
class Solution {
    public boolean isVowel(char i)
    {
        return i=='a'||i=='i'||i=='o'||i=='u'||i=='e';
    }
    public int maxVowels(String s, int k) {
        int max=Integer.MIN_VALUE;
        int n=s.length();
        int i=0;
        int j=0;
        int cnt=0;
        while(j<n)
        {
            if(isVowel(s.charAt(j)))
            {
                cnt++;
            }
            if(j-i+1<k)
            {
                j++;
            }
            else if(j-i+1==k)
            {
                max=Math.max(max,cnt);
                if(isVowel(s.charAt(i)))
                {
                    cnt--;
                }
                i++;
                j++;
            }
        }
        return max;
    }
}