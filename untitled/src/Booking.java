/**
 * Represents the booking as it sets booking details and show the booking details
 * in addition to the fact that it calculate the total price of the booking.
 * @author Mariam Khaled
 * @version 1.0
 * @since June 2021
 *
 */
public class Booking {
    public String date;
    public String startTime;
    public String endTime;
    public Player player;
    public Playground playground;
    private int totalPrice;

    /**
     * Creates a new booking and sets its details
     *
     * @param date       The booking date
     * @param startTime  The booking starting time
     * @param endTime    The booking ending time
     * @param player     The player that made that booking
     * @param playground The playground that is being booked
     */
    public Booking(String date, String startTime, String endTime, Player player, Playground playground) {
        this.date = date;
        this.startTime = startTime;
        this.endTime = endTime;
        this.player = player;
        this.playground = playground;
    }

    /**
     * A method that shows all the booking details (Date, start time, end time, playground price per hour, total price of booking)
     */
    public void showBookingDetails() {
        System.out.println("Booking details: ");
        System.out.println("Date: " + date);
        System.out.println("Start time: " + startTime + ", End Time: " + endTime);
        System.out.println("price per hour: " + playground.getPricePerHour() + ", total price: " + totalPrice);
    }

    /**
     * Represents the total price that the player should pay for this booking.
     *
     * @return The total price for this booking
     */
    public int showTotalPrice() {
        int startslot, endslot, diff;
        char[] convert1 = this.startTime.toCharArray();
        char[] convert2 = this.endTime.toCharArray();
        char index0Start = convert1[0];
        char index0End = convert2[0];
        if (index0Start == '1')
        {
            startslot= convert1[1] - '0';
            startslot+=10;
        }
        else
        {
            startslot= convert1[1] - '0';
        }
        if(index0End == '1')
        {
            endslot= convert2[2] - '0';
            endslot+=10;
        }
        else
        {
            endslot= convert2[2]- '0';
        }
        if(this.startTime.contains("pm") && this.endTime.contains("am"))
        {
            startslot+=12;
            diff = endslot - startslot;
            totalPrice = diff * playground.getPricePerHour();
        }
        else if(this.startTime.contains("am") && this.endTime.contains("pm"))
        {
            endslot+=12;
            diff= 24 - endslot;
            diff += startslot;
            totalPrice = diff * playground.getPricePerHour();
        }
        else
        {
            diff=endslot - startslot;
            totalPrice = diff * playground.getPricePerHour();
        }
        return totalPrice;
    }
}