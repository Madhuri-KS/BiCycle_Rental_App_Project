package BicycleApp;

import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public interface Controller {
	public static final String currentSpeed = "";
	public static final float charging = 0;
	public long calculate_duration(Date start_time, Date end_time);
	
	public void setStartTime();
	public void setEndTime();
	public void CalculateDistanceTravelled();
	
	public void setNavigation(boolean flag);
	public void displayNavigation();
	public void isSufficientlyCharged();
}
