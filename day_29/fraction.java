package day_29;

public class fraction {
    public class Fraction
    {
        public int num;
        public int denom;

        public Fraction()
        {
            this.num=0;
            this.denom=1;
        }

        public Fraction(int n,int d)
        {
            this.num=n;
            this.denom=d;
        }
       
        public Fraction add(Fraction f)
        {
            int newnum=(num*f.denom )+ (f.num * denom);
            int newdenom=(denom * f.denom);
            return new Fraction(newnum, newdenom);
        }

        public void display()
        {
            System.out.println(num+"/"+denom);
        }
    }

    public void main(String args[])
    {
        Fraction f1 = new Fraction(1,2);
        Fraction f2 = new Fraction(3,4);
        Fraction f3 = f1.add(f2);
        f3.display();
    }
}
