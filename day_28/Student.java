package day_28;
import java.util.*;
public class Student {

    private String studentName;
    private int studentRollno;
    private int marks;
    private String branch;
    private boolean isPresent;

    public Student(String studentName,int studentRollno,int marks,String branch, boolean isPresent)
    {
        this.studentName=studentName;         
        this.studentRollno=studentRollno;
        this.marks=marks;
        this.branch=branch;
        this.isPresent=isPresent;   
    } 
    Student()
    {
        System.out.println(name)  
      }
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    Student (int Rollno,int student)
    public void setStudentRollno(int studentRollno) {
        this.studentRollno = studentRollno;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public void setPresent(boolean isPresent) {
        this.isPresent = isPresent;
    }

    public String getStudentName() {
        return studentName;
    }

    public int getStudentRollno() {
        return studentRollno;
    }

    public int getMarks() {
        return marks;
    }

    public String getBranch() {
        return branch;
    }

    public boolean isPresent() {
        return isPresent;
    }

    

}
public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    String name=sc.nextLine();
    System.out.println("Enter Student Name: ");
    Student student = new Student(name, rollNo, marks, branch, isPresent);
    System.out.println("Student name:"+student.getStudentName());

}
