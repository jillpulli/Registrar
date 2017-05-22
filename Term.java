package Registrar_v2;

import java.util.ArrayList;

/**
 * The Term class contains an ArrayList of sections and the 
 * String "term"
 *
 */
public class Term {
	
	private ArrayList<Section> sections;
	private String term;
	
	/**
	 * The Default constructor of Term
	 */
	public Term() {
	}
	
	
	/**
	 * Additional Constructor of Term that contains the parameter term.
	 * @param term The term 
	 */
	public Term(String term) {
		this.term = term;
		sections = new ArrayList<Section>();
	}
	
	/**
	 * Method returns the ArrayList of sections
	 * @return the sections
	 */
	public ArrayList<Section> getSections() {
		return sections;
	}

	
	/**
	 * Another constructor of Term that takes
	 * the sections ArrayList and a term in String
	 * @param sections The sections of the term
	 * @param term		The term
	 */
	public Term(ArrayList<Section> sections, String term) {
		this.sections = sections;
		this.term = term;
	}
	
	
	/**
	 * Adds a section
	 * @param section The section to be added
	 */
	public void addSection(Section section) {
		sections.add(section);
	}
	
	/**
	 * Returns the sections ONLY in the specific department
	 * @param depart
	 * @return
	 */
	public ArrayList<Section> getSectionsForDepart(Department depart) {
		
		ArrayList<Section> theseSections = new ArrayList<Section>();
		
		for(int i = 0; i < sections.size(); i++){
			if(sections.get(i).getCourse().getDepartment().equals(depart)) {
				theseSections.add(sections.get(i));
			}
		}
		
		return theseSections;
	}
}
