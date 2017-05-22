package Registrar_v2;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;


/**
 * DropDownPanel class is the panel that contains the combo box of 
 * departments and the label that describes the combo box.
 *
 */
public class DropDownPanel extends JPanel {
	
	Department selectedDepartment;
	JComboBox<Object> combo;

	/**
	 * Constructor of DropDownPanel that:
	 * 		-creates the label and adds it to the panel.
	 * 		-creates the combo box with the department
	 * 			values and adds it to the panel.
	 */
	public DropDownPanel() {
		JLabel department = new JLabel("Select a department");
		add(department);
		
		combo = new JComboBox<Object>(Department.values());
		combo.addItem("");
		add(combo);
		
		setBackground(new Color(220, 220, 220));
		
		combo.setSelectedIndex(-1);
	}
	
	
	
	/**
	 * Method that returns the combo box
	 * @return the combo box
	 */
	public JComboBox<Object> getCombo() {
		return combo;
	}



	/**
	 * Method returns the selected department of the combo box
	 * @return the selectedDepartment
	 */
	public Department getSelectedDepartment() {
		return selectedDepartment;
	}
	
	

}
