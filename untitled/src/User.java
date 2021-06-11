package com.company;
/**
 *  The class user is to have the same data from player and owner in same atributies and methods
 * @author Anas Hamada
 * @version 1.0
 * @since June 2021
 */
public class User
{
    protected String name,nationalID,password,email,phone,location;
    protected int ewalletAmount;
    //////////////////////////constructor/////////////////////////////////////////
    /**
     * The class constructor assigns a given values to name, nationalID, password, email,phone, location,and ewallet money
     * @param name The value to set the name data field to
     * @param nationalID The value to set the name data field to
     * @param password The value to set the name data field to
     * @param email The value to set the name data field to
     * @param phone The value to set the name data field to
     * @param location The value to set the name data field to
     * @param ewalletAmount The value to set the name data field to
     */
    public User (String name,String nationalID,String password,String email,String phone,String location,int ewalletAmount)
    {
        this.name=name;
        this.nationalID=nationalID;
        this.password=password;
        this.email=email;
        this.phone=phone;
        this.location=location;
        this.ewalletAmount=ewalletAmount;
    }

    /**
     * Default constructor
     */
    public User() {

    }
    ///////////////////////////////////methods/////////////////////////////////////
    /**
     * Login method is to check the correctness of email and password
     * @param email email The value to check with the attribute email
     * @param password password The value to check with the attribute password
     * @return boolean type
     */
    public boolean login (String email,String password)
    {
        if(this.email.equals(email) && this.password.equals(password))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    /**
     * The viewprofile method is to display content of user
     */
    public void viewProfile()
    {
        System.out.println ("User name : "+name);
        System.out.println ("User nationalID : "+nationalID);
        System.out.println ("User email: "+email);
        System.out.println ("User phone : "+phone);
        System.out.println ("User location : "+location);
    }
    ///////////////////////////////////////Getter/////////////////////////////////
    /**
     * The getewalletAmount returns the value of the ewalletAmount
     * @return the value of the ewalletAmount
     */
    public int getewalletAmount()
    {
        return ewalletAmount;
    }
}