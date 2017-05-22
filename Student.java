package Registrar_v2;

import java.util.HashMap;

/**
 * Subclass of person will have an additional attribute called major
 *
 */
public class Student extends Person{
	
	private String major;
	private HashMap<Integer, Section> currentSections = new HashMap<>();
	
	/**
	 * no argument constructor from super class.
	 */
	public Student(){
		super();
	}
	
	public Student(String firstName, String middleName, String lastName,
			String email, String ssn, int age, String major) {
		super(firstName, middleName, lastName, email, ssn, age);
		this.major = major;
	}
	
	public Student(int id, String lastName) {
		super(id, lastName);
	}
	
	public String getMajor() {
		return major;
	
	}
	public void setMajor(String major) {
		this.major = major;
	
	}
	public String toString(){
		return  super.toString() + "\n" + this.major;
	
	}
	public void add(Section section) {
		currentSections.put(section.getCRN(), section);
	}
	


}
