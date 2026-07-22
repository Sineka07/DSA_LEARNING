package day_28;

import java.util.Scanner;

public class customCopyConstructor {
    public static class Student
    {
        public String name;
        public int marks;

        public Student(String name,int marks)
        {
            this.name=name;
            this.marks=marks;
            System.out.println("Parameterized Constructor called");
        }

        public Student(Student st)
        {
            this.name=st.name;
            this.marks=st.marks;
            System.out.println("Copy constructor called");
        }

        void eat()
        {
            System.out.println("Student is eating");
        }

    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String name=sc.next();
        int marks=sc.nextInt();
       
        Student s=new Student(name,marks);
        Student s2=new Student(s);
        System.out.println("s2 marks="+s2.marks);
        System.out.println("s2 name = "+s2.name);
    }
}
