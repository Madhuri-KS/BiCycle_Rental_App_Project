package BicycleApp;

public class Person {
 public String ID,name,address, gender, type ;
 public float age;
 public Person(String nm)
 {
	 this.name=nm;
 }
  public void add_details() {
	 	 System.out.println("Added Cust Details for " + name);
 }
 public void remove_details() {
	 
	 System.out.println("Removed Cust Details " + name);
 }
 public void modify_details() {
	 System.out.println("Modified Cust Details " + name);
 }
 
 
}
