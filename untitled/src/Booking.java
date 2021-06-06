
// Mariam Khaled
public class Booking {
    private String date;
    private String startTime;
    private String endTime;
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

    public int showTotalPrice(){
        int initialPrice = Integer.parseInt ( endTime ) - Integer.parseInt ( startTime );
        totalPrice = initialPrice * (playground.getPricePerHour());
    }


}
