package Day_15;
import java.util.*;
class AllSequencesOfString {
    void allSubsequences(String s,int idx,String ans,List<String>finalans)
    {
        if(idx==s.length())
        {
            finalans.add(ans);
            return;
        }
        allSubsequences(s,idx+1,ans,finalans);
        
        allSubsequences(s,idx+1,ans+s.charAt(idx),finalans);
    }
    public List<String> powerSet(String s) {
        // Code here
        int n=s.length();
        ArrayList<String>res=new ArrayList<>();
        String ans="";
        allSubsequences(s,0,ans,res);
        Collections.sort(res);
        return res;
    }
}