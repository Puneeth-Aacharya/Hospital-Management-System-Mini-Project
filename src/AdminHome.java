import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.UIManager;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.*;

/**
 * by 
 * Puneeth_Aacharya
 * 
 */
public class AdminHome {

	public JFrame frmAdminHome;

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
					AdminHome window = new AdminHome();
					window.frmAdminHome.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AdminHome() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAdminHome = new JFrame();
		frmAdminHome.setResizable(false);
		frmAdminHome.setTitle("Administration >> Home");
		frmAdminHome.setBounds(100, 100, 996, 614);
		frmAdminHome.setLocationRelativeTo(null);
		frmAdminHome.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAdminHome.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Welcome..to HMS");
		lblNewLabel.setFont(new Font("SansSerif", Font.BOLD | Font.ITALIC, 26));
		lblNewLabel.setBounds(26, 39, 283, 33);
		frmAdminHome.getContentPane().add(lblNewLabel);
		
		JButton btnLogout = new JButton("LogOut");
		btnLogout.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnLogout.setBounds(838, 21, 113, 44);
		frmAdminHome.getContentPane().add(btnLogout);
		
		JLabel lblRecordDatabase = new JLabel("Database :");
		lblRecordDatabase.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblRecordDatabase.setBounds(26, 129, 223, 44);
		frmAdminHome.getContentPane().add(lblRecordDatabase);
		
		JButton btnDoctors = new JButton("Doctors");
		btnDoctors.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				frmAdminHome.dispose();
				Doctor window = new Doctor();
				window.frmDoctor.setVisible(true);
			}
		});
		btnDoctors.setFont(new Font("SansSerif", Font.BOLD, 26));
		btnDoctors.setBounds(76, 227, 173, 57);
		frmAdminHome.getContentPane().add(btnDoctors);
		
		JButton btnNurse = new JButton("Nurse");
		btnNurse.setFont(new Font("SansSerif", Font.BOLD, 26));
		btnNurse.setBounds(388, 227, 173, 57);
		frmAdminHome.getContentPane().add(btnNurse);
		btnNurse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				frmAdminHome.dispose();
				Nurse window = new Nurse();
				window.frmNurse.setVisible(true);
			}
		});
		
		JButton btnReceptionist = new JButton("Receptionist");
		btnReceptionist.setFont(new Font("SansSerif", Font.BOLD, 26));
		btnReceptionist.setBounds(669, 227, 223, 57);
		frmAdminHome.getContentPane().add(btnReceptionist);
		btnReceptionist.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				frmAdminHome.dispose();
				Reception window = new Reception();
				window.frmAdministration.setVisible(true);
			}
		});
		
		JButton btnWards = new JButton("Wards");
		btnWards.setFont(new Font("SansSerif", Font.BOLD, 26));
		btnWards.setBounds(76, 344, 173, 57);
		frmAdminHome.getContentPane().add(btnWards);
		btnWards.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				frmAdminHome.dispose();
				Wards window = new Wards();
				window.frmWards.setVisible(true);
			}
		});
		
		JButton btnLabs = new JButton("Labs");
		btnLabs.setFont(new Font("SansSerif", Font.BOLD, 26));
		btnLabs.setBounds(388, 344, 173, 57);
		frmAdminHome.getContentPane().add(btnLabs);
		btnLabs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				frmAdminHome.dispose();
				Lab window = new Lab();
				window.frmLab.setVisible(true);
			}
		});
		
		
		JButton btnAdministration = new JButton("Administration");
		btnAdministration.setFont(new Font("SansSerif", Font.BOLD, 25));
		btnAdministration.setBounds(669, 343, 223, 57);
		frmAdminHome.getContentPane().add(btnAdministration);
		
		JButton btnRadiologyDept = new JButton("Radiology Dept.");
		btnRadiologyDept.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmAdminHome.dispose();
				Radiology_details window = new Radiology_details();
				window.frmRadiology_records.setVisible(true);
			}
		});
		btnRadiologyDept.setFont(new Font("SansSerif", Font.BOLD, 26));
		btnRadiologyDept.setBounds(185, 487, 263, 57);
		frmAdminHome.getContentPane().add(btnRadiologyDept);
		
		JButton btnStatistics = new JButton("Statistics");
		btnStatistics.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmAdminHome.dispose();
				Statistics window = new Statistics();
				window.frmStat.setVisible(true);
			}
		});
		btnStatistics.setFont(new Font("SansSerif", Font.BOLD, 26));
		btnStatistics.setBounds(553, 484, 223, 62);
		frmAdminHome.getContentPane().add(btnStatistics);
		btnAdministration.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				frmAdminHome.dispose();
				Administration window = new Administration();
				window.frmAdministration.setVisible(true);
			}
		});
		
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				frmAdminHome.dispose();
				frontwindow window = new frontwindow();
				window.frmWelcome.setVisible(true);
			}
		});
	}
}
