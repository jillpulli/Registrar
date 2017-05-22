package Registrar_v2;

/**
 * The timeslot class contains the information for sections on
 * their day of the week, start and end time.
 */
public class Timeslot {
	
	private java.time.DayOfWeek weekDay;
	private java.time.LocalTime startTime;
	private java.time.LocalTime endTime;
	
	/**
	 * Default constructor
	 */
	public Timeslot() {
		
	}
	
	
	/**
	 * Additional Constructor that takes in the fields as arguments
	 * @param weekDay
	 * @param startTime
	 * @param endTime
	 */
	public Timeslot(java.time.DayOfWeek weekDay,java.time.LocalTime startTime,java.time.LocalTime endTime) {
		this.weekDay = weekDay;
		this.startTime = startTime;
		this.endTime = endTime;
	}
	
	/**
	 * Method returns the week day
	 * @return the weekDay
	 */
	public java.time.DayOfWeek getWeekDay() {
		return weekDay;
	}
	
	
	/**
	 * @param weekDay the weekDay to set
	 */
	public void setWeekDay(java.time.DayOfWeek weekDay) {
		this.weekDay = weekDay;
	}
	
	
	/**
	 * @return the startTime
	 */
	public java.time.LocalTime getStartTime() {
		return startTime;
	}
	
	
	/**
	 * @param startTime the startTime to set
	 */
	public void setStartTime(java.time.LocalTime startTime) {
		this.startTime = startTime;
	}
	
	
	/**
	 * @return the endTime
	 */
	public java.time.LocalTime getEndTime() {
		return endTime;
	}
	
	
	/**
	 * @param endTime the endTime to set
	 */
	public void setEndTime(java.time.LocalTime endTime) {
		this.endTime = endTime;
	}
	
	
}
