package day_29;

public class MultipleInheritance {
    public static class Engineer {
        public String name;

        public Engineer(String name) {
            this.name = name;
        }

        void aboutEngineer() {
            System.out.println("Hey my name is : " + name);
        }
    }

    public static class Teacher {
        public String subject;

        public Teacher(String subject) {
            this.subject = subject;
        }

        void aboutTeacher() {
            System.out.println("I teach " + subject);
        }
    }

    public static class Youtuber {
        public int subscribers;

        public Youtuber(int subscribers) {
            this.subscribers = subscribers;
        }

        public void aboutYoutuber() {
            System.out.println("I have a subscribers count of " + subscribers);
        }
    }

    public static class Person extends Engineer {
        public int age;
        public Teacher teacher;
        public Youtuber youtuber;

        public Person(String name, int age, String subject, int subscribers) {
            super(name);
            this.age = age;
            this.teacher = new Teacher(subject);
            this.youtuber = new Youtuber(subscribers);
        }

        void aboutTeacher() {
            teacher.aboutTeacher();
        }

        void aboutYoutuber() {
            youtuber.aboutYoutuber();
        }
    }

    public static void main(String args[]) {
        Person p = new Person("Arun", 49, "Physics", 1000);

        p.aboutEngineer();
        p.aboutTeacher();
        p.aboutYoutuber();
    }
}


