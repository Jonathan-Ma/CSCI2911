/*Jonathan Ma


/** */
import java.util.*;
public class Conversion{
public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    double user;
    int choice;
    double converted;
    
    
   do{
       System.out.println("Please enter the number of meters you want to convert.");
    user = keyboard.nextDouble();
       menu();
       System.out.println("Enter your choice: ");
       
       choice = keyboard.nextInt();
       
       
       if(choice == 1){
       kilometer(user);
       System.out.println(user + " meters is " + kilometer(user) + " kilometers");
       System.out.println(" ");
       }
       if(choice == 2){
           inches(user);
           System.out.println(user + " meters is "+ inches(user) + " inches");
           System.out.println(" ");
       }
       if(choice == 3){
           feet(user);
           System.out.println(user + " meters is "+ feet(user)+ " feet");
           System.out.println(" ");
       }
       if(choice == 4){
           yard(user);
           System.out.println(user+ " meters is "+ yard(user)+ " yards");
           System.out.println(" ");
       }
       if(choice > 5 || choice <1){
           System.out.println("Try again");
           System.out.println(" ");
       }
    }
    while(choice <= 6 && choice >= 1);
    
}

public static void menu()
{
    System.out.println("1. Convert to kilometers\n2. Convert to inches\n3. Convert to feet\n4. Convert to yards\n5. Quit the program");
    System.out.println(" ");
}
public static double kilometer(double user)
{
    return  user * 0.001;
}

public static double inches(double user)
{
    return user * 39.3701;
}
public static double feet(double user)
{
    return user * 3.28084;
}
public static double yard(double user)
{
    return user * 1.09361;
}
}


   

    

    
