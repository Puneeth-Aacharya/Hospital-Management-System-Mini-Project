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
public class Generate_P_Bill {
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
					Generate_P_Bill window = new Generate_P_Bill();
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
	public Generate_P_Bill() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		frmReceptionBill = new JFrame();
		frmReceptionBill.setTitle("Reception >> Bill >> Generate Bill ");
		frmReceptionBill.setBounds(100, 100, 962, 751);
		frmReceptionBill.setLocationRelativeTo(null);
		frmReceptionBill.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmReceptionBill.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("BILL");
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setBackground(new Color(240, 240, 240));
		lblNewLabel.setFont(new Font("SansSerif", Font.BOLD, 40));
		lblNewLabel.setBounds(380, 10, 108, 62);
		frmReceptionBill.getContentPane().add(lblNewLabel);
		
		JLabel lblBillNumber = new JLabel("Bill Number :");
		lblBillNumber.setFont(new Font("Tahoma", Font.PLAIN, 27));
		lblBillNumber.setBounds(53, 150, 177, 48);
		frmReceptionBill.getContentPane().add(lblBillNumber);
		
		JLabel lblPatientId = new JLabel("Patient ID :");
		lblPatientId.setFont(new Font("Tahoma", Font.PLAIN, 27));
		lblPatientId.setBounds(529, 158, 177, 33);
		frmReceptionBill.getContentPane().add(lblPatientId);
		
		JLabel lblPatientName = new JLabel("Patient Name :");
		lblPatientName.setFont(new Font("Tahoma", Font.PLAIN, 27));
		lblPatientName.setBounds(53, 254, 191, 33);
		frmReceptionBill.getContentPane().add(lblPatientName);
		
		JLabel lblPatientType = new JLabel("Patient Type :");
		lblPatientType.setFont(new Font("Tahoma", Font.PLAIN, 27));
		lblPatientType.setBounds(529, 254, 177, 33);
		frmReceptionBill.getContentPane().add(lblPatientType);
		
		JLabel lblDoctorCharges = new JLabel("Doctor Charges :");
		lblDoctorCharges.setFont(new Font("Tahoma", Font.PLAIN, 27));
		lblDoctorCharges.setBounds(53, 354, 207, 33);
		frmReceptionBill.getContentPane().add(lblDoctorCharges);
		
		JLabel lblLabCharges = new JLabel("Lab Charges :");
		lblLabCharges.setFont(new Font("Tahoma", Font.PLAIN, 27));
		lblLabCharges.setBounds(539, 354, 167, 33);
		frmReceptionBill.getContentPane().add(lblLabCharges);
		
		JLabel lblOtherCharges = new JLabel("Other Charges :");
		lblOtherCharges.setFont(new Font("Tahoma", Font.PLAIN, 27));
		lblOtherCharges.setBounds(53, 452, 207, 33);
		frmReceptionBill.getContentPane().add(lblOtherCharges);
		
		JLabel lblTotal = new JLabel("TOTAL ");
		lblTotal.setFont(new Font("Tahoma", Font.BOLD, 27));
		lblTotal.setBounds(507, 505, 108, 55);
		frmReceptionBill.getContentPane().add(lblTotal);
		
		textB_No = new JTextField();
		textB_No.setEditable(false);
		textB_No.setFont(new Font("Tahoma", Font.BOLD, 20));
		textB_No.setBounds(262, 154, 208, 48);
		frmReceptionBill.getContentPane().add(textB_No);
		textB_No.setColumns(10);
		
		textP_Name = new JTextField();
		textP_Name.setEditable(false);
		textP_Name.setFont(new Font("Tahoma", Font.BOLD, 20));
		textP_Name.setColumns(10);
		textP_Name.setBounds(262, 250, 208, 48);
		frmReceptionBill.getContentPane().add(textP_Name);
		
		textD_Charge = new JTextField();
		textD_Charge.setEditable(false);
		textD_Charge.setFont(new Font("Tahoma", Font.BOLD, 20));
		textD_Charge.setColumns(10);
		textD_Charge.setBounds(268, 350, 202, 48);
		frmReceptionBill.getContentPane().add(textD_Charge);
		
