import java.awt.EventQueue;
import java.sql.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * by 
 * Puneeth_Aacharya
 * 
 */
public class RadiologyDept {
	Connection con;
	PreparedStatement p;
	ResultSet r;

	public JFrame frmRDept;
	private JTextField textP_name;
	private JTextField textBill;
	private JTextField textP_id;
	private JTextField textD_id;
	private JComboBox Combo;
	private JTextField textD_name;

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
					RadiologyDept window = new RadiologyDept();
					window.frmRDept.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public RadiologyDept() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmRDept = new JFrame();
		frmRDept.setTitle("Radiology department >> Home");
		frmRDept.setBounds(100, 100, 1065, 639);
		frmRDept.setLocationRelativeTo(null);
		frmRDept.setLocationRelativeTo(null);
		frmRDept.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmRDept.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("DEPARTMENT OF RADIOLOGY");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setBounds(319, 10, 456, 56);
		frmRDept.getContentPane().add(lblNewLabel);
		
		JButton btnLogout = new JButton("LogOut");
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnLogoutAtionPerformed(e);
			}
		});
		btnLogout.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnLogout.setBounds(901, 28, 99, 38);
		frmRDept.getContentPane().add(btnLogout);
		
		JLabel lblPatientId = new JLabel("Patient ID :");
		lblPatientId.setFont(new Font("Tahoma", Font.PLAIN, 23));
		lblPatientId.setBounds(42, 188, 127, 42);
		frmRDept.getContentPane().add(lblPatientId);
		
		JLabel lblPatientName = new JLabel("Patient Name :");
		lblPatientName.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblPatientName.setBounds(42, 306, 171, 42);
		frmRDept.getContentPane().add(lblPatientName);
		
		textP_name = new JTextField();
		textP_name.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String p_id=textP_id.getText();
				try
				{
					Connect.getup();
					con=Connect.Connecti();
					String query="select * from PATIENT where P_ID=?";
					p=con.prepareStatement(query);
					p.setString(1, p_id);
					r=p.executeQuery();
					if(r.next())
					{
						String p_name=r.getString("P_NAME");
						textP_name.setText(p_name);
					}
					else
					{
						JOptionPane.showMessageDialog(null,"Please enter Patient ID");
					}
				}
				catch(Exception evt)
				{
					JOptionPane.showMessageDialog(null,evt);
				}
			}
		});
		textP_name.setFont(new Font("Book Antiqua", Font.ITALIC, 21));
		textP_name.setText("Get");
		textP_name.setBounds(225, 306, 207, 56);
		frmRDept.getContentPane().add(textP_name);
		textP_name.setColumns(10);
		
		JLabel lblDoctorId = new JLabel("Doctor ID :");
		lblDoctorId.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblDoctorId.setBounds(577, 188, 142, 42);
		frmRDept.getContentPane().add(lblDoctorId);
		
		JLabel lblScanName = new JLabel("Scan Name :");
		lblScanName.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblScanName.setBounds(577, 304, 152, 56);
		frmRDept.getContentPane().add(lblScanName);
		
		JLabel lblBillAmount = new JLabel("Bill Amount :");
		lblBillAmount.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblBillAmount.setBounds(577, 434, 171, 30);
		frmRDept.getContentPane().add(lblBillAmount);
		
		textBill = new JTextField();
		textBill.setColumns(10);
		textBill.setBounds(753, 428, 207, 56);
		frmRDept.getContentPane().add(textBill);
		
		JLabel lblRs = new JLabel("Rs.");
		lblRs.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblRs.setBounds(972, 448, 45, 36);
		frmRDept.getContentPane().add(lblRs);
		
		textP_id = new JTextField();
		textP_id.setColumns(10);
		textP_id.setBounds(225, 188, 207, 56);
		frmRDept.getContentPane().add(textP_id);
		
		textD_id = new JTextField();
		textD_id.setColumns(10);
		textD_id.setBounds(752, 188, 207, 56);
		frmRDept.getContentPane().add(textD_id);
		
		JButton btnSave = new JButton("SAVE");
		btnSave.setBackground(new Color(102, 153, 255));
		btnSave.setForeground(Color.BLACK);
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				btnSaveActionPerformed(evt);
			}
		});
		btnSave.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnSave.setBounds(455, 529, 127, 56);
		frmRDept.getContentPane().add(btnSave);
		
		Combo = new JComboBox();
		Combo.setFont(new Font("SansSerif", Font.PLAIN, 25));
		Combo.setModel(new DefaultComboBoxModel(new String[] {"CT", "MRI", "X-ray", "USG", "Doppler"}));
		Combo.setBounds(752, 306, 207, 56);
		frmRDept.getContentPane().add(Combo);
		
		JLabel lblDoctorName = new JLabel("Doctor Name :");
		lblDoctorName.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblDoctorName.setBounds(42, 434, 171, 42);
		frmRDept.getContentPane().add(lblDoctorName);
		
		textD_name = new JTextField();
		textD_name.setFont(new Font("SansSerif", Font.PLAIN, 20));
		textD_name.setText("Get");
		textD_name.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String d_id=textD_id.getText();
				try
				{
					Connect.getup();
					con=Connect.Connecti();
					String query="select * from DOCTOR where D_ID=?";
					p=con.prepareStatement(query);
					p.setString(1, d_id);
					r=p.executeQuery();
					if(r.next())
					{
						String d_name=r.getString("D_NAME");
						textD_name.setText(d_name);
					}
					else
					{
						JOptionPane.showMessageDialog(null,"Please enter Doctor ID");
					}
				}
				catch(Exception evt)
				{
					JOptionPane.showMessageDialog(null,evt);
				}
			}
		});
		textD_name.setColumns(10);
		textD_name.setBounds(225, 428, 207, 56);
		frmRDept.getContentPane().add(textD_name);
	}
	private void btnSaveActionPerformed(ActionEvent evt)
	{
		String P_id=textP_id.getText();
		String D_id=textD_id.getText();
		String P_name=textP_name.getText();
		String scan=(String)Combo.getSelectedItem().toString();
	    float bill=Float.parseFloat(textBill.getText());
	    String D_name=textD_name.getText(); 
	    
	    try
	    {

			Connect.getup();
			con=Connect.Connecti();
			
			String sql="insert into RADIOLOGY(SCAN_NAME,P_ID,P_NAME,D_ID,BILL_AMOUNT,D_NAME) values(?,?,?,?,?,?)";
			p=con.prepareStatement(sql);
			p.setString(1, scan);
			p.setString(2, P_id);
			p.setString(3, P_name);
			p.setString(4, D_id);
			p.setLong(5, (long)bill);
			p.setString(6, D_name);
			
			
			p.execute();
			
			JOptionPane.showMessageDialog(null, "Registered Succesfully");
			
		}
		catch(Exception e)
		{
			JOptionPane.showMessageDialog(null, e);
		}
	}
	private void btnLogoutAtionPerformed(ActionEvent evt)
	{
		frmRDept.dispose();
		frontwindow window = new frontwindow();
		window.frmWelcome.setVisible(true);
	}
}
