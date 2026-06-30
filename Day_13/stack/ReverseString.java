import java.util.ArrayList;
import java.util.Stack;
class ReverseString {
    public static String reverseString(String s) {
        // code here
        int n=s.length();
        Stack<Character>st=new Stack<>();
        for(int i=0;i<n;i++)
        {
            char c=s.charAt(i);
            st.push(c);
        }
        String ans="";
        while(!st.isEmpty())
        {
            ans+=st.pop();
        }
        return ans;
    }
}