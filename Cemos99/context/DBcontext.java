package context;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBcontext {
	
	
	public Connection getConnection() throws Exception{
		String url = "jdbc:sqlserver://"+ serverName + ":" + postNumber + "\\" + instance + ";databaseName="+ dbName;
		if( instance == null || instance.trim().isEmpty())
			url = "jdbc:sqlserver://"+ serverName +":"+ postNumber + ";databaseName = " + dbName;
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		return DriverManager.getConnection(url, userID,password);
		
	}
	
	private final String serverName ="localhost";
	private final String dbName ="BookStore";
	private final String postNumber ="1433";
	private final String instance ="";
	private final String userID ="sa";
	private final String password ="duongdu123";


	public static void main(String[] args) {
		try {
			System.out.println(new DBcontext().getConnection());
		} catch (Exception e) {
			
		}
	}

}
