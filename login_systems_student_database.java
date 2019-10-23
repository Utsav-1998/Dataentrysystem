package login_systems;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;

import Dataentrysystem.Dataentrysystems;

import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;

public class login_systems_student_database {

	private JFrame frame;
	private JTextField Userid;
	private JPasswordField PasswordTxt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login_systems_student_database window = new login_systems_student_database();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public login_systems_student_database() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblSystemLogin = new JLabel("System Login");
		lblSystemLogin.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblSystemLogin.setBounds(167, 0, 91, 14);
		frame.getContentPane().add(lblSystemLogin);
		
		JLabel Username = new JLabel("User Name");
		Username.setFont(new Font("Tahoma", Font.BOLD, 12));
		Username.setBounds(61, 78, 71, 14);
		frame.getContentPane().add(Username);
		
		JLabel Password = new JLabel("Password");
		Password.setFont(new Font("Tahoma", Font.BOLD, 12));
		Password.setBounds(61, 136, 59, 14);
		frame.getContentPane().add(Password);
		
		Userid = new JTextField();
		Userid.setBounds(181, 76, 116, 20);
		frame.getContentPane().add(Userid);
		Userid.setColumns(10);
		
		PasswordTxt = new JPasswordField();
		PasswordTxt.setBounds(181, 134, 116, 20);
		frame.getContentPane().add(PasswordTxt);
		
		JButton Login = new JButton("Login");
		Login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String password=PasswordTxt.getText();
				String username=Userid.getText();
				
				if(password.contains("Reckless") && username.contains("utsav")) {
					
					PasswordTxt.setText(null);
					Userid.setText(null);
					JOptionPane.showMessageDialog(null, "Login Successful","System",JOptionPane.OK_OPTION);
					
					Dataentrysystems info =new Dataentrysystems();   //calling the data entry systems file
					Dataentrysystems.main(null);
					
					
				}else {
					JOptionPane.showMessageDialog(null, "Invalid Username or password","Login Error",JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		Login.setFont(new Font("Tahoma", Font.BOLD, 12));
		Login.setBounds(31, 216, 89, 23);
		frame.getContentPane().add(Login);
		
		JButton Reset = new JButton("Reset");
		Reset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Userid.setText("");
				PasswordTxt.setText("");
			}
		});
		Reset.setFont(new Font("Tahoma", Font.BOLD, 12));
		Reset.setBounds(169, 216, 89, 23);
		frame.getContentPane().add(Reset);
		
		JButton exitbutton = new JButton("Exit");
		exitbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				frame=new JFrame(" Exit");
				if(JOptionPane.showConfirmDialog(frame,"Confirm if you want to exit","Login Systems",
						JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
				
			}
		});
		exitbutton.setFont(new Font("Tahoma", Font.BOLD, 12));
		exitbutton.setBounds(305, 216, 89, 23);
		frame.getContentPane().add(exitbutton);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(46, 203, 149, -26);
		frame.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(56, 188, 318, 2);
		frame.getContentPane().add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(46, 23, 330, 2);
		frame.getContentPane().add(separator_2);
	}
}
