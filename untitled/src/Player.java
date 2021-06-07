
// Mariam Khaled
public class Player extends User {
    private Booking book[];
    private Team team;
    private int bookIndex = 0;

    public void showBooking(){
        for (int i=0; i<=book.length; i++){
            System.out.println ( "Booking #"+i );
            book[i].showBookingDetails ();
        }
    }

    public void cancelBooking (Booking booking){
        int index=-1;
        for (int i=0; i<=book.length; i++){
            if (booking.date == book[i].date &&
                    booking.startTime == book[i].startTime && booking.endTime == book[i].endTime ){
                index = i;
                break;
            }
        }
        if (index != -1) {
            //check if condition is < or <=
            for (int j = index; j < book.length; j++) {
                book[j] = book[j + 1];
            }
            bookIndex--;
            System.out.println ( "Booking cancelled successfully!" );
        }
        else{
            System.out.println ( "Booking doesn't exist!" );
        }

    }

    public void addBooking(Booking booking){
        for ()


        bookIndex++;
        book[bookIndex] = booking;
        System.out.println ( "Booking added successfully!" );
    }

    // not necessary to be implemented
    public void createTeam (Team team){}

}
