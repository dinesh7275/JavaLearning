package encapsulation;

import java.util.Locale;

public class HidingData {
    //Hiding data

    private String userName;
    private String password;

  //    Parametrize constructor declaration

    public HidingData(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

   public void login(String userName, String password)
   {
       if(this.userName.equals(userName) && this.password.equals(password))
       {   System.out.println("Access granted");}
       else{
           System.out.println("Invalid Credential");
       }
   }
}
class Execution{
    public static void main(String args[])
    {
        HidingData hd= new HidingData("Dinesh","123456789");
        hd.login("Dinesh","123456789");
        hd.login("ddlj","1245");

    }
}