package Registrar_v2;

import java.util.ArrayList;


/**
 * The Faculty class is an ArrayList of Instructors
 *
 */
public class Faculty {
	
	private ArrayList<Instructor> instructors = new ArrayList<Instructor>();
	
	
	/**
	 * Method adds an instructor to the ArrayList
	 * @param instructor The instructor to be added
	 */
	public void addInstructor(Instructor instructor) {
		instructors.add(instructor);
	}

	/**
	 * Method returns the ArrayList of instructors
	 * @return the instructors of the ArrayList
	 */
	public ArrayList<Instructor> getInstructors() {
		return instructors;
	}
	
	
}
