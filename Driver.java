package Registrar_v2;

import java.util.ArrayList;
import java.time.LocalTime;
import java.util.Random;


public class Driver {

	public static void main(String[] args) {
		Random r = new Random();

		// Build the objects needed to represent the registration process
		Catalog catalog = new Catalog();
		Term term = new Term("<the term>");  // change to the current term
		Faculty faculty = new Faculty();
		Student student = new Student(1, "<your last name>");  // change to your last name
		ArrayList<Timeslot> timeslots = new ArrayList<>();
				
		// Populate these objects
		createInstructors(faculty);  // Send the faculty object to method for instructor population
		createCourses(catalog);	     // Send the catalog object to method for course population
		createTimeSlots(timeslots);
		createSections(term, catalog, faculty, timeslots, r);
		
		GUI gooey = new GUI(term);
	}
	

	/**
	 * Method creates and adds Instructors to faculty
	 * @param faculty The faculty to have instructors stored in
	 */
	private static void createInstructors(Faculty faculty) {
		faculty.addInstructor(new Instructor(101, "Johnson"));
		faculty.addInstructor(new Instructor(102, "Kay"));
		faculty.addInstructor(new Instructor(103, "Xu"));
		faculty.addInstructor(new Instructor(104, "Mulligan"));
		faculty.addInstructor(new Instructor(105, "Muldoon"));
		faculty.addInstructor(new Instructor(106, "Stanzione"));
		faculty.addInstructor(new Instructor(107, "Brady"));
		faculty.addInstructor(new Instructor(108, "Sawyer"));
		faculty.addInstructor(new Instructor(109, "Brown"));
		faculty.addInstructor(new Instructor(110, "Harrison"));
		faculty.addInstructor(new Instructor(111, "Ford"));
		faculty.addInstructor(new Instructor(112, "Danzinger"));
		faculty.addInstructor(new Instructor(113, "Clarke"));
		faculty.addInstructor(new Instructor(114, "Abraham"));
		faculty.addInstructor(new Instructor(115, "Perkowski"));
		faculty.addInstructor(new Instructor(116, "Brando"));
	}
	
	
	/**
	 * Creates and adds courses to catalog
	 * @param catalog The catalog to have courses added to
	 */
	private static void createCourses(Catalog catalog) {
		catalog.addCourse(new Course("ART 01.101", "Art Appreciation", Department.ART));	
		catalog.addCourse(new Course("ART 01.201", "Painting with Oils", Department.ART));
		catalog.addCourse(new Course("ART 01.202", "Painting with Water Colors", Department.ART));
		catalog.addCourse(new Course("BIOL 01.110", "Genetics", Department.BIOLOGY));
		catalog.addCourse(new Course("BIOL 04.301", "Anatomy and Physiology", Department.BIOLOGY));		
		catalog.addCourse(new Course("CHEM 01.101", "Introduction to Chemistry", Department.CHEMISTRY));
		catalog.addCourse(new Course("CHEM 01.201", "Organic Chemistry", Department.CHEMISTRY));
		catalog.addCourse(new Course("CHEM 01.301", "Analytical Chemistry", Department.CHEMISTRY));
		catalog.addCourse(new Course("CSC 04.114", "Object Oriented Programming", Department.COMPUTER_SCIENCE));
		catalog.addCourse(new Course("CSC 04.301", "Human Computer Interaction", Department.COMPUTER_SCIENCE));
		catalog.addCourse(new Course("CSC 07.211", "Artificial Intelligence", Department.COMPUTER_SCIENCE));
		catalog.addCourse(new Course("CSC 04.370", "Software Engineering", Department.COMPUTER_SCIENCE));
		catalog.addCourse(new Course("CSC 04.210", "Data Structures and Algorithms", Department.COMPUTER_SCIENCE));
		catalog.addCourse(new Course("ECON 01.101", "Microeconomics", Department.ECONOMICS));
		catalog.addCourse(new Course("HIS 01.101", "Western Civilization", Department.HISTORY));
		catalog.addCourse(new Course("HIS 01.331", "Civil Wars", Department.HISTORY));
		catalog.addCourse(new Course("MUS 01.214", "The Genres of Rock Music", Department.MUSIC));
		catalog.addCourse(new Course("PHIL 01.111", "Ethics", Department.PHILOSOPHY));
		catalog.addCourse(new Course("PHIL 01.221", "Existentialism", Department.PHILOSOPHY));
		catalog.addCourse(new Course("PHY 02.121", "Introduction to Mechanics", Department.PHYSICS));
		catalog.addCourse(new Course("PSY 04.114", "Abnormal Psychology", Department.PSYCHOLOGY));		
	}	
	
