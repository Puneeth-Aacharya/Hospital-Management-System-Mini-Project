import java.awt.EventQueue;
import java.sql.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
/**
 * by 
 * Puneeth_Aacharya
 * 
 */
public class Generate_IN_P_Bill {
	Connection con;
	PreparedStatement p;
	ResultSet r;

	public JFrame frmReceptionBill;
	private JTextField textB_No;
	private JTextField textP_Name;
	private JTextField textD_Charge;
	private JTextField textL_Charge;
	private JTextField textO_Charge;
	public JTextField textP_Id;
	private JTextField textP_Type;
	private JTextField textTotal;
	private JTextField textFieldP_id;
	private JTextField textW_charge;
	private JTextField textN_days;

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
					Generate_IN_P_Bill window = new Generate_IN_P_Bill();
					window.frmReceptionBill.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Generate_IN_P_Bill() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		frmReceptionBill = new JFrame();
		frmReceptionBill.setTitle("Reception >> Bill >> Generate Bill ");
		frmReceptionBill.setBounds(100, 100, 1184, 762);
		frmReceptionBill.setLocationRelativeTo(null);
		frmReceptionBill.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmReceptionBill.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("BILL");
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setBackground(new Color(240, 240, 240));
		lblNewLabel.setFont(new Font("SansSerif", Font.BOLD, 40));
		lblNewLabel.setBounds(548, 10, 108, 62);
		frmReceptionBill.getContentPane().add(lblNewLabel);
		
		JLabel lblBillNumber = new JLabel("Bill Number :");
		lblBillNumber.setFont(new Font("Tahoma", Font.PLAIN, 27));
		lblBillNumber.setBounds(53, 111, 177, 48);
		frmReceptionBill.getContentPane().add(lblBillNumber);
		
		JLabel lblPatientId = new JLabel("Patient ID :");
		lblPatientId.setFont(new Font("Tahoma", Font.PLAIN, 27));
		lblPatientId.setBounds(656, 119, 177, 33);
		frmReceptionBill.getContentPane().add(lblPatientId);
		
		JLabel lblPatientName = new JLabel("Patient Name :");
		lblPatientName.setFont(new Font("Tahoma", Font.PLAIN, 27));
		lblPatientName.setBounds(55, 233, 191, 33);
		frmReceptionBill.getContentPane().add(lblPatientName);
		
		JLabel lblPatientType = new JLabel("Patient Type :");
		lblPatientType.setFont(new Font("Tahoma", Font.PLAIN, 27));
		lblPatientType.setBounds(656, 233, 177, 33);
		frmReceptionBill.getContentPane().add(lblPatientType);
		
		JLabel lblDoctorCharges = new JLabel("Doctor Charges :");
		lblDoctorCharges.setFont(new Font("Tahoma", Font.PLAIN, 27));
		lblDoctorCharges.setBounds(53, 326, 207, 33);
		frmReceptionBill.getContentPane().add(lblDoctorCharges);
		
		JLabel lblLabCharges = new JLabel("Lab Charges :");
		lblLabCharges.setFont(new Font("Tahoma", Font.PLAIN, 27));
		lblLabCharges.setBounds(656, 326, 167, 33);
		frmReceptionBill.getContentPane().add(lblLabCharges);
		
		JLabel lblwardCharges = new JLabel("Other Charges :");
		lblwardCharges.setFont(new Font("Tahoma", Font.PLAIN, 27));
		lblwardCharges.setBounds(53, 418, 207, 33);
		frmReceptionBill.getContentPane().add(lblwardCharges);
		
		JLabel lblTotal = new JLabel("TOTAL ");
		lblTotal.setFont(new Font("Tahoma", Font.BOLD, 27));
		lblTotal.setBounds(683, 527, 108, 55);
		frmReceptionBill.getContentPane().add(lblTotal);
		
		textB_No = new JTextField();
		textB_No.setEditable(false);
		textB_No.setFont(new Font("Tahoma", Font.BOLD, 20));
		textB_No.setBounds(262, 119, 208, 48);
		frmReceptionBill.getContentPane().add(textB_No);
		textB_No.setColumns(10);
		
		textP_Name = new JTextField();
		textP_Name.setEditable(false);
		textP_Name.setFont(new Font("Tahoma", Font.BOLD, 20));
		textP_Name.setColumns(10);
		textP_Name.setBounds(262, 218, 208, 48);
		frmReceptionBill.getContentPane().add(textP_Name);
		
		textD_Charge = new JTextField();
		textD_Charge.setEditable(false);
		textD_Charge.setFont(new Font("Tahoma", Font.BOLD, 20));
		textD_Charge.setColumns(10);
		textD_Charge.setBounds(262, 324, 202, 48);
		frmReceptionBill.getContentPane().add(textD_Charge);
		
		textL_Charge = new JTextField();
		textL_Charge.setEditable(false);
		textL_Charge.setFont(new Font("Tahoma", Font.BOLD, 20));
		textL_Charge.setColumns(10);
		textL_Charge.setBounds(883, 322, 185, 48);
		frmReceptionBill.getContentPane().add(textL_Charge);
		
		textO_Charge = new JTextField();
		textO_Charge.setEditable(false);
		textO_Charge.setFont(new Font("Tahoma", Font.BOLD, 20));
		textO_Charge.setColumns(10);
		textO_Charge.setBounds(262, 418, 202, 48);
		frmReceptionBill.getContentPane().add(textO_Charge);
		
		textP_Id = new JTextField();
		textP_Id.setEditable(false);
		textP_Id.setFont(new Font("Tahoma", Font.BOLD, 20));
		textP_Id.setColumns(10);
		textP_Id.setBounds(883, 115, 185, 48);
		frmReceptionBill.getContentPane().add(textP_Id);
		
