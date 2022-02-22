package BicycleApp;

public abstract class Person {
 public String ID,name,address, gender, type ;
 public float age;
private String nm;
 public Person(String nm)
 {
	 name = this.nm;
 }
 public void add_details() {
	 
	 System.out.println("Add Cust Details");
 }
 public void remove_details() {
	 
	 System.out.println("Remove Cust Details");
 }
 public void modify_details() {
	 System.out.println("Modify Cust Details");
 }
 
 
}
