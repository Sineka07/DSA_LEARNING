package day_29;

public class MultiLevelInheritance {
    public static class Engineer
    {
        public String name;
        public String role;

        public Engineer(String name, String role)
        {
            this.name=name;
            this.role=role;
        }
        
        void intro()
        {
            System.out.println("My name is "+name);
        }

    }
    public static class Employee extends Engineer
    {
        public  int salary;
        public  String role;

        public Employee(String name, String role, int salary)
        {
            super(name, role);
            this.salary = salary;
            this.role = role;
        }

        void aboutEmployee()
        {
            System.out.println("I work as a "+role);
            System.out.println("My Salary is: "+salary);
        }
    }

    public static class Manager extends Employee
    {
        public String dept;
        public int numOfEmployee;

        public Manager(String name,int salary, String role, String dept, int numOfEmployee)
        {
            super(name, role, salary);
            this.dept=dept;
            this.numOfEmployee=numOfEmployee;
        }

        void aboutdManager()
        {
            System.out.println("I work in "+dept);
            System.out.println("I lead a team of "+numOfEmployee);
        }

        void display()
        {
            System.out.println("Name: "+name);
            System.out.println("Salary: "+salary);
            System.out.println("Role: "+role);
            System.out.println("Department: "+dept);
            System.out.println("Number of Working Employess: "+numOfEmployee);
        }
    }
    public static void main(String args[])
    {
        Manager x=new Manager("Bala",500000,"Software Engineer","IT",50);
        
        x.display();
        x.aboutEmployee();
        x.aboutdManager();    
    }
}
