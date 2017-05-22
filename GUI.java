package Registrar_v2;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


/**
 * The GUI class holds the different panel classes in it
 * and adds them to the overall frame. 
 */
public class GUI extends JFrame {

	private DropDownPanel dropDown;
	private CourseListing courseListing;
	private Term term;
	private JPanel centerPanel;


	/**
	 * Constructor for GUI, adds the combo box panel,
	 * the course listing panel and the courses added to the frame.
	 * @param term
	 */
	public GUI(Term term) {

		//Displays a title
		super("Banner Self Service for: " + JOptionPane.showInputDialog("What is your name?"));
		this.term = term;
		
		centerPanel = new JPanel();

		//Action for the close button
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//Create a BorderLayout manager for overall GUI
		setLayout(new BorderLayout());
		centerPanel.setLayout(new FlowLayout());
		centerPanel.setBackground(Color.white);
		setMinimumSize(new Dimension(1200, 120));

		dropDown = new DropDownPanel();
		dropDown.getCombo().addActionListener(new ComboBoxListener());
		courseListing = new CourseListing(term.getSectionsForDepart(null));

		//Add components
		centerPanel.add(courseListing);
		add(dropDown, BorderLayout.NORTH);
		add(centerPanel, BorderLayout.CENTER);
		add(courseListing.getCoursesAdded(), BorderLayout.SOUTH);

		pack();
		setVisible(true);

	}

	/**
	 * Inner class ActionLister that changes the display of courses
	 * when a different department is selected. It also tells the user 
	 * in a label on the bottom panel how many sections were found.
	 */
	private class ComboBoxListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			JComboBox a;
			a = (JComboBox) e.getSource();
			centerPanel.remove(courseListing);
			if (!a.getSelectedItem().equals("")) {
				courseListing = new CourseListing(term.getSectionsForDepart((Department)a.getSelectedItem()));
				centerPanel.add(courseListing, BorderLayout.CENTER);
				courseListing.getCoursesAdded().getCourseLabel().setText(courseListing.getTheseCourses().size() + " sections found");
			}
			else {
				courseListing.getCoursesAdded().getCourseLabel().setText("");
			}
			pack();
		}



	}
}
