/**
 * Represents the player who is a kind of user, but he is the one that books the playground and add members
 * to his team and invite them.
 * @author Mariam Khaled
 * @version 1.0
 * @since June 2021
 *
 */
public class Player extends User {
    private Booking[] book;
    private Team team;
    private int bookIndex = 0;

    /**
     * Displays all the current booking of that player.
     */
    public void showBooking(){
        if (bookIndex != 0) {
            for (int i = 0; i <= book.length; i++) {
                System.out.println ( "Booking #" + i );
                book[i].showBookingDetails ( );
            }
        }
        else{
            System.out.println ( "No Current bookings !" );
        }
    }

    /**
     * Cancels a booking for the player.
     * @param booking Represents the booking that will be deleted
     */
    public void cancelBooking (Booking booking){
        // didn't check cancellation period as it is out of scope
        int index=-1;
        for (int i=0; i<=book.length; i++){
            if ( booking.date.equals ( book[i].date ) &&
                    booking.startTime.equals ( book[i].startTime ) && booking.endTime.equals ( book[i].endTime ) ){
                index = i;
                break;
            }
        }
        if (index != -1) {
            //check if condition is < or <=
            System.arraycopy ( book , index + 1 , book , index , book.length - index );
            bookIndex--;
            System.out.println ( "Booking cancelled successfully!" );
        }
        else{
            System.out.println ( "Booking doesn't exist!" );
        }

    }

    /**
     * Adds a new booking to that player's bookings.
     * @param booking Represents the booking that the player wants to make
     */
    public void addBooking(Booking booking){
        //didn't get in the details of money transaction (out of required scope)
        if (booking.playground.checkBooking(booking) && booking.playground.getStatus().equals ( "Activate" )) {
            bookIndex++;
            book[bookIndex] = booking;
            System.out.println ( "Booking added successfully!" );
        }
        else if (!booking.playground.getStatus().equals ( "Activate" )){
            System.out.println ( "Playground cannot be booked right now !" );
        }
        else{
            System.out.println ( "Booking date and time are not available!" );
        }
    }

    /**
     * Creates a team to that player, includes other players that he will add
     * @param team Represents the team members that he wants to add as his team on his profile.
     */
    // out of the required scope
    public void createTeam (Team team){}

}
