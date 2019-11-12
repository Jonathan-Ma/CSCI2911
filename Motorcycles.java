import java.util.*;

public class Motorcycles{
    //getters and setters
    private int year;
    private String make;
    private double speed;

    public void Motorcycle(int y, String m){
        year = y;
        make = m;
    }
    public void Motorcycle(){
    make="";
    speed=0.0;
    year=0;
    }
    public int getYear(){
        return year;
    }
    public String getMake(){
        return make;
    }
    public double getSpeed(){
        return speed;
    }
    
    public void setMake(String make){
        this.make = make;
    }
    
    public void setYear(int year){
        this.year = year;
    }

    public double accelerate(double a) {
        a = speed += 5;
        return a;
    }

    public double brake(double b) {
        b = speed -= 5;
        return b;
    }

    public static void main(String[] args) {
        //Main code
        Scanner keyboard = new Scanner(System.in);
        Motorcycles motor = new Motorcycles();
        boolean condition;

        System.out.println("Please enter your motorcycle make.");//make of motorcycle
        System.out.print(">>>");
        motor.setMake(keyboard.nextLine());

        do{ //loop to check year
            System.out.println("Now enter the motorcycles year.");
            System.out.print(">>>");
            
            int year = keyboard.nextInt();
            if (year >= 1900 && year <= 2018) { 
                motor.setYear(year);
                condition = true;
            } else {
                condition = false;
            }
            
        }while(!condition);

        System.out.println("How many times do you want to accelerate?");    //loop for accelerating     
        int c = keyboard.nextInt();
        for (int i = 0; i <= c; i++) { 
            System.out.println("A " + motor.getYear() + " " + motor.getMake() + " is going " + motor.accelerate(0.0));
        }
        for (int i = 0; i <= c; i++) { //loop for the brakeing 
            System.out.println("A " + motor.getYear() + " " + motor.getMake() + " is going " + motor.brake(0.0));

        


    }
    
}
}