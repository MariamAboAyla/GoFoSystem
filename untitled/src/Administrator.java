package com.company;

/**
 * Represents the administrator and the methods (functions) that he is capable of doing.
 * @author Mariam Khaled
 * @version 1.0
 * @since June 2021
 *
 */
public class Administrator {
    ///////////////////////////////////methods/////////////////////////////////////
    /**
     * Checks whether this playground should be added on the system, stay activate on the system or to be suspended. As
     * it change teh playground's state.
     * @param playground Tht represents the playground that the administrator will do action on
     * @return The state of the playground (True: will be added on the system (Active), False: will be suspended)
     */
    public Playground checkPlayground (Playground playground,String status){
        if ( status.equalsIgnoreCase( "Not_Activate" ) ){
            // out of scope
            playground.updateStatus(Status.Not_Activate);
        }
        else if (playground.getRate()<1.5 && status.equalsIgnoreCase( "suspend" ) ){
            playground.updateStatus(Status.Suspend);
        }
        else {
            playground.updateStatus(Status.Activate);
        }
        return playground;
    }

    /**
     * It deletes a playground from the system.
     * @param playground
     * @return object of playground
     */
    //not implemented as it is currently out of scope
    public Playground deletePlayground (Playground playground)
    {
        playground.updateStatus(Status.deleted);
        return playground;
    }
}
