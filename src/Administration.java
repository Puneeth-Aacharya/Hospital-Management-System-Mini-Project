import java.awt.EventQueue;
import java.sql.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
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
public class Administration {
	Connection con;
	PreparedStatement p;
	ResultSet r;

	public JFrame frmAdministration;
	private JTextField textField;
	private JTable table;

	
	public static void main(String[] args){
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
					Administration window = new Administration();
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
	public Administration() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAdministration = new JFrame();
		frmAdministration.setTitle("Administration >> Home >> Administration");
		frmAdministration.setBounds(100, 100, 1020, 620);
		frmAdministration.setLocationRelativeTo(null);
		frmAdministration.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAdministration.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ADMINISTRATION DETAILS");
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel.setBounds(290, 10, 433, 45);
		frmAdministration.getContentPane().add(lblNewLabel);
		
		JLabel lblEnterAdministrationIid = new JLabel("Enter administration I_ID :");
		lblEnterAdministrationIid.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblEnterAdministrationIid.setBounds(10, 167, 246, 33);
		frmAdministration.getContentPane().add(lblEnterAdministrationIid);
		
		textField = new JTextField();
		textField.setBounds(260, 165, 199, 42);
		frmAdministration.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblGetAllAdministratin = new JLabel("Get All Administratin Details :");
		lblGetAllAdministratin.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblGetAllAdministratin.setBackground(new Color(240, 240, 240));
		lblGetAllAdministratin.setBounds(612, 166, 237, 33);
		frmAdministration.getContentPane().add(lblGetAllAdministratin);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				btnSearchActionPerformed(evt);
			}
		});
		btnSearch.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnSearch.setBounds(469, 167, 108, 37);
		frmAdministration.getContentPane().add(btnSearch);
		
		JButton btnGet = new JButton("GET");
		btnGet.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnGet.setBounds(865, 167, 94, 37);
		frmAdministration.getContentPane().add(btnGet);
		btnGet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				btnGetActionPerformed(evt);
			}
		});
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 274, 986, 280);
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
		String A_ID=textField.getText();
		try
		{
			Connect.getup();
			con=Connect.Connecti();
			String query="select A_ID,A_NAME,ADDRESS,DESIGNATION,QUALIFICATION,PH_NO,BLOOD_GROUP,YEAR_OF_EXP from ADMINISTRATION where A_ID=?";
			p=con.prepareStatement(query);
			p.setString(1, A_ID);
			r=p.executeQuery();
			table.setModel(DbUtils.resultSetToTableModel(r));
		}
		catch(Exception e) {
			JOptionPane.showMessageDialog(null, e);
		}
	}
	private void btnGetActionPerformed(ActionEvent evt)
	{
		try
		{
			Connect.getup();
			con=Connect.Connecti();
			String query="select A_ID,A_NAME,ADDRESS,DESIGNATION,QUALIFICATION,PH_NO,BLOOD_GROUP,YEAR_OF_EXP from ADMINISTRATION";
			p=con.prepareStatement(query);
			r=p.executeQuery();
			table.setModel(DbUtils.resultSetToTableModel(r));
			
		}
		catch(Exception e) {
			JOptionPane.showMessageDialog(null, e);
		}
	}
}
