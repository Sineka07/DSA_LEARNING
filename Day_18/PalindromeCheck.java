//Time Complexity: O(n)
//Space Complexity: O(n)
class PalindromeCheck {
    public boolean isPali(String s,int i,int j)
    {
        int n=s.length();
        if(i>=j)
           return true;
        if(s.charAt(i)!=s.charAt(j))
           return false;
        return isPali(s,i+1,j-1);
    }
    boolean isPalindrome(String s) {
        // code here
        int n=s.length();
      
        return isPali(s,0,n-1);
    }
public static void main(String[] args) {
        PalindromeCheck pc=new PalindromeCheck();
        String s="abccba";
        System.out.println(pc.isPalindrome(s));
    }

}