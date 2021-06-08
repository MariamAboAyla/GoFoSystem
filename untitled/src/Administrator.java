
// Mariam Khaled
public class Administrator {
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

    //not implemented as it is currently out of scope
    public boolean deletePlayground (Playground playground){return false;}

}
