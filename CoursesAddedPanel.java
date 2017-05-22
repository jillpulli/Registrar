package Registrar_v2;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.*;

/**
 * CoursesAddedPanel is the bottom panel that displays the list of sections
 * the user added from clicking on the CRN buttons.
 *
 */
public class CoursesAddedPanel extends JPanel{

	private ArrayList<Section> theseSections = new ArrayList<Section>();
	private JLabel courseLabel;

	
	/**
	 * Constructor of CoursesAddedPanel that creates the Label
	 * and adds it to the panel.
	 */
	public CoursesAddedPanel() {
		courseLabel = new JLabel(getLabel());
		add(courseLabel);
		setBackground(new Color(220, 220, 220));
	}

	
	/**
	 * Method iterates through the Sections in the ArrayList and 
	 * displays the list of sections 
	 * @return returnString, the String of the courses added.
	 */
	public String getLabel() {
		String returnString = "";
		Iterator<Section> it = theseSections.iterator();
		while (it.hasNext()) {
			Section section = it.next();
			returnString += section.toString();
			if (it.hasNext())
				returnString += ", ";
		}
		return returnString;
	}


	/**
	 * Method adds a section to the ArrayList of courses that were chosen
	 * and updates the label to display them. If the course is online or a hybrid,
	 * then they will get notified by a JOptionPane to confirm their choice. If they already
	 * chose that section, then it will get removed from the label/ ArrayList.
	 * @param section The section to be added.
	 */
	public void addSection(Section section) {
		boolean valid = true;
		if (!theseSections.contains(section)) {
			if (section instanceof IsOnline){
				valid = ((IsOnline) section).validateChoice();
			}
			if (valid && timeCheck(section)) {
				theseSections.add(section);
				courseLabel.setText(getLabel());
			}
		}
		else if (theseSections.contains(section)){
			theseSections.remove(section);
			courseLabel.setText(getLabel());
		}

	}

	
	/**
	 * Method returns the courseLabel
	 * @return the courseLabel to be returned
	 */
	public JLabel getCourseLabel() {
		return courseLabel;
	}

	/**
	 * Method checks if the time slots are available, if not then the user will
	 * be prompted by a JOptionPane Error Message.
	 */
	private boolean timeCheck(Section section) {
		boolean valid = true;
		if (section instanceof OnlineSection)
			return true;
		for (Section addedSection: theseSections) {
			if (addedSection instanceof TraditionalSection) {
				ArrayList<Timeslot> timeslots = ((TraditionalSection)addedSection).getTimeSlots();
				for (Timeslot time: timeslots) {
					if (section instanceof TraditionalSection) {
						for (Timeslot time2: ((TraditionalSection)section).getTimeSlots()) {
							if (time2.equals(time)) {
								valid = false;
							}
						}
						if (section instanceof HybridSection) {
							if (time.equals(((HybridSection)section).getTimeSlot())) {
								valid = false;
							}
						}
					}
				}
			}
		}
		if(!valid) {
			JOptionPane.showMessageDialog(null, "This class's time conflicts with another class on your schedule.", "Time Conflict", JOptionPane.ERROR_MESSAGE);
		}
		return valid;
	}
}
