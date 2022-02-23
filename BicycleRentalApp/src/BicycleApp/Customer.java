package BicycleApp;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Pattern;


/******************************************************************************************************************
Contains the Main
 * This Code creates an instance of customer and performs:
 * 1 License Validation - Using Random Functionality(Similar to self test) 
 * 2 On validating the license It Checks for cycle availability and books a random available cycle
 * 3 Cycle details are based and the Customer is asked to proceed to payment
 * 4 Payment is validated - for purposes of demo  Random Functionality(Similar to self test) is used for the check
 * 5 On Validating the payment a Booking ID is generated for the customer
 * ****************************************************************************************************************
 * @author madhh
 *
 */

// Created a Class Customer that would extend all attributes of Person 

public class Customer extends Person {
	
	/* Create a List of Variables used to make a booking */
	
	private String License,isPremiumCustomer,login,password;
	private int cust_id;
	private static String stts;
	Station cust_station;
	static BookingDetails cust_book;
	static Cycle cust_cycle;
	RidingSystem cust_ridingsys;
	Controller cust_controller;
	Payment cust_payment;

	 
	/* Constructor of Customer */
	public Customer(String Name)
	{
		super(Name);
		cust_station = new Station(); 
		cust_book = new BookingDetails();
		//cust_cycle=new Cycle();
	    cust_payment=new Payment();
 	
	}
	
	/* Method to validate the license of Customer */
	public boolean check_license_validity(double status) {
		return Math.random() > status; 
	}
	 
	/* Main */
	public static void main(String[] args) 
	{
		System.out.println("Hey Welcome! Select your Ride today ! ");
		System.out.println("Enter your Name: ");
		Scanner customername = new Scanner(System.in);
		String c_nm= customername.nextLine();
		
		/* Create customer */
		Customer custnew=new Customer(c_nm);
		custnew.add_details();
		
		/* Check license validity */
		
		if (custnew.check_license_validity(0.1))
		{
			stts="Succeded";
			System.out.println("License validity for " +custnew.name + ": Succeeded");
			
			/* Ask Customer for Duration */
			cust_book.SelectDuration();
			
			/* Check Cycle Availability */
			System.out.println("Check Cycle availablity ....");
			String chk=cust_book.checkAvailability(new Cycle());
			System.out.println(chk.contains("Cycle available"));
			
			/* If Cycle is available proceed to Payment */
			if (chk.contains("Cycle available"))
			{
				/* If Cycle is available Confirm before proceeding to Payment */
				String bookstts= cust_book.confirm();
				/* On Customer confirming, proceed to Payment */
				if (bookstts.contains("Confirm"))
				{
					/* Check Payment Status */
					System.out.println(Payment.chk_paymentstatus());
					int paychk=Payment.chk_paymentstatus();
					
					if ((paychk-1)==0)
					{
						/* If Payment is successful, proceed to payment */
						cust_book.setBookingID();
						cust_book.getBookingID();
						System.out.println("Cycle Booked ...."+cust_book.BookingID);
						cust_book.setStartTime();
						cust_book.setEndTime(); 
						cust_book.charge_penalty();
						
					}
					else
					{
						/* If Payment is unsuccessful, notify user*/
						System.out.println("Cycle Payment Failed ....");
					}
				}
				else
				{
					/* If Cycle is unavailable, notify user*/
					System.out.println("No Cycle Booked ....");
				}		
			}
		}
	
	else 
	{
		/* If License Validity fails, notify user*/
		stts="Failed";
		System.out.println("License validity for " +custnew.name + ": Failed");
	} 
}
	
}
