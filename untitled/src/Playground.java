import java.util.ArrayList;

public class Playground
{
    public static int ratingCounter=0;
    private String name,availableHour1,availableHour2,location;
    private int size, pricePerHour, cancellationPeriod;
    private Status status;
    private Owner owner;
    private double rate,sumOfRate=0;
    private ArrayList<Booking> booking = new ArrayList<Booking>();
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
    public String getName()
    {
        return name;
    }
    public String getAvailableHour1()
    {
        return availableHour1;
    }
    public String getAvailableHour2()
    {
        return availableHour2;
    }
    public String getLocation()
    {
        return location;
    }
    public int getSize()
    {
        return size;
    }
    public int getPricePerHour()
    {
        return pricePerHour;
    }
    public int getCancellationPeriod()
    {
        return cancellationPeriod;
    }
    public Status getStatus()
    {
        return status;
    }
    public Owner getOwner()
    {
        return owner;
    }
    public double getRate()
    {
        return rate;
    }
    public void updateRate(double rate)
    {
        ratingCounter++;
        sumOfRate+=rate;
        rate= sumOfRate/ratingCounter;
    }
    public void addBooking(Booking booking)
    {
        this.booking.add(booking);
    }
    public void updateStatus(Status status)
    {
        this.status=status;
    }
    public void showBooking()
    {
        for(int i=0;i<booking.size();i++)
        {
            System.out.println(booking.get(i));
        }
    }
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
    public boolean checkBooking(Booking booking)
    {
        for(int i=0;i<this.booking.size();i++)
        {
            if(booking==this.booking.get(i))
            {
                return false;
            }
        }
        return true;
    }
}
