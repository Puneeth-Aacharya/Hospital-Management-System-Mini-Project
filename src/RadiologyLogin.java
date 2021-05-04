import java.awt.EventQueue;
import java.sql.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

//import java.awt.BorderLayout;
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
public class RadiologyLogin {
	Connection con;
	PreparedStatement p;
	ResultSet r;

	public JFrame frmDepartmentOfRadiology;
	private JTextField textID;
	private JPasswordField passwordField;
	private JLabel lblDepartmentOfRadiology;
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
					RadiologyLogin window = new RadiologyLogin();
					window.frmDepartmentOfRadiology.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public RadiologyLogin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmDepartmentOfRadiology = new JFrame();
		frmDepartmentOfRadiology.setResizable(false);
		frmDepartmentOfRadiology.setTitle("Department of Radiology");
		frmDepartmentOfRadiology.setBounds(100, 100, 792, 498);
		frmDepartmentOfRadiology.setLocationRelativeTo(null);
		frmDepartmentOfRadiology.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmDepartmentOfRadiology.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Radiology ID :");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 28));
		lblNewLabel.setBounds(173, 132, 176, 45);
		frmDepartmentOfRadiology.getContentPane().add(lblNewLabel);
		
		JLabel lblPassword = new JLabel("Password :");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 28));
		lblPassword.setBounds(173, 243, 176, 45);
		frmDepartmentOfRadiology.getContentPane().add(lblPassword);
		
		textID = new JTextField();
		textID.setBounds(438, 131, 196, 58);
		frmDepartmentOfRadiology.getContentPane().add(textID);
		textID.setColumns(10);
		
		JButton btnSignIn = new JButton("Sign In");
		btnSignIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnSignInActionPerformed(e);
			}
		});
		btnSignIn.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btnSignIn.setBounds(314, 398, 126, 51);
		frmDepartmentOfRadiology.getContentPane().add(btnSignIn);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(438, 242, 196, 58);
		frmDepartmentOfRadiology.getContentPane().add(passwordField);
		
		lblDepartmentOfRadiology = new JLabel("Department of Radiology");
		lblDepartmentOfRadiology.setForeground(new Color(0, 0, 204));
		lblDepartmentOfRadiology.setFont(new Font("SansSerif", Font.BOLD, 30));
		lblDepartmentOfRadiology.setBounds(237, 6, 368, 58);
		frmDepartmentOfRadiology.getContentPane().add(lblDepartmentOfRadiology);
		
		btnForgotPassword = new JButton("Forgot Password");
		btnForgotPassword.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmDepartmentOfRadiology.dispose();
				RadiologyForgot window = new RadiologyForgot();
				window.frameRadiologyForgot.setVisible(true);
			}
		});
		btnForgotPassword.setFont(new Font("SansSerif", Font.PLAIN, 14));
		btnForgotPassword.setBounds(523, 323, 176, 31);
		frmDepartmentOfRadiology.getContentPane().add(btnForgotPassword);
	}
	
	private void btnSignInActionPerformed(ActionEvent evt)
	{
		String RD_id=textID.getText();
		@SuppressWarnings("deprecation")
		String pass=passwordField.getText();
		try{   
				Connect.getup();
				con=Connect.Connecti();
				String chek="select * from RADIOLOGY_DEPT where RD_ID=?";
				p=con.prepareStatement(chek);
				p.setString(1,RD_id);
				r=p.executeQuery();
				if(r.next())
				{
					String password=r.getString("password");
					if(pass.contentEquals(password))
					{
						frmDepartmentOfRadiology.dispose();
						RadiologyDept window = new RadiologyDept();
						window.frmRDept.setVisible(true);
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
			
		textID.setText("");
		passwordField.setText("");
	 }	
}
