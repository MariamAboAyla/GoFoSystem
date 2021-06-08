/**
 * Represents the administrator and the methods (functions) that he is capable of doing.
 * @author Mariam Khaled
 * @version 1.0
 * @since June 2021
 *
 */
public class Administrator {

    /**
     * Checks whether this playground should be added on the system, stay activate on the system or to be suspended. As
     * it change teh playground's state.
     * @param playground Tht represents the playground that the administrator will do action on
     * @return The state of the playground (True: will be added on the system (Active), False: will be suspended)
     */
    public boolean checkPlayground (Playground playground){
        if ( playground.getStatus ( ).equals ( "Suspend" ) ){
            // out of scope
            playground.updateStatus("Activate");
            return true;
        }
        else if (playground.getRate()<1.5 && playground.getStatus ( ).equals ( "Not_Activate" ) ){
            playground.updateStatus("Suspend");
            return false;
        }
        else{
            playground.updateStatus("Activate");
            return true;
        }
    }

    /**
     * It deletes a playground from the system.
     * @param playground
     * @return
     */
    //not implemented as it is currently out of scope
    public boolean deletePlayground (Playground playground){return false;}

}
