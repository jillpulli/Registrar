package Registrar_v2;


/**
 * The Course class contains the course number, title and department 
 * of the course that is to be taken.
 * @author Jill
 *
 */
public class Course {
	
	
	private String courseNumber; 
	private String title;
	private Department department;
	
	
	/**
	 * Constructor for Course, sets the instance variables
	 * @param courseNumber	The course number of the Course
	 * @param title			The title of the Course
	 * @param department	The department of the Course
	 */
	public Course(String courseNumber, String title, Department department) {
		this.courseNumber = courseNumber;
		this.title = title;
		this.department = department;
	}
	
	
	/**
	 * Method that returns the course number of the Course
	 * @return The course number to be returned
	 */
	public String getCourseNumber() {
		return courseNumber;
	}
	
	
	/**
	 * Sets the course number of the Course
	 * @param courseNumber the courseNumber to set
	 */
	public void setCourseNumber(String courseNumber) {
		this.courseNumber = courseNumber;
	}
	
	
	/**
	 * Method that returns the title of the Course
	 * @return the title of the course
	 */
	public String getTitle() {
		return title;
	}
	
	
	/**
	 * Sets the title of the course
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	
	
	/**
	 * Returns the department of the course
	 * @return the department of the course
	 */
	public Department getDepartment() {
		return department;
	}
	
	
	/**
	 * Sets the department of the course
	 * @param department the department to set
	 */
	public void setDepartment(Department department) {
		this.department = department;
	}
}
