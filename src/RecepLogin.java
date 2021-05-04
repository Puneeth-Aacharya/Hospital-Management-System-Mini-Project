import java.awt.EventQueue;
import java.sql.*;
import javax.swing.JFrame;
//import java.awt.Window.Type;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

//import java.awt.BorderLayout;
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
public class RecepLogin {
	Connection con;
	PreparedStatement p;
	ResultSet r;
	

	public JFrame frmReceptionLogin;
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
					RecepLogin window = new RecepLogin();
					window.frmReceptionLogin.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public RecepLogin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmReceptionLogin = new JFrame();
		frmReceptionLogin.setResizable(false);
		frmReceptionLogin.setTitle("Reception Login");
		frmReceptionLogin.setBounds(100, 100, 772, 530);
		frmReceptionLogin.setLocationRelativeTo(null);
		frmReceptionLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmReceptionLogin.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Receptionist ID : ");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel.setBounds(65, 107, 226, 41);
		frmReceptionLogin.getContentPane().add(lblNewLabel);
		
		JLabel lblPassword = new JLabel("Password       : ");
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblPassword.setBounds(65, 248, 226, 41);
		frmReceptionLogin.getContentPane().add(lblPassword);
		
		textField = new JTextField();
		textField.setFont(new Font("SansSerif", Font.PLAIN, 22));
		textField.setBounds(356, 108, 204, 61);
		frmReceptionLogin.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnSignin = new JButton("SignIn");
		btnSignin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				btnSigninActionPerformed(evt);
			}
		});
		btnSignin.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnSignin.setForeground(Color.BLUE);
		btnSignin.setBounds(313, 408, 134, 55);
		frmReceptionLogin.getContentPane().add(btnSignin);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("SansSerif", Font.PLAIN, 22));
		passwordField.setBounds(356, 239, 204, 61);
		frmReceptionLogin.getContentPane().add(passwordField);
		
		btnForgotPassword = new JButton("Forgot Password");
		btnForgotPassword.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmReceptionLogin.dispose();
				ReceptionForgot window = new ReceptionForgot();
				window.frameReceptionForgot.setVisible(true);
			}
		});
		btnForgotPassword.setFont(new Font("SansSerif", Font.PLAIN, 14));
		btnForgotPassword.setBounds(489, 330, 204, 31);
		frmReceptionLogin.getContentPane().add(btnForgotPassword);
	}
	
	public void btnSigninActionPerformed(java.awt.event.ActionEvent evt) {
		
		String usr=textField.getText();
		@SuppressWarnings("deprecation")
		String pass=passwordField.getText();
		try{   
				Connect.getup();
				con=Connect.Connecti();
				String chk="select * from receptionist where R_ID=?";
				p=con.prepareStatement(chk);
				p.setString(1,usr);
				r=p.executeQuery();
				if(r.next())
				{
					String password=r.getString("password");
					if(pass.contentEquals(password))
					{
						frmReceptionLogin.dispose();
						RecepHome window=new RecepHome();
						window.frmReceptionHome.setVisible(true);
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
