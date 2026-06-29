//Time complexity: O(n) 
//space complexity: O(1)
#include <iostream>
using namespace std;
int main()
{
    int nums[5]={1,2,3,4,5};
    for(int i=1;i<=4;i++){
        int a=nums[i]*nums[i];
        cout<<a;
    }
}