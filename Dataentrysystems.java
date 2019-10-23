package Dataentrysystem;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JEditorPane;
import javax.swing.JTable;
import javax.swing.BoxLayout;
import javax.swing.DropMode;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.awt.FlowLayout;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class Dataentrysystems {

	private JFrame frame;
	private JTextField Studentname;
	private JTextField Dtofissue;
	private JTextField Dtofreturn;
	private JTextField Bookid;
	private JTable table;
	private JTable table_1;
	private JTable table_2;
	private JTable table_3;
	private JTextField studentid;
	private JTextField year;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Dataentrysystems window = new Dataentrysystems();
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
	public Dataentrysystems() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Tahoma", Font.BOLD, 46));
		frame.setBounds(0, 0, 1370, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		frame.getContentPane().add(panel, BorderLayout.NORTH);
		
		JLabel lblNewLabel = new JLabel("LIBRARY MANAGEMENT SYSTEM");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 50));
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		frame.getContentPane().add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new GridLayout(0, 1, 3, 3));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_1.add(panel_2);
		panel_2.setLayout(new GridLayout(1, 3, 3, 3));
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_2.add(panel_4);
		panel_4.setLayout(new GridLayout(3, 2, 2, 2));
		
		JPanel panel_8 = new JPanel();
		panel_8.setBorder(null);
		panel_4.add(panel_8);
		
		JLabel lblStudentId = new JLabel("Student id");
		lblStudentId.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel_8.add(lblStudentId);
		
		JPanel panel_9 = new JPanel();
		panel_9.setBorder(null);
		panel_4.add(panel_9);
		
		studentid = new JTextField();
		studentid.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panel_9.add(studentid);
		studentid.setColumns(10);
		
		JPanel panel_11 = new JPanel();
		panel_11.setBorder(null);
		panel_4.add(panel_11);
		
		JLabel lblStudentName = new JLabel("Student name");
		lblStudentName.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel_11.add(lblStudentName);
		
		JPanel panel_10 = new JPanel();
		panel_10.setBorder(null);
		panel_4.add(panel_10);
		
		Studentname = new JTextField();
		Studentname.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panel_10.add(Studentname);
		Studentname.setColumns(10);
		
		JPanel panel_12 = new JPanel();
		panel_12.setBorder(null);
		panel_4.add(panel_12);
		
		JLabel lblStudentYear = new JLabel("Student year");
		lblStudentYear.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel_12.add(lblStudentYear);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBorder(null);
		panel_4.add(panel_7);
		
		year = new JTextField();
		year.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_7.add(year);
		year.setColumns(10);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_2.add(panel_5);
		panel_5.setLayout(new GridLayout(3, 2, 2, 2));
		
		JPanel panel_13 = new JPanel();
		panel_13.setBorder(null);
		panel_5.add(panel_13);
		
		JLabel lblDateOfIssue = new JLabel("Date of Issue");
		lblDateOfIssue.setHorizontalAlignment(SwingConstants.CENTER);
		lblDateOfIssue.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel_13.add(lblDateOfIssue);
		
		JPanel panel_14 = new JPanel();
		panel_14.setBorder(null);
		panel_5.add(panel_14);
		
		Dtofissue = new JTextField();
		panel_14.add(Dtofissue);
		Dtofissue.setColumns(10);
		
		JPanel panel_15 = new JPanel();
		panel_15.setBorder(null);
		panel_5.add(panel_15);
		
		JLabel lblNewLabel_1 = new JLabel("Date of Return");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel_15.add(lblNewLabel_1);
		
		JPanel panel_16 = new JPanel();
		panel_16.setBorder(null);
		panel_5.add(panel_16);
		
		Dtofreturn = new JTextField();
		panel_16.add(Dtofreturn);
		Dtofreturn.setColumns(10);
		
		JPanel panel_17 = new JPanel();
		panel_17.setBorder(null);
		panel_5.add(panel_17);
		
		JLabel lblNewLabel_2 = new JLabel("Book Id\r\n");
		lblNewLabel_2.setLabelFor(frame);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel_17.add(lblNewLabel_2);
		
		JPanel panel_18 = new JPanel();
		panel_18.setBorder(null);
		panel_5.add(panel_18);
		
		Bookid = new JTextField();
		panel_18.add(Bookid);
		Bookid.setColumns(10);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_2.add(panel_6);
		panel_6.setLayout(new GridLayout(3, 1, 0, 0));
		
		JButton btnNewButton_1 = new JButton("clear");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
			
				
				Dtofissue.setText("");
				Dtofreturn.setText("");    //code for resetting the text fields in case user has entered any wrong data***********************************
				Bookid.setText("");
				
				
				
				
				
				
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 38));
		panel_6.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Show  Details");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				DefaultTableModel model=(DefaultTableModel)table_2.getModel();  //code to print the entered data in the database starting from the last row*********************************
				
			  model.addRow(new Object[]{studentid.getText(),
			    Studentname.getText(),
				 year.getText().toString(),
				Dtofissue.getText().toString(),
				Dtofreturn.getText().toString(),
				Bookid.getText().toString(),
				  
			});
				
				
				
				
				
				
				
				
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 31));
		panel_6.add(btnNewButton_2);
		
		JButton btnNewButton = new JButton("Save");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				JOptionPane.showMessageDialog(null, "Library Database saved","central Database",JOptionPane.OK_CANCEL_OPTION);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 30));
		panel_6.add(btnNewButton);
		
		JPanel panel_3 = new JPanel();
		panel_3.setForeground(new Color(64, 64, 64));
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_1.add(panel_3);
		panel_3.setLayout(new GridLayout(2, 1, 1, 1));
		
		JPanel panel_20 = new JPanel();
		panel_20.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_3.add(panel_20);
		panel_20.setLayout(new BorderLayout(0, 0));
		
		
		table_2 = new JTable();
		table_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		table_2.setModel(new DefaultTableModel(
			new Object[][] {
				{"Student id", "Student name", "Student year", "Date of issue", "Date of return", " Book id"},
			},
			new String[] {
				"new column", "new column", "new column", "new column", "new column", "new column"
			}
			
		));
		table_2.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		table_2.setFillsViewportHeight(true);
		table_2.setColumnSelectionAllowed(true);
		table_2.setCellSelectionEnabled(true);
		panel_20.add(table_2, BorderLayout.CENTER);
		
		
		JPanel panel_19 = new JPanel();
		panel_19.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_3.add(panel_19);
		panel_19.setLayout(new GridLayout(1, 4, 4, 4));
		
		JPanel panel_21 = new JPanel();
		panel_21.setBorder(null);
		panel_19.add(panel_21);
		
		JButton btnNewButton_3 = new JButton("Delete");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				DefaultTableModel model=(DefaultTableModel)table_2.getModel();  //code for deleting a row in  the database*****************************************************
				if(table_2.getSelectedRow()==-1) {
					if(table_2.getRowCount()==0) {
						
						JOptionPane.showMessageDialog(null,"No data to delete","Library Database",JOptionPane.OK_OPTION);
					}else {
						JOptionPane.showMessageDialog(null,"Select data to delete","Library Database",JOptionPane.OK_OPTION);
					}
				}else {
					model.removeRow(table_2.getSelectedRow());
					
					
					
				}
				
				
			}
		});
		btnNewButton_3.setFont(new Font("Source Sans Pro Semibold", Font.BOLD, 15));
		panel_21.add(btnNewButton_3);
		
		JPanel panel_22 = new JPanel();
		panel_22.setBorder(null);
		panel_19.add(panel_22);
		
		JButton btnNewButton_4 = new JButton("Reset");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				studentid.setText("");
				Studentname.setText("");      //code to reset all typed data *****************************************************************
				Dtofissue.setText("");
				year.setText("");
				Dtofreturn.setText("");
				Bookid.setText("");
				
				
			}
		});
		btnNewButton_4.setFont(new Font("Source Sans Pro Semibold", Font.BOLD, 15));
		panel_22.add(btnNewButton_4);
		
		JPanel panel_23 = new JPanel();
		panel_23.setBorder(null);
		panel_19.add(panel_23);
		
		JButton btnNewButton_5 = new JButton("Exit");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				                                                       //code to exit the application**********************************************************
				frame=new JFrame("exit");
				if(JOptionPane.showConfirmDialog(frame,"confirm if you want to exit","Central library systems",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		btnNewButton_5.setFont(new Font("Source Sans Pro Semibold", Font.BOLD, 15));
		panel_23.add(btnNewButton_5);
	}

}
