import java.awt.EventQueue;
import java.sql.*;
import java.text.SimpleDateFormat;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.util.Calendar;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;


import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import com.toedter.calendar.JDateChooser;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

/**
 * by 
 * Puneeth_Aacharya
 * 
 */
public class Patient {

	
	
	Connection con;
	PreparedStatement p;
	ResultSet r;

	public JFrame frmPatientHome;
	private JTextField p_idField;
	private  JTextField ageField;
	private JTextField typeField;
	private JTextField addressField;
	private JTextField d_idField;
	private JTextField phField;
	private JTextField nameField;
	private JTextField r_idField;
	private JTextField d_nameField;
	private JDateChooser date;
	private Calendar cal;
	private JComboBox GenCombo;
	private JComboBox BloodBox;

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
					Patient window = new Patient();
					window.frmPatientHome.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Patient() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmPatientHome = new JFrame();
		frmPatientHome.setResizable(false);
		frmPatientHome.setTitle("Reception >> Home >> New Patient");
		frmPatientHome.setBounds(100, 100, 981, 760);
		frmPatientHome.setLocationRelativeTo(null);
		frmPatientHome.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPatientHome.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New Patient Registration");
		lblNewLabel.setFont(new Font("SansSerif", Font.PLAIN, 35));
		lblNewLabel.setForeground(new Color(51, 51, 204));
		lblNewLabel.setBounds(272, 6, 406, 74);
		frmPatientHome.getContentPane().add(lblNewLabel);
		
		JLabel lblPid = new JLabel("PATIENT ID :");
		lblPid.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblPid.setBounds(25, 124, 152, 28);
		frmPatientHome.getContentPane().add(lblPid);
		
		JLabel lblName = new JLabel("NAME :");
		lblName.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblName.setBounds(436, 124, 99, 28);
		frmPatientHome.getContentPane().add(lblName);
		
		JLabel lblAge = new JLabel("AGE : ");
		lblAge.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblAge.setBounds(25, 206, 71, 28);
		frmPatientHome.getContentPane().add(lblAge);
		
		JLabel lblGender = new JLabel("GENDER :");
		lblGender.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblGender.setBounds(436, 206, 120, 28);
		frmPatientHome.getContentPane().add(lblGender);
		
		JLabel lblPtype = new JLabel("TIME :");
		lblPtype.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblPtype.setBounds(25, 293, 101, 28);
		frmPatientHome.getContentPane().add(lblPtype);
		
		JLabel lblBloodGroup = new JLabel("BLOOD GROUP :");
		lblBloodGroup.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblBloodGroup.setBounds(436, 293, 189, 28);
		frmPatientHome.getContentPane().add(lblBloodGroup);
		
		JLabel lblAddress = new JLabel("ADDRESS :");
		lblAddress.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblAddress.setBounds(25, 373, 130, 28);
		frmPatientHome.getContentPane().add(lblAddress);
		
		JLabel lblAppointmentDate = new JLabel("APPOINTMENT DATE :");
		lblAppointmentDate.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblAppointmentDate.setBounds(436, 555, 264, 28);
		frmPatientHome.getContentPane().add(lblAppointmentDate);
		
		JLabel lblDoctorid = new JLabel("DOCTOR_ID :");
		lblDoctorid.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblDoctorid.setBounds(25, 460, 162, 25);
		frmPatientHome.getContentPane().add(lblDoctorid);
		
		JLabel lblRid = new JLabel("RECEPTIONIST ID :");
		lblRid.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblRid.setBounds(436, 375, 225, 25);
		frmPatientHome.getContentPane().add(lblRid);
		
		JLabel lblPhno = new JLabel("PH_NO :");
		lblPhno.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblPhno.setBounds(25, 557, 101, 25);
		frmPatientHome.getContentPane().add(lblPhno);
		
		p_idField = new JTextField();
		p_idField.setBounds(176, 125, 239, 40);
		frmPatientHome.getContentPane().add(p_idField);
		p_idField.setColumns(10);
		
		ageField = new JTextField();
		ageField.setBounds(176, 207, 239, 40);
		frmPatientHome.getContentPane().add(ageField);
		ageField.setColumns(10);
		
