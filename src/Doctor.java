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

/**
 * by 
 * Puneeth_Aacharya
 * 
 */
public class Doctor {
	Connection con;
	PreparedStatement p;
	ResultSet r;

	public JFrame frmDoctor;
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
					Doctor window = new Doctor();
					window.frmDoctor.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Doctor() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmDoctor = new JFrame();
		frmDoctor.setResizable(false);
		frmDoctor.setTitle("Administration >> Home >> Doctor");
		frmDoctor.setBounds(100, 100, 1030, 639);
		frmDoctor.setLocationRelativeTo(null);
		frmDoctor.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmDoctor.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("DOCTOR DETAILS");
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel.setBounds(350, 10, 282, 46);
		frmDoctor.getContentPane().add(lblNewLabel);
		
		JLabel lblEnterDoctorId = new JLabel("Enter Doctor ID :");
		lblEnterDoctorId.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblEnterDoctorId.setBounds(10, 181, 173, 33);
		frmDoctor.getContentPane().add(lblEnterDoctorId);
		
		textField = new JTextField();
		textField.setBounds(193, 161, 166, 53);
		frmDoctor.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				btnSearchActionPerformed(evt);
			}
		});
		btnSearch.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnSearch.setBounds(385, 162, 107, 46);
		frmDoctor.getContentPane().add(btnSearch);
		
		JLabel lblGetAllDoctors = new JLabel("Get All Doctors Details");
		lblGetAllDoctors.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblGetAllDoctors.setBounds(619, 164, 239, 40);
		frmDoctor.getContentPane().add(lblGetAllDoctors);
		
		JButton btnGet = new JButton("GET");
		btnGet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				btnGetActionPerformed(evt);
			}
		});
		btnGet.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnGet.setBounds(868, 155, 107, 53);
		frmDoctor.getContentPane().add(btnGet);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 271, 986, 305);
		frmDoctor.getContentPane().add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JButton btnLogout = new JButton("LogOut");
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				frmDoctor.dispose();
				frontwindow window = new frontwindow();
				window.frmWelcome.setVisible(true);
			}
		});
		btnLogout.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnLogout.setBounds(868, 15, 107, 46);
		frmDoctor.getContentPane().add(btnLogout);
		
		JButton btnHome = new JButton("HOME");
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				frmDoctor.dispose();
				AdminHome window = new AdminHome();
				window.frmAdminHome.setVisible(true);
			}
		});
		btnHome.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnHome.setBounds(22, 25, 99, 49);
		frmDoctor.getContentPane().add(btnHome);
	}
	
	private void btnSearchActionPerformed(ActionEvent evt) {
		String D_ID=textField.getText();
		try {
			Connect.getup();
			con=Connect.Connecti();
			String query="SELECT D_ID,D_NAME,DEPARTMENT,AGE,GENDER,ADDRESS,PH_NO,BLOOD_GROUP FROM DOCTOR WHERE D_ID=?";
			p=con.prepareStatement(query);
			p.setString(1, D_ID);
			r=p.executeQuery();
			table.setModel(DbUtils.resultSetToTableModel(r));
			if(table!=null) {
		    	JOptionPane.showMessageDialog(null,"search succesfull");
		    }
		    else {
		    	JOptionPane.showMessageDialog(null,"not found");
		    }
		}
		catch(Exception e)
		{
			JOptionPane.showMessageDialog(null,e);
		}
	}
	private void btnGetActionPerformed(ActionEvent evt) {
		try {
			Connect.getup();
			con=Connect.Connecti();
			String query="SELECT D_ID,D_NAME,DEPARTMENT,AGE,GENDER,ADDRESS,PH_NO,BLOOD_GROUP FROM DOCTOR";
			p=con.prepareStatement(query);
			r=p.executeQuery();
			table.setModel(DbUtils.resultSetToTableModel(r));
			if(table!=null) {
		    	JOptionPane.showMessageDialog(null,"search succesfull");
		    }
		    else {
		    	JOptionPane.showMessageDialog(null,"not found");
		    }
		}
		catch(Exception e)
		{
			JOptionPane.showMessageDialog(null,e);
		}
	}
}
