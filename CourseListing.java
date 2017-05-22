package Registrar_v2;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;


/**
 * The CourseListing class is the panel in the GUI that displays the list of
 * courses in the specified department in the combo box.
 */
public class CourseListing extends JPanel {
	

	static private CoursesAddedPanel coursesAdded = new CoursesAddedPanel();
	private ArrayList<Section> theseCourses;


	/**
	 * The constructor for CourseLisiting.
	 * It creates the panel in the GUI that displays the list of Courses 
	 * from the selected department in the combo box.
	 * @param theseCourses The courses only in the specific department
	 */
	public CourseListing(ArrayList<Section> theseCourses) {
		this.theseCourses = theseCourses;
		
		//Will only make enough rows for however many courses exist in department
		int numCourses = theseCourses.size(); 
		setLayout(new GridLayout(++numCourses, 1)); 

		setBackground(Color.white);

		
		if (theseCourses.size() != 0) {
			//the top panel that contains the labels describing the courses
			JPanel topPanel = new JPanel();
			topPanel.setLayout(new GridLayout(1, 5));
			topPanel.setBackground(Color.white);
			JLabel crn = new JLabel("Click CRN to add or drop course");
			crn.setForeground(Color.blue);
			JLabel courseNum = new JLabel("Course Number");
			courseNum.setForeground(Color.blue);
			JLabel title = new JLabel("Title");
			title.setForeground(Color.blue);
			JLabel instructor = new JLabel("Instructor");
			instructor.setForeground(Color.blue);
			JLabel schedule = new JLabel("Schedule");
			schedule.setForeground(Color.blue);
			
			//adds the labels to the top panel
			topPanel.add(crn);
			topPanel.add(courseNum);
			topPanel.add(title);
			topPanel.add(instructor);
			topPanel.add(schedule);
			
			//adds the top panel to the overall panel
			add(topPanel);

			for (int i = 0; i < theseCourses.size(); i++) {
				Section section = theseCourses.get(i); 		
				JPanel panel = new JPanel();				
				panel.setLayout(new GridLayout(1, 5));
				JPanel buttonPanel = new JPanel();			
				buttonPanel.setLayout(new BorderLayout());
				JButton button = new JButton(section.getCRN().toString()); //button displays the CRN of the class
				button.addActionListener(new ButtonListener());
				button.setPreferredSize(new Dimension(10, 20));	//attempt to change the size of the button
				buttonPanel.add(button, BorderLayout.CENTER);
				panel.add(buttonPanel);
				
				//displays the info of the courses into a label
				panel.add(new JLabel(section.getCourse().getCourseNumber()));
				panel.add(new JLabel(section.getCourse().getTitle()));
				panel.add(new JLabel(section.getInstructor().getLastName()));
				panel.add(new JLabel(section.getSchedule()));
				
				//sets the background of every other label
				if (i % 2 == 1) {
					panel.setBackground(new Color(238,232,170));
					buttonPanel.setBackground(new Color(238,232,170));
				}
				else {
					panel.setBackground(Color.white);
					buttonPanel.setBackground(Color.white);
				}

				//adds panel to the overall panel
				add(panel);
			}
		}
	}

	
	/**
	 * Method returns the ArrayList
	 * @return theseCourses, the courses in specific department
	 */
	public ArrayList<Section> getTheseCourses() {
		return theseCourses;
	}
	

	/**
	 * Method returns the courses added panel
	 * @return the coursesAdded panel
	 */
	public CoursesAddedPanel getCoursesAdded() {
		return coursesAdded;
	}

	/**
	 * Inner class action listener, adds the courses to the bottom panel
	 * when the button is clicked.
	 *
	 */
	class ButtonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			String crn = ((JButton)(e.getSource())).getText();
			for (Section section: theseCourses) {
				if (section.getCRN().toString().equals(crn)) {
					coursesAdded.addSection(section);
				}
			}	
		}

	}
}