		typeField = new JTextField();
		typeField.setText("Click Here");
		typeField.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				java.util.Date today=new java.util.Date();
				SimpleDateFormat time=new SimpleDateFormat("HH:mm:SS aa");
				String timestamp=time.format(today);
				typeField.setText(timestamp);
			}
		});
		typeField.setBounds(176, 294, 239, 40);
		frmPatientHome.getContentPane().add(typeField);
		typeField.setColumns(10);
		
		addressField = new JTextField();
		addressField.setBounds(176, 374, 239, 40);
		frmPatientHome.getContentPane().add(addressField);
		addressField.setColumns(10);
		
		d_idField = new JTextField();
		d_idField.setBounds(176, 459, 239, 40);
		frmPatientHome.getContentPane().add(d_idField);
		d_idField.setColumns(10);
		
		phField = new JTextField();
		phField.setBounds(176, 556, 239, 40);
		frmPatientHome.getContentPane().add(phField);
		phField.setColumns(10);
		
		nameField = new JTextField();
		nameField.setBounds(684, 125, 239, 40);
		frmPatientHome.getContentPane().add(nameField);
		nameField.setColumns(10);
		
		r_idField = new JTextField();
		r_idField.setBounds(684, 374, 239, 40);
		frmPatientHome.getContentPane().add(r_idField);
		r_idField.setColumns(10);
		
		d_nameField = new JTextField();
		d_nameField.setText("Click Here");
		d_nameField.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String Doctor=d_idField.getText();
				try {
					Connect.getup();
					con=Connect.Connecti();
					p=con.prepareStatement("select * from DOCTOR where D_ID=?");
					p.setString(1,Doctor);
					r=p.executeQuery();
					if(r.next())
					{
						String D_ID=r.getString("D_NAME");
						d_nameField.setText(D_ID);
					}
					else
					{
						JOptionPane.showMessageDialog(null,"Enter valid Doctor Id");
					}
					
				}
				catch(Exception s)
				{
					JOptionPane.showMessageDialog(null,s);
				}
			}
		});
		d_nameField.setBounds(684, 459, 239, 40);
		frmPatientHome.getContentPane().add(d_nameField);
		d_nameField.setColumns(10);
		
		JLabel lblDoctorname = new JLabel("DOCTOR_NAME : ");
		lblDoctorname.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblDoctorname.setBounds(436, 460, 204, 25);
		frmPatientHome.getContentPane().add(lblDoctorname);
		
		JButton btnSave = new JButton("SAVE");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				btnSaveActionPerformed(evt);
			}
		});
		btnSave.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnSave.setBounds(389, 664, 167, 49);
		frmPatientHome.getContentPane().add(btnSave);
		
		JButton btnLogout = new JButton("LogOut");
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmPatientHome.dispose();
				frontwindow window = new frontwindow();
				window.frmWelcome.setVisible(true);
			}
		});
		btnLogout.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnLogout.setBounds(817, 27, 96, 33);
		frmPatientHome.getContentPane().add(btnLogout);
		
		JButton btnHome = new JButton("HOME");
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmPatientHome.dispose();
				RecepHome window = new RecepHome();
				window.frmReceptionHome.setVisible(true);
			}
		});
		btnHome.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnHome.setBounds(25, 30, 112, 33);
		frmPatientHome.getContentPane().add(btnHome);
		
		date = new JDateChooser();
		date.setBounds(684, 555, 239, 41);
		frmPatientHome.getContentPane().add(date);
				
		date.setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{date.getCalendarButton()}));
		
		GenCombo = new JComboBox();
		GenCombo.setFont(new Font("SansSerif", Font.PLAIN, 20));
		GenCombo.setModel(new DefaultComboBoxModel(new String[] {"Male", "Female", "Others"}));
		GenCombo.setBounds(684, 212, 239, 40);
		frmPatientHome.getContentPane().add(GenCombo);
		
		BloodBox = new JComboBox();
		BloodBox.setFont(new Font("SansSerif", Font.PLAIN, 20));
		BloodBox.setModel(new DefaultComboBoxModel(new String[] {"A+", "A-", "B+", "B-", "AB+", "Ab-", "O+", "O-"}));
		BloodBox.setBounds(684, 299, 239, 40);
		frmPatientHome.getContentPane().add(BloodBox);
		
		
	}
	
	private void btnSaveActionPerformed(ActionEvent evt)
	{		
		
		String P_ID= p_idField.getText();
		String NAME=nameField.getText();
		String AGE=ageField.getText();
		String GEN=(String)GenCombo.getSelectedItem().toString();
		//String P_TYPE=typeField.getText();
		String B_GROUP=(String)BloodBox.getSelectedItem().toString();
		String ADDRESS=addressField.getText();
		String R_ID=r_idField.getText();
		String D_ID=d_idField.getText();
		String D_NAME=d_nameField.getText();
		String PH_NO=phField.getText();
		SimpleDateFormat at=new SimpleDateFormat("dd-MM-yyyy");
		String jodate=at.format(date.getDate());
		//Date sqlDate =new Date(date.getDate().getTime());
		
		
		
		java.util.Date today=new java.util.Date();
		SimpleDateFormat time=new SimpleDateFormat("HH:mm:SS aa");
		String timestamp=time.format(today);
		
		
		
		try {
			Connect.getup();
			con=Connect.Connecti();
		    
			p=con.prepareStatement("insert into patient(P_ID,P_NAME,AGE,GENDER,TIME,BLOOD_GROUP,ADDRESS,APPOINTMENT_DATE,DOCTOR_ID,R_ID,PH_NO,D_NAME) values(?,?,?,?,?,?,?,?,?,?,?,?)");
			p.setString(1 ,P_ID);
			p.setString(2,NAME);
			p.setString(3,AGE);
			p.setString(4,GEN);
			p.setString(5,timestamp);
			p.setString(6,B_GROUP);
			p.setString(7,ADDRESS);
			p.setString(8,jodate);
			p.setString(9,D_ID);
			p.setString(10,R_ID);
			p.setString(11,PH_NO);
			p.setString(12,D_NAME);
			p.execute();
			
			JOptionPane.showMessageDialog(null,"Registered Succesfully");
			
			
		}
		catch(Exception e)
		{
			JOptionPane.showMessageDialog(null, e);
		}
		p_idField.setText("");
		nameField.setText("");
		ageField.setText("");			
		addressField.setText("");
		r_idField.setText("");
		d_idField.setText("");
		d_nameField.setText("");
		phField.setText("");
	}
}
