package Registrar_v2;

import javax.swing.JOptionPane;


/**
 * Hybrid Sections only meet once a week and have the other work online,
 * this class only has one Timeslot.
 */
public class HybridSection extends Section implements IsOnline {
	
	private Timeslot timeSlot;
	
	
	/**
	 * The HybridSection constructor calls its super class, Section.
	 * @param CRN 			The CRN of the section
	 * @param course		The course of the section
	 * @param instructor	The instructor of the section
	 * @param timeslot		The timeslot of the section
	 */
	public HybridSection(Integer CRN, Course course, Instructor instructor, Timeslot timeslot) {
		super.setCRN(CRN);
		super.setCourse(course);
		super.setInstructor(instructor);
		this.timeSlot = timeslot;
	}
	
	
	/**
	 * Method returns the schedule of the section
	 * @return A schedule of times for the section
	 */
	public String getSchedule() {
		return timeSlot.getWeekDay() + ": " + timeSlot.getStartTime() + " - " + timeSlot.getEndTime();
	}
	
	
	/**
	 * Method prompts the user if they select a hybrid class.
	 */
	public boolean validateChoice() {
		int value;
		value = JOptionPane.showConfirmDialog(null, "Hybrid classes require online connectivity."
				+ " Are you sure you want to register for this class?");
		if (value == JOptionPane.YES_OPTION){
			return true;
		}
		else {
			return false;
		}
	}


	/**
	 * Method returns the timeslot of the section
	 * @return the timeSlot
	 */
	public Timeslot getTimeSlot() {
		return timeSlot;
	}

}
