package Day_18;
import java.util.Scanner;
public class Print_1_toN {
    public void print(int n)
    {
        //base case
        if(n==0)
        {
            return;
        }
        //recursive call or Hypothesis
        print(n-1);
        System.out.print(n+" ");
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Print_1_toN obj=new Print_1_toN();
        obj.print(n);

    }

}