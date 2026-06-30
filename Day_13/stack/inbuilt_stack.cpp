#include <iostream>
#include <stack>
using namespace std;
int main()
{
    stack<int> st;

    int n;
    cout<<"Entet n: "<<endl;
    cin>>n;

    while(n--)
    {
        int elem;
        cout<<"Enter n elements one by one: "<<endl;
        cin>>elem;
        st.push(elem);
    }
}