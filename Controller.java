
/**
 * Write a description of class Controller here.
 *
 * @author (Ieman S.)
 * @version (25.10.2024)
 */
public class Controller
{
    // instance variables 
    private String surname;
    private String controllerID;

    /**
     * Constructor for objects of class Controller
     */
    public Controller(String controllerSurname, String playerControllerID)
    {
        surname = controllerSurname;
        controllerID = playerControllerID;
    }

    /**
     * Mutator method
     */
    public void setSurname (String controllerSurname)
    {
        surname = controllerSurname;
    }
    
    public void setControllerID (String playerControllerID)
    {
        controllerID = playerControllerID;
    }
    
    /**
     * Accessor method
     */
    public String getcontrollerSurname() 
    {
        return surname;
    }
    
    public String getPlayerControllerID() 
    {
        return controllerID;
    }
}
