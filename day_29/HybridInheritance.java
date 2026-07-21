package day_29;

public class HybridInheritance {
    public static class Student
    {
        public String name;
        public int marks;

        public Student(String name)
        {
            this.name=name;
        }

        public void study()
        {
            System.out.println("Student study");
        }
    }

    public static class Male extends Student
    {
        public String gender;
        
        public Male(String name)
        {
            super(name);
        }
        
        public void maleIntro()
        {
            System.out.println("Gender is "+gender);
        }
    }

    public static class Female extends Student
    {
        String gender;
        
        public Female(String name)
        {
            super(name);
        }
        
        void FemaleIntro()
        {
            System.out.println("Gender is "+gender);
        }
    }

    public static class Boy extends Male
    {
        public Boy(String name, int marks, String gender)
        {
            super(name);
            this.marks=marks;
            this.gender=gender;
        }

        void boyIntro()
        {
            System.out.println("My name is "+name);
            System.out.println("My gender is"+gender);
            System.out.println("I got "+marks);
        }
    }

    public static class Girl  extends Female
    {
        public Girl(String name, int marks, String gender)
        {
            super(name);
            this.marks=marks;
            this.gender=gender;
        }

        void girlIntro()
        {
            System.out.println("My name is "+name);
            System.out.println("My gender is"+gender);
            System.out.println("I got "+marks);
        }
    }

    public static void main(String[] args) {
        Boy b=new Boy("Rahul",100,"Male");
        b.study();
        b.maleIntro();
        Girl g=new Girl("Sineka",500,"Female");
        g.FemaleIntro();
    }
}
