package day_28;

import java.util.*;
public class copyConstructor{
    public static class Student {
        public String name;
        public int marks;
        public int rollno;

        Student(String name,int marks,int rollno)
        {
            this.name=name;
            this.marks=marks;
            this.rollno=rollno;
            System.out.println("Default constructor called!");
        }

        Student(Student other)
        {
            this.name = other.name;
            this.marks = other.marks;
            this.rollno = other.rollno;
            System.out.println("Copy constructor called!");
        }

        void study()
        {
            System.out.println("Student study!!");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name=sc.next();
        int marks=sc.nextInt();
        int rollno=sc.nextInt();
        Student s=new Student(name,marks,rollno);
        Student s2=new Student(s);
        System.out.println("s Name : "+s.name);
        s2.study();
        s2.marks=90;
        System.out.println("s name: "+s.name);
        System.out.println("s2.name: "+s2.name);

        System.out.println("s marks: "+s.marks);
        System.out.println("s2 marks: "+s2.marks);

        System.out.println("s marks after modifying through s2: "+s.marks);
        System.out.println("s2 marks after modifying s2: "+s2.marks);
        sc.close();
    }
}
