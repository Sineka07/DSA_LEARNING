package Day_17;
import java.util.ArrayList;
import java.util.Collections;
//Time Complexity: O(n!)    
//Space Complexity: O(n)
class Solution {
    void getAllPermutation(String s,String output,ArrayList<String>ans)
    {
        if(s.length()==0)
        {
            ans.add(output);
            return;
        }
        int n=s.length();
       
        for(int i=0;i<n;i++)
        {
            char c=s.charAt(i);
            String input=s.substring(0,i)+s.substring(i+1);
            String newOp=output+c;
            getAllPermutation(input,newOp,ans);
        }
        return;
    }
    public ArrayList<String> permutation(String s) {
        // code here
        int n=s.length();
        String output="";
        ArrayList<String>ans=new ArrayList<>();
        
        getAllPermutation(s,output,ans);
        Collections.sort(ans);
        return ans;
  
    }
}
