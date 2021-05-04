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

/**
 * by 
 * Puneeth_Aacharya
 * 
 */
public class Radiology_details {
	Connection con;
	PreparedStatement p;
	ResultSet r;

	public JFrame frmRadiology_records;
	private JTextField textRD_id;
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
					Radiology_details window = new Radiology_details();
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
	public Radiology_details() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmRadiology_records = new JFrame();
		frmRadiology_records.setTitle("Admin >> Home >> Radiology department Records");
		frmRadiology_records.setBounds(100, 100, 1092, 653);
		frmRadiology_records.setLocationRelativeTo(null);
		frmRadiology_records.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmRadiology_records.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel(" Radiology Department Records");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 38));
		lblNewLabel.setBounds(272, 10, 560, 50);
		frmRadiology_records.getContentPane().add(lblNewLabel);
		
		JLabel lblRDId = new JLabel("Radiology Dept. ID :");
		lblRDId.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 25));
		lblRDId.setBounds(41, 182, 265, 50);
		frmRadiology_records.getContentPane().add(lblRDId);
		
		textRD_id = new JTextField();
		textRD_id.setFont(new Font("Tahoma", Font.PLAIN, 22));
		textRD_id.setBounds(272, 184, 253, 50);
		frmRadiology_records.getContentPane().add(textRD_id);
		textRD_id.setColumns(10);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnSearchActionPerformed(e);
			}
		});
		btnSearch.setFont(new Font("Segoe UI Semibold", Font.BOLD, 28));
		btnSearch.setBounds(537, 199, 135, 33);
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
				AdminHome window = new AdminHome();
				window.frmAdminHome.setVisible(true);
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
		
		JLabel lblGetAllDetails = new JLabel("Get All Details :");
		lblGetAllDetails.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 25));
		lblGetAllDetails.setBounds(722, 182, 176, 50);
		frmRadiology_records.getContentPane().add(lblGetAllDetails);
		
		JButton btnGet = new JButton("GET");
		btnGet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ev) {
				btnGetActionPerformed(ev);
			}
		});
		btnGet.setFont(new Font("Segoe UI Semibold", Font.BOLD, 28));
		btnGet.setBounds(904, 182, 135, 50);
		frmRadiology_records.getContentPane().add(btnGet);
	}
	
	private void btnSearchActionPerformed(ActionEvent evt)
	{
		String rd_id=textRD_id.getText();
		try
		{
			Connect.getup();
			con=Connect.Connecti();
			
			String query="select * from RADIOLOGY_DEPT where RD_ID=?";
			p=con.prepareStatement(query);
			p.setString(1, rd_id);
			
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
			
			String query="select * from RADIOLOGY_DEPT";
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