		textP_Type = new JTextField();
		textP_Type.setEditable(false);
		textP_Type.setFont(new Font("Tahoma", Font.BOLD, 20));
		textP_Type.setColumns(10);
		textP_Type.setBounds(883, 229, 185, 48);
		frmReceptionBill.getContentPane().add(textP_Type);
		
		textTotal = new JTextField();
		textTotal.setEditable(false);
		textTotal.setFont(new Font("Tahoma", Font.BOLD, 20));
		textTotal.setColumns(10);
		textTotal.setBounds(846, 527, 222, 62);
		frmReceptionBill.getContentPane().add(textTotal);
		
		JLabel lblRs = new JLabel("Rs.");
		lblRs.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblRs.setBounds(1078, 530, 45, 29);
		frmReceptionBill.getContentPane().add(lblRs);
		
		JLabel lblRs_1 = new JLabel("Rs.");
		lblRs_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblRs_1.setBounds(474, 343, 45, 29);
		frmReceptionBill.getContentPane().add(lblRs_1);
		
		JLabel lblRs_2 = new JLabel("Rs.");
		lblRs_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblRs_2.setBounds(1078, 343, 45, 29);
		frmReceptionBill.getContentPane().add(lblRs_2);
		
		JLabel lblRs_3 = new JLabel("Rs.");
		lblRs_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblRs_3.setBounds(474, 437, 45, 29);
		frmReceptionBill.getContentPane().add(lblRs_3);
		
		JLabel lblEneterPatientId = new JLabel("Eneter Patient ID:");
		lblEneterPatientId.setFont(new Font("Tahoma", Font.PLAIN, 27));
		lblEneterPatientId.setBounds(202, 642, 222, 33);
		frmReceptionBill.getContentPane().add(lblEneterPatientId);
		
		textFieldP_id = new JTextField();
		textFieldP_id.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textFieldP_id.setColumns(10);
		textFieldP_id.setBounds(452, 638, 185, 48);
		frmReceptionBill.getContentPane().add(textFieldP_id);
		
		JButton btnGenerate = new JButton("Generate");
		btnGenerate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnGenerateActionPerformed(e);
			}
		});
		btnGenerate.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnGenerate.setBounds(765, 645, 167, 33);
		frmReceptionBill.getContentPane().add(btnGenerate);
		
		JLabel lblWardCharges = new JLabel("Ward Charges :");
		lblWardCharges.setFont(new Font("Tahoma", Font.PLAIN, 27));
		lblWardCharges.setBounds(656, 418, 207, 33);
		frmReceptionBill.getContentPane().add(lblWardCharges);
		
		textW_charge = new JTextField();
		textW_charge.setFont(new Font("Tahoma", Font.BOLD, 20));
		textW_charge.setEditable(false);
		textW_charge.setColumns(10);
		textW_charge.setBounds(883, 414, 185, 48);
		frmReceptionBill.getContentPane().add(textW_charge);
		
		JLabel lblRs_2_1 = new JLabel("Rs.");
		lblRs_2_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblRs_2_1.setBounds(1078, 435, 45, 29);
		frmReceptionBill.getContentPane().add(lblRs_2_1);
		
		JLabel lblNoofDays = new JLabel("No_of Days :");
		lblNoofDays.setFont(new Font("Tahoma", Font.PLAIN, 27));
		lblNoofDays.setBounds(53, 504, 207, 33);
		frmReceptionBill.getContentPane().add(lblNoofDays);
		
		textN_days = new JTextField();
		textN_days.setFont(new Font("Tahoma", Font.BOLD, 20));
		textN_days.setEditable(false);
		textN_days.setColumns(10);
		textN_days.setBounds(262, 511, 202, 48);
		frmReceptionBill.getContentPane().add(textN_days);
		
		JButton btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmReceptionBill.dispose();
				Billing window = new Billing();
				window.frmBilling.setVisible(true);
			}
		});
		btnBack.setFont(new Font("SansSerif", Font.PLAIN, 20));
		btnBack.setBounds(53, 37, 122, 35);
		frmReceptionBill.getContentPane().add(btnBack);

	}
	private void btnGenerateActionPerformed(ActionEvent ev)
	{
		try
		{
			
			Connect.getup();
			con=Connect.Connecti();
			String p_ID=textFieldP_id.getText();
			
			String query="select *from IN_PATIENT_BILL_GENERAE where P_ID=? and P_TYPE='INPATIENT'";
			p=con.prepareStatement(query);
			p.setString(1, p_ID);
			r=p.executeQuery();
			if(r.next())
			{
				String bill_no=r.getString("BILL_NUMBER");
				String p_id=r.getString("P_ID");
				String p_name=r.getString("P_NAME");
				String p_type=r.getString("P_TYPE");
				String d_charge=r.getString("DOCTOR_CHARGES");
				String l_charge=r.getString("LAB_CHARGES");
				String w_charge=r.getString("WARD_CHARGES");
				String N_days=r.getString("NO_OF_DAYS");
				String o_charge=r.getString("OTHER_CHARGES");
				String total=r.getString("TOTAL");
				
				textB_No.setText(bill_no);
				textP_Id.setText(p_id);
				textP_Name.setText(p_name);
				textP_Type.setText(p_type);
				textD_Charge.setText(d_charge);
				textL_Charge.setText(l_charge);
				textO_Charge.setText(o_charge);
				textW_charge.setText(w_charge);
				textN_days.setText(N_days);
				textTotal.setText(total);
			}
			else
			{
				JOptionPane.showMessageDialog(null,"ERROR","Patient not found", JOptionPane.ERROR_MESSAGE);
			}
		}
		catch(Exception evt)
		{
			JOptionPane.showMessageDialog(null, evt);
		}
	}
}
