import java.awt.EventQueue;
import java.sql.*;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.UIManager;

import javax.swing.plaf.nimbus.NimbusLookAndFeel;

import java.awt.Component;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Color;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * by 
 * Puneeth_Aacharya
 * 
 */
public class DocLogin {
	Connection con;
	ResultSet r;
	PreparedStatement p;
	
	public JFrame frmDoctorLogin;
	private JTextField textUsername;
	private JPasswordField passwordField;
	private JButton btnForgotPassword;

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
					DocLogin window = new DocLogin();
					window.frmDoctorLogin.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}
	

	/**
	 * Create the application.
	 */
	public DocLogin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmDoctorLogin = new JFrame();
		frmDoctorLogin.setResizable(false);
		frmDoctorLogin.setTitle("Doctor Login");
		frmDoctorLogin.setBounds(100, 100, 741, 453);
		frmDoctorLogin.setLocationRelativeTo(null);
		frmDoctorLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmDoctorLogin.getContentPane().setLayout(null);
		
		JLabel lblUsername = new JLabel("Doctor ID :");
		lblUsername.setFont(new Font("Tahoma", Font.BOLD, 23));
		lblUsername.setBounds(138, 90, 159, 56);
		frmDoctorLogin.getContentPane().add(lblUsername);
		
		 textUsername = new JTextField();
		
		textUsername.setBounds(390, 94, 214, 56);
		frmDoctorLogin.getContentPane().add(textUsername);
		textUsername.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password :");
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 23));
		lblPassword.setBounds(138, 219, 159, 56);
		frmDoctorLogin.getContentPane().add(lblPassword);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(390, 223, 214, 56);
		frmDoctorLogin.getContentPane().add(passwordField);
		
		JButton btnSignIn = new JButton("Sign In");
		btnSignIn.setForeground(Color.BLUE);
		btnSignIn.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnSignIn.setBounds(295, 366, 127, 41);
		frmDoctorLogin.getContentPane().add(btnSignIn);
		
		btnForgotPassword = new JButton("Forgot Password");
		btnForgotPassword.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmDoctorLogin.dispose();
				DoctorForgot window = new DoctorForgot();
				window.frameDoctorForgot.setVisible(true);
			}
		});
		btnForgotPassword.setFont(new Font("SansSerif", Font.BOLD, 13));
		btnForgotPassword.setBounds(539, 305, 179, 30);
		frmDoctorLogin.getContentPane().add(btnForgotPassword);
		//frmDoctorLogin.setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{frmDoctorLogin.getContentPane(), lblUsername, textUsername, lblPassword, passwordField, btnSignIn}));
		
		btnSignIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignInActionPerformed(evt);
            }
        });
	}
	private void btnSignInActionPerformed(java.awt.event.ActionEvent evt) 
	{			
		String usr=textUsername.getText();
		String pass=passwordField.getText();
		try{   
				Connect.getup();
				con=Connect.Connecti();
				String chek="select * from DOCTOR where D_ID=?";
				p=con.prepareStatement(chek);
				p.setString(1,usr);
				r=p.executeQuery();
				if(r.next())
				{
					String password=r.getString("password");
					if(pass.contentEquals(password))
					{
						frmDoctorLogin.dispose();
						DocHome window = new DocHome();
						window.frmDoctorHome.setVisible(true);
						//passwordField.setText("");
						JOptionPane.showMessageDialog(null, "Login Succesfull");
					}
					else
					{						
						JOptionPane.showMessageDialog(null, "Please Enter valid ID and Password");					
					}					
				}
				else 
				{
					
					JOptionPane.showMessageDialog(null, "Please Enter valid ID and Password");
					
				}			
			}        
	        catch(Exception e)
			{
	            JOptionPane.showMessageDialog(null, e);	           
	        } 
		
		passwordField.setText("");
		textUsername.setText("");
			
	 }	
}
