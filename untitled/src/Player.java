package com.company;

import java.util.ArrayList;
/**
 * Represents the player who is a kind of user, but he is the one that books the playground and add members
 * to his team and invite them.
 * @author Mariam Khaled
 * @version 1.0
 * @since June 2021
 */
public class Player extends User {
    private ArrayList<Booking>bookings = new ArrayList<Booking>();
    private Team team;
    private int bookIndex = 0;
    //////////////////////////constructor/////////////////////////////////////////
    /**
     * The class constructor assigns a given values to name, nationalID, password, email,phone, location,and ewallet money
     * @param name name The value to set the name data field to
     * @param nationalID nationalID The value to set the name data field to
     * @param password password The value to set the name data field to
     * @param email email The value to set the name data field to
     * @param phone phone The value to set the name data field to
     * @param location location The value to set the name data field to
     * @param ewalletAmount ewalletamount The value to set the name data field to
     */
    public Player(String name, String nationalID, String password, String email, String phone, String location, int ewalletAmount) {
        super(name, nationalID, password, email, phone, location, ewalletAmount);
    }
    /**
     * Default constructor
     */
    public Player() {
        super();
    }
    ///////////////////////////////////methods/////////////////////////////////////
    /**
     * Displays all the current booking of that player.
     */
    public void showBooking(){
        if (bookings.size()!=0) {
            for (int i = 0; i < this.bookings.size(); i++) {
                System.out.println("Booking #" + (i + 1));
                System.out.println("The start hour is: " + bookings.get(i).startTime + " The end hour " + bookings.get(i).endTime);
                System.out.println("The date of booking is: " + bookings.get(i).date);
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
        for(int i=0 ; i<this.bookings.size() ; i++)
        {
            if (this.bookings.get(i)==booking)
            {
                this.bookings.remove(i) ;
            }
        }
    }
    /**
     * Adds a new booking to that player's bookings.
     * @param booking Represents the booking that the player wants to make
     */
    public void addBooking(Booking booking){
        bookings.add(booking);
    }
    /**
     * Creates a team to that player, includes other players that he will add
     * @param team Represents the team members that he wants to add as his team on his profile.
     */
    // out of the required scope
    public void createTeam (Team team){
        team.addPlayer(this);
    }
}