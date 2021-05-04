import java.awt.EventQueue;
import java.sql.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;


/**
 * by 
 * Puneeth_Aacharya
 * 
 */
public class DoctorForgot {
	Connection con;
	PreparedStatement p;
	ResultSet r;

	public JFrame frameDoctorForgot;
	private JTextField textD_id;
	private JTextField textP_no;
	private JPasswordField passwordField;

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
					DoctorForgot window = new DoctorForgot();
					window.frameDoctorForgot.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public DoctorForgot() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frameDoctorForgot = new JFrame();
		frameDoctorForgot.setTitle("Create new Password");
		frameDoctorForgot.setBounds(100, 100, 752, 588);
		frameDoctorForgot.setLocationRelativeTo(null);
		frameDoctorForgot.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameDoctorForgot.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("DOCTOR ID :");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel.setBounds(58, 145, 232, 47);
		frameDoctorForgot.getContentPane().add(lblNewLabel);
		
		JLabel lblPhoneNo = new JLabel("PHONE NO. :");
		lblPhoneNo.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblPhoneNo.setBounds(58, 238, 232, 47);
		frameDoctorForgot.getContentPane().add(lblPhoneNo);
		
		textD_id = new JTextField();
		textD_id.setBounds(348, 147, 200, 56);
		frameDoctorForgot.getContentPane().add(textD_id);
		textD_id.setColumns(10);
		
		textP_no = new JTextField();
		textP_no.setColumns(10);
		textP_no.setBounds(348, 240, 200, 56);
		frameDoctorForgot.getContentPane().add(textP_no);
		
		JLabel lblEnterNewPassword = new JLabel("Enter New Password :");
		lblEnterNewPassword.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblEnterNewPassword.setBounds(58, 348, 249, 31);
		frameDoctorForgot.getContentPane().add(lblEnterNewPassword);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(348, 348, 200, 56);
		frameDoctorForgot.getContentPane().add(passwordField);
		
		JButton btnShow = new JButton("Show");
		btnShow.setBackground(new Color(51, 204, 255));
		btnShow.setForeground(new Color(0, 0, 0));
		btnShow.setFont(new Font("SansSerif", Font.PLAIN, 14));
		btnShow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				passwordField.setEchoChar((char)0);
				
			}
		});
		btnShow.setBounds(576, 365, 85, 31);
		frameDoctorForgot.getContentPane().add(btnShow);
		
		JButton btnNewButton = new JButton("Update");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButtonactionPerformed(e);
			}
		});
		btnNewButton.setBackground(new Color(102, 102, 255));
		btnNewButton.setFont(new Font("SansSerif", Font.BOLD, 27));
		btnNewButton.setBounds(309, 477, 130, 56);
		frameDoctorForgot.getContentPane().add(btnNewButton);
	}
	private void btnNewButtonactionPerformed(ActionEvent evt)
	{
		String D_id=textD_id.getText();
		String P_no=textP_no.getText();
		String Pass=passwordField.getText();
		try
		{
			Connect.getup();
			con=Connect.Connecti();
			
			String update="update DOCTOR set PASSWORD=? where D_ID=? and PH_NO=?";
			p=con.prepareStatement(update);
			p.setString(1,Pass);
			p.setString(2, D_id);
			p.setString(3, P_no);
			
			p.executeUpdate();
			JOptionPane.showMessageDialog(null, "Updated Succesfully\nPlease Login to Continue");
			
			frameDoctorForgot.dispose();
			frontwindow window = new frontwindow();
			window.frmWelcome.setVisible(true);
		}
		catch(Exception e)
		{
			JOptionPane.showMessageDialog(null,e);
		}
	}
}
