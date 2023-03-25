package myconnection;

import java.sql.Connection;
import java.sql.DriverManager;

public class conProvider {
	static Connection con = null;

	private conProvider() {

	}

	public static Connection getConnection() {

		if (con == null) {
			try {
				// Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
				Class.forName(DbConnectionData.DATABASE_Driver);
				con = DriverManager.getConnection(DbConnectionData.DATABASE_URL, DbConnectionData.DATABASE_UserName,
						DbConnectionData.DATABASE_Password);
				System.out.println("Connected");
			} catch (Exception e) {
				System.out.println("oops");
				e.printStackTrace();
			}
		}
		return con;

	}
}
