import java.util.HashMap;
/**
 * Simula una agenda telefonica.
 * 
 * @author Marcelino José Granda Muñoz
 * @version 2015-03-04
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
     * introduce un nuevo registro a la agenda indicandole 
     * el nombre y numero telefono
     * @param name nombre del propietario del numero
     * @param number numero de telefono asociado a name
     */
    public void enterNumber(String name, String number){
        agenda.put(name, number);
    }

    /**
     * retorna el numero asociado al nombre de la persona introducido
     * @param name nombre de la persona que se desa saber el nombre
     * @return numero asociado al nombre  o null si no hay un registro con ese conmbre
     */
    public String lookupNumber(String name){
        return agenda.get(name);
    }

    /**
     * imprime todos los nombres delaagenda
     */
    public void printAllNames()
    {
       System.out.println(agenda.keySet());
    }
}
