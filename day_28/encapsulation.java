package day_28;

import java.util.Scanner;

public class encapsulation {
    public static class Student
    {
        private int marks;
        private String address;
        public String name;

        public Student(String name, int marks, String address)
        {
            this.name = name;
            this.marks = marks;
            this.address = address;
        }

        public Student(Student other)
        {
            this.name = other.name;
            this.marks = other.marks;
            this.address = other.address;
        }

        void writecode()
        {
            System.out.println("Student writes code");
        }

        void getMarks()
        {
            System.out.println("Marks: "+marks);
        }

        void displayData()
        {
            System.out.println("Marks are: "+marks);
            System.out.println("Name is: "+name);
            System.out.println("Address is: "+address);
        }

        void setMarks(int marks)
        {
            this.marks = marks;
            System.out.println("Marks updated");
        }

        void setData(String name, int marks, String address)
        {
            this.name = name;
            if(marks >= 0)
            {
                this.marks = marks;
            }
            this.address = address;
        }
    }
     public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int marks=sc.nextInt();
        String name=sc.next();
        String address=sc.next();
        Student s1=new Student(name,marks,address);
        Student s2=new Student(s1);
        System.out.println("\nStudent 1 Details:");
        s1.displayData();

        // Update marks using setter
        s1.setMarks(95);

        System.out.println("\nAfter Updating Marks:");
        s1.displayData();

        System.out.println("\nCopied Student Details:");
        s2.displayData();

        sc.close();
    }
    
}
