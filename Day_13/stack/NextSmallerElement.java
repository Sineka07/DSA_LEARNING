package Day_13.stack;
import java.util.ArrayList;
import java.util.Stack;
class Solution {
    static void reverse(ArrayList<Integer> res) {
        int left = 0;
        int right = res.size() - 1;
        while (left < right) {
            int temp=res.get(left);
            res.set(left, res.get(right));
            res.set(right, temp);
            left++;
            right--;
        }
    }
    public static ArrayList<Integer> nextSmallerEle(int[] arr) {
        // code here
        int n=arr.length;
        ArrayList<Integer>res=new ArrayList<>();
        Stack<Integer>st=new Stack<>();
        for(int i=n-1;i>=0;i--)
        {
            int elem=arr[i];
            if(st.size()==0)
            {
                res.add(-1);
            }
            else if(st.size()>0 && st.peek()<elem)
            {
                res.add(st.peek());
            }
            else if(st.size()>0 && st.peek()>=elem)
            {
                while(st.size()>0 && st.peek()>=elem)
                {
                    st.pop();
                }
                if(st.size()==0)
                {
                    res.add(-1);
                }
                else
                {
                    res.add(st.peek());
                }
            }
            st.push(elem);
        }
        reverse(res);
        return res;
    }
}
