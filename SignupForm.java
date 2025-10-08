import javax.swing.*;
import java.awt.*;
public class SignupForm {

	public static void main(String[] args) {
		JFrame mainframe = new JFrame();
		mainframe.setSize(300,300);
		mainframe.setTitle("SignUpForm");
		JPanel mainpanel = new JPanel();
		mainpanel.setLayout(new GridLayout(6,2,10,10));
		JLabel namelabel = new JLabel("Name");
		JTextField namefield = new JTextField();
		
		JLabel emailLabel = new JLabel("E-mail");
		JTextField emailField = new JTextField();
		
		JLabel genderLabel = new JLabel("Gender");
		JRadioButton male = new JRadioButton("Male");
		JRadioButton female = new JRadioButton("Female");
		ButtonGroup genButtonGroup = new ButtonGroup();
		genButtonGroup.add(male);
		genButtonGroup.add(female);
		
		JPanel genderPanel =new JPanel();
		genderPanel.setLayout(new FlowLayout());
		genderPanel.setLayout(new FlowLayout());
		genderPanel.add(male);
		genderPanel.add(female);
		
		JLabel countryLabel = new JLabel("Country");
		String [] countries = {"India", "China", "Russia", "USA"};
		JComboBox<String> countryBox = new JComboBox<>(countries);
		
		JLabel addressLabel = new JLabel("Address");
		JTextArea addressArea = new JTextArea(3,4);
		JButton submitBUtton = new JButton("Submit");
		
		mainpanel.add(namelabel);
		mainpanel.add(namefield);
		mainpanel.add(emailLabel);
		mainpanel.add(emailField);
		mainpanel.add(genderLabel);
		mainpanel.add(genderPanel);
		mainpanel.add(countryLabel);
		mainpanel.add(countryBox);
		mainpanel.add(addressLabel); 
		mainpanel.add(addressArea);
		mainpanel.add(new JLabel());
		mainpanel.add(submitBUtton);
		
		mainframe.add(mainpanel);
		mainframe.setVisible(true);
		
	}

}
