
// Mariam Khaled
public class Player extends User {
    private Booking[] book;
    private Team team;
    private int bookIndex = 0;

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

    // out of the required scope
    public void createTeam (Team team){}

}
