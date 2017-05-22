package Registrar_v2;

import javax.swing.JOptionPane;


/**
 * The Online Section class is a child class of Section
 * and has no timeslots.
 */
public class OnlineSection extends Section implements IsOnline {
	
	
	/**
	 * Constructor for OnlineSection. 
	 * @param CRN			The CRN of the section
	 * @param course		The course of the section
	 * @param instructor	The instructor of the section
	 */
	public OnlineSection(Integer CRN, Course course, Instructor instructor) {
		super.setCRN(CRN);
		super.setCourse(course);
		super.setInstructor(instructor);
	}
	
	
	/**
	 * Method returns the schedule, "online," of the section
	 * @return A schedule of times for the section
	 */
	public String getSchedule() {
		return "Online";
	}
	
	
	/**
	 * Method prompts the user to ask if they are sure about taking the class.
	 */
	public boolean validateChoice() {
		int value;
		value = JOptionPane.showConfirmDialog(null, "Remote classes require online connectivity and good time management skills."
				+ " Are you sure you want to register for this class?");
		if (value == JOptionPane.YES_OPTION){
			return true;
		}
		else {
			return false;
		}
	}
}
