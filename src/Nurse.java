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
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

import net.proteanit.sql.DbUtils;

import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.table.DefaultTableModel;
/**
 * by 
 * Puneeth_Aacharya
 * 
 */
public class Nurse {
	Connection con;
	PreparedStatement p;
	ResultSet r;

	public JFrame frmNurse;
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
					Nurse window = new Nurse();
					window.frmNurse.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Nurse() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmNurse = new JFrame();
		frmNurse.setResizable(false);
		frmNurse.setTitle("Administration >> Home >> Nurse");
		frmNurse.setBounds(100, 100, 1019, 622);
		frmNurse.setLocationRelativeTo(null);
		frmNurse.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmNurse.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("NURSE DETAILS");
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel.setBounds(368, 10, 275, 57);
		frmNurse.getContentPane().add(lblNewLabel);
		
		JLabel lblEnterNurseId = new JLabel("Enter Nurse ID :");
		lblEnterNurseId.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblEnterNurseId.setBounds(24, 135, 162, 40);
		frmNurse.getContentPane().add(lblEnterNurseId);
		
		textField = new JTextField();
		textField.setBounds(173, 134, 196, 52);
		frmNurse.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblGetAllNurses = new JLabel("Get All Nurses Details :");
		lblGetAllNurses.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblGetAllNurses.setBounds(573, 139, 223, 32);
		frmNurse.getContentPane().add(lblGetAllNurses);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				btnSearchActionPerformed(evt);
			}
		});
		btnSearch.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnSearch.setBounds(404, 136, 110, 40);
		frmNurse.getContentPane().add(btnSearch);
		
		JButton btnGet = new JButton("GET");
		btnGet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evts) {
				btnGetActionPerformed(evts);
			}
		});
		btnGet.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnGet.setBounds(806, 136, 110, 40);
		frmNurse.getContentPane().add(btnGet);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(28, 242, 941, 319);
		frmNurse.getContentPane().add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
			}
		));
		scrollPane.setViewportView(table);
		
		JButton btnLogout = new JButton("LogOut");
		btnLogout.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnLogout.setBounds(868, 27, 110, 40);
		frmNurse.getContentPane().add(btnLogout);
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evts) {
				frmNurse.dispose();
				frontwindow window = new frontwindow();
				window.frmWelcome.setVisible(true);
				
			}
		});
		
		JButton btnHome = new JButton("HOME");
		btnHome.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnHome.setBounds(24, 27, 110, 40);
		frmNurse.getContentPane().add(btnHome);
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evts) {
				frmNurse.dispose();
				AdminHome window = new AdminHome();
				window.frmAdminHome.setVisible(true);
				
			}
		});
	}
	private void btnSearchActionPerformed(ActionEvent evt)
	{
		String N_ID=textField.getText();
		try {
			Connect.getup();
			con=Connect.Connecti();
			String query="select N_ID,N_NAME,ADDRESS,BLOOD_GROUP,PH_NO,SALARY from NURSE where N_ID=?";
			p=con.prepareStatement(query);
			p.setString(1, N_ID);
			r=p.executeQuery();
			table.setModel(DbUtils.resultSetToTableModel(r));
		}
		catch(Exception e)
		{
			JOptionPane.showMessageDialog(null, "Not Found");
			JOptionPane.showMessageDialog(null, e);
		}
	}
	public void btnGetActionPerformed(ActionEvent evts)
	{
		try {
			Connect.getup();
			con=Connect.Connecti();
			String query="select N_ID,N_NAME,ADDRESS,BLOOD_GROUP,PH_NO,SALARY  from NURSE ";
			p=con.prepareStatement(query);
			r=p.executeQuery();
			table.setModel(DbUtils.resultSetToTableModel(r));
		}
		catch(Exception e) {
			JOptionPane.showMessageDialog(null, "Not Found");
			JOptionPane.showMessageDialog(null, e);
		}
	}
}
