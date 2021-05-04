import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Toolkit;
import java.awt.Color;
import java.awt.Dimension;
import java.sql.*;
import java.text.SimpleDateFormat;

import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.CompoundBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import com.toedter.calendar.JDateChooser;

/**
 * by 
 * Puneeth_Aacharya
 * 
 */
public class Billing {
	
	Connection con;
	PreparedStatement p;
	ResultSet r;

	public JFrame frmBilling;
	private JTextField textTotal;
	private JTextField textD_Charge;
	private JTextField textP_Name;
	private JTextField textB_NO;
	private static JTextField textP_ID;
	private JTextField textP_Type;
	private JTextField textL_Charge;
	private JTextField textOthers;
	private JTextField textInB_no;
	private JTextField textInP_name;
	private JTextField textInD_charge;
	private JTextField textInP_id;
	private JTextField textInP_type;
	private JTextField textInL_charge;
	private JTextField textInW_charge;
	private JTextField textInO_charge;
	private JTextField textIn_days;
	private JTextField textInTotal;
	private JDateChooser dateChooser;

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
					Billing window = new Billing();
					window.frmBilling.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Billing() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmBilling = new JFrame();
		frmBilling.setTitle("Reception >> Home >> Billing");
		Dimension screenSize=Toolkit.getDefaultToolkit().getScreenSize();
		frmBilling.setSize(screenSize.width,screenSize.height);
		frmBilling.setLocationRelativeTo(null);
		frmBilling.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmBilling.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("BILLING SECTION");
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 35));
		lblNewLabel.setBounds(559, 10, 328, 64);
		frmBilling.getContentPane().add(lblNewLabel, BorderLayout.NORTH);
		
		JPanel panel = new JPanel();
		panel.setBorder(new CompoundBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(59, 59, 59)), new CompoundBorder()));
		panel.setBounds(24, 121, 739, 653);
		frmBilling.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("OUTPATIENT");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_1.setBounds(310, 10, 170, 31);
		panel.add(lblNewLabel_1);
		
		JLabel lblBillNumber = new JLabel("Bill Number :");
		lblBillNumber.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblBillNumber.setBounds(10, 114, 141, 42);
		panel.add(lblBillNumber);
		
		JLabel lblPatientId = new JLabel("Patient ID :");
		lblPatientId.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblPatientId.setBounds(390, 123, 149, 25);
		panel.add(lblPatientId);
		
		JLabel lblPatientName = new JLabel("Patient Name :");
		lblPatientName.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblPatientName.setBounds(10, 217, 166, 40);
		panel.add(lblPatientName);
		
		JLabel lblPatientType = new JLabel("Patient Type :");
		lblPatientType.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblPatientType.setBounds(390, 227, 150, 25);
		panel.add(lblPatientType);
		
		JLabel lblDoctorCharges = new JLabel("Doctor Charges :");
		lblDoctorCharges.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblDoctorCharges.setBounds(10, 314, 180, 46);
		panel.add(lblDoctorCharges);
		
		JLabel lblLabCharges = new JLabel("Lab Charges :");
		lblLabCharges.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblLabCharges.setBounds(390, 314, 149, 46);
		panel.add(lblLabCharges);
		
		JButton btnTotal = new JButton("TOTAL");
		btnTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				btnTotalActionPerformed(evt);			
			}
		});
		btnTotal.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnTotal.setBounds(491, 411, 170, 66);
		panel.add(btnTotal);
		
		textTotal = new JTextField();
		textTotal.setEditable(false);
		textTotal.setFont(new Font("Tahoma", Font.PLAIN, 24));
		textTotal.setColumns(10);
		textTotal.setBounds(432, 503, 219, 46);
		panel.add(textTotal);
		
		textD_Charge = new JTextField();
		textD_Charge.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textD_Charge.setColumns(10);
		textD_Charge.setBounds(200, 314, 180, 46);
		panel.add(textD_Charge);
		
		textP_Name = new JTextField();
		textP_Name.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String p_id=textP_ID.getText();
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
						textP_Name.setText(p_name);
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
		textP_Name.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textP_Name.setText("Get Name");
		textP_Name.setColumns(10);
		textP_Name.setBounds(200, 211, 180, 46);
		panel.add(textP_Name);
		
		textB_NO = new JTextField();
		textB_NO.setEditable(false);
		textB_NO.setText("0");
		textB_NO.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textB_NO.setColumns(10);
		textB_NO.setBounds(200, 113, 180, 46);
		panel.add(textB_NO);
		
		textP_ID = new JTextField();
		textP_ID.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textP_ID.setColumns(10);
		textP_ID.setBounds(549, 114, 180, 46);
		panel.add(textP_ID);
		
		textP_Type = new JTextField();
		textP_Type.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textP_Type.setEditable(false);
		textP_Type.setText("OUTPATIENT");
		textP_Type.setColumns(10);
		textP_Type.setBounds(549, 211, 180, 46);
		panel.add(textP_Type);
		
		textL_Charge = new JTextField();
		textL_Charge.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textL_Charge.setColumns(10);
		textL_Charge.setBounds(549, 314, 180, 46);
		panel.add(textL_Charge);
		
		JButton btnSaveToDatabase = new JButton("Save to database");
		btnSaveToDatabase.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnSaveToDatabase.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				btnSaveToDataBaseActionPerformed(evt);
			}
		});
		btnSaveToDatabase.setBounds(61, 577, 269, 42);
		panel.add(btnSaveToDatabase);
		
		JLabel lblOtherCharges = new JLabel("Other Charges :");
		lblOtherCharges.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblOtherCharges.setBounds(10, 398, 180, 31);
		panel.add(lblOtherCharges);
		
		textOthers = new JTextField();
		textOthers.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textOthers.setColumns(10);
		textOthers.setBounds(200, 398, 180, 46);
		panel.add(textOthers);
		
		JLabel lblIfTheBill = new JLabel("If the Bill is Paid Click the button to Save :");
		lblIfTheBill.setForeground(new Color(0, 0, 205));
		lblIfTheBill.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblIfTheBill.setBounds(10, 523, 388, 42);
		panel.add(lblIfTheBill);
		
		JLabel lblRs = new JLabel("Rs.");
		lblRs.setFont(new Font("SansSerif", Font.PLAIN, 15));
		lblRs.setBounds(663, 518, 24, 31);
		panel.add(lblRs);
		
		JButton btnGenerateBill = new JButton("Generate Bill ");
		btnGenerateBill.setFont(new Font("SansSerif", Font.PLAIN, 16));
		btnGenerateBill.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnGenerateBillActionPerformed(e);
			}
		});
		btnGenerateBill.setBounds(464, 591, 187, 42);
		panel.add(btnGenerateBill);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new CompoundBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(59, 59, 59)), new CompoundBorder()));
		panel_1.setBounds(773, 121, 728, 653);
		frmBilling.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("INPATIENT");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_2.setBounds(338, 10, 170, 31);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblBillNumber_1 = new JLabel("Bill Number :");
		lblBillNumber_1.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblBillNumber_1.setBounds(10, 111, 141, 42);
		panel_1.add(lblBillNumber_1);
		
		JLabel lblPatientName_1 = new JLabel("Patient Name :");
		lblPatientName_1.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblPatientName_1.setBounds(10, 193, 166, 40);
		panel_1.add(lblPatientName_1);
		
		JLabel lblDoctorCharges_1 = new JLabel("Doctor Charges :");
		lblDoctorCharges_1.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblDoctorCharges_1.setBounds(10, 280, 180, 46);
		panel_1.add(lblDoctorCharges_1);
		
		JLabel lblPatientId_1 = new JLabel("Patient ID :");
		lblPatientId_1.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblPatientId_1.setBounds(381, 111, 149, 42);
		panel_1.add(lblPatientId_1);
		
		JLabel lblPatientType_1 = new JLabel("Patient Type :");
		lblPatientType_1.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblPatientType_1.setBounds(381, 194, 150, 38);
		panel_1.add(lblPatientType_1);
		
		JLabel lblLabCharges_1 = new JLabel("Lab Charges :");
		lblLabCharges_1.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblLabCharges_1.setBounds(381, 280, 149, 46);
		panel_1.add(lblLabCharges_1);
		
		textInB_no = new JTextField();
		textInB_no.setEditable(false);
		textInB_no.setText("0");
		textInB_no.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textInB_no.setColumns(10);
		textInB_no.setBounds(191, 112, 180, 46);
		panel_1.add(textInB_no);
		
		textInP_name = new JTextField();
		textInP_name.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String p_id=textInP_id.getText();
				try
				{
					Connect.getup();
					con=Connect.Connecti();
					String query="select * from INPATIENT where P_ID=?";
					p=con.prepareStatement(query);
					p.setString(1, p_id);
					r=p.executeQuery();
					if(r.next())
					{
						String p_name=r.getString("P_NAME");
						textInP_name.setText(p_name);
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
		textInP_name.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textInP_name.setText("Get name");
		textInP_name.setColumns(10);
		textInP_name.setBounds(191, 193, 180, 46);
		panel_1.add(textInP_name);
		
		textInD_charge = new JTextField();
		textInD_charge.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textInD_charge.setColumns(10);
		textInD_charge.setBounds(191, 283, 180, 46);
		panel_1.add(textInD_charge);
		
		textInP_id = new JTextField();
		textInP_id.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textInP_id.setColumns(10);
		textInP_id.setBounds(537, 112, 180, 46);
		panel_1.add(textInP_id);
		
		textInP_type = new JTextField();
		textInP_type.setEditable(false);
		textInP_type.setText("INPATIENT");
		textInP_type.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textInP_type.setColumns(10);
		textInP_type.setBounds(537, 193, 180, 46);
		panel_1.add(textInP_type);
		
		textInL_charge = new JTextField();
		textInL_charge.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textInL_charge.setColumns(10);
		textInL_charge.setBounds(537, 283, 180, 46);
		panel_1.add(textInL_charge);
		
		JLabel lblDoctorCharges_1_1 = new JLabel("Ward Charges :");
		lblDoctorCharges_1_1.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblDoctorCharges_1_1.setBounds(10, 377, 180, 46);
		panel_1.add(lblDoctorCharges_1_1);
		
		JLabel lblOtherCharges_2 = new JLabel("Other Charges");
		lblOtherCharges_2.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblOtherCharges_2.setBounds(381, 385, 154, 31);
		panel_1.add(lblOtherCharges_2);
		
		textInW_charge = new JTextField();
		textInW_charge.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textInW_charge.setColumns(10);
		textInW_charge.setBounds(191, 380, 180, 46);
		panel_1.add(textInW_charge);
		
		textInO_charge = new JTextField();
		textInO_charge.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textInO_charge.setColumns(10);
		textInO_charge.setBounds(537, 380, 180, 46);
		panel_1.add(textInO_charge);
		
		JLabel lblDoctorCharges_1_1_1 = new JLabel("No_of_Days :");
		lblDoctorCharges_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblDoctorCharges_1_1_1.setBounds(10, 471, 180, 46);
		panel_1.add(lblDoctorCharges_1_1_1);
		
		textIn_days = new JTextField();
		textIn_days.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textIn_days.setColumns(10);
		textIn_days.setBounds(191, 474, 180, 46);
		panel_1.add(textIn_days);
		
		JButton btnInTotal = new JButton("TOTAL");
		btnInTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				btnInTotalActionPerformed(evt);
			}
		});
		btnInTotal.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnInTotal.setBounds(466, 438, 170, 66);
		panel_1.add(btnInTotal);
		
		textInTotal = new JTextField();
		textInTotal.setEditable(false);
		textInTotal.setFont(new Font("Tahoma", Font.PLAIN, 24));
		textInTotal.setColumns(10);
		textInTotal.setBounds(443, 516, 217, 46);
		panel_1.add(textInTotal);
		
		JLabel lblIfTheBill_1 = new JLabel("If the Bill is Paid Click the button to Save :");
		lblIfTheBill_1.setForeground(new Color(0, 0, 128));
		lblIfTheBill_1.setBackground(SystemColor.activeCaption);
		lblIfTheBill_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblIfTheBill_1.setBounds(10, 529, 388, 42);
		panel_1.add(lblIfTheBill_1);
		
		JButton btnInSave = new JButton("Save to database");
		btnInSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				btnInSaveActionPerformed(evt);
			}
		});
		btnInSave.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnInSave.setBounds(69, 583, 269, 42);
		panel_1.add(btnInSave);
		
		JLabel lblRs_1 = new JLabel("Rs.");
		lblRs_1.setFont(new Font("SansSerif", Font.PLAIN, 15));
		lblRs_1.setBounds(674, 542, 24, 20);
		panel_1.add(lblRs_1);
		
		JButton btnGenerateBill_1 = new JButton("Generate Bill ");
		btnGenerateBill_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmBilling.dispose();
				Generate_IN_P_Bill window = new Generate_IN_P_Bill();
				window.frmReceptionBill.setVisible(true);
			}
		});
		btnGenerateBill_1.setFont(new Font("SansSerif", Font.PLAIN, 16));
		btnGenerateBill_1.setBounds(462, 588, 187, 42);
		panel_1.add(btnGenerateBill_1);
		
		JButton btnLogout = new JButton("LogOut");
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				frmBilling.dispose();
				frontwindow window = new frontwindow();
				window.frmWelcome.setVisible(true);
			}
		});
		btnLogout.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnLogout.setBounds(1350, 22, 117, 36);
		frmBilling.getContentPane().add(btnLogout);
		
		JButton btnHome = new JButton("HOME");
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				frmBilling.dispose();
				RecepHome window = new RecepHome();
				window.frmReceptionHome.setVisible(true);
			}
		});
		btnHome.setFont(new Font("SansSerif", Font.PLAIN, 20));
		btnHome.setBounds(46, 22, 117, 36);
		frmBilling.getContentPane().add(btnHome);
		
		dateChooser = new JDateChooser();
		dateChooser.setBounds(1077, 67, 265, 50);
		frmBilling.getContentPane().add(dateChooser);
	}
	
	private void btnTotalActionPerformed(ActionEvent evt)
	{
		try 
		{
		 float D_Charge=Float.parseFloat(textD_Charge.getText());
		 float L_Charge=Float.parseFloat(textL_Charge.getText());
		 float Others=Float.parseFloat(textOthers.getText());
		 String SUM=String.valueOf(D_Charge+L_Charge+Others);
		
		textTotal.setText(SUM);
		}
		catch(Exception e)
		{
			JOptionPane.showMessageDialog(null, e);
		}
		
	}
	private void btnSaveToDataBaseActionPerformed(ActionEvent evt)
	{
		 float D_Charge=Float.parseFloat(textD_Charge.getText());
		 float L_Charge=Float.parseFloat(textL_Charge.getText());
		 float Others=Float.parseFloat(textOthers.getText());
		 float SUM=D_Charge+L_Charge+Others;
		
		String P_id=textP_ID.getText();
		String P_name=textP_Name.getText();
		String P_type=textP_Type.getText();
		
		Date da=new Date(dateChooser.getDate().getTime());
		SimpleDateFormat ds=new SimpleDateFormat("dd-MM-yyyy");
		String date_of=ds.format(dateChooser.getDate());
		
		int Bill_no=Integer.parseInt(textB_NO.getText());
		
		try {
			Connect.getup();
			con=Connect.Connecti();
			String sql="insert into BILLING(BILL_NUMBER,P_ID,P_NAME,P_TYPE,DOCTOR_CHARGES,LAB_CHARGES,OTHER_CHARGES,TOTAL,CURRENT_DATE)values(?,?,?,?,?,?,?,?,?)";
			p=con.prepareStatement(sql);
			p.setLong(1, Bill_no);
			p.setString(2, P_id);
			p.setString(3, P_name);
			p.setString(4,P_type);
			p.setLong(5,(long)D_Charge);
			p.setLong(6,(long) L_Charge);
			p.setLong(7,(long) Others);
			p.setLong(8,(long)SUM);
			p.setString(9, date_of);
			
			p.execute();
			
			JOptionPane.showConfirmDialog(null,"Are You Sure to Save");
			JOptionPane.showMessageDialog(null,"Saved Succesfully");
			
		}
		catch(Exception e)
		{
			JOptionPane.showMessageDialog(null, e);
		}
		
		textP_Name.setText("");
		textP_ID.setText("");
		textOthers.setText("");
		textL_Charge.setText("");
		textD_Charge.setText("");
	}
	
	private void btnInTotalActionPerformed(ActionEvent evt)
	{
		try
		{
			 int InD_Charge=Integer.parseInt(textInD_charge.getText());
			 int InL_Charge=Integer.parseInt(textInL_charge.getText());
			 int InOthers=Integer.parseInt(textInO_charge.getText());
			 int InW_Charge=Integer.parseInt(textInW_charge.getText());
			
			 String INSUM=String.valueOf(InD_Charge+InL_Charge+InOthers+InW_Charge);
			 
			 
			
			 textInTotal.setText(INSUM);
		}
		catch(Exception e)
		{
			JOptionPane.showMessageDialog(null, e);
		}
	}
	
	private void btnInSaveActionPerformed(ActionEvent evt)
	{
		int InD_Charge=Integer.parseInt(textInD_charge.getText());
		int InL_Charge=Integer.parseInt(textInL_charge.getText());
		int InOthers=Integer.parseInt(textInO_charge.getText());
		int InW_Charge=Integer.parseInt(textInW_charge.getText());
		int InBill_no=Integer.parseInt(textInB_no.getText());
		int No_Of_Days=Integer.parseInt(textIn_days.getText());
		int INSUM=(InD_Charge+InL_Charge+InOthers+InW_Charge);
		String InP_id=textInP_id.getText();
		String InP_name=textInP_name.getText();
		String InP_type=textInP_type.getText();
		
		SimpleDateFormat ds=new SimpleDateFormat("dd-MM-yyyy");
		String date_of_in=ds.format(dateChooser.getDate());
		
		try
		{
			Connect.getup();
			con=Connect.Connecti();
			String sql="insert into BILLING(BILL_NUMBER,P_ID,P_NAME,P_TYPE,DOCTOR_CHARGES,LAB_CHARGES,WARD_CHARGES,NO_OF_DAYS,OTHER_CHARGES,TOTAL,CURRENT_DATE)values(?,?,?,?,?,?,?,?,?,?,?)";
			p=con.prepareStatement(sql);
			p.setLong(1, InBill_no);
			p.setString(2, InP_id);
			p.setString(3, InP_name);
			p.setString(4,InP_type);
			p.setLong(5,InD_Charge);
			p.setLong(6, InL_Charge);
			p.setLong(7, InW_Charge);
			p.setLong(8,No_Of_Days);
			p.setLong(9, InOthers);
			p.setLong(10,INSUM);
			p.setString(11, date_of_in);
			
			p.execute();
			
			JOptionPane.showConfirmDialog(null,"Are You Sure to Save");
			JOptionPane.showMessageDialog(null,"Saved Succesfully");
		}
		catch(Exception e)
		{
			JOptionPane.showMessageDialog(null, e);
		}
	}
	
	
	public void btnGenerateBillActionPerformed(ActionEvent evt)
	{
		frmBilling.dispose();
		Generate_P_Bill window = new Generate_P_Bill();
		window.frmReceptionBill.setVisible(true);
	}
}
