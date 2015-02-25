import java.util.HashMap;
/**
 * Write a description of class AgendaTelefonica here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AgendaTelefonica
{
    // instance variables - replace the example below with your own
    private HashMap<String, String> agenda;

    /**
     * Constructor for objects of class AgendaTelefonica
     */
    public AgendaTelefonica()
    {
        agenda = new HashMap<>();

    }

    /**
     * introduce un nuevo registro a la agenda
     * @
     * @
     */
    public void enterNumber(String name, String number){
        agenda.put(name, number);
    }

    public String lookupNumber(String name){
        return agenda.get(name);
    }

    /**
     * Print all keys
     */
    public void printAllNames()
    {
       System.out.println(agenda.keySet());
    }
}
