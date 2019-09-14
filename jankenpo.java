import java.util.Random;
import java.util.Scanner;
public class jankenpo {
public static void main(String[] args) {
while(true){
System.out.println("Let's play JanKen Po!");
System.out.println("Please enter your choice.");
System.out.println("Type in 1 for rock, 2 for paper or 3 for scissors, and press enter.");
Scanner choice = new Scanner(System.in);
int rps = choice.nextInt();
Random cChoice = new Random();
int cChoiceRand = cChoice.nextInt(3) + 1;
if(rps<4 && rps>0) {
if (rps == 1)
System.out.println("You chose: Rock");
if (rps == 2)
System.out.println("You chose: Paper");
if (rps == 3)
System.out.println("You chose: Scissors");
if (cChoiceRand == 1)
System.out.println("The computer chose: Rock");
if (cChoiceRand == 2)
System.out.println("The computer chose: Paper");
if (cChoiceRand == 3)
System.out.println("The computer chose: Scissors");
System.out.println("The result is:");
if (rps == cChoiceRand)
System.out.println(" a tie");
if (rps == cChoiceRand+1)
System.out.println(" you win");
if (rps == cChoiceRand-1)
System.out.println(" the computer wins");
if (rps==1 && cChoiceRand==3)
System.out.println(" you win");
if (rps==3 && cChoiceRand==1)
System.out.println(" the computer wins");
System.out.println("\n");
}
if (rps>3 || rps<1) {
System.out.println("That is not a choice. Please type in 1 for rock, 2 for paper or 3 for scissors, and press enter");
}
}
}
}

