import java.awt.EventQueue;
import java.sql.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

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
/**
 * by 
 * Puneeth_Aacharya
 * 
 */
public class Lab {
	Connection con;
	PreparedStatement p;
	ResultSet r;

	public JFrame frmLab;
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
					Lab window = new Lab();
					window.frmLab.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Lab() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmLab = new JFrame();
		frmLab.setResizable(false);
		frmLab.setTitle("Administration >> Home >> Lab/Wards");
		frmLab.setBounds(100, 100, 1020, 720);
		frmLab.setLocationRelativeTo(null);
		frmLab.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLab.getContentPane().setLayout(null);
		
		JLabel lblLabDetails = new JLabel("LAB DETAILS");
		lblLabDetails.setForeground(Color.BLUE);
		lblLabDetails.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblLabDetails.setBounds(389, 24, 205, 37);
		frmLab.getContentPane().add(lblLabDetails);
		
		JLabel lblEnterLabNumber = new JLabel("Enter Lab Number :");
		lblEnterLabNumber.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblEnterLabNumber.setBounds(26, 207, 180, 37);
		frmLab.getContentPane().add(lblEnterLabNumber);
		
		textField = new JTextField();
		textField.setBounds(216, 206, 167, 47);
		frmLab.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				btnSearchActionPerformed(evt);
			}
		});
		btnSearch.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnSearch.setBounds(434, 206, 99, 47);
		frmLab.getContentPane().add(btnSearch);
		
		JLabel lblGetAllLab = new JLabel("Get All Lab Details :");
		lblGetAllLab.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblGetAllLab.setBounds(578, 209, 192, 33);
		frmLab.getContentPane().add(lblGetAllLab);
		
		JButton btnGet = new JButton("GET");
		btnGet.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnGet.setBounds(809, 203, 99, 47);
		frmLab.getContentPane().add(btnGet);
		btnGet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				btnGetActionPerformed(evt);
			}
		});
		
		JButton btnLogout = new JButton("LogOut");
		btnLogout.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnLogout.setBounds(854, 40, 94, 33);
		frmLab.getContentPane().add(btnLogout);
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				frmLab.dispose();
				frontwindow window = new frontwindow();
				window.frmWelcome.setVisible(true);
			}
		});
		
		JButton btnHome = new JButton("HOME");
		btnHome.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnHome.setBounds(36, 40, 94, 33);
		frmLab.getContentPane().add(btnHome);
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				frmLab.dispose();
				AdminHome window = new AdminHome();
				window.frmAdminHome.setVisible(true);
			}
		});
	}
	private void btnSearchActionPerformed(ActionEvent evt)
	{
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(128, 319, 780, 294);
		frmLab.getContentPane().add(scrollPane);
		table = new JTable();
		scrollPane.setViewportView(table);
		String LAB_NO=textField.getText();
		try
		{
			Connect.getup();
			con=Connect.Connecti();
			
			String query="select * from LAB where LAB_NO=?";
			p=con.prepareStatement(query);
			p.setString(1,LAB_NO);
			r=p.executeQuery();
			table.setModel(DbUtils.resultSetToTableModel(r));
		}
		catch(Exception e)
		{
			JOptionPane.showConfirmDialog(null, e);
		}
	}
	private void btnGetActionPerformed(ActionEvent evt)
	{
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(128, 319, 780, 294);
		frmLab.getContentPane().add(scrollPane);
		table = new JTable();
		scrollPane.setViewportView(table);
		try {
			Connect.getup();
			con=Connect.Connecti();
			
			String query="select * from LAB";
			p=con.prepareStatement(query);
			r=p.executeQuery();
			table.setModel(DbUtils.resultSetToTableModel(r));
		}
		catch(Exception e)
		{
			JOptionPane.showConfirmDialog(null, e);
		}
	}
}
