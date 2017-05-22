package Registrar_v2;


/**
 * Section is an abstract class that holds the fields
 * CRN, course, and instructor
 *
 */
public abstract class Section {
	
	
	private Integer CRN;
	private Course course;
	private Instructor instructor;
	
	
	abstract public String getSchedule();

	/**
	 * Method returns the CRN of the section
	 * @return the cRN of the section
	 */
	public Integer getCRN() {
		return CRN;
	}

	/**
	 * Method sets the CRN of the section
	 * @param cRN the cRN to set
	 */
	public void setCRN(Integer cRN) {
		CRN = cRN;
	}

	/**
	 * Method returns the course of the section
	 * @return the course of the section
	 */
	public Course getCourse() {
		return course;
	}

	/**
	 * @param course the course to set
	 */
	public void setCourse(Course course) {
		this.course = course;
	}

	/**
	 * @return the instructor
	 */
	public Instructor getInstructor() {
		return instructor;
	}

	/**
	 * @param instructor the instructor to set
	 */
	public void setInstructor(Instructor instructor) {
		this.instructor = instructor;
	}

	
	public String toString() {
		return CRN + " " + course.getTitle();
	}
	
	
	}

