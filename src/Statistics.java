import java.awt.EventQueue;
import java.sql.*;
import java.text.SimpleDateFormat;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;

import java.awt.Component;

import javax.swing.JButton;

import javax.swing.UIManager;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

import org.eclipse.wb.swing.FocusTraversalOnArray;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import com.toedter.calendar.JDateChooser;

//import net.proteanit.sql.DbUtils;



//import javax.swing.JTable;
//import javax.swing.JScrollPane;


//import com.toedter.calendar.JMonthChooser;
import javax.swing.JTextField;
import java.awt.Color;


/**
 * by 
 * Puneeth_Aacharya
 * 
 */
public class Statistics {
	Connection con;
	PreparedStatement p;
	ResultSet r;

	public JFrame frmStat;
	
	private JDateChooser DoADate;
	private JDateChooser DoADate1;
	private JTextField textField;
	private JTextField textouttotal;
	private JTextField textintotal;
	private JTextField textsum;
	private JTextField textField_1;
	

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
					Statistics window = new Statistics();
					window.frmStat.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Statistics() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmStat = new JFrame();
		frmStat.setTitle("Admin >> Statistics ");
		frmStat.setBounds(100, 100, 1542, 760);
		frmStat.setLocationRelativeTo(null);
		frmStat.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmStat.getContentPane().setLayout(null);
		
		
		
