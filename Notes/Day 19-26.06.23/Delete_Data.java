import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Delete_Data {
	static final String DriverName = "oracle.jdbc.driver.OracleDriver";
	static final String HostName = "jdbc:oracle:thin:@localhost:1521:xe";
	static final String UserName = "system";
	static final String Password = "1234";
	

	public static void main(String[] args) {
		try {
			Class.forName(DriverName);
			Connection con = DriverManager.getConnection(HostName, UserName, Password);
			Statement smt = con.createStatement();
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			while (true) {
				System.out.println("Enter Emp Id for Delete:");
				int eid = Integer.parseInt(br.readLine());
				
				String SqlStatement = "DELETE FROM EMP WHERE Id="+eid;
				int count = smt.executeUpdate(SqlStatement);

				if (count==1) {
					System.out.println(count + " Record Deleted..");
				} else {
					System.out.println("No Record Deleted....");
				}

				System.out.println("Do you want to Delete More record...[y/n]");
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
