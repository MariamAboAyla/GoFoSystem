
// Mariam Khaled
public class Player extends User {
    private Booking book[];
    private Team team;

    public void showBooking(){
        for (int i=0; i<book.length; i++){
            int price = book[i].showTotalPrice ();
        }
    }

    public void cancelBooking (Booking booking){

    }

    public void addBooking(Booking book){

    }

    // not necessary to be implemented
    public void createTeam (Team team){}

}
