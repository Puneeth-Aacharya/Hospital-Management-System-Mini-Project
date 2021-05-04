import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

import net.proteanit.sql.DbUtils;
/**
 * by 
 * Puneeth_Aacharya
 * 
 */
public class InPatientRecords {
	Connection con;
	PreparedStatement p;
	ResultSet r;
	
	private JTextField textField;
	private JTable table;

	public JFrame frameInPatientRecords;

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
					InPatientRecords window = new InPatientRecords();
					window.frameInPatientRecords.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public InPatientRecords() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frameInPatientRecords = new JFrame();
		frameInPatientRecords.setResizable(false);
		frameInPatientRecords.setTitle("In Patient Details");
		frameInPatientRecords.setBounds(100, 100, 1086, 640);
		frameInPatientRecords.setLocationRelativeTo(null);
		frameInPatientRecords.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameInPatientRecords.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("INPATIENT DETAILS");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 35));
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setBounds(342, 17, 412, 68);
		frameInPatientRecords.getContentPane().add(lblNewLabel);
		
		JLabel lblEnterPatientId = new JLabel("Enter Patient ID :");
		lblEnterPatientId.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblEnterPatientId.setBounds(51, 199, 175, 47);
		frameInPatientRecords.getContentPane().add(lblEnterPatientId);
		
		textField = new JTextField();
		textField.setBounds(236, 194, 148, 52);
		frameInPatientRecords.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				btnSearchActionperformed(evt);
			}
		});
		btnSearch.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnSearch.setBounds(422, 207, 108, 32);
		frameInPatientRecords.getContentPane().add(btnSearch);
		
		JLabel lblGetAllPatient = new JLabel("Get All Patient Details :");
		lblGetAllPatient.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblGetAllPatient.setBounds(633, 206, 214, 32);
		frameInPatientRecords.getContentPane().add(lblGetAllPatient);
		
		JButton btnGet = new JButton("GET");
		btnGet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				btnGetActionPerformed(evt);
			}
		});
		btnGet.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnGet.setBounds(865, 207, 108, 32);
		frameInPatientRecords.getContentPane().add(btnGet);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(6, 294, 1060, 287);
		frameInPatientRecords.getContentPane().add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JButton btnLogout = new JButton("LogOut");
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frameInPatientRecords.dispose();
				frontwindow window = new frontwindow();
				window.frmWelcome.setVisible(true);
			}
		});
		btnLogout.setFont(new Font("SansSerif", Font.PLAIN, 18));
		btnLogout.setBounds(927, 39, 108, 39);
		frameInPatientRecords.getContentPane().add(btnLogout);
	}
	private void btnSearchActionperformed(ActionEvent evt)
	{
		String P_ID=textField.getText();
		try
		{
			Connect.getup();
			con=Connect.Connecti();
			
			String query="select P_ID,P_NAME,WARD_NO,DATE_OF_ADMISSION,DATE_OF_DISCHARGE,LAB_NO,N_ID,D_ID,PH_NO,DISEASE from INPATIENT where P_ID=?";
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
			
			String query="select P_ID,P_NAME,WARD_NO,DATE_OF_ADMISSION,DATE_OF_DISCHARGE,LAB_NO,N_ID,D_ID,PH_NO,DISEASE from INPATIENT";
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
