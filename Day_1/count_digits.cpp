//Time complexity: O(n)
//space complexity: O(1)
class Solution {
  public:
    int countDigits(int n) {
        // Code here
        int cnt=0;
        while(n>0)
        {
            int d=n%10;
            cnt++;
            n/=10;
        }
        return cnt;
    }
};