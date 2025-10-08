import javax.swing.*;
import java.awt.*;
public class GUIDemo {
	public static void main(String [] args) {
		JFrame mainframe = new JFrame();
		mainframe.setSize(300,300);
		mainframe.setTitle("The first GUI");
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(3,2,10,10));
		JLabel userLabel = new JLabel("Username");
		JTextField userfield = new JTextField();
		JLabel pwdLabel = new JLabel("Password");
		JPasswordField pwdField = new JPasswordField();
		JButton loginButton = new JButton("Login");
		
		panel.add(userLabel);
		panel.add(userfield);
		panel.add(pwdLabel);
		panel.add(pwdField);
		panel.add(new JLabel(""));
		panel.add(loginButton);
		mainframe.add(panel);
		mainframe.setLocationRelativeTo(null);
		mainframe.setVisible(true);
	}
}
