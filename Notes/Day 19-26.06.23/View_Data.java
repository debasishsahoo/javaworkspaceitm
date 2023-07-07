import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class View_Data {
	static final String DriverName = "oracle.jdbc.driver.OracleDriver";
	static final String HostName = "jdbc:oracle:thin:@localhost:1521:xe";
	static final String UserName = "system";
	static final String Password = "1234";
	static final String SqlStatement = "SELECT * FROM EMP";

	public static void main(String[] args) {
		try {
			Class.forName(DriverName);
			Connection con = DriverManager.getConnection(HostName, UserName, Password);
			Statement smt = con.createStatement();

			ResultSet rs = smt.executeQuery(SqlStatement);

			while (rs.next()) {
				int eid = rs.getInt(1);
				String ename = rs.getString(2);
				double esal = rs.getDouble(3);
				System.out.println("Emp Id: " + eid);
				System.out.println("Emp Name: " + ename);
				System.out.println("Emp Salary: " + esal);
				System.out.println("\n");
			}
			System.out.println("Thank You for Using JDBC....");
			con.close();
			System.out.println("Connection Closed.....");

		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
