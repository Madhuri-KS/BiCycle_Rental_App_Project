package BicycleApp;

public class Customer extends Person{
	
	public Customer()
	{
		Station cust_station = new Station(); 
		BookingDetails cust_book = new BookingDetails();
		Cycle cust_cycle=new Cycle();
		RidingSystem cust_ridingsys=new RidingSystem();
		Controller cust_controller=new Controller();
		Payment cust_payment=new Payment();
		Inventory cust_inv=new Inventory();	
		
	}
	public static void main(String[] args) {
		System.out.println("Hey Welcome! Select your Ride today ! ");
		Customer custnew=new Customer();
		custnew.add_details();
		custnew.remove_details();
		
		
		
	
	}
	
}
