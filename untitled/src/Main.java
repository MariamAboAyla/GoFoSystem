package com.company;

import java.util.ArrayList;
import java.util.Scanner;
/**
 * This is just a demo to create GOFO application test
 *  @author Mazen Mohamed
 *  @version 1.0
 *  @since June 2021
 */
public class Main
{
    public static void main(String[] args)
    {
        System.out.println ( "Welcome to GOFO Application");
        ArrayList<Player> players= new ArrayList<Player>();
        ArrayList<Playground> playgrounds= new ArrayList<Playground>();
        ArrayList<Owner> owners = new ArrayList<Owner>();
        Administrator me = new Administrator();
        String administratoracess = "FCI-2019";
        int choice,choice1=0,choice2,ewalletamount=0, choice4;
        String name="",nationalID="",password="",email="",phone="",location="",start,end,date;
        int price1,price2,cancel;
        Scanner cin = new Scanner(System.in);
        while (true)
        {
            System.out.println("Choose who you are:");
            System.out.println("1: Default user");
            System.out.println("2: Administrator");
            choice=cin.nextInt();
            if(choice==1)
            {
                System.out.println("Choose who you are:");
                System.out.println("1: Player");
                System.out.println("2: Owner");
                choice2= cin.nextInt();// player
                System.out.println("Choose from the following:");
                System.out.println("1:Sign up");
                System.out.println("2:Log in");
                choice1= cin.nextInt();
                if(choice1==1)
                {
                    System.out.println("Enter name, Email, Password, Phone,National ID,location, and Ewallet amount");
                    name = cin.next();
                    email =cin.next();
                    password= cin.next();
                    phone= cin.next();
                    nationalID=cin.next();
                    location= cin.next();
                    ewalletamount= cin.nextInt();
                }
                switch (choice2)
                {
                    case 1:
                    {
                        Player tempp = new Player();
                        if(choice1==1)
                        {
                            Player temp = new Player(name,nationalID,password,email,phone,location,ewalletamount);
                            tempp=temp;
                            players.add(temp);
                        }
                        else if(choice1==2)
                        {
                            int flag=0;
                            while (true)
                            {
                                System.out.println("Enter email and password");
                                email=cin.next();
                                password=cin.next();
                                for(int i=0;i<players.size();i++)
                                {
                                    tempp= players.get(i);
                                    if(tempp.login(email,password))
                                    {
                                        flag=1;
                                        System.out.println("Login is correct");
                                        break;
                                    }
                                }
                                if(flag==1)
                                {
                                    break;
                                }
                            }
                        }
                        System.out.println("1: Book a playground");
                        System.out.println("2: Show your profile");
                        System.out.println("3: Show your Bookings");
                        choice4= cin.nextInt();
                        if(choice4==1)
                        {
                            int flag=0;
                            System.out.println("Which way do you prefer search by price or location(type)");
                            name=cin.next();
                            if(name.equalsIgnoreCase("price"))
                            {
                                System.out.println("Enter the range of price which you prefer from");
                                price1=cin.nextInt();
                                System.out.println("to ");
                                price2=cin.nextInt();
                                Playground temp;
                                for(int i=0;i<playgrounds.size();i++)
                                {
                                    temp = playgrounds.get(i);
                                    if(price1<=temp.getPricePerHour() && temp.getPricePerHour()<=price2 && temp.getStatus().equals(Status.Activate))
                                    {
                                        System.out.println("..................................................");
                                        System.out.println("Playground's Name:" + temp.getName());
                                        System.out.println("Playground's Location:" + temp.getLocation());
                                        System.out.println("Playground's price per Hour:" + temp.getPricePerHour());
                                        System.out.println("Playground's size:" + temp.getSize());
                                        System.out.println("Playground's start booking from :" + temp.getAvailableHour1());
                                        System.out.println("Playground's end booking at :" + temp.getAvailableHour2());
                                        System.out.println("Playground's rate :" + temp.getRate());
                                        flag=1;
                                    }
                                }
                            }
                            else
                            {
                                System.out.println("Enter location which you prefer");
                                location=cin.next();
                                Playground temp;
                                for(int i=0;i<playgrounds.size();i++)
                                {
                                    temp = playgrounds.get(i);
                                    if(temp.getLocation().equalsIgnoreCase(location) && temp.getStatus().equals(Status.Activate))
                                    {
                                        System.out.println("..................................................");
                                        System.out.println("Playground's Name:" + temp.getName());
                                        System.out.println("Playground's Location:" + temp.getLocation());
                                        System.out.println("Playground's price per Hour:" + temp.getPricePerHour());
                                        System.out.println("Playground's size:" + temp.getSize());
                                        System.out.println("Playground's start booking from :" + temp.getAvailableHour1());
                                        System.out.println("Playground's end booking at :" + temp.getAvailableHour2());
                                        flag=1;
                                    }
                                }
                            }
                            if(flag==1)
                            {
                                int flag1=0;
                                System.out.println("Enter the name of playground, you want to book from:");
                                name= cin.next();
                                Playground temp1 ;
                                Playground temp2= new Playground();
                                for(int i=0;i<playgrounds.size();i++)
                                {
                                    temp1 = playgrounds.get(i);
                                    if(temp1.getName().equalsIgnoreCase(name))
                                    {
                                        flag1=1;
                                        temp2 = temp1;
                                        break;
                                    }
                                }
                                if(flag1==1)
                                {
                                    System.out.println("Enter the time you want to book from((ex): enter 01am first if exists):");
                                    start= cin.next();
                                    System.out.println("to:");
                                    end = cin.next();
                                    System.out.println("Enter the date you want to book:");
                                    date = cin.next();
                                    Booking book = new Booking(date,start,end,tempp,temp2);
                                    if(temp2.checkBooking(book))
                                    {
                                        temp2.addBooking(book);
                                        tempp.addBooking(book);
                                        System.out.println("Total price:" + book.showTotalPrice());
                                        System.out.println("The booking is done...");
                                    }
                                    else
                                    {
                                        System.out.println("Invalid time of booking, please try again later...");
                                    }
                                }
                                else
                                {
                                    System.out.println("Inviald name...");
                                }
                            }
                            else
                            {
                                System.out.println("There is no avialable playground");
                            }
                        }
                        else if(choice4==2)
                        {
                            System.out.println("...................Your profile......................");
                            tempp.viewProfile();
                            System.out.println ("User ewallet Amount : "+tempp.getewalletAmount());
                        }
                        else if(choice4==3)
                        {
                            System.out.println("..................show your bookings.................");
                            tempp.showBooking();
                        }
                        break;
                    }
                    case 2:
                    {
                        Owner tempp = new Owner();
                        if(choice1==1)
                        {
                            Owner temp = new Owner(name,nationalID,password,email,phone,location,ewalletamount);
                            System.out.println("Add your playground:");
                            System.out.println("Enter name:");
                            name= cin.next();
                            System.out.println("Enter location:");
                            location=cin.next();
                            System.out.println("Enter start booking(enter (ex) 01am first if exists) time from:");
                            start=cin.next();
                            System.out.println("to(ex:01pm):");
                            end=cin.next();
                            System.out.println("Enter playground size:");
                            price1= cin.nextInt();
                            System.out.println("Enter price Per Hour:");
                            price2=cin.nextInt();
                            System.out.println("Enter cancellation Period:");
                            cancel= cin.nextInt();
                            Playground n = new Playground(name,start,location,end,price1,price2,cancel,Status.Not_Activate,temp);
                            playgrounds.add(n);
                            temp.addPlayground(n);
                            tempp=temp;
                            owners.add(temp);
                        }
                        if(choice1==2)
                        {
                            int flag=0;
                            while (true)
                            {
                                System.out.println("Enter email and password");
                                email=cin.next();
                                password=cin.next();
                                for(int i=0;i<owners.size();i++)
                                {
                                    tempp= owners.get(i);
                                    if(tempp.login(email,password))
                                    {
                                        flag=1;
                                        System.out.println("Login is correct");
                                        break;
                                    }
                                }
                                if(flag==1)
                                {
                                    break;
                                }
                            }
                        }
                        System.out.println("1: Show playground");
                        System.out.println("2: Update available hours of booking");
                        choice4= cin.nextInt();
                        if(choice4==1)
                        {
                            tempp.showPlayground();
                        }
                        else if(choice4==2)
                        {
                            System.out.println("Enter start booking time from:");
                            start=cin.next();
                            System.out.println("to:");
                            end=cin.next();
                            tempp.updateAvailableHour(start,end);
                        }
                    }
                }
            }
            else if(choice==2)
            {
                while (true)
                {
                    System.out.println("Enter your access code:");
                    name= cin.next();
                    if(name.equals(administratoracess))
                    {
                        System.out.println("Access correct...");
                        break;
                    }
                }
                System.out.println("All playgrounds in the system...");
                for(int i=0;i<playgrounds.size();i++)
                {
                    System.out.println(".............................................................");
                    System.out.println("Playground's Name:" + playgrounds.get(i).getName());
                    System.out.println("Playground's Location:" + playgrounds.get(i).getLocation());
                    System.out.println("Playground's price per Hour:" + playgrounds.get(i).getPricePerHour());
                    System.out.println("Playground's size:" + playgrounds.get(i).getSize());
                    System.out.println("Playground's start booking from :" + playgrounds.get(i).getAvailableHour1());
                    System.out.println("Playground's end booking at :" + playgrounds.get(i).getAvailableHour2());
                    System.out.println("Playground's rate :" + playgrounds.get(i).getRate());
                    System.out.println("Playground's status :" + playgrounds.get(i).getStatus());
                }
                System.out.println("..................The end of all playground..................");
                System.out.println("Enter the playground's name which you want to check/delete");
                name=cin.next();
                Playground temp1 ;
                int index_playground = 0,index_owner=0,flag=0;
                for(int i=0;i<playgrounds.size();i++) {
                    temp1 = playgrounds.get(i);
                    if (temp1.getName().equalsIgnoreCase(name)) {
                        index_playground = i;
                        flag=1;
                    }
                    if(temp1.getOwner()== owners.get(i))
                    {
                        index_owner=i;
                    }
                }
                if(flag==1)
                {
                    System.out.println("1: Check the playground");
                    System.out.println("2: delete the playground");
                    price1 = cin.nextInt();
                    System.out.println("Playground's Name:" + playgrounds.get(index_playground).getName());
                    System.out.println("Playground's Location:" + playgrounds.get(index_playground).getLocation());
                    System.out.println("Playground's price per Hour:" + playgrounds.get(index_playground).getPricePerHour());
                    System.out.println("Playground's size:" + playgrounds.get(index_playground).getSize());
                    System.out.println("Playground's start booking from :" + playgrounds.get(index_playground).getAvailableHour1());
                    System.out.println("Playground's end booking at :" + playgrounds.get(index_playground).getAvailableHour2());
                    System.out.println("Playground's rate :" + playgrounds.get(index_playground).getRate());
                    System.out.println("Playground's status :" + playgrounds.get(index_playground).getStatus());
                    System.out.println(".............................................................");
                    if(price1==1)
                    {
                        System.out.println("Do you want to change in status ?(yes/no)");
                        name = cin.next();
                        if(name.equalsIgnoreCase("yes"))
                        {
                            System.out.println("Enter the status:");
                            start= cin.next();
                            playgrounds.set(index_playground,me.checkPlayground(playgrounds.get(index_playground),start));
                            System.out.println("change status is done...");
                        }
                    }
                    else if(price1==2)
                    {
                        System.out.println("Do you want to delete the playground ?(yes/no)");
                        name = cin.next();
                        if(name.equalsIgnoreCase("yes"))
                        {
                            playgrounds.set(index_playground,me.deletePlayground(playgrounds.get(index_playground)));
                            owners.get(index_owner).addPlayground(playgrounds.get(index_playground));
                            playgrounds.remove(index_playground);
                            System.out.println("Delete process is done...");
                        }
                    }
                }
                else
                {
                    System.out.println("Inviald name...");
                }
            }
        }
    }
}
