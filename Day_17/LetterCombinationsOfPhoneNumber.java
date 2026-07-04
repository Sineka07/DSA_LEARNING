import java.util.ArrayList;
import java.util.List;
//Time Complexity: O(4^n)
//Space Complexity: O(n)
class LetterCombinationsOfPhoneNumber {
    
    String[] mapping={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};

    void helper(String s,int idx,String[] mapping,String ans,List<String>finalans)
    {
        if(s.length()==idx)
        {
            finalans.add(ans);
            return;
        }
        String letter=mapping[s.charAt(idx)-'0'];
        for(int i=0;i<letter.length();i++)
        {
            char c=letter.charAt(i);
            helper(s,idx+1,mapping,ans+c,finalans);
        }
    }
    public List<String> letterCombinations(String digits) {
        List<String>finalans=new ArrayList<>();
        String ans="";
        helper(digits,0,mapping,ans,finalans);
        return finalans;
    }
}