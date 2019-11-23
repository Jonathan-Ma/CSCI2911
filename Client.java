/*  Client
 * -clientNumber; String
 * -mailingList; boolean
 * +
 * 
 */
package inheritance;

/**
 *
 * @author jma1
 */
public class Client extends Person{
   private String clientNum;
   private boolean mailingList;
    
    public Client(){
        clientNum = "";
        mailingList = true;
    }
    public Client(String name, String email, String phoneNumber, String clientNum, boolean mailingList){
        super(name,email,phoneNumber);
        this.clientNum = clientNum;
        this.mailingList = mailingList;
    }
    public void setclientNum(String clientNum){
        clientNum = clientNum;
    }
    public void setmailingList(boolean mailingList){
        mailingList = mailingList;
    }
    public String toString(){
        return "Client name: " + getName() + "\nClient email: " + getEmail() + "\nClient phone number: " + getNumber() + "\nClient num:" + clientNum + "\nMailing list: " + (mailingList?"Yes":"No");
    }
}
