package BicycleApp;

import java.util.regex.Pattern;

public class Customer extends Person {
	private String License,isPremiumCustomer,login,password;
	private int cust_id;
	private static String stts;
	Station cust_station;
	static BookingDetails cust_book;
	static Cycle cust_cycle;
	RidingSystem cust_ridingsys;
	Controller cust_controller;
	Payment cust_payment;
	Inventory cust_inv;
	 
	public Customer(String Name)
	{
		super(Name);
		cust_station = new Station(); 
		cust_book = new BookingDetails();
		//cust_cycle=new Cycle();
		cust_ridingsys=new RidingSystem();
		cust_controller=new Controller();
	    cust_payment=new Payment();
		cust_inv=new Inventory();	
	}
	public boolean check_license_validity(double status) {
		return Math.random() > status; 
	}
	 
	
	public static void main(String[] args) 
	{
		System.out.println("Hey Welcome! Select your Ride today ! ");
		Customer custnew=new Customer("Tina");
		custnew.add_details(); 
		if (custnew.check_license_validity(0.1))
		{
			stts="Succeded";
			System.out.println("License validity for " +custnew.name + ": Succeeded");
			cust_book.SelectDuration();
			System.out.println("Check Cycle availablity ....");
			String chk=cust_book.checkAvailability(new Cycle());
			//Pattern pattern = Pattern.compile("Cycle available");
			System.out.println(chk.contains("Cycle available"));
			if (chk.contains("Cycle available"))
			{
				String bookstts= cust_book.confirm();
				if (bookstts.contains("Confirm"))
				{
					System.out.println(Payment.chk_paymentstatus());
					int paychk=Payment.chk_paymentstatus();
					if ((paychk-1)==0)
					{
						cust_book.setBookingID();
						cust_book.getBookingID();
						System.out.println("Cycle Booked ...."+cust_book.BookingID);
					}
					else
					{
						System.out.println("Cycle Payment Failed ....");
					}
				}
				else
				{
					System.out.println("No Cycle Booked ....");
				}		
			}
		}
	
	else 
	{
		stts="Failed";
		System.out.println("License validity for " +custnew.name + ": Failed");
	} 
}
	
}
