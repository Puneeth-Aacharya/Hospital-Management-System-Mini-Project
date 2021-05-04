import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
//import java.awt.BorderLayout;
import java.awt.Font;
//import java.awt.Toolkit;

import javax.swing.JButton;
import java.awt.event.*;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

import java.awt.Color;

/**
 * by 
 * Puneeth_Aacharya
 * 
 */
public class RecepHome {

	public JFrame frmReceptionHome;

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
					RecepHome window = new RecepHome();
					window.frmReceptionHome.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public RecepHome() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmReceptionHome = new JFrame();
		frmReceptionHome.setResizable(false);
		frmReceptionHome.setTitle("Reception >> Home");	
		
		frmReceptionHome.setBounds(100, 100, 839, 531);
		frmReceptionHome.setLocationRelativeTo(null);
		frmReceptionHome.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmReceptionHome.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Welcome.. to HMS ");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 25));
		lblNewLabel.setBounds(26, 39, 283, 33);
		frmReceptionHome.getContentPane().add(lblNewLabel);
		
		JButton btnBillRise = new JButton("Billing");
		btnBillRise.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				frmReceptionHome.dispose();
				Billing window = new Billing();
				window.frmBilling.setVisible(true);
			}
		});
		btnBillRise.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnBillRise.setBounds(119, 341, 190, 63);
		frmReceptionHome.getContentPane().add(btnBillRise);
		
		JButton btnLogout = new JButton("LogOut");
		btnLogout.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnLogout.setBounds(700, 23, 96, 33);
		frmReceptionHome.getContentPane().add(btnLogout);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(211, 211, 211));
		panel.setBounds(26, 116, 770, 154);
		frmReceptionHome.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblAdmit = new JLabel("Admit");
		lblAdmit.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblAdmit.setBounds(45, 10, 89, 30);
		panel.add(lblAdmit);
		
		JButton btnPatient = new JButton("Patient");
		btnPatient.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmReceptionHome.dispose();
				Patient window = new Patient();
				window.frmPatientHome.setVisible(true);
			}
		});
		btnPatient.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnPatient.setBounds(96, 62, 191, 62);
		panel.add(btnPatient);
		
		JLabel lblAdmitAs = new JLabel("Admit as");
		lblAdmitAs.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblAdmitAs.setBounds(463, 9, 120, 30);
		panel.add(lblAdmitAs);
		
		JButton btnInPatient = new JButton("In Patient");
		btnInPatient.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnInPatient.setBounds(537, 62, 177, 62);
		panel.add(btnInPatient);
		btnInPatient.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmReceptionHome.dispose();
				InPatient window = new InPatient();
				window.frmInpatient.setVisible(true);
			}
		});
		
		JButton btnDischarge = new JButton("Discharge");
		btnDischarge.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmReceptionHome.dispose();
				Discharge window = new Discharge();
				window.frmDischarge.setVisible(true);
			}
		});
		btnDischarge.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnDischarge.setBounds(566, 341, 176, 63);
		frmReceptionHome.getContentPane().add(btnDischarge);
		
		btnLogout.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt) {
				frmReceptionHome.dispose();
				frontwindow window = new frontwindow();
				window.frmWelcome.setVisible(true);
			}
		});
	}
}
