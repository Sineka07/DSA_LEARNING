package destructor;
import java.util.*;
class destructor{
class Student
{
    String name;
    int marks;
    
    Student(String name, int marks)
    {
        this.name=name;
        this.marks=marks;
        System.out.println("Parameterrised constructor called! ");
    }
    // Student()
    // {
    //     remove marks;
    //     System.out.println("Destructor called!");
    // }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        int marks=sc.nextInt();
        Student st=new Student(name,marks);
        System.out.println("Name "+st.name+"Marks "+st.marks);
    }
}
}