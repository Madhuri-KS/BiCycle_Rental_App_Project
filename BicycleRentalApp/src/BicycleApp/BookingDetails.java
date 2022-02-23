package BicycleApp;

import java.nio.charset.Charset;
import java.util.Random;
import java.util.Scanner;

public class BookingDetails extends Cycle {
	String BookingID, To, from,  status, rating;
	public int duration;
  	public String checkAvailability(Cycle cyc)
  	{
  		System.out.println("HERE NOW");
  		String cy1=cyc.getDetails();
  		System.out.println("HERE NOW got details" +cy1);
  		if(cy1=="")
  		{
  			System.out.println("Cycle Unavailable");
  			return "Cycle Unavailable";
  		}
  		else
  			System.out.println("Cycle available");
  			return "Cycle available : "+cy1;
  	}
  	
    public String getBookingID() {
		return BookingID;
	}

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
         case 1: System.out.println("Confirm, Proceed to Payment");status="Confirmed";break;
         case 2: System.out.println("Cancelled");status="Cancel";break;
         default: System.out.println("Invalid Selection");status="Cancel";break;
         }
         return status;
	}
	public void cancel() {}
	public void modify() {}
	public void charge_penalty() 
	{
		
	}
	

	
}
