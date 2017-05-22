package Registrar_v2;


/**
 * Person class contains all the fields that a person would have:
 * 		-id
 * 		-firstName
 * 		-middleName	
 * 		-lastName
 * 		-email
 * 		-ssn
 * 		-age
 */
public class Person {
	private int id;
	private String firstName;
	private String middleName;
	private String lastName;
	private String email;
	private String ssn;
	private int age; 
	public static int maxValue = 0;
	
	
	/**
	 * Default constructor for Person
	 */
	public Person() {
	}
	
	
	/**
	 * Constructor for class Person that passes the fields.
	 * @param firstName
	 * @param middleName
	 * @param lastName
	 * @param email
	 * @param ssn
	 * @param age
	 */
	public Person(String firstName, String middleName, String lastName,
			String email, String ssn, int age) {
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.email = email;
		this.ssn = ssn;
		this.age = age;
	}
	
	/**
	 * Constructor for Person that only takes ID and lastName
	 * @param ID
	 * @param lastName
	 */
	public Person (int ID, String lastName) {
		this.id = ID;
		this.lastName = lastName;
	}
	
	/**
	 * Method returns the ID of person
	 * @return	The id of person
	 */
	public int getId() {
		return id;
	}
	
	/**
	 * Method sets the ID of Person
	 * @param id The id of person
	 */
	public void setId(int id) {
		this.id = id;
	}
	
	/**
	 * Returns the first name of person
	 * @return The first name of person
	 */
	public String getFirstName() {
		return firstName;
	}
	
	/**
	 * Method sets the first name of person
	 * @param firstName The first name to be set of person
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public int getAge() {
		return age;
		
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	/**
	 * @return The portion of the email after '@'
	 */
	public String getEmailDomain(){
		String emailDomain = email.substring(email.indexOf('@') + 1);
		return emailDomain;
	}
	
	/**
	 * @return The last 4 numbers of the Person's ssn
	 */
	public String getLast4SSN(){
		String last4 = this.ssn.substring(7,11);
		return last4;
	}
	/**
	 * taken help from internet(read about Pattern and Matcher class.
	 * @param email
	 * @return
	 */
	public static boolean isValidEmailAddress(String email) {
         String ePattern = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$";
         java.util.regex.Pattern p = java.util.regex.Pattern.compile(ePattern);
         java.util.regex.Matcher m = p.matcher(email);
         return m.matches();
    }
	
	
	/**
	 * Determines if a string is a proper social security number
	 * @param ssn 
	 * @return true if the ssn is in the format (###-##-####)
	 * 		   false if not
	 */
	public static boolean isValidSSN(String ssn){
		boolean flag = false;
		if((ssn.length() == 11) && (ssn.charAt(3) == '-') && (ssn.charAt(6) == '-')) 
			flag = true;
		else{
			flag = false;
		}
		return flag;
		
	}
	
	/**
	 * Determines if an integer is a valid age
	 * @param age
	 * @return True if the age is between 16 and 100
	 * 		   False if not
	 */
	public static boolean isValidAge(int age){
		boolean flag = false;
		if(age > 16 && age < 100)
			flag = true;
		else
			flag = false;
		return flag;
	}
	
	
	/**
	 * Determines if an age is the highest age yet seen.
	 * Changes the highest age if so.
	 * @param age 
	 * @return "oldest" if the person is the oldest Person created
	 * 		   "not oldest" otherwise
	 */
	public static String isMaxAge(int age){
		String s = null;
		if (age > maxValue){ 
			maxValue = age;
			s = "oldest";
		}
		else
			s = "not oldest";
		return s;
	}
	public String toString(){
		return "\n" + this.firstName + " " + this.middleName + " " + this.lastName + "(" + this.getClass().getSimpleName() + ")" + "\n" + getEmailDomain() + "\n" + getLast4SSN() + "\n" + isMaxAge(getAge());
	}
}