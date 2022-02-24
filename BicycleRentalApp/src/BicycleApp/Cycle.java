package BicycleApp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/* Cycle has a controller */
public class Cycle implements Controller{
	/* Attributes - Cycle attribute modelID,modelName,start_time,end_time etc */
	static int modelID;
	public String modelName, usage_Cycle, color;
	static ArrayList<String> cycleList = new ArrayList<String>();
	public static Date start_time,end_time;
	public int yearOfMfg,TotalAvailable, TotalBooked,CycleID;
	
	public void update_Inventory() {}
	public void repair() {}
	
	/* Constructor of Class Cycle */
	public Cycle()
	{
		
		cycleList.add("CYCLE_1");
		cycleList.add("CYCLE_2");
		cycleList.add("CYCLE_3");
		cycleList.add("CYCLE_4");
		//System.out.println(cycleList);
		CycleID=(int) (Math.random() * (5) + 1);
	}
	/* Methods - To Add Cycle to a Station */
	public void add_to_Inventory(int nbr) {
		cycleList.add("CYCLE_" + nbr);
	}
	public void remove() {}
	public void modify_cancel_details() {}
	/* Methods - To Get details of Cycle */
	public String getDetails()
	{
	
		if (CycleID < 5)
		{
			return cycleList.get(CycleID);
		}
		else 
		{
			return "";
		}
	}
	/* Methods - To calculate duration of the ride , difference between duration selected and start time */
	public long calculate_duration(Date st_time,Date e_time) 
	{
		long difference = e_time.getTime() - st_time.getTime();
		return difference;
	}
	/* Methods - To set Start Time of the ride after user confirms start of ride*/
	public void setStartTime() 
	{
		System.out.println("Have you picked your Cycle Y/N: ");
		Scanner start = new Scanner(System.in);
		String c_nm= start.nextLine();
		if(c_nm.equals("Y")) 
		{
			start_time = Calendar.getInstance().getTime();
		    System.out.println("Your Ride Started at: " + start_time);  
			
		}
		else 
		{
			System.out.println("Cycle Not Picked for ride..Cancelling Ride");
		}
		

	}
	/* Methods - To set End time , once Customer confirms end time.*/
	public void setEndTime() 
	{
	    System.out.println("Do you want to dock your Cycle Y/N: ");
			Scanner c_in = new Scanner(System.in);
			String c_end= c_in.nextLine();
			if(c_end.equals("Y")) 
			{
				end_time=Calendar.getInstance().getTime();
			    //System.out.println("Your Ride Ended at: " + end_time);			    
			}
			else 
			{
				System.out.println("Cycle Rented is still in progress");
			}	
	}

	@Override
	public void CalculateDistanceTravelled() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setNavigation(boolean flag) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void displayNavigation() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void isSufficientlyCharged() {
		// TODO Auto-generated method stub
		
	} 
}
