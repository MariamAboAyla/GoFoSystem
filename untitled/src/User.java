public class User
{
    protected String name,nationalID,password,email,phone,location;
    protected int ewalletAmount;
    public User (String name,String nationalID,String password,String email,String phone,String location,int ewalletAmount)
    {
        this.name=name;
        this.nationalID=nationalID;
        this.password=password;
        this.email=email;
        this.phone=phone;
        this.location=location;
    }
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
    public void viewProfile()
    {
        System.out.println ("User name : "+name);
        System.out.println ("User nationalID : "+nationalID);
        System.out.println ("User email: "+email);
        System.out.println ("User phone : "+phone);
        System.out.println ("User location : "+location);
        System.out.println ("User ewalletAmount : "+ewalletAmount);
    }
    public int getewalletAmount()
    {
        return ewalletAmount;
    }
}