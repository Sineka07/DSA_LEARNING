//Time complexity: O(n) 
//space complexity: O(1)
class Solution {
  public:
  
    int digitsInFactorial(int N) {
        // code here
        double res=1;
        for(int i=2;i<=N;i++)
        {
            res=res+log10(i);
        }
        return floor(res);
    }
};