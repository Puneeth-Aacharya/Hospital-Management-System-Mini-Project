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
public class Wards {
	Connection con;
	PreparedStatement p;
	ResultSet r;

	public JFrame frmWards;
	private JTextField textField;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try 
		{
			  UIManager.setLookAndFeel(new NimbusLookAndFeel());
		}
		catch(Exception e)
		{ 
			e.printStackTrace();
		}
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Wards window = new Wards();
					window.frmWards.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Wards() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmWards = new JFrame();
		frmWards.setResizable(false);
		frmWards.setTitle("Receptionist >> Home >> Wards");
		frmWards.setBounds(100, 100, 1020, 620);
		frmWards.setLocationRelativeTo(null);
		frmWards.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmWards.getContentPane().setLayout(null);
		
		JLabel lblWardsDetails = new JLabel("WARDS DETAILS");
		lblWardsDetails.setForeground(Color.BLUE);
		lblWardsDetails.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblWardsDetails.setBounds(359, 21, 263, 44);
		frmWards.getContentPane().add(lblWardsDetails);
		
		JLabel lblEnterWardNumber = new JLabel("Enter Ward Number :");
		lblEnterWardNumber.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblEnterWardNumber.setBounds(27, 187, 200, 38);
		frmWards.getContentPane().add(lblEnterWardNumber);
		
		textField = new JTextField();
		textField.setBounds(235, 187, 167, 47);
		frmWards.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.setBackground(new Color(153, 153, 204));
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				btnSearchActionPerformed(evt);
			}
		});
		btnSearch.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnSearch.setBounds(442, 185, 102, 44);
		frmWards.getContentPane().add(btnSearch);
		
		JLabel lblGetAllWards = new JLabel("Get All Wards Deatils :");
		lblGetAllWards.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblGetAllWards.setBounds(597, 188, 212, 37);
		frmWards.getContentPane().add(lblGetAllWards);
		
		JButton btnGet = new JButton("GET");
		btnGet.setBackground(new Color(153, 153, 204));
		btnGet.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnGet.setBounds(821, 185, 85, 44);
		frmWards.getContentPane().add(btnGet);
		btnGet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				btnGetActionPerformed(evt);
			}
		});
		
		
		JButton btnLogout = new JButton("LogOut");
		btnLogout.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnLogout.setBounds(876, 41, 94, 35);
		frmWards.getContentPane().add(btnLogout);
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				frmWards.dispose();
				frontwindow window = new frontwindow();
				window.frmWelcome.setVisible(true);
			}
		});
		
		JButton btnHome = new JButton("HOME");
		btnHome.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnHome.setBounds(27, 41, 95, 35);
		frmWards.getContentPane().add(btnHome);
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				frmWards.dispose();
				AdminHome window = new AdminHome();
				window.frmAdminHome.setVisible(true);
			}
		});
	}
	private void btnSearchActionPerformed(ActionEvent evt)
	{
		String Ward_No=textField.getText();
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(87, 291, 833, 258);
		frmWards.getContentPane().add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		try
		{
			Connect.getup();
			con=Connect.Connecti();
			String query="select * from WARDS where WARD_NO=?";
			p=con.prepareStatement(query);
			p.setString(1, Ward_No);
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
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(87, 291, 833, 258);
		frmWards.getContentPane().add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		try
		{
			Connect.getup();
			con=Connect.Connecti();
			String query="select * from WARDS";
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
