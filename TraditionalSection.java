package Registrar_v2;

import java.util.ArrayList;
import java.util.Iterator;


/**
 * TraditionalSection class has a list of timeslots
 */
public class TraditionalSection extends Section {
	
	
	private ArrayList<Timeslot> timeSlots = new ArrayList<Timeslot>(2);
	
	
	/**
	 * Constructor of TraditionalSection,
	 * takes in the fields from the super class along with
	 * adding the two timeslots to the collection
	 * @param CRN
	 * @param course
	 * @param instructor
	 * @param timeslot1
	 * @param timeslot2
	 */
	public TraditionalSection(Integer CRN, Course course, Instructor instructor, Timeslot timeslot1, Timeslot timeslot2) {
		super.setCRN(CRN);
		super.setCourse(course);
		super.setInstructor(instructor);
		timeSlots.add(timeslot1);
		timeSlots.add(timeslot2);
	}
	
	
	/**
	 * Method Iterates through Timeslots and returns the String
	 * of the schedule.
	 * @return A schedule of times for the section
	 */
	public String getSchedule() {
		String returnString = "";
		Iterator<Timeslot> it = timeSlots.iterator();
		while (it.hasNext()) {
			Timeslot time = it.next();
			returnString += time.getWeekDay() + ": " + time.getStartTime() + " - " + time.getEndTime();
			if (it.hasNext())
				returnString += ", ";
		}
		return returnString;
	}
	

	/**
	 * Method returns the ArrayList of timeslots.
	 * @return the timeSlots
	 */
	public ArrayList<Timeslot> getTimeSlots() {
		return timeSlots;
	}
}
