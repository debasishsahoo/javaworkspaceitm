import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Insert_Data {
	static final String DriverName = "oracle.jdbc.driver.OracleDriver";
	static final String HostName = "jdbc:oracle:thin:@localhost:1521:xe";
	static final String UserName = "system";
	static final String Password = "1234";
	static final String SqlStatement = "INSERT INTO EMP VALUES(?,?,?)";

	public static void main(String[] args) {
		try {
			Class.forName(DriverName);
			Connection con = DriverManager.getConnection(HostName, UserName, Password);
			PreparedStatement psmt = con.prepareStatement(SqlStatement);
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			while (true) {
				System.out.println("Enter Emp Id:");
				int eid = Integer.parseInt(br.readLine());

				System.out.println("Enter Emp Name:");
				String ename = br.readLine();

				System.out.println("Enter Emp Salary:");
				double esalary = Integer.parseInt(br.readLine());

				psmt.setInt(1, eid);
				psmt.setString(2, ename);
				psmt.setDouble(3, esalary);

				int count = psmt.executeUpdate();

				if (count > 0) {
					System.out.println(count + " Record Insterted..");
				} else {
					System.out.println("No Record Insterted....");
				}

				System.out.println("Do you want to Instert More record...[y/n]");
				String Ch = br.readLine();
				if (Ch.equalsIgnoreCase("n")) {
					System.out.println("Thank You for Using JDBC....");
					con.close();
					System.out.println("Connection Closed.....");
					break;
				}
					
			}
		} catch (Exception e) {
			System.out.println(e);
		}

	}
}
