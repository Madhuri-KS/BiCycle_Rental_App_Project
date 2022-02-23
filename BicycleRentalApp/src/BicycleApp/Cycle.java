package BicycleApp;
import java.util.ArrayList;
public class Cycle {
	static int modelID;
	public String modelName, usage_Cycle, color;
	static ArrayList<String> cycleList = new ArrayList<String>();
	public int yearOfMfg;	
	public Cycle()
	{
		System.out.println("HERE NOW cycle const");
		cycleList.add("CYCLE_1");
		cycleList.add("CYCLE_2");
		cycleList.add("CYCLE_3");
		cycleList.add("CYCLE_4");
		//System.out.println(cycleList);
		modelID=(int) (Math.random() * (10) + 1);
	}
	
	public void add_to_Inventory(int nbr) {
		cycleList.add("CYCLE_" + nbr);
	}
	public void remove() {}
	public void modify_cancel_details() {}
	public String getDetails()
	{
		System.out.println("HERE NOW getdetail call");
		if (modelID < 5)
		{
			return cycleList.get(modelID);
		}
		else 
		{
			return "";
		}
	}
	
}
