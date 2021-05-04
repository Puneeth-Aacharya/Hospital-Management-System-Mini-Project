import java.awt.EventQueue;
import java.sql.*;
import javax.swing.JOptionPane;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Font;
import java.awt.Color;
import java.sql.Date;
import net.proteanit.sql.DbUtils;

import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import javax.swing.JPanel;

import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JTable;
import java.awt.SystemColor;
import javax.swing.JScrollPane;
import com.toedter.calendar.JDateChooser;

/**
 * by 
 * Puneeth_Aacharya
 * 
 */
public class Discharge {
	Connection con;
	PreparedStatement p;
	ResultSet r;

	public JFrame frmDischarge;
	private JTextField txtEnterPid;
	private JTable table;
	private JDateChooser date;
	private JTextField textDP_ID;
	private JTextField textP_Name;

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
					Discharge window = new Discharge();
					window.frmDischarge.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Discharge() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmDischarge = new JFrame();
		frmDischarge.setResizable(false);
		frmDischarge.setTitle("Reception >> Home >> Discharge");	
		frmDischarge.setBounds(100, 100, 1013, 650);
		frmDischarge.setLocationRelativeTo(null);
		frmDischarge.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmDischarge.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Patient Discharge");
		lblNewLabel.setForeground(new Color(0, 0, 153));
		lblNewLabel.setFont(new Font("Verdana", Font.BOLD, 27));
		lblNewLabel.setBounds(382, 10, 272, 48);
		frmDischarge.getContentPane().add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.scrollbar);
		panel.setBounds(20, 128, 962, 121);
		frmDischarge.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblPid = new JLabel("Patient ID :");
		lblPid.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblPid.setBounds(10, 34, 122, 36);
		panel.add(lblPid);
		
		txtEnterPid = new JTextField();
		txtEnterPid.setFont(new Font("SansSerif", Font.PLAIN, 18));
		txtEnterPid.setBounds(129, 27, 199, 52);
		panel.add(txtEnterPid);
		txtEnterPid.setColumns(10);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.setBackground(new Color(153, 153, 204));
		btnSearch.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnSearch.setBounds(778, 36, 113, 43);
		panel.add(btnSearch);
		
		JLabel lblP_Name = new JLabel("Patient Name :");
		lblP_Name.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblP_Name.setBounds(352, 34, 156, 36);
		panel.add(lblP_Name);
		
		textP_Name = new JTextField();
		textP_Name.setFont(new Font("SansSerif", Font.PLAIN, 18));
		textP_Name.addMouseListener(new MouseAdapter() {
			public void  mouseClicked(MouseEvent e) {
				String P_name=txtEnterPid.getText();
				try {
					Connect.getup();
					con=Connect.Connecti();
					p=con.prepareStatement("select * from PATIENT where P_ID=?");
					p.setString(1,P_name);
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
				catch(Exception s)
				{
					JOptionPane.showMessageDialog(null,e);
				}
			}
		});
		textP_Name.setColumns(10);
		textP_Name.setText("Click here");
		textP_Name.setBounds(505, 30, 199, 52);
		panel.add(textP_Name);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(33, 287, 937, 141);
		frmDischarge.getContentPane().add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JLabel lblNewLabel_1 = new JLabel("Date Of Discharge :");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel_1.setBounds(521, 472, 207, 31);
		frmDischarge.getContentPane().add(lblNewLabel_1);
		
		JButton btnDischarge = new JButton("Discharge");
		btnDischarge.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				btnDischargeActionPerformed(evt);
			}
		});
		btnDischarge.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btnDischarge.setBounds(416, 544, 207, 48);
		frmDischarge.getContentPane().add(btnDischarge);
		
		JButton btnLogout = new JButton("LogOut");
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmDischarge.dispose();
				frontwindow window = new frontwindow();
				window.frmWelcome.setVisible(true);
			}
		});
		btnLogout.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnLogout.setBounds(870, 26, 85, 32);
		frmDischarge.getContentPane().add(btnLogout);
		
		JButton btnNewButton = new JButton("HOME");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmDischarge.dispose();
				RecepHome window = new RecepHome();
				window.frmReceptionHome.setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton.setBounds(34, 26, 85, 32);
		frmDischarge.getContentPane().add(btnNewButton);
		
		 date = new JDateChooser();
		date.setBounds(731, 458, 239, 55);
		frmDischarge.getContentPane().add(date);
		
		JLabel lblPatientId = new JLabel("Patient ID :");
		lblPatientId.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblPatientId.setBounds(47, 471, 126, 31);
		frmDischarge.getContentPane().add(lblPatientId);
		
		textDP_ID = new JTextField();
		textDP_ID.setFont(new Font("SansSerif", Font.PLAIN, 18));
		textDP_ID.setBounds(216, 458, 242, 55);
		frmDischarge.getContentPane().add(textDP_ID);
		textDP_ID.setColumns(10);
		
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				String P_id=txtEnterPid.getText();
				String p_name=textP_Name.getText();
				
				
				try{   
					Connect.getup();
					con=Connect.Connecti();
					String chk="SELECT I.P_ID,I.P_NAME,I.DATE_OF_ADMISSION,B.TOTAL FROM INPATIENT I,BILLING B WHERE I.P_ID=? AND B.P_ID=? AND I.P_NAME=? AND B.P_NAME=? ";
					
					p=con.prepareStatement(chk);
					p.setString(1,P_id);
					p.setString(2,P_id);
					p.setString(3, p_name);
					p.setString(4, p_name);
					r=p.executeQuery();
				    table.setModel(DbUtils.resultSetToTableModel(r));
				}
				catch(Exception e) 
				{
					JOptionPane.showMessageDialog(null,"error");
				}
				
				txtEnterPid.setText("");
				textP_Name.setText("");
			}
		});
	}
	private void btnDischargeActionPerformed(ActionEvent evt)
	{
		Date sqlDate =new Date(date.getDate().getTime());
		String P_ID=textDP_ID.getText();
		try
		{
			Connect.getup();
			con=Connect.Connecti();
			String sql="UPDATE INPATIENT SET DATE_OF_DISCHARGE=? WHERE P_ID=?";
			p=con.prepareStatement(sql);
			p.setDate(1, sqlDate);
			p.setString(2, P_ID);
			p.executeUpdate();
			
			String update_occupied="update wards set occupied=occupied-1 where ward_no=(select i.ward_no from inpatient i where P_ID=?)";
			p=con.prepareStatement(update_occupied);
			p.setString(1, P_ID);
			p.executeUpdate();
			
			String update_remaining="update wards set remaining=total_beds-occupied where ward_no=(select i.ward_no from inpatient i where P_ID=?)";
			p=con.prepareStatement(update_remaining);
			p.setString(1, P_ID);
			p.executeUpdate();
			
			
			textDP_ID.setText("");
			
			JOptionPane.showMessageDialog(null,"Updated Succesfully");
			JOptionPane.showMessageDialog(null,"Patient Discharged");
		}
		catch(Exception e)
		{
			JOptionPane.showMessageDialog(null,e);
		}
	}
}
