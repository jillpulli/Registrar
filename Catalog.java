package Registrar_v2;

import java.util.ArrayList;


/**
 * The class Catalog contains an ArrayList of Courses.
 * Contains a method to add courses to it and
 * a method that returns courses in a specified department.
 */
public class Catalog {
	
	
	//creates an ArrayList of Courses
	private ArrayList<Course> courses = new ArrayList<Course>();
	
	
	/**
	 * Adds a course to the ArrayList of courses
	 * @param course The course to be added
	 */
	public void addCourse(Course course) {
		courses.add(course);
	}
	
	
	/**
	 * Getter method for returning the ArrayList of courses
	 * @return The courses in the ArrayList
	 */
	public ArrayList<Course> getCourses() {
		return courses;
	}
	
	
	/**
	 * Returns the courses ONLY in the specific department
	 * @param depart The department that is selected
	 * @return The courses in the specified department
	 */
	public ArrayList<Course> getCoursesForDepart(Department depart) {
		
		ArrayList<Course> theseCourses = new ArrayList<Course>();
		
		for(int i = 0; i < courses.size(); i++){
			if(courses.get(i).getDepartment().equals(depart)) {
				theseCourses.add(courses.get(i));
			}
		}
		
		return theseCourses;
	}
	
}
