import java.awt.EventQueue;
import java.sql.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

import net.proteanit.sql.DbUtils;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

/**
 * by 
 * Puneeth_Aacharya
 * 
 */
public class Radiology_PRecords {
	Connection con;
	PreparedStatement p;
	ResultSet r;

	public JFrame frmRadiology_records;
	private JTextField textP_id;
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
					Radiology_PRecords window = new Radiology_PRecords();
					window.frmRadiology_records.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Radiology_PRecords() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmRadiology_records = new JFrame();
		frmRadiology_records.setTitle("Doctor >> Home >> Radiology Records");
		frmRadiology_records.setBounds(100, 100, 1092, 653);
		frmRadiology_records.setLocationRelativeTo(null);
		frmRadiology_records.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmRadiology_records.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Patient Radiology Records");
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 38));
		lblNewLabel.setBounds(272, 10, 560, 50);
		frmRadiology_records.getContentPane().add(lblNewLabel);
		
		JLabel lblPatientId = new JLabel("Patient ID :");
		lblPatientId.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 25));
		lblPatientId.setBounds(168, 182, 138, 50);
		frmRadiology_records.getContentPane().add(lblPatientId);
		
		textP_id = new JTextField();
		textP_id.setFont(new Font("Tahoma", Font.PLAIN, 22));
		textP_id.setBounds(349, 184, 253, 50);
		frmRadiology_records.getContentPane().add(textP_id);
		textP_id.setColumns(10);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnSearchActionPerformed(e);
			}
		});
		btnSearch.setFont(new Font("Segoe UI Semibold", Font.BOLD, 28));
		btnSearch.setBounds(740, 182, 150, 50);
		frmRadiology_records.getContentPane().add(btnSearch);
		
		JButton btnLogout = new JButton("LogOut");
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmRadiology_records.dispose();
				frontwindow window = new frontwindow();
				window.frmWelcome.setVisible(true);
			}
		});
		btnLogout.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		btnLogout.setBounds(911, 36, 116, 41);
		frmRadiology_records.getContentPane().add(btnLogout);
		
		JButton btnHome = new JButton("HOME");
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmRadiology_records.dispose();
				DocHome window = new DocHome();
				window.frmDoctorHome.setVisible(true);
			}
		});
		btnHome.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		btnHome.setBounds(26, 47, 124, 41);
		frmRadiology_records.getContentPane().add(btnHome);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(41, 306, 998, 287);
		frmRadiology_records.getContentPane().add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
	}
	
	private void btnSearchActionPerformed(ActionEvent evt)
	{
		String p_id=textP_id.getText();
		try
		{
			Connect.getup();
			con=Connect.Connecti();
			
			String query="select * from RADIOLOGY where P_ID=?";
			p=con.prepareStatement(query);
			p.setString(1, p_id);
			
			r=p.executeQuery();
			table.setModel(DbUtils.resultSetToTableModel(r));
			
		}
		catch(Exception e)
		{
			JOptionPane.showMessageDialog(null, e);
		}
	}
}
