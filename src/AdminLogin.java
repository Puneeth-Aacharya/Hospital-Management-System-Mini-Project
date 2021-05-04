import java.awt.EventQueue;
import java.sql.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


/**
 * by 
 * Puneeth_Aacharya
 * 
 */
public class AdminLogin {
	Connection con;
	PreparedStatement p;
	ResultSet r;

	public JFrame frmAdministrationLogin;
	private JTextField textField;
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
					AdminLogin window = new AdminLogin();
					window.frmAdministrationLogin.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AdminLogin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAdministrationLogin = new JFrame();
		frmAdministrationLogin.setTitle("Administration Login");
		frmAdministrationLogin.setBounds(100, 100, 723, 456);
		frmAdministrationLogin.setLocationRelativeTo(null);
		frmAdministrationLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAdministrationLogin.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Admin ID : ");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel.setBounds(96, 107, 171, 41);
		frmAdministrationLogin.getContentPane().add(lblNewLabel);
		
		JLabel lblPassword = new JLabel("Password  : ");
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblPassword.setBounds(96, 208, 171, 41);
		frmAdministrationLogin.getContentPane().add(lblPassword);
		
		textField = new JTextField();
		textField.setBounds(374, 96, 185, 48);
		frmAdministrationLogin.getContentPane().add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(374, 209, 185, 48);
		frmAdministrationLogin.getContentPane().add(passwordField);
		
		JButton btnSignin = new JButton("SignIn");
		btnSignin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				btnSigninActionPerformed(evt);
			}
		});
		btnSignin.setForeground(Color.BLUE);
		btnSignin.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnSignin.setBounds(278, 373, 120, 40);
		frmAdministrationLogin.getContentPane().add(btnSignin);
		
		btnForgotPassword = new JButton("Forgot Password");
		btnForgotPassword.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmAdministrationLogin.dispose();
				AdminForgot window = new AdminForgot();
				window.frameAdminForgot.setVisible(true);
			}
		});
		btnForgotPassword.setFont(new Font("SansSerif", Font.PLAIN, 14));
		btnForgotPassword.setBounds(495, 269, 185, 30);
		frmAdministrationLogin.getContentPane().add(btnForgotPassword);
	}
	
public void btnSigninActionPerformed(java.awt.event.ActionEvent evt) {
		
		String usr=textField.getText();
		String pass=passwordField.getText();
		try{   
				Connect.getup();
				con=Connect.Connecti();
				String chk="select * from administration where A_ID=?";
				p=con.prepareStatement(chk);
				p.setString(1,usr);
				r=p.executeQuery();
				if(r.next())
				{
					String password=r.getString("password");
					if(pass.contentEquals(password))
					{
						frmAdministrationLogin.dispose();
						AdminHome window=new AdminHome();
						window.frmAdminHome.setVisible(true);
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
		
		 textField.setText("");
         passwordField.setText("");
	    }

}
