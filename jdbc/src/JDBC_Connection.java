import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBC_Connection {
	static final String DriverName="oracle.jdbc.driver.OracleDriver";
	static final String HostName="jdbc:oracle:thin:@localhost:1521:xe";
	static final String UserName="system";
	static final String Password="1234";
	

	static final String TableStatement="CREATE TABLE Emp("
			+ "id NUMBER,"
			+ "fullname VARCHAR2(32),"
			+ "salary NUMBER)";
	
	static final String SuccessMsg="Table Created Successfully....";
	

	public static void main(String[] args) {
		try {
			Class.forName(DriverName);
			Connection con=DriverManager.getConnection(HostName,UserName,Password);
			Statement smt=con.createStatement();
		 
			smt.executeUpdate(TableStatement);
			System.out.println(SuccessMsg);
			con.close();
		}
		catch(Exception e) {
			System.out.println(e);
			
		}
		

	}

}
