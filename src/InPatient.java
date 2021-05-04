import java.awt.EventQueue;
import java.sql.*;
import java.text.SimpleDateFormat;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import java.awt.Component;

import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

import org.eclipse.wb.swing.FocusTraversalOnArray;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import com.toedter.calendar.JDateChooser;

import net.proteanit.sql.DbUtils;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTable;
import javax.swing.JScrollPane;
/**
 * by 
 * Puneeth_Aacharya
 * 
 */
public class InPatient {
	Connection con;
	PreparedStatement p;
	ResultSet r;

	public JFrame frmInpatient;
	private JTextField textWard;
	private JTextField textP_ID;
	private JTextField textD_ID;
	private JTextField textName;
	private JTextField textPhNo;
	private JDateChooser DoADate;
	private JTable table;

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
					InPatient window = new InPatient();
					window.frmInpatient.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public InPatient() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmInpatient = new JFrame();
		frmInpatient.setResizable(false);
		frmInpatient.setTitle("Reception >> Home >> InPatient");
		frmInpatient.setBounds(100, 100, 1009, 760);
		frmInpatient.setLocationRelativeTo(null);
		frmInpatient.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmInpatient.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ADMIT AS INPATIENT");
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 35));
		lblNewLabel.setBounds(272, 6, 406, 74);
		frmInpatient.getContentPane().add(lblNewLabel);
		
		JButton btnHome = new JButton("HOME");
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmInpatient.dispose();
				RecepHome window = new RecepHome();
				window.frmReceptionHome.setVisible(true);
			}
		});
		btnHome.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnHome.setBounds(25, 33, 112, 33);
		frmInpatient.getContentPane().add(btnHome);
		
		JButton btnLogout = new JButton("LogOut");
		btnLogout.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnLogout.setBounds(817, 27, 96, 33);
		frmInpatient.getContentPane().add(btnLogout);
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmInpatient.dispose();
				frontwindow window = new frontwindow();
				window.frmWelcome.setVisible(true);
				
			}
		});
		
		JLabel lblPatientId = new JLabel("Patient ID : ");
		lblPatientId.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblPatientId.setBounds(25, 124, 152, 28);
		frmInpatient.getContentPane().add(lblPatientId);
		
		JLabel lblName = new JLabel("Name :");
		lblName.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblName.setBounds(513, 124, 152, 28);
		frmInpatient.getContentPane().add(lblName);
		
		JLabel lblDoctorId = new JLabel("Doctor ID :");
		lblDoctorId.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblDoctorId.setBounds(513, 243, 152, 28);
		frmInpatient.getContentPane().add(lblDoctorId);
		
		JLabel lblWardNo = new JLabel("Ward No. :");
		lblWardNo.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblWardNo.setBounds(25, 243, 152, 28);
		frmInpatient.getContentPane().add(lblWardNo);
		
		JLabel lblDateOfAdmission = new JLabel("Date of Admission :");
		lblDateOfAdmission.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblDateOfAdmission.setBounds(25, 378, 220, 28);
		frmInpatient.getContentPane().add(lblDateOfAdmission);
		
		JLabel lblPhoneNo = new JLabel("Phone no. :");
		lblPhoneNo.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblPhoneNo.setBounds(513, 378, 152, 28);
		frmInpatient.getContentPane().add(lblPhoneNo);
		
		textWard = new JTextField();
		textWard.setBounds(242, 242, 239, 40);
		frmInpatient.getContentPane().add(textWard);
		textWard.setColumns(10);
		
		textP_ID = new JTextField();
		textP_ID.setBounds(242, 124, 239, 40);
		frmInpatient.getContentPane().add(textP_ID);
		textP_ID.setColumns(10);
		
		textD_ID = new JTextField();
		textD_ID.setBounds(735, 242, 239, 40);
		frmInpatient.getContentPane().add(textD_ID);
		textD_ID.setColumns(10);
		
		textName = new JTextField();
		textName.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String P_name=textP_ID.getText();
				try {
					Connect.getup();
					con=Connect.Connecti();
					p=con.prepareStatement("select * from PATIENT where P_ID=?");
					p.setString(1,P_name);
					r=p.executeQuery();
					if(r.next())
					{
						String p_name=r.getString("P_NAME");
						textName.setText(p_name);
					}
					else
					{
						JOptionPane.showMessageDialog(null,"Please enter valid Patient ID");
					}
					
				}
				catch(Exception s)
				{
					JOptionPane.showMessageDialog(null,s);
				}
			}
		});
		textName.setBounds(735, 125, 239, 40);
		textName.setText("Click here");
		frmInpatient.getContentPane().add(textName);
		textName.setColumns(10);
		
		textPhNo = new JTextField();
		textPhNo.setBounds(735, 377, 239, 40);
		frmInpatient.getContentPane().add(textPhNo);
		textPhNo.setColumns(10);
		
		JButton btnSave = new JButton("SAVE");
		btnSave.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnSave.setBounds(389, 666, 167, 49);
		frmInpatient.getContentPane().add(btnSave);
		
		DoADate = new JDateChooser();
		DoADate.setBounds(242, 368, 239, 39);
		frmInpatient.getContentPane().add(DoADate);
		DoADate.setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{DoADate.getCalendarButton()}));
		
		
		
		JButton btnCheck = new JButton("CHECK");
		btnCheck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnCheckActionPerformed(e);
			}
		});
		btnCheck.setBounds(242, 296, 96, 40);
		frmInpatient.getContentPane().add(btnCheck);
		
		JLabel lblCheckWardAvailability = new JLabel("Check ward availability");
		lblCheckWardAvailability.setFont(new Font("SansSerif", Font.PLAIN, 18));
		lblCheckWardAvailability.setBounds(25, 300, 203, 28);
		frmInpatient.getContentPane().add(lblCheckWardAvailability);
		
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				btnSaveActionPerformed(evt);
			}
		});
	}
	private void btnSaveActionPerformed(ActionEvent evt)
	{
		String P_ID= textP_ID.getText();
		String P_NAME= textName.getText();
		//String N_ID= textN_ID.getText();
		String D_ID= textD_ID.getText();
		//String DoA= textDoA.getText();
		String WARD= textWard.getText();
		//String LAB= textLab.getText();
		String Ph_No= textPhNo.getText();
		SimpleDateFormat dt=new SimpleDateFormat("dd-MM-yyyy");
		String doa=dt.format(DoADate.getDate());
		Date DoA =new Date(DoADate.getDate().getTime());
		
		try
		{
			Connect.getup();
			con=Connect.Connecti();
			
			String sql="insert into INPATIENT(P_ID,P_NAME,WARD_NO,DATE_OF_ADMISSION,D_ID,PH_NO) values(?,?,?,?,?,?)";
			p=con.prepareStatement(sql);
			p.setString(1, P_ID);
			p.setString(2, P_NAME);
			p.setString(3, WARD);
			p.setString(4, doa);
			
			p.setString(5, D_ID);
			p.setString(6, Ph_No);
			
			p.execute();
			
			
			String occupaid="update wards set occupied=(select count(i.ward_no) from inpatient i where ward_no=?)   where ward_no=?";
			p=con.prepareStatement(occupaid);
			p.setString(1, WARD);
			p.setString(2, WARD);
			p.executeUpdate();
			
			
			String remaining="update wards set remaining=(total_beds - occupied) where ward_no=?";
			p=con.prepareStatement(remaining);
			p.setString(1, WARD);
			p.executeUpdate();
			
			
			JOptionPane.showMessageDialog(null, "Registered Succesfully");
	    }
		catch(Exception e)
		{
			JOptionPane.showMessageDialog(null,e,"ERROR", JOptionPane.ERROR_MESSAGE);
		}
	
   }
	
	private void btnCheckActionPerformed(ActionEvent evt)
	{
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(51, 463, 907, 189);
		frmInpatient.getContentPane().add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		try
		{
			Connect.getup();
			con=Connect.Connecti();
			
			String query="select * from WARDS";
			p=con.prepareStatement(query);
			r=p.executeQuery();
			table.setModel(DbUtils.resultSetToTableModel(r));
		}
		catch(Exception e)
		{
			JOptionPane.showMessageDialog(null, "Error occured");
		}
	}
}
