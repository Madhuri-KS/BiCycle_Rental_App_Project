package BicycleApp;

/* Class Person */

public class Person {
	
/* Person Attributes - ID, name, address etc */
 public String ID,name,address, gender, type ;
 public float age;
 
 /* Methods - To Add, Modify and Remove Details of a person - customer/employee */
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