	/**
	 * Method creates and add Timeslots to the ArrayList of timeslots, 
	 * timeslots are Monday - Friday each hour from 8 am until 6 pm
	 * @param timeslots The ArrayList of timeslots
	 */
	private static void createTimeSlots(ArrayList<Timeslot> timeslots){
		timeslots.add(new Timeslot(java.time.DayOfWeek.MONDAY,LocalTime.parse("08:00"),LocalTime.parse("08:50")));
		timeslots.add(new Timeslot(java.time.DayOfWeek.MONDAY,LocalTime.parse("09:00"),LocalTime.parse("09:50")));
		timeslots.add(new Timeslot(java.time.DayOfWeek.MONDAY,LocalTime.parse("10:00"),LocalTime.parse("10:50")));
		timeslots.add(new Timeslot(java.time.DayOfWeek.MONDAY,LocalTime.parse("11:00"),LocalTime.parse("11:50")));
		timeslots.add(new Timeslot(java.time.DayOfWeek.MONDAY,LocalTime.parse("12:00"),LocalTime.parse("12:50")));
		timeslots.add(new Timeslot(java.time.DayOfWeek.MONDAY,LocalTime.parse("13:00"),LocalTime.parse("13:50")));
		timeslots.add(new Timeslot(java.time.DayOfWeek.MONDAY,LocalTime.parse("14:00"),LocalTime.parse("14:50")));
		timeslots.add(new Timeslot(java.time.DayOfWeek.MONDAY,LocalTime.parse("15:00"),LocalTime.parse("15:50")));
		timeslots.add(new Timeslot(java.time.DayOfWeek.MONDAY,LocalTime.parse("16:00"),LocalTime.parse("16:50")));
		timeslots.add(new Timeslot(java.time.DayOfWeek.MONDAY,LocalTime.parse("17:00"),LocalTime.parse("17:50")));
		timeslots.add(new Timeslot(java.time.DayOfWeek.MONDAY,LocalTime.parse("18:00"),LocalTime.parse("18:50")));

		timeslots.add(new Timeslot(java.time.DayOfWeek.TUESDAY,LocalTime.parse("08:00"),LocalTime.parse("08:50")));
		timeslots.add(new Timeslot(java.time.DayOfWeek.TUESDAY,LocalTime.parse("09:00"),LocalTime.parse("09:50")));
		timeslots.add(new Timeslot(java.time.DayOfWeek.TUESDAY,LocalTime.parse("10:00"),LocalTime.parse("10:50")));
		timeslots.add(new Timeslot(java.time.DayOfWeek.TUESDAY,LocalTime.parse("11:00"),LocalTime.parse("11:50")));
		timeslots.add(new Timeslot(java.time.DayOfWeek.TUESDAY,LocalTime.parse("12:00"),LocalTime.parse("12:50")));
		timeslots.add(new Timeslot(java.time.DayOfWeek.TUESDAY,LocalTime.parse("13:00"),LocalTime.parse("13:50")));
		timeslots.add(new Timeslot(java.time.DayOfWeek.TUESDAY,LocalTime.parse("14:00"),LocalTime.parse("14:50")));
		timeslots.add(new Timeslot(java.time.DayOfWeek.TUESDAY,LocalTime.parse("15:00"),LocalTime.parse("15:50")));
		timeslots.add(new Timeslot(java.time.DayOfWeek.TUESDAY,LocalTime.parse("16:00"),LocalTime.parse("16:50")));
		timeslots.add(new Timeslot(java.time.DayOfWeek.TUESDAY,LocalTime.parse("17:00"),LocalTime.parse("17:50")));
		timeslots.add(new Timeslot(java.time.DayOfWeek.TUESDAY,LocalTime.parse("18:00"),LocalTime.parse("18:50")));
		
		timeslots.add(new Timeslot(java.time.DayOfWeek.WEDNESDAY,LocalTime.parse("08:00"),LocalTime.parse("08:50")));
		timeslots.add(new Timeslot(java.time.DayOfWeek.WEDNESDAY,LocalTime.parse("09:00"),LocalTime.parse("09:50")));
		timeslots.add(new Timeslot(java.time.DayOfWeek.WEDNESDAY,LocalTime.parse("10:00"),LocalTime.parse("10:50")));
		timeslots.add(new Timeslot(java.time.DayOfWeek.WEDNESDAY,LocalTime.parse("11:00"),LocalTime.parse("11:50")));
		timeslots.add(new Timeslot(java.time.DayOfWeek.WEDNESDAY,LocalTime.parse("12:00"),LocalTime.parse("12:50")));
		timeslots.add(new Timeslot(java.time.DayOfWeek.WEDNESDAY,LocalTime.parse("13:00"),LocalTime.parse("13:50")));
		timeslots.add(new Timeslot(java.time.DayOfWeek.WEDNESDAY,LocalTime.parse("14:00"),LocalTime.parse("14:50")));
		timeslots.add(new Timeslot(java.time.DayOfWeek.WEDNESDAY,LocalTime.parse("15:00"),LocalTime.parse("15:50")));
		timeslots.add(new Timeslot(java.time.DayOfWeek.WEDNESDAY,LocalTime.parse("16:00"),LocalTime.parse("16:50")));
		timeslots.add(new Timeslot(java.time.DayOfWeek.WEDNESDAY,LocalTime.parse("17:00"),LocalTime.parse("17:50")));
		timeslots.add(new Timeslot(java.time.DayOfWeek.WEDNESDAY,LocalTime.parse("18:00"),LocalTime.parse("18:50")));
		
		timeslots.add(new Timeslot(java.time.DayOfWeek.THURSDAY,LocalTime.parse("08:00"),LocalTime.parse("08:50")));
		timeslots.add(new Timeslot(java.time.DayOfWeek.THURSDAY,LocalTime.parse("09:00"),LocalTime.parse("09:50")));
		timeslots.add(new Timeslot(java.time.DayOfWeek.THURSDAY,LocalTime.parse("10:00"),LocalTime.parse("10:50")));
		timeslots.add(new Timeslot(java.time.DayOfWeek.THURSDAY,LocalTime.parse("11:00"),LocalTime.parse("11:50")));
		timeslots.add(new Timeslot(java.time.DayOfWeek.THURSDAY,LocalTime.parse("12:00"),LocalTime.parse("12:50")));
		timeslots.add(new Timeslot(java.time.DayOfWeek.THURSDAY,LocalTime.parse("13:00"),LocalTime.parse("13:50")));
		timeslots.add(new Timeslot(java.time.DayOfWeek.THURSDAY,LocalTime.parse("14:00"),LocalTime.parse("14:50")));
		timeslots.add(new Timeslot(java.time.DayOfWeek.THURSDAY,LocalTime.parse("15:00"),LocalTime.parse("15:50")));
		timeslots.add(new Timeslot(java.time.DayOfWeek.THURSDAY,LocalTime.parse("16:00"),LocalTime.parse("16:50")));
		timeslots.add(new Timeslot(java.time.DayOfWeek.THURSDAY,LocalTime.parse("17:00"),LocalTime.parse("17:50")));
		timeslots.add(new Timeslot(java.time.DayOfWeek.THURSDAY,LocalTime.parse("18:00"),LocalTime.parse("18:50")));
		
		timeslots.add(new Timeslot(java.time.DayOfWeek.FRIDAY,LocalTime.parse("08:00"),LocalTime.parse("08:50")));
		timeslots.add(new Timeslot(java.time.DayOfWeek.FRIDAY,LocalTime.parse("09:00"),LocalTime.parse("09:50")));
		timeslots.add(new Timeslot(java.time.DayOfWeek.FRIDAY,LocalTime.parse("10:00"),LocalTime.parse("10:50")));
		timeslots.add(new Timeslot(java.time.DayOfWeek.FRIDAY,LocalTime.parse("11:00"),LocalTime.parse("11:50")));
		timeslots.add(new Timeslot(java.time.DayOfWeek.FRIDAY,LocalTime.parse("12:00"),LocalTime.parse("12:50")));
		timeslots.add(new Timeslot(java.time.DayOfWeek.FRIDAY,LocalTime.parse("13:00"),LocalTime.parse("13:50")));
		timeslots.add(new Timeslot(java.time.DayOfWeek.FRIDAY,LocalTime.parse("14:00"),LocalTime.parse("14:50")));
		timeslots.add(new Timeslot(java.time.DayOfWeek.FRIDAY,LocalTime.parse("15:00"),LocalTime.parse("15:50")));
		timeslots.add(new Timeslot(java.time.DayOfWeek.FRIDAY,LocalTime.parse("16:00"),LocalTime.parse("16:50")));
		timeslots.add(new Timeslot(java.time.DayOfWeek.FRIDAY,LocalTime.parse("17:00"),LocalTime.parse("17:50")));
		timeslots.add(new Timeslot(java.time.DayOfWeek.FRIDAY,LocalTime.parse("18:00"),LocalTime.parse("18:50")));
	}
	
	
	/**
	 * Creates the sections of courses and adds them to the term. 
	 * @param term
	 * @param catalog
	 * @param faculty
	 * @param timeslots
	 * @param r
	 */
	private static void createSections(Term term, Catalog catalog, Faculty faculty, ArrayList<Timeslot> timeslots, Random r) {
		Integer crn = 40001;
		for (Course course: catalog.getCourses()) {
			term.addSection(new TraditionalSection(crn, course, faculty.getInstructors().get(r.nextInt(faculty.getInstructors().size())), timeslots.get(r.nextInt(timeslots.size())),timeslots.get(r.nextInt(timeslots.size()))));
			crn++;
			term.addSection(new HybridSection(crn, course,faculty.getInstructors().get(r.nextInt(faculty.getInstructors().size())), timeslots.get(r.nextInt(timeslots.size()))));
			crn++;
			term.addSection(new OnlineSection(crn, course,faculty.getInstructors().get(r.nextInt(faculty.getInstructors().size()))));
			crn++;
		}
	}
		
}

		

