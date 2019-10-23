//@author Jonathan Ma
//I am creating 6 methods for verb, noun, adverb, adjective, animal, and an exclamation word
import java.util.*;
import java.io.*;
public class MadLibs{
   
    public static String noun(){
    Random rand = new Random();
        String[] noun = {"Kaimuki","Kaimana","Waikiki","Beach","School","Koko Head","Sandy Beach"};
        String sNoun = noun[rand.nextInt(noun.length)];
        return sNoun;
    }
    
    public static String verb(){
        Random rand = new Random();
        String[] verb = {"running", "swimming","surfing","kayaking","hiking","shooting","gaming"};
        String sVerb = verb[rand.nextInt(verb.length)];
        return sVerb;
    }
    
    public static String animal(){
        Random rand = new Random();
        String[] animal = {"dog","shark","seagle","mongoose","turtle","seal","fish","hippo"};
        String sAnimal = animal[rand.nextInt(animal.length)];
        return sAnimal;
    }
   
   public static String adjective(){
       Random rand = new Random();
       String[] adjective = {"terrified","exhilarated","outraged","disgusted","intimidated","horrified"};
       String sAdjective = adjective[rand.nextInt(adjective.length)];
       return sAdjective;
   }
   
   public static String exclamation(){
       Random rand = new Random();
       String[] exclamation = {"yikes!","oh lord!","geez!","uh oh!","goodness gracious!","good god!"};
       String sExclamation = exclamation[rand.nextInt(exclamation.length)];
       return sExclamation;
   }
   
    public static void main(String[] args)throws IOException {
        System.out.println("Here is my Mad Libs story:");
        File file = new File("MadLibs.txt"); 
        if( !file.exists())
            {System.out.println("No file!");
        System.exit(0);
    }
        
        Scanner data = new Scanner(file);
        
        while( data.hasNextLine()){ 
            String story = data.nextLine();
            String[] words = story.split(" ");

             for (int i = 0; i < words.length; i++) {
                 String word = words[i];
                  
                 if(word.equals("_noun_"))
                 {
                     word=(noun());
                 }
                 if(word.equals("_verb_,"))
                {
                    word=(verb());
                }
                if(word.equals("_animal_"))
                {
                    word=(animal());
                }
                if(word.equals("_adjective_,"))
                {
                    word=(adjective());
                }
                if(word.equals("_exclamation_,"))
                {
                    word=(exclamation());
                }
            System.out.println(word);
        }
    }

            
    }
}