import java.awt.EventQueue;
import java.sql.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

import net.proteanit.sql.DbUtils;

import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.Date;
import java.sql.Timestamp;

/**
 * by 
 * Puneeth_Aacharya
 * 
 */
@SuppressWarnings("unused")
public class PatientRecords {
	Connection con;
	PreparedStatement p;
	ResultSet r;

	public JFrame frameP_Records;
	private JTextField textField;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			  UIManager.setLookAndFeel(new NimbusLookAndFeel());
		}
		catch(Exception e)
		{ 
			e.printStackTrace();
		}
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PatientRecords window = new PatientRecords();
					window.frameP_Records.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public PatientRecords() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frameP_Records = new JFrame();
		frameP_Records.setResizable(false);
		frameP_Records.setTitle("Patient Details");
		frameP_Records.setBounds(100, 100, 1197, 640);
		frameP_Records.setLocationRelativeTo(null);
		frameP_Records.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameP_Records.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("PATIENT DETAILS");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 35));
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setBounds(461, 10, 333, 68);
		frameP_Records.getContentPane().add(lblNewLabel);
		
		JLabel lblEnterPatientId = new JLabel("Enter Patient ID :");
		lblEnterPatientId.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblEnterPatientId.setBounds(99, 199, 175, 47);
		frameP_Records.getContentPane().add(lblEnterPatientId);
		
		textField = new JTextField();
		textField.setFont(new Font("SansSerif", Font.PLAIN, 18));
		textField.setBounds(321, 197, 181, 52);
		frameP_Records.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				btnSearchActionperformed(evt);
			}
		});
		btnSearch.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnSearch.setBounds(546, 203, 108, 40);
		frameP_Records.getContentPane().add(btnSearch);
		
		JLabel lblGetAllPatient = new JLabel("Get All Patient Details :");
		lblGetAllPatient.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblGetAllPatient.setBounds(801, 206, 214, 32);
		frameP_Records.getContentPane().add(lblGetAllPatient);
		
		JButton btnGet = new JButton("GET");
		btnGet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				btnGetActionPerformed(evt);
			}
		});
		btnGet.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnGet.setBounds(1053, 200, 108, 47);
		frameP_Records.getContentPane().add(btnGet);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(6, 294, 1181, 287);
		frameP_Records.getContentPane().add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JButton btnLogout = new JButton("LogOut");
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frameP_Records.dispose();
				frontwindow window = new frontwindow();
				window.frmWelcome.setVisible(true);
			}
		});
		btnLogout.setFont(new Font("SansSerif", Font.PLAIN, 18));
		btnLogout.setBounds(1053, 32, 108, 39);
		frameP_Records.getContentPane().add(btnLogout);
	}
	private void btnSearchActionperformed(ActionEvent evt)
	{
		String P_ID=textField.getText();
		try
		{
			Connect.getup();
			con=Connect.Connecti();
			
			String query="select P_ID,P_NAME,AGE,GENDER,BLOOD_GROUP,ADDRESS,APPOINTMENT_DATE,DOCTOR_ID,D_NAME,LAB_NO,DISEASE,R_ID,PH_NO from PATIENT where P_ID=?";
			p=con.prepareStatement(query);
			p.setString(1, P_ID);
			r=p.executeQuery();
			table.setModel(DbUtils.resultSetToTableModel(r));
		}
		catch(Exception e)
		{
			JOptionPane.showMessageDialog(null, e);
		}
	}
	private void btnGetActionPerformed(ActionEvent evt)
	{
		
		try
		{
			Connect.getup();
			con=Connect.Connecti();
			
			String query="select P_ID,P_NAME,APPOINTMENT_DATE,DOCTOR_ID,BLOOD_GROUP,AGE,GENDER,TIME,ADDRESS,D_NAME,LAB_NO,DISEASE,R_ID,PH_NO from PATIENT";
			p=con.prepareStatement(query);
			r=p.executeQuery();
			table.setModel(DbUtils.resultSetToTableModel(r));
		}
		catch(Exception e)
		{
			JOptionPane.showMessageDialog(null, e);
		}
	}
}
