
// Mariam Khaled
public class Booking {
    public String date;
    public String startTime;
    public String endTime;
    private Player player;
    private Playground playground;
    private int totalPrice;

    public Booking (String date, String startTime, String endTime, Player player, Playground playround ){
        this.date = date;
        this.startTime = startTime;
        this.endTime = endTime;
        this.player = player;
        this.playground = playground;
    }

    public void showBookingDetails(){
        System.out.println ( "Booking details: " );
        System.out.println ( "Date: "+date);
        System.out.println("Start time: "+startTime+", End Time: "+endTime );
        System.out.println ( "price per hour: "+ playground.getPricePerHour()+", total price: "+totalPrice);
    }

    public int showTotalPrice(){
        int initialPrice = Integer.parseInt ( endTime ) - Integer.parseInt ( startTime );
        totalPrice = initialPrice * (playground.getPricePerHour());
        return totalPrice;
    }


}
