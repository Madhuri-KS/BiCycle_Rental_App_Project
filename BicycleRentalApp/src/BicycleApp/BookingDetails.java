package BicycleApp;

import java.nio.charset.Charset;
import java.util.Random;
import java.util.Scanner;

/* Booking Class Extends Cycle to obtain its inventory details while making booking  */
public class BookingDetails extends Cycle {
	
	/* Attributes - BookingID, Start destination/to ,end destination/from, status, duration of the ride etc.  */
	String BookingID, To, from,  status, rating;
	public long duration, actual_duration,penalty;
	/* Methods - To check cycle availability */
  	public String checkAvailability(Cycle cyc)
  	{
  		/* Method - To get Cycle Details */
  		String cy1=cyc.getDetails();
   		if(cy1=="")
  		{
  			System.out.println("Cycle Unavailable");
  			return "Cycle Unavailable";
  		}
  		else
  			System.out.println("Cycle available");
  			return "Cycle available : "+cy1;
  	}
  	/* Method - To get Booking ID generated */
    public String getBookingID() {
		return BookingID;
	}
    /* Method - To generate the Booking ID  */
	public void setBookingID()
	{
		StringBuilder generatedString = new StringBuilder();
	    Random random = new Random();
	    for (int i = 0; i < 5; i++)
	    {
	    	String candidateChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890" ;
		char ch;
	    	ch=candidateChars.charAt((int)(Math.random() * (30) + 1));
	    	generatedString.append(ch);
	    
  	    //System.out.println(generatedString.toString());
  	    BookingID =  generatedString.toString();
	    }
	}

	/* Method - To ask user to select duration of the cycle to be rented */
	public void SelectDuration()
    {
    	 int selection;
         Scanner input = new Scanner(System.in);

         /***************************************************/

         System.out.println("Select Duration");
         System.out.println("-------------------------\n");
         System.out.println("1 - 30 mins");
         System.out.println("2 - 60 mins");
         System.out.println("3 - 120 mins");
         System.out.println("4 - 240 mins");
         System.out.println("5 - Full Day");

         selection = input.nextInt();
         
         switch (selection)
         {
         case 1: System.out.println("30 mins selected");duration=30;break;
         case 2: System.out.println("60 mins selected");duration=60;break;
         case 3: System.out.println("120 mins selected");duration=120;break;
         case 4: System.out.println("240 mins selected");duration=240;break;
         case 5: System.out.println("Full day selected");duration=1;break;
         default: System.out.println("Invalid Selection");duration=0;break;
         }
     }

	/* Method - To ask user to Confirm cycle booking  */
	public String confirm()
	{
		 int selection;
         Scanner input = new Scanner(System.in);

         /***************************************************/

         System.out.println("Confirm Booking and Proceed to Payment");
         System.out.println("-------------------------\n");
         System.out.println("1 - Yes");
         System.out.println("2 - No"); 
         System.out.println("-------------------------\n");
         selection = input.nextInt();
         
         switch (selection)
         {
         case 1: System.out.println("Confirm, Proceed to Payment");status="Confirm";break;
         case 2: System.out.println("Cancelled");status="Cancel";break;
         default: System.out.println("Invalid Selection");status="Cancel";break;
         }
         return status;
	}
	/* Methods - To cancel/modify details of ride  */
	public void cancel() {}
	public void modify() {}
	/* Methods - charge penalty for rides */
	public void charge_penalty() 
	{
		
		long actual_duration=(calculate_duration(Cycle.start_time, Cycle.end_time))/(60 * 1000) % 60;
	
		if ((actual_duration-duration)>0) 
		{
			penalty=100;
			System.out.println("Duration of Your Ride : " + actual_duration);
			System.out.println("Penalty Charged Duration Difference Details : " + actual_duration+"-"+duration+"="+(actual_duration-duration));
		}
		else
		{
			penalty=0;
			System.out.println("Duration of Your Ride : " + actual_duration);
			System.out.println("No Penalty Charged Cycle returned on time. Details : " + actual_duration+"-"+duration+"="+(actual_duration-duration));
		}
			
	}
	
	
}
