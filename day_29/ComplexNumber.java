package day_29;

public class ComplexNumber {
    public class Complex
    {
        public int a;
        public int b;

        public Complex()
        {
            this.a=0;
            this.b=0;
        }

        public Complex(int a,int b)
        {
            this.a=a;
            this.b=b;
        }
       
        public Complex add(Complex c)
        {
            int newreal=a+ c.a;
            int newimag=b+c.b;
            Complex temp=new Complex(newreal, newimag);
            return temp;
        }

        public void display()
        {
            System.out.println(a+"+"+b+"i");
        }
    }

    public void main(String args[])
    {
        Complex f1 = new Complex(2,3);
        Complex f2 = new Complex(3,4);
        Complex f3 = f1.add(f2);
        f3.display();
    }
}
