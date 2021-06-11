package com.company;
/**
 *  This class is used to create an owner with its information and methods
 * @author Mazen Mohamed
 * @version 1.0
 * @since June 2021
 */
public class Owner extends User
{
    private Playground playground;
    //////////////////////////constructor/////////////////////////////////////////
    /**
     * The class constructor assigns a given values to name, nationalID, password, email,phone, location,and ewallet money
     * @param name name The value to set the name data field to
     * @param nationalID nationalID The value to set the name data field to
     * @param password password The value to set the name data field to
     * @param email email The value to set the name data field to
     * @param phone phone The value to set the name data field to
     * @param location location The value to set the name data field to
     * @param ewalletamount ewalletamount The value to set the name data field to
     */
    public Owner(String name, String nationalID, String password, String email, String phone, String location, int ewalletamount) {
        super(name, nationalID, password, email, phone, location,ewalletamount);
    }
    /**
     * Default constructor
     */
    public Owner() {

    }
    //////////////////////////////setters and getters//////////////////////////////////////////
    /**
     * The addPlayground method assigns a given value to playground
     * @param playground playground The value to set the name data field to
     */
    public void addPlayground(Playground playground) {
        this.playground = playground;
    }
    /**
     * The getPlayground method returns the value of the playground
     * @return the value of the playground
     */
    public Playground getPlayground() {
        return playground;
    }
    ///////////////////////////////////methods/////////////////////////////////////
    /**
     *  The showPlayground is used for displaying owner's playground
     */
    void showPlayground()
    {
        System.out.println("Playground's Name:" + playground.getName());
        System.out.println("Playground's Location :" + playground.getLocation());
        System.out.println("Playground's Size :" + playground.getSize());
        System.out.println("Playground's Rate :" + playground.getRate());
        System.out.println("Playground's Price Per Hour :" + playground.getPricePerHour());
        System.out.println("Playground's Booking time starts from :" + playground.getAvailableHour1());
        System.out.println("Playground's Booking time ends from :" + playground.getAvailableHour2());
        System.out.println("Playground's Cancellation period :" + playground.getCancellationPeriod());
        System.out.println("Playground's Status :" + playground.getStatus());
        playground.showBooking();
    }

    /**
     * The updateAvailableHour is used to update the value of AvailableHour1 and and AvailableHour2
     * @param AvailableHour1 The value to set the AvailableHour1 data field to
     * @param AvailableHour2 The value to set the AvailableHour2 data field to
     */
    void updateAvailableHour(String AvailableHour1, String AvailableHour2)
    {
        playground.setAvailableHour1(AvailableHour1);
        playground.setAvailableHour2(AvailableHour2);
    }
}