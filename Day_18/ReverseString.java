import java.util.Scanner;
public class ReverseString {
    void helper(char[] s,int i,int j)
    {
        if(i>=j)
        {
            return;
        }
        char temp=s[i];
        s[i]=s[j];
        s[j]=temp;
        helper(s,i+1,j-1);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char[] arr=s.toCharArray();
        int n=arr.length;
        ReverseString obj=new ReverseString();
        obj.helper(arr,0,n-1);
        System.out.println(new String(arr));
    }
    
}
