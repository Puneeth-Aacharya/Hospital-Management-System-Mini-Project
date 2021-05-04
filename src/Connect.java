import java.sql.*;
import javax.swing.JOptionPane;
import java.lang.Exception;


public class Connect 
{
	private static String u;
    private static String p;
    
    public static void getup()
    {
    	u="DBMS_LAB"; //username of your oracle database
    	p="jnnce";    // password for your oracle database
    }
    public static Connection Connecti(){
        
        
        try
        {
            Class.forName("oracle.jdbc.OracleDriver");
            Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe",u,p);
            return con;
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
    
    
}