		textL_Charge = new JTextField();
		textL_Charge.setEditable(false);
		textL_Charge.setFont(new Font("Tahoma", Font.BOLD, 20));
		textL_Charge.setColumns(10);
		textL_Charge.setBounds(710, 350, 185, 48);
		frmReceptionBill.getContentPane().add(textL_Charge);
		
		textO_Charge = new JTextField();
		textO_Charge.setEditable(false);
		textO_Charge.setFont(new Font("Tahoma", Font.BOLD, 20));
		textO_Charge.setColumns(10);
		textO_Charge.setBounds(268, 448, 202, 48);
		frmReceptionBill.getContentPane().add(textO_Charge);
		
		textP_Id = new JTextField();
		textP_Id.setEditable(false);
		textP_Id.setFont(new Font("Tahoma", Font.BOLD, 20));
		textP_Id.setColumns(10);
		textP_Id.setBounds(710, 150, 185, 48);
		frmReceptionBill.getContentPane().add(textP_Id);
		
		textP_Type = new JTextField();
		textP_Type.setEditable(false);
		textP_Type.setFont(new Font("Tahoma", Font.BOLD, 20));
		textP_Type.setColumns(10);
		textP_Type.setBounds(710, 250, 185, 48);
		frmReceptionBill.getContentPane().add(textP_Type);
		
		textTotal = new JTextField();
		textTotal.setEditable(false);
		textTotal.setFont(new Font("Tahoma", Font.BOLD, 20));
		textTotal.setColumns(10);
		textTotal.setBounds(638, 505, 222, 62);
		frmReceptionBill.getContentPane().add(textTotal);
		
		JLabel lblRs = new JLabel("Rs.");
		lblRs.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblRs.setBounds(870, 532, 45, 29);
		frmReceptionBill.getContentPane().add(lblRs);
		
		JLabel lblRs_1 = new JLabel("Rs.");
		lblRs_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblRs_1.setBounds(474, 359, 45, 29);
		frmReceptionBill.getContentPane().add(lblRs_1);
		
		JLabel lblRs_2 = new JLabel("Rs.");
		lblRs_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblRs_2.setBounds(899, 369, 28, 29);
		frmReceptionBill.getContentPane().add(lblRs_2);
		
		JLabel lblRs_3 = new JLabel("Rs.");
		lblRs_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblRs_3.setBounds(474, 457, 45, 29);
		frmReceptionBill.getContentPane().add(lblRs_3);
		
		JLabel lblEneterPatientId = new JLabel("Eneter Patient ID:");
		lblEneterPatientId.setFont(new Font("Tahoma", Font.PLAIN, 27));
		lblEneterPatientId.setBounds(86, 639, 222, 33);
		frmReceptionBill.getContentPane().add(lblEneterPatientId);
		
		textFieldP_id = new JTextField();
		textFieldP_id.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textFieldP_id.setColumns(10);
		textFieldP_id.setBounds(334, 635, 185, 48);
		frmReceptionBill.getContentPane().add(textFieldP_id);
		
		JButton btnGenerate = new JButton("Generate");
		btnGenerate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnGenerateActionPerformed(e);
			}
		});
		btnGenerate.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnGenerate.setBounds(573, 642, 167, 33);
		frmReceptionBill.getContentPane().add(btnGenerate);
		
		JButton btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmReceptionBill.dispose();
				Billing window = new Billing();
				window.frmBilling.setVisible(true);
			}
		});
		btnBack.setFont(new Font("SansSerif", Font.PLAIN, 20));
		btnBack.setBounds(53, 37, 108, 35);
		frmReceptionBill.getContentPane().add(btnBack);

	}
	private void btnGenerateActionPerformed(ActionEvent ev)
	{
		try
		{
			
			Connect.getup();
			con=Connect.Connecti();
			String p_ID=textFieldP_id.getText();
			
			String query="select *from PATIENT_BILL_GENERAE where P_ID=? and P_TYPE='OUTPATIENT'";
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
				String o_charge=r.getString("OTHER_CHARGES");
				String total=r.getString("TOTAL");
				//String date=r.getString("CURRENT_DATE");
				
				textB_No.setText(bill_no);
				textP_Id.setText(p_id);
				textP_Name.setText(p_name);
				textP_Type.setText(p_type);
				textD_Charge.setText(d_charge);
				textL_Charge.setText(l_charge);
				textO_Charge.setText(o_charge);
				textTotal.setText(total);
				//textDate.setText(date);
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
