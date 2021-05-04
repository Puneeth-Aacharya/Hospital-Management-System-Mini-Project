import java.awt.EventQueue;
import java.sql.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * by 
 * Puneeth_Aacharya
 * 
 */
public class NurseLogin {
	Connection con;
	PreparedStatement p;
	ResultSet r;

	public JFrame frmNurseLogin;
	private  JTextField textField;
	private  JPasswordField passwordField;

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
					NurseLogin window = new NurseLogin();
					window.frmNurseLogin.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public NurseLogin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmNurseLogin = new JFrame();
		frmNurseLogin.setResizable(false);
		frmNurseLogin.setTitle("Nurse Login");
		frmNurseLogin.setBounds(100, 100, 763, 479);
		frmNurseLogin.setLocationRelativeTo(null);
		frmNurseLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmNurseLogin.getContentPane().setLayout(null);
		
		JLabel lblUsername = new JLabel("Nurse ID : ");
		lblUsername.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblUsername.setBounds(78, 94, 162, 60);
		frmNurseLogin.getContentPane().add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password  : ");
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblPassword.setBounds(78, 219, 162, 60);
		frmNurseLogin.getContentPane().add(lblPassword);
		
		textField = new JTextField();
		textField.setBounds(351, 94, 206, 60);
		frmNurseLogin.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnSignIn = new JButton("Sign In");
		btnSignIn.setForeground(Color.BLUE);
		btnSignIn.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 24));
		btnSignIn.setBounds(288, 371, 169, 60);
		frmNurseLogin.getContentPane().add(btnSignIn);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(351, 219, 206, 60);
		frmNurseLogin.getContentPane().add(passwordField);
		
		JButton btnForgotPassword = new JButton("Forgot Password");
		btnForgotPassword.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmNurseLogin.dispose();
				NurseForgot window = new NurseForgot();
				window.frameNurseForgot.setVisible(true);
			}
		});
		btnForgotPassword.setFont(new Font("SansSerif", Font.PLAIN, 14));
		btnForgotPassword.setBounds(504, 308, 181, 30);
		frmNurseLogin.getContentPane().add(btnForgotPassword);
	
		btnSignIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignInActionPerformed(evt);
            }
        });
	}
	
public void btnSignInActionPerformed(java.awt.event.ActionEvent evt) {
		
	String usr=textField.getText();
	String pass=passwordField.getText();
	try{   
			Connect.getup();
			con=Connect.Connecti();
			String chk="select * from nurse where N_ID=?";
			p=con.prepareStatement(chk);
			p.setString(1,usr);
			r=p.executeQuery();
			if(r.next())
			{
				String password=r.getString("password");
				if(pass.contentEquals(password))
				{
					frmNurseLogin.dispose();
					NurseHome window = new NurseHome();
					window.frmNurseHome.setVisible(true);
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
