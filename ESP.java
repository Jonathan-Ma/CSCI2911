
import java.util.*;


public class ESP{

        static Scanner keyboard = new Scanner(System.in);
        static private Random rand = new Random();
        static private int fish, correct = 0;
        static private String inputU, fishC;
    
        public static void compFish() {  
            fish = rand.nextInt(5) + 1;
            if (fish == 1) {
                fishC = "ahi";
            } else if (fish == 2) {
                fishC = "opah";
            } else if (fish == 3) {
                fishC = "mahimahi";
            } else if (fish == 4) {
                fishC = "onaga";
            } else if (fish == 5) {
                fishC = "ono";
            }
    
        }
    
        public static void userInput() 
        {  
            System.out.println("");
            System.out.println("********************");
            System.out.println("I'm thinking of a fish!\nIs it Ahi, Opah, Mahimahi, Onaga, or Ono?");
            inputU = keyboard.nextLine().toLowerCase();
            
            while (!inputU.equals("ahi") && !inputU.equals("opah") && !inputU.equals("mahimahi") && !inputU.equals("onaga") && !inputU.equals("ono")) //        while(!inputU.equalsIgnoreCase("Ahi"))
            {
                System.out.println("Please type one of the 5 types of fish: Ahi, Opah, Mahimahi, Onaga, or Ono.");
                inputU = keyboard.nextLine();
            }
            
    
        }
    
        
        public static void correct() {   

            if (inputU.equalsIgnoreCase(fishC)) {
                System.out.println("The computer guessed " + fishC + " too. Good job!");
                correct++;
            } else {
                System.out.println("Your guess was wrong! Better luck next time!");
            }
        }
    
        public static void main(String[] args) {
            for (int i = 0; i < 10; i++) {  
                compFish();
                userInput();
                correct();
            }
            System.out.println("You got: " + correct + "out of 10 correct");
        }
    }
    
    

    


