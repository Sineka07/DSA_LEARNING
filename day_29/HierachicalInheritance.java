package day_29;

public class HierachicalInheritance {
    public static class Student
    {
        public String name;
        public int marks;

        void about() {
            {
                System.out.println("I am Study"+);
            }
        }
    }
    public class Boy extends Student{
        public String favGame;

        public void playGame
    }

    public class Girl extends Student{
        public boolean songname;
        Girl(boolean songname)
        {
            this.songname=songname;
        }
        
        void sing()
        {
            System.out.println("Girl Sings "+songname);
        }
    }
}
