import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


public class Update_Data {
	static final String DriverName = "oracle.jdbc.driver.OracleDriver";
	static final String HostName = "jdbc:oracle:thin:@localhost:1521:xe";
	static final String UserName = "system";
	static final String Password = "1234";
	static final String SqlStatement = "UPDATE EMP SET salary=?"+"WHERE id=?";

	public static void main(String[] args) {
		try {
			Class.forName(DriverName);
			Connection con = DriverManager.getConnection(HostName, UserName, Password);
			PreparedStatement psmt = con.prepareStatement(SqlStatement);
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			System.out.println("Enter Emp Id(ReadOnly):");
			int eid = Integer.parseInt(br.readLine());

			System.out.println("Enter Emp new Salary:");
			double esalary = Double.parseDouble(br.readLine());

			
			psmt.setDouble(1, esalary);
			psmt.setInt(2, eid);
			
			int count = psmt.executeUpdate();

			if (count > 0) {
				System.out.println(count + " Record Updated..");
			} else {
				System.out.println("No Record Found..");
			}
			System.out.println("Thank You for Using JDBC....");
			con.close();
			System.out.println("Connection Closed.....");
			

		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
