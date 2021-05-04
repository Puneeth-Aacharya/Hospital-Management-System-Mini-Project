import java.awt.EventQueue;
import java.sql.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

import java.awt.event.*;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.border.CompoundBorder;
import javax.swing.border.TitledBorder;

/**
 * by 
 * Puneeth_Aacharya
 * 
 */
public class DocHome {
	
	Connection con;
	PreparedStatement p;
	ResultSet r;

	public JFrame frmDoctorHome;
	private JTextField textP_Field;
	private JTextField textD_Field;
	private JTextField textFieldP_ID;
	private JTextField textFieldLab;
	private JTextField textFieldDisease;
	private JTextField textFieldD_ID;
	private JTextField textInLAB;
	private JTextField textInDisease;

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
					DocHome window = new DocHome();
					window.frmDoctorHome.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}

	/**
	 * Create the application.
	 */
	public DocHome() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmDoctorHome = new JFrame();
		frmDoctorHome.setResizable(false);
		frmDoctorHome.setTitle("Doctor >> Home");
		frmDoctorHome.setBounds(100, 100, 1088, 762);
		frmDoctorHome.setLocationRelativeTo(null);
		frmDoctorHome.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmDoctorHome.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setFont(new Font("Tahoma", Font.ITALIC, 25));
		lblNewLabel.setBounds(26, 39, 283, 33);
		frmDoctorHome.getContentPane().add(lblNewLabel);
		
		JButton btnLogout = new JButton("LogOut");
		btnLogout.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnLogout.setBounds(940, 6, 96, 33);
		frmDoctorHome.getContentPane().add(btnLogout);
		
		JPanel records = new JPanel();
		records.setBackground(new Color(204, 204, 255));
		records.setBounds(54, 84, 966, 106);
		frmDoctorHome.getContentPane().add(records);
		records.setLayout(null);
		
		JLabel lblRecordDetails = new JLabel("Record Details");
		lblRecordDetails.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblRecordDetails.setBounds(6, 35, 151, 37);
		records.add(lblRecordDetails);
		
		JButton btnPatient = new JButton("Patient");
		btnPatient.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmDoctorHome.dispose();
				PatientRecords window = new PatientRecords();
				window.frameP_Records.setVisible(true);
			}
		});
		btnPatient.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnPatient.setBounds(276, 24, 151, 59);
		records.add(btnPatient);
		
		JButton btnInPatient = new JButton("In Patient");
		btnInPatient.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmDoctorHome.dispose();
				InPatientRecords window = new InPatientRecords();
				window.frameInPatientRecords.setVisible(true);
			}
		});
		btnInPatient.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnInPatient.setBounds(495, 24, 151, 59);
		records.add(btnInPatient);
		
		JButton btnPatientRadiologyRecords = new JButton("Patient Radiology Records");
		btnPatientRadiologyRecords.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmDoctorHome.dispose();
				Radiology_PRecords window = new Radiology_PRecords();
				window.frmRadiology_records.setVisible(true);
			}
		});
		btnPatientRadiologyRecords.setForeground(new Color(0, 0, 0));
		btnPatientRadiologyRecords.setFont(new Font("SansSerif", Font.PLAIN, 16));
		btnPatientRadiologyRecords.setBounds(691, 27, 225, 59);
		records.add(btnPatientRadiologyRecords);
		
		
		
		JLabel lblWelcomeTo = new JLabel("WELCOME .. to HMS");
		lblWelcomeTo.setFont(new Font("Tahoma", Font.ITALIC, 28));
		lblWelcomeTo.setBounds(54, 25, 283, 47);
		frmDoctorHome.getContentPane().add(lblWelcomeTo);
		
		JPanel update_2 = new JPanel();
		update_2.setBorder(new CompoundBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(59, 59, 59)), new CompoundBorder()));
		update_2.setBounds(54, 237, 466, 467);
		frmDoctorHome.getContentPane().add(update_2);
		update_2.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Update Inpatient");
		lblNewLabel_1.setFont(new Font("SansSerif", Font.PLAIN, 26));
		lblNewLabel_1.setBounds(159, 6, 193, 34);
		update_2.add(lblNewLabel_1);
		
		JLabel lblPatientId = new JLabel("Patient ID :");
		lblPatientId.setFont(new Font("SansSerif", Font.PLAIN, 22));
		lblPatientId.setBounds(28, 89, 119, 46);
		update_2.add(lblPatientId);
		
		textP_Field = new JTextField();
		textP_Field.setBounds(179, 89, 173, 48);
		update_2.add(textP_Field);
		textP_Field.setColumns(10);
		
		JLabel lblDoctorId = new JLabel("Doctor ID :");
		lblDoctorId.setFont(new Font("SansSerif", Font.PLAIN, 22));
		lblDoctorId.setBounds(28, 321, 119, 45);
		update_2.add(lblDoctorId);
		
		textD_Field = new JTextField();
		textD_Field.setBounds(179, 323, 173, 48);
		update_2.add(textD_Field);
		textD_Field.setColumns(10);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				btnUpdateActionPerformed(evt);
			}
		});
		btnUpdate.setFont(new Font("SansSerif", Font.PLAIN, 18));
		btnUpdate.setBounds(201, 413, 102, 36);
		update_2.add(btnUpdate);
		
		JLabel lblLabNo_1 = new JLabel("Lab No. :");
		lblLabNo_1.setFont(new Font("SansSerif", Font.PLAIN, 22));
		lblLabNo_1.setBounds(28, 168, 119, 46);
		update_2.add(lblLabNo_1);
		
		JLabel lblDisease_1 = new JLabel("Disease :");
		lblDisease_1.setFont(new Font("SansSerif", Font.PLAIN, 22));
		lblDisease_1.setBounds(28, 247, 119, 46);
		update_2.add(lblDisease_1);
		
		textInLAB = new JTextField();
		textInLAB.setColumns(10);
		textInLAB.setBounds(179, 166, 173, 48);
		update_2.add(textInLAB);
		
		textInDisease = new JTextField();
		textInDisease.setColumns(10);
		textInDisease.setBounds(179, 250, 173, 48);
		update_2.add(textInDisease);
		
		JPanel panel = new JPanel();
		panel.setBorder(new CompoundBorder(new CompoundBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(59, 59, 59)), new CompoundBorder()), null));
		panel.setBounds(554, 237, 466, 467);
		frmDoctorHome.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Update Patient ");
		lblNewLabel_2.setFont(new Font("SansSerif", Font.PLAIN, 26));
		lblNewLabel_2.setBounds(164, 6, 181, 34);
		panel.add(lblNewLabel_2);
		
		JLabel lblPatientId_1 = new JLabel("Patient ID :");
		lblPatientId_1.setFont(new Font("SansSerif", Font.PLAIN, 22));
		lblPatientId_1.setBounds(27, 88, 119, 46);
		panel.add(lblPatientId_1);
		
		textFieldP_ID = new JTextField();
		textFieldP_ID.setBounds(198, 87, 173, 48);
		panel.add(textFieldP_ID);
		textFieldP_ID.setColumns(10);
		
		JLabel lblLabNo = new JLabel("Lab No. :");
		lblLabNo.setFont(new Font("SansSerif", Font.PLAIN, 22));
		lblLabNo.setBounds(27, 166, 119, 46);
		panel.add(lblLabNo);
		
		textFieldLab = new JTextField();
		textFieldLab.setBounds(198, 164, 173, 48);
		panel.add(textFieldLab);
		textFieldLab.setColumns(10);
		
		JLabel lblDisease = new JLabel("Disease :");
		lblDisease.setFont(new Font("SansSerif", Font.PLAIN, 22));
		lblDisease.setBounds(27, 242, 119, 46);
		panel.add(lblDisease);
		
		textFieldDisease = new JTextField();
		textFieldDisease.setBounds(198, 240, 173, 48);
		panel.add(textFieldDisease);
		textFieldDisease.setColumns(10);
		
		JLabel lblDoctorid = new JLabel("Doctor_ID :");
		lblDoctorid.setFont(new Font("SansSerif", Font.PLAIN, 22));
		lblDoctorid.setBounds(27, 318, 119, 46);
		panel.add(lblDoctorid);
		
		textFieldD_ID = new JTextField();
		textFieldD_ID.setColumns(10);
		textFieldD_ID.setBounds(198, 318, 173, 48);
		panel.add(textFieldD_ID);
		
		JButton btnUpdate_1 = new JButton("Update");
		btnUpdate_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				btnUpdate_1ActionPerformed(evt);
			}
		});
		btnUpdate_1.setFont(new Font("SansSerif", Font.PLAIN, 18));
		btnUpdate_1.setBounds(218, 410, 102, 36);
		panel.add(btnUpdate_1);
		
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				frmDoctorHome.dispose();
				frontwindow window = new frontwindow();
				window.frmWelcome.setVisible(true);
			}
		});
	}
	private void btnUpdateActionPerformed(ActionEvent evt)
	{
		String P_ID=textP_Field.getText();
		String D_ID=textD_Field.getText();
		int InLab=Integer.parseInt(textInLAB.getText());
		String Disease=textInDisease.getText();
		try
		{
			Connect.getup();
			con=Connect.Connecti();
			
			String query="update INPATIENT set D_ID=? ,LAB_NO=?,DISEASE=? where P_ID=?";
			p=con.prepareStatement(query);
			p.setString(1, D_ID);
			p.setLong(2, InLab);
			p.setString(3, Disease);
			p.setString(4, P_ID);
			
			p.executeUpdate();
			JOptionPane.showMessageDialog(null, "Updated Succesfully");
			
		}
		catch(Exception e)
		{
			JOptionPane.showMessageDialog(null,e,"ERROR",JOptionPane.ERROR_MESSAGE);
		}
		
		textP_Field.setText("");
		textD_Field.setText("");
		textInLAB.setText("");
		textInDisease.setText("");
	}
	private void btnUpdate_1ActionPerformed(ActionEvent evt)
	{
		String P_ID=textFieldP_ID.getText();
		String D_ID=textFieldD_ID.getText();
		String LAB=textFieldLab.getText();
		String DISEASE=textFieldDisease.getText();
		
		try
		{
			Connect.getup();
			con=Connect.Connecti();
			
			String query="update PATIENT set LAB_NO=? ,DISEASE=? where P_ID=? and DOCTOR_ID=?";
			p=con.prepareStatement(query);
			p.setString(1, LAB);
			p.setString(2, DISEASE);
			p.setString(3, P_ID);
			p.setString(4, D_ID);
			p.executeUpdate();
			JOptionPane.showMessageDialog(null, "Updated Succesfully");
			
		}
		catch(Exception e)
		{
			JOptionPane.showMessageDialog(null,e,"ERROR",JOptionPane.ERROR_MESSAGE);
		}
		
		textFieldP_ID.setText("");
		textFieldD_ID.setText("");
		textFieldLab.setText("");
		textFieldDisease.setText("");
	}
}
