import java.awt.EventQueue;
import java.sql.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

//import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.UIManager;
//import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

import net.proteanit.sql.DbUtils;

import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * by 
 * Puneeth_Aacharya
 * 
 */
public class Reception {
	Connection con;
	PreparedStatement p;
	ResultSet r;

	public JFrame frmAdministration;
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
					Reception window = new Reception();
					window.frmAdministration.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Reception() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAdministration = new JFrame();
		frmAdministration.setResizable(false);
		frmAdministration.setTitle("Administration >> Home >> Receptionist");
		frmAdministration.setBounds(100, 100, 1020, 620);
		frmAdministration.setLocationRelativeTo(null);
		frmAdministration.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAdministration.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("RECEPTIONIST DETAILS");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setBounds(293, 10, 386, 62);
		frmAdministration.getContentPane().add(lblNewLabel);
		
		JLabel lblEnterReceptionistId = new JLabel("Enter Receptionist ID : ");
		lblEnterReceptionistId.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblEnterReceptionistId.setBounds(10, 174, 208, 33);
		frmAdministration.getContentPane().add(lblEnterReceptionistId);
		
		textField = new JTextField();
		textField.setBounds(225, 165, 199, 42);
		frmAdministration.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				btnSearchActionPerformed(evt);
			}
		});
		btnSearch.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnSearch.setBounds(448, 166, 113, 33);
		frmAdministration.getContentPane().add(btnSearch);
		
		JLabel lblGetAllReceptionist = new JLabel("Get All Receptionist Details :");
		lblGetAllReceptionist.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblGetAllReceptionist.setBounds(617, 165, 258, 33);
		frmAdministration.getContentPane().add(lblGetAllReceptionist);
		
		JButton btnGet = new JButton("GET");
		btnGet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				btnGetActionPerformed(evt);
			}
		});
		btnGet.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnGet.setBounds(885, 166, 94, 33);
		frmAdministration.getContentPane().add(btnGet);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(35, 273, 930, 282);
		frmAdministration.getContentPane().add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JButton btnLogout = new JButton("LogOut");
		btnLogout.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnLogout.setBounds(885, 30, 94, 33);
		frmAdministration.getContentPane().add(btnLogout);
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				frmAdministration.dispose();
				frontwindow window = new frontwindow();
				window.frmWelcome.setVisible(true);		
			}
		});
		
		JButton btnHome = new JButton("HOME");
		btnHome.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnHome.setBounds(29, 30, 103, 33);
		frmAdministration.getContentPane().add(btnHome);
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				frmAdministration.dispose();
				AdminHome window = new AdminHome();
				window.frmAdminHome.setVisible(true);
				
			}
		});
	}
	
	private void btnSearchActionPerformed(ActionEvent evt)
	{
		String R_ID=textField.getText();
		try {
			Connect.getup();
			con=Connect.Connecti();
			String query="select R_ID,R_NAME,R_ADDRESS,BLOOD_GROUP,PH_NO,SALARY from RECEPTIONIST where R_ID=?";
			p=con.prepareStatement(query);
			p.setString(1, R_ID);
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
		try {
			Connect.getup();
			con=Connect.Connecti();
			String query="select R_ID,R_NAME,R_ADDRESS,BLOOD_GROUP,PH_NO,SALARY from RECEPTIONIST";
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
