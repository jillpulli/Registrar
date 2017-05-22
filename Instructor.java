/**
 * 
 */
package Registrar_v2;

/**
 * Class Instructor is a subclass of Person.
 * Instructors have an extra field, department
 */
public class Instructor extends Person{
	
	
	private String department;
	
	
	/**
	 * Default constructor, calls the super class, Person's default constructor.
	 */
	public Instructor() {
		super();
	}
	
	
	/**
	 * Constructor that takes in the fields from the super class
	 * @param firstName		The first name of the Instructor
	 * @param middleName	The middle name of the Instructor
	 * @param lastName		The last name of the Instructor
	 * @param email			The email of the Instructor
	 * @param ssn			The social security number of Instructor
	 * @param age			The age of the Instructor
	 */
	public Instructor(String firstName, String middleName, String lastName,
			String email, String ssn, int age, String department) {
		super(firstName, middleName, lastName, email, ssn, age);
		this.department = department;
	}
	
	
	/**
	 * Constructor that only takes in  id and last name from superclass
	 * @param id
	 * @param lastName
	 */
	public Instructor(int id, String lastName) {
		super(id, lastName);
	}
	
	/**
	 * Method returns the department of the Instructor
	 * @return department of instructor
	 */
	public String getDepartment() {
		return department;
	}
	
	/**
	 * Method sets the department of the instructor
	 * @param department The department of the instructor
	 */
	public void setDepartment(String department) {
		this.department = department;
	}
	
	/**
	 * Method returns the toString from the super class along with the department/
	 */
	public String toString(){
		return  super.toString() + "\n" + this.department;
	}
	
}
