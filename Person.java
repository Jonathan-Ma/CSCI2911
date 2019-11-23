/*
 * 
 * 
 * 
 */
package inheritance;

/**
 *
 * @author jma1
 */
public class Person {
    private String name;
    private String email;
    private String phoneNumber;
    
    public Person(){
    name = "";
    email = "";
    phoneNumber = "";
    }
    
    public Person(String name, String email, String phoneNumber){
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
                
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getNumber(){
        return phoneNumber;
    }
    public void setNumber(String number){
        this.phoneNumber = phoneNumber;
    }
    public String toString(){
        return "Person name: " + name + "\nPerson email: " + email + "\nPerson phone number: " + phoneNumber;
    }
}
