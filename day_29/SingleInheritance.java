package day_29;

public class SingleInheritance {
    
    public static class Vehicle
    {
        public int speed;
        public String color;
        public int gears;
        public int wheels;

        Vehicle()
        {
            System.out.println("it is an Deafault constructor ans the vehicle is ready to go!!! ❤️‍🔥🪻💛");
        }
        void start()
        {
            System.out.println("Vehicle Starts!!!");
        }

        void applyBrakes()
        {
            System.out.println("Applying Brakes");
        }

    }
    public static class Car extends Vehicle{
        public String brandname;
        
        public Car(int speed,String color, int wheels,String brandname)
        {
            this.speed=speed;
            this.color=color;
            this.wheels=wheels;
            this.brandname=brandname;
        }
        void OpenSunroof()
        {
            System.out.println("Opening sunroof!!!");
        }

        void display()
        {
            System.out.println("Speed: "+speed);
            System.out.println("Color : "+color);
            System.out.println("Number of wheels: "+wheels);
            System.out.println("BrandName: "+brandname);
        }
    }
    public static void main(String args[])
    {
        Car c=new Car(200,"black",4,"mahindra");
        
        c.display();
        c.start();
        c.applyBrakes();
        
    }
}
