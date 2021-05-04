import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

import java.awt.Font;
import java.awt.Color;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
/**
 * by 
 * @author Puneeth_Aacharya
 * 
 */
public class frontwindow {

	public JFrame frmWelcome;

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
					frontwindow window = new frontwindow();
					window.frmWelcome.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public frontwindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmWelcome = new JFrame("Wlcome");
		frmWelcome.setResizable(false);
		frmWelcome.setForeground(new Color(214, 217, 223));
		frmWelcome.getContentPane().setBackground(new Color(214, 217, 223));
		frmWelcome.setTitle("Welcome");
		frmWelcome.setBounds(150, 150, 1000, 596);
		frmWelcome.setLocationRelativeTo(null);
		frmWelcome.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmWelcome.getContentPane().setLayout(null);
		
		JButton btnDoctor = new JButton("Doctor");
		btnDoctor.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnDoctor.setBounds(683, 178, 243, 44);
		frmWelcome.getContentPane().add(btnDoctor);
		
		JButton btnNurse = new JButton("Nurse");
		btnNurse.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNurse.setBounds(683, 250, 243, 44);
		frmWelcome.getContentPane().add(btnNurse);
		
		JButton btnReceptionist = new JButton("Receptionist");
		btnReceptionist.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnReceptionist.setBounds(683, 326, 243, 44);
		frmWelcome.getContentPane().add(btnReceptionist);
		
		JButton btnAdmin = new JButton("Admin");
		btnAdmin.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnAdmin.setBounds(683, 406, 243, 44);
		frmWelcome.getContentPane().add(btnAdmin);
		
		JLabel lblHMS = new JLabel("HOSPITAL MANGEMENT SYSTEM");
		lblHMS.setBounds(219, 6, 618, 60);
		lblHMS.setForeground(Color.BLUE);
		lblHMS.setFont(new Font("Tahoma", Font.BOLD, 35));
		lblHMS.setHorizontalAlignment(SwingConstants.CENTER);
		frmWelcome.getContentPane().add(lblHMS);
		
		JLabel lblLoginAs = new JLabel("LOGIN AS");
		lblLoginAs.setBounds(556, 78, 126, 44);
		lblLoginAs.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 22));
		lblLoginAs.setForeground(new Color(255, 0, 0));
		frmWelcome.getContentPane().add(lblLoginAs);
		
		JButton btnRadiologyDept = new JButton("Radiology Dept.");
		btnRadiologyDept.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmWelcome.dispose();
				RadiologyLogin window = new RadiologyLogin();
				window.frmDepartmentOfRadiology.setVisible(true);
			}
		});
		btnRadiologyDept.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnRadiologyDept.setBounds(683, 482, 243, 44);
		frmWelcome.getContentPane().add(btnRadiologyDept);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setToolTipText("source");
		lblNewLabel.setIcon(new ImageIcon("D:\\Bluetooth\\hospital.png"));
		lblNewLabel.setBounds(46, 124, 607, 417);
		frmWelcome.getContentPane().add(lblNewLabel);
		
		JLabel lblauthor = new JLabel("@author puneeth k s");
		lblauthor.setFont(new Font("SansSerif", Font.BOLD, 14));
		lblauthor.setBounds(6, 543, 162, 19);
		frmWelcome.getContentPane().add(lblauthor);
		frmWelcome.getContentPane().setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{btnDoctor, btnNurse, btnReceptionist, btnAdmin, lblHMS, lblLoginAs}));
		
		
		btnDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	frmWelcome.dispose();
        		DocLogin window = new DocLogin();
        		window.frmDoctorLogin.setVisible(true);		
            }
        });
		
		btnNurse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	frmWelcome.dispose();
        		NurseLogin window = new NurseLogin();
        		window.frmNurseLogin.setVisible(true);	
            }
        });
		
		btnReceptionist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	frmWelcome.dispose();
        		RecepLogin window = new RecepLogin();
        		window.frmReceptionLogin.setVisible(true);
            }
        });
		
		btnAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	frmWelcome.dispose();
        		AdminLogin window = new AdminLogin();
        		window.frmAdministrationLogin.setVisible(true);
            }
        });
	}
}
