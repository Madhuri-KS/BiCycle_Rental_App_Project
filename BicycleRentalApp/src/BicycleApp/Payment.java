package BicycleApp;

import java.util.Random;
/* Payment Class */
public class Payment {
	/* Attributes - Payment related attributes */
	int PaymentID;
	float amount;
	String DiscountCode,Status;
	/* Methods for checking payment status, currently randomly decides Success/Failure*/
public static int chk_paymentstatus()
{
	//return 0;
	Random r=new Random();
	int payst = r.nextInt(1,2 );
	return payst;	
}
public void make_payment(){}
public void raiseDispute(){}

}
