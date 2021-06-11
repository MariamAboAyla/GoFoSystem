package com.company;
import java.util.ArrayList;
/**
 *  This class is used to create a playground and its information
 *  also show its information: bookings,status,...
 * @author Mazen Mohamed
 * @version 1.0
 * @since June 2021
 */
public class Playground
{
    public static int ratingCounter=0;
    private String name,availableHour1,availableHour2,location;
    private int size, pricePerHour, cancellationPeriod;
    private Status status;
    private Owner owner;
    private double rate=0,sumOfRate=0;
    private ArrayList<Booking> booking = new ArrayList<Booking>();
    //////////////////////////constructor/////////////////////////////////////////
    /**
     * The class constructor assigns a given values to name,availableHour1,location,availableHour2,size,pricePerHour,cancellationPeriod,status,and owner
     * @param name The value to set the name data field to
     * @param availableHour1 The value to set the availableHour1 data field to
     * @param location The value to set the location data field to
     * @param availableHour2 The value to set the availableHour2 data field to
     * @param size The value to set the size data field to
     * @param pricePerHour The value to set the pricePerHour data field to
     * @param cancellationPeriod The value to set the cancellationPeriod data field to
     * @param status The value to set the status data field to
     * @param owner The value to set the owner data field to
     */
    public Playground(String name, String availableHour1,String location ,String availableHour2, int size, int pricePerHour,int cancellationPeriod,
                      Status status,Owner owner)
    {
        this.name=name;
        this.availableHour1=availableHour1;
        this.availableHour2=availableHour2;
        this.cancellationPeriod=cancellationPeriod;
        this.owner=owner;
        this.status=Status.Not_Activate;
        this.size=size;
        this.pricePerHour=pricePerHour;
        this.location=location;
    }
    /**
     *  Default constructor
     */
    public Playground() {

    }
    //////////////////////////////setters and getters//////////////////////////////////////////
    /**
     * The getName returns the value of the name
     * @return the value of the name
     */
    public String getName()
    {
        return name;
    }
    /**
     * The getAvailableHour1 returns the value of the AvailableHour1
     * @return the value of the AvailableHour1
     */
    public String getAvailableHour1()
    {
        return availableHour1;
    }
    /**
     * The getAvailableHour2 returns the value of the AvailableHour2
     * @return the value of the AvailableHour2
     */
    public String getAvailableHour2()
    {
        return availableHour2;
    }
    /**
     * The getLocation returns the value of the Location
     * @return the value of the Location
     */
    public String getLocation()
    {
        return location;
    }
    /**
     * The getSize returns the value of the Size
     * @return the value of the Size
     */
    public int getSize()
    {
        return size;
    }
    /**
     * The getPricePerHour returns the value of the PricePerHour
     * @return the value of the PricePerHour
     */
    public int getPricePerHour()
    {
        return pricePerHour;
    }
    /**
     * The getCancellationPeriod returns the value of the CancellationPeriod
     * @return the value of the CancellationPeriod
     */
    public int getCancellationPeriod()
    {
        return cancellationPeriod;
    }
    /**
     * The getStatus returns the value of the Status
     * @return the value of the Status
     */
    public Status getStatus()
    {
        return status;
    }
    /**
     * The getOwner returns the value of the Owner
     * @return the value of the Owner
     */
    public Owner getOwner()
    {
        return owner;
    }
    /**
     * The getRate returns the value of the Rate
     * @return the value of the Rate
     */
    public double getRate()
    {
        return rate;
    }
    ///////////////////////////////////methods/////////////////////////////////////
    /**
     * The updateRate is used to update rate
     * @param rate the value of rate to be added
     */
    public void updateRate(double rate)
    {
        ratingCounter++;
        sumOfRate+=rate;
        rate= sumOfRate/ratingCounter;
    }
    /**
     * The addBooking method is used to add booking in arraylist
     * @param booking the object of booking to be added
     */
    public void addBooking(Booking booking)
    {
        this.booking.add(booking);
    }
    /**
     * The updateStatus is used to update status
     * @param status the value of status to be added
     */
    public void updateStatus(Status status)
    {
        this.status=status;
    }
    /**
     *  The setavailableHour1 method assigns a given value to availableHour1
     * @param availableHour1 The value to set the availableHour1 data field to
     */
    public void setAvailableHour1(String availableHour1) {
        this.availableHour1 = availableHour1;
    }
    /**
     *  The setavailableHour2 method assigns a given value to availableHour2
     * @param availableHour2 The value to set the availableHour2 data field to
     */
    public void setAvailableHour2(String availableHour2) {
        this.availableHour2 = availableHour2;
    }
    ///////////////////////////////////methods/////////////////////////////////////
    /**
     * The showBooking is used to display booking details
     */
    public void showBooking()
    {
        for(int i=0;i<booking.size();i++)
        {
            System.out.println("Booking #" + (i+1));
            booking.get(i).showBookingDetails();
        }
    }
    /**
     * used to cancel booking
     * @param booking object that will be canceled
     */
    public void cancelBooking(Booking booking)
    {
        for(int i=0;i<this.booking.size();i++)
        {
            if(booking==this.booking.get(i))
            {
                this.booking.remove(i);
            }
        }
    }
    /**
     * The checkBooking is used to check booking from other booking
     * @param booking object of booking will be checked if it's exists
     * @return boolean type (true.false)
     */
    public boolean checkBooking(Booking booking)
    {
        for(int i=0;i<this.booking.size();i++)
        {
            if(booking==this.booking.get(i))
            {
                return false;
            }
        }
        int startslot=0, endslot=0, avh1=0, avh2=0;
        char[] convert1 = booking.startTime.toCharArray();
        char[] convert2 = booking.endTime.toCharArray();
        char[] convert3 = availableHour1.toCharArray();
        char[] convert4 = availableHour2.toCharArray();
        if (convert1[0]== '1')//10 pm
        {
            startslot= convert1[1] - '0';
            startslot+=10;
        }
        else
        {
            startslot= convert1[1] - '0';
        }
        if(convert2[0] == '1')
        {
            endslot= convert2[1] - '0';
            endslot+=10;
        }
        else
        {
            endslot= convert2[1]- '0';
        }
        if (convert3[0]== '1')//10 pm
        {
            avh1= convert3[1] - '0';
            avh1+=10;
        }
        else
        {
            avh1= convert3[1] - '0';
        }
        if(convert4[0] == '1')
        {
            avh2= convert4[1] - '0';
            avh2+=10;
        }
        else
        {
            avh2= convert4[1]- '0';
        }
        if(booking.startTime.contains("pm"))
        {
            startslot+=12;
        }
        if ( booking.endTime.contains("pm"))
        {
            endslot+=12;
        }
        if(availableHour1.contains("pm"))
        {
            avh1+=12;
        }
        if (availableHour2.contains("pm"))
        {
            avh2+=12;
        }
        for(int i=startslot;i<endslot;i++)
        {
            if(i>= avh1 && i<avh2)
            {
                if(i==24)
                {
                    i=1;
                }
            }
            else
            {
                return false;
            }
        }
        return true;
    }
}
