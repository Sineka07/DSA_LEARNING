//Time complexity: O(n)
//space complexity: O(1)
class Solution {
  public:
    int isFibonacci(int n) {
        // code here
        int a=0;
        int b=1;
        for(int i=1;i<=n;i++)
        {
            int nx=a+b;
            a=b;
            b=nx;
            cout<<a<<" ";
        }
        
    }
};