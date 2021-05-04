import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import javax.swing.border.CompoundBorder;
import javax.swing.border.TitledBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.SoftBevelBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * by 
 * Puneeth_Aacharya
 * 
 */
public class NurseHome {
	Connection con;
	PreparedStatement p;
	ResultSet r;

	public JFrame frmNurseHome;
	private JTextField textP_ID;
	private JTextField textP_Name;
	private JTextField textN_ID;

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
					NurseHome window = new NurseHome();
					window.frmNurseHome.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public NurseHome() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmNurseHome = new JFrame();
		frmNurseHome.setResizable(false);
		frmNurseHome.getContentPane().setFont(new Font("SansSerif", Font.PLAIN, 12));
		frmNurseHome.setTitle("Nurse >> Home");
		frmNurseHome.setBounds(100, 100, 1088, 762);
		frmNurseHome.setLocationRelativeTo(null);
		frmNurseHome.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmNurseHome.getContentPane().setLayout(null);
		
		JLabel lblWelcomeToHms = new JLabel("Welcome.. to HMS");
		lblWelcomeToHms.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 25));
		lblWelcomeToHms.setBounds(81, 30, 283, 33);
		frmNurseHome.getContentPane().add(lblWelcomeToHms);
		
		JButton btnLogout = new JButton("LogOut");
		btnLogout.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnLogout.setBounds(954, 20, 96, 33);
		frmNurseHome.getContentPane().add(btnLogout);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(204, 204, 255));
		panel.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(173, 216, 230)));
		panel.setBounds(36, 75, 1002, 143);
		frmNurseHome.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Record details");
		lblNewLabel.setFont(new Font("SansSerif", Font.PLAIN, 26));
		lblNewLabel.setBounds(82, 48, 216, 37);
		panel.add(lblNewLabel);
		
		JButton btnPatient = new JButton("Patient");
		btnPatient.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmNurseHome.dispose();
				PatientRecords window = new PatientRecords();
				window.frameP_Records.setVisible(true);
			}
		});
		btnPatient.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnPatient.setBounds(429, 39, 151, 59);
		panel.add(btnPatient);
		
		JButton btnInPatient = new JButton("In Patient");
		btnInPatient.setBounds(767, 39, 162, 59);
		panel.add(btnInPatient);
		btnInPatient.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmNurseHome.dispose();
				InPatientRecords window = new InPatientRecords();
				window.frameInPatientRecords.setVisible(true);
			}
		});
		btnInPatient.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JPanel update_2 = new JPanel();
		update_2.setLayout(null);
		update_2.setBorder(new CompoundBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(59, 59, 59)), new CompoundBorder()));
		update_2.setBounds(36, 230, 1005, 467);
		frmNurseHome.getContentPane().add(update_2);
		
		JLabel lblNewLabel_1 = new JLabel("Update Inpatient Info");
		lblNewLabel_1.setFont(new Font("SansSerif", Font.PLAIN, 26));
		lblNewLabel_1.setBounds(382, 30, 267, 34);
		update_2.add(lblNewLabel_1);
		
		JLabel lblPatientId = new JLabel("Patient ID :");
		lblPatientId.setFont(new Font("SansSerif", Font.PLAIN, 22));
		lblPatientId.setBounds(296, 112, 119, 46);
		update_2.add(lblPatientId);
		
		textP_ID = new JTextField();
		textP_ID.setColumns(10);
		textP_ID.setBounds(508, 115, 206, 48);
		update_2.add(textP_ID);
		
		JLabel lblNurseId = new JLabel("Nurse ID :");
		lblNurseId.setFont(new Font("SansSerif", Font.PLAIN, 22));
		lblNurseId.setBounds(296, 303, 119, 45);
		update_2.add(lblNurseId);
		
		textP_Name = new JTextField();
		textP_Name.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String p_id=textP_ID.getText();
				try
				{
					Connect.getup();
					con=Connect.Connecti();
					
					String sql="select * from INPATIENT where P_ID=?";
					p=con.prepareStatement(sql);
					p.setString(1, p_id);
					r=p.executeQuery();
					if(r.next())
					{
						String p_name=r.getString("P_NAME");
						textP_Name.setText(p_name);
					}
					else
					{
						JOptionPane.showMessageDialog(null,"Please enter valid Patient ID");
					}
				}
				catch(Exception ev)
				{
					JOptionPane.showMessageDialog(null,ev);
				}
			}
		});
		textP_Name.setColumns(10);
		textP_Name.setText("Click here");
		textP_Name.setBounds(508, 208, 206, 48);
		update_2.add(textP_Name);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				btnUpdateActionPerformed(evt);
			}
		});
		btnUpdate.setFont(new Font("SansSerif", Font.PLAIN, 18));
		btnUpdate.setBounds(446, 406, 102, 36);
		update_2.add(btnUpdate);
		
		JLabel lblPatientName = new JLabel("Patient Name :");
		lblPatientName.setFont(new Font("SansSerif", Font.PLAIN, 22));
		lblPatientName.setBounds(296, 205, 153, 46);
		update_2.add(lblPatientName);
		
		textN_ID = new JTextField();
		textN_ID.setColumns(10);
		textN_ID.setBounds(508, 305, 206, 48);
		update_2.add(textN_ID);
		
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				frmNurseHome.dispose();
				frontwindow window = new frontwindow();
				window.frmWelcome.setVisible(true);				
			}
		});
	}
	
	private void btnUpdateActionPerformed(ActionEvent evt)
	{
		String P_ID=textP_ID.getText();
		String P_NAME=textP_Name.getText();
		String N_ID=textN_ID.getText();
		
		try {
			Connect.getup();
			con=Connect.Connecti();
			String sql="update INPATIENT set N_ID=? where P_ID=? and P_NAME=?";
			p=con.prepareStatement(sql);
			p.setString(1, N_ID);
			p.setString(2,P_ID);
			p.setString(3, P_NAME);
			p.executeUpdate();
			
			JOptionPane.showMessageDialog(null,"Updated Succesfully");
		}
		catch(Exception e)
		{
			JOptionPane.showMessageDialog(null,e);
		}
		textN_ID.setText("");
		textP_Name.setText("");
		textP_ID.setText("");
		
	}
}
