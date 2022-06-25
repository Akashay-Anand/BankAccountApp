package BankAccountProject;

import java.util.Date;

public class ClassResource {
    
    // method to freez scree for few seconds
    public void startDekay(int milliSecond){
        // time is in milli second
        try
        {
          System.out.println("Start of delay: "+ new Date());
          Thread.sleep(milliSecond);   
          System.out.println("End of delay: "+ new Date());
        }
        catch(InterruptedException ex) { ex.printStackTrace(); }
    }
    

}
