/*     Person
 * -name; String
 * -phoneNumber; String
 * -email; String
 * +
 * 
 * 
 */
package inheritance;

/**
 *
 * @author jma1
 */
public class Inheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Client dog = new Client ("Dog", "bark@gmail.com", "123-123-1234", "123-pug", true);
        System.out.println(dog);
        System.out.println(" ");
        Client cat = new Client ("Cat", "meow@gmail.com", "9876544321", "888-cat", false);
        System.out.println(cat);
    }
    
    
}
