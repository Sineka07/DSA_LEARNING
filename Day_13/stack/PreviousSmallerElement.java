package Day_13.stack;
import java.util.ArrayList;
import java.util.Stack;
class PreviousSmallerElement {
    public static ArrayList<Integer> prevSmaller(int[] arr) {
        // code here
        int n=arr.length;
        ArrayList<Integer>res=new ArrayList<>();
        Stack<Integer>st=new Stack<>();
        for(int i=0;i<n;i++)
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
        return res;
    }
}