		JButton btnHome = new JButton("HOME");
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmStat.dispose();
				AdminHome window = new AdminHome();
				window.frmAdminHome.setVisible(true);
			}
		});
		btnHome.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnHome.setBounds(98, 33, 112, 33);
		frmStat.getContentPane().add(btnHome);
		
		JButton btnLogout = new JButton("LogOut");
		btnLogout.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnLogout.setBounds(1302, 19, 96, 33);
		frmStat.getContentPane().add(btnLogout);
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmStat.dispose();
				frontwindow window = new frontwindow();
				window.frmWelcome.setVisible(true);
				
			}
		});

		JLabel lblDateOfAdmission = new JLabel("FROM  Date :");
		lblDateOfAdmission.setFont(new Font("Tahoma", Font.PLAIN, 27));
		lblDateOfAdmission.setBounds(296, 138, 166, 58);
		frmStat.getContentPane().add(lblDateOfAdmission);
			
		DoADate = new JDateChooser();
		DoADate.setBounds(501, 138, 239, 58);
		frmStat.getContentPane().add(DoADate);
		DoADate.setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{DoADate.getCalendarButton()}));
		
		JButton btnSEARCH = new JButton("SEARCH");
		btnSEARCH.setFont(new Font("SansSerif", Font.PLAIN, 20));
		btnSEARCH.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnSEARCHActionPerformed(e);
			}
		});
		btnSEARCH.setBounds(714, 250, 148, 45);
		frmStat.getContentPane().add(btnSEARCH);
		
		JLabel lblDateOfAdmission_1 = new JLabel("TO  Date :");
		lblDateOfAdmission_1.setFont(new Font("Tahoma", Font.PLAIN, 27));
		lblDateOfAdmission_1.setBounds(802, 141, 154, 53);
		frmStat.getContentPane().add(lblDateOfAdmission_1);
		
		DoADate1= new JDateChooser();
		DoADate1.setBounds(953, 138, 239, 58);
		frmStat.getContentPane().add(DoADate1);
		DoADate1.setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{DoADate1.getCalendarButton()}));
		
		JLabel lblTotalNumberOf = new JLabel("TOTAL NUMBER OF OUT PATIENTS :");
		lblTotalNumberOf.setFont(new Font("SansSerif", Font.BOLD, 24));
		lblTotalNumberOf.setBounds(22, 354, 430, 58);
		frmStat.getContentPane().add(lblTotalNumberOf);
		
		textField = new JTextField();
		textField.setFont(new Font("SansSerif", Font.PLAIN, 40));
		textField.setEditable(false);
		textField.setBounds(464, 348, 274, 58);
		frmStat.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblTotalAmount = new JLabel("TOTAL  AMOUNT (OUTPATIENT) :");
		lblTotalAmount.setFont(new Font("SansSerif", Font.BOLD, 24));
		lblTotalAmount.setBounds(22, 473, 393, 61);
		frmStat.getContentPane().add(lblTotalAmount);
		
		textouttotal = new JTextField();
		textouttotal.setFont(new Font("SansSerif", Font.PLAIN, 40));
		textouttotal.setEditable(false);
		textouttotal.setColumns(10);
		textouttotal.setBounds(464, 468, 274, 58);
		frmStat.getContentPane().add(textouttotal);
		
		JLabel lblRs = new JLabel("Rs.");
		lblRs.setFont(new Font("Dialog", Font.PLAIN, 20));
		lblRs.setBounds(1498, 482, 30, 45);
		frmStat.getContentPane().add(lblRs);
		
		JLabel lblTotalAmountinpatient = new JLabel("TOTAL  AMOUNT (INPATIENT) :");
		lblTotalAmountinpatient.setFont(new Font("SansSerif", Font.BOLD, 24));
		lblTotalAmountinpatient.setBounds(802, 478, 358, 51);
		frmStat.getContentPane().add(lblTotalAmountinpatient);
		
		textintotal = new JTextField();
		textintotal.setFont(new Font("SansSerif", Font.PLAIN, 40));
		textintotal.setEditable(false);
		textintotal.setColumns(10);
		textintotal.setBounds(1212, 468, 274, 58);
		frmStat.getContentPane().add(textintotal);
		
		JLabel lblRs_1 = new JLabel("Rs.");
		lblRs_1.setFont(new Font("Dialog", Font.PLAIN, 20));
		lblRs_1.setBounds(737, 488, 30, 33);
		frmStat.getContentPane().add(lblRs_1);
		
		JLabel lblStatistics = new JLabel("STATISTICS");
		lblStatistics.setForeground(Color.BLUE);
		lblStatistics.setFont(new Font("SansSerif", Font.BOLD, 40));
		lblStatistics.setBounds(673, 19, 249, 45);
		frmStat.getContentPane().add(lblStatistics);
		
		JLabel lblSum = new JLabel("SUM    :");
		lblSum.setFont(new Font("SansSerif", Font.BOLD, 30));
		lblSum.setBounds(550, 630, 123, 51);
		frmStat.getContentPane().add(lblSum);
		
		textsum = new JTextField();
		textsum.setFont(new Font("SansSerif", Font.PLAIN, 40));
		textsum.setEditable(false);
		textsum.setColumns(10);
		textsum.setBounds(698, 614, 274, 77);
		frmStat.getContentPane().add(textsum);
		
		JLabel lblRs_2 = new JLabel("Rs.");
		lblRs_2.setFont(new Font("Dialog", Font.PLAIN, 20));
		lblRs_2.setBounds(984, 646, 46, 45);
		frmStat.getContentPane().add(lblRs_2);
		
		JLabel lblTotalNumberOf_1 = new JLabel("TOTAL NUMBER OF IN PATIENTS :");
		lblTotalNumberOf_1.setFont(new Font("SansSerif", Font.BOLD, 24));
		lblTotalNumberOf_1.setBounds(802, 354, 398, 58);
		frmStat.getContentPane().add(lblTotalNumberOf_1);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("SansSerif", Font.PLAIN, 40));
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBounds(1212, 348, 274, 58);
		frmStat.getContentPane().add(textField_1);
		
		
		
	}	
		
	private void btnSEARCHActionPerformed(ActionEvent evt)
	{
		
		SimpleDateFormat at=new SimpleDateFormat("dd-MM-yyyy");
		String from_date=at.format(DoADate.getDate());
		
		
		String to_date=at.format(DoADate1.getDate());
		
		//Date DoA =new Date(DoADate.getDate().getTime());
		//System.out.println(from_date);
		
		//Date DoADate=new Date(DoADate1.getDate().getTime());
		//System.out.println(to_date);
		try
		{
			Connect.getup();
			con=Connect.Connecti();
			
			String sql="select count(APPOINTMENT_DATE) from patient where APPOINTMENT_DATE between ?  and ?";
			p=con.prepareStatement(sql);
			p.setString(1, from_date);
			p.setString(2, to_date);
			r=p.executeQuery();
			
			if(r.next())
			{
				String total_patient=r.getString("count(APPOINTMENT_DATE)");
				textField.setText(total_patient);
			}
			
			
			
			String sql_4="select count(DATE_OF_ADMISSION) from inpatient where DATE_OF_ADMISSION between ?  and ?";
			p=con.prepareStatement(sql_4);
			p.setString(1, from_date);
			p.setString(2, to_date);
			r=p.executeQuery();
			
			if(r.next())
			{
				String total_inpatient=r.getString("count(DATE_OF_ADMISSION)");
				textField_1.setText(total_inpatient);
			}
			
			
			String sql_1="select SUM(TOTAL) from BILLING B where B.CURRENT_DATE between ? and ? and B.P_TYPE='OUTPATIENT'";
			p=con.prepareStatement(sql_1);
			p.setString(1, from_date);
			p.setString(2, to_date);
			r=p.executeQuery();
			
			if(r.next())
			{
				String total_amount_1=r.getString("SUM(TOTAL)");
				textouttotal.setText(total_amount_1);
			}
			
			
			String sql_2="select SUM(TOTAL) from BILLING B where B.P_TYPE='INPATIENT' and B.CURRENT_DATE between ? and ?";
			p=con.prepareStatement(sql_2);
			p.setString(1, from_date);
			p.setString(2, to_date);
			r=p.executeQuery();
			
			if(r.next())
			{
				String total_amount_2=r.getString("SUM(TOTAL)");
				textintotal.setText(total_amount_2);
			}
			
			
			String sql_3="select SUM(TOTAL) from BILLING B where B.CURRENT_DATE between ? and ?";
			p=con.prepareStatement(sql_3);
			p.setString(1, from_date);
			p.setString(2, to_date);
			r=p.executeQuery();
			
			if(r.next())
			{
				String total_amount_3=r.getString("SUM(TOTAL)");
				textsum.setText(total_amount_3);
			}
			
			
			
	    }
		catch(Exception e)
		{
			JOptionPane.showMessageDialog(null,e,"ERROR", JOptionPane.ERROR_MESSAGE);
		}
	
   }
}
