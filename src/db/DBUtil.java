package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.omg.PortableInterceptor.AdapterManagerIdHelper;

public class DBUtil {
	private static Connection conn=null;
	
	static{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:7333/student","root","123");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public static  Connection getConnection(){
		return conn;
	}
	
	
	public static void main(String[] args) throws SQLException {
		Statement statement =conn.createStatement();
		ResultSet rs = statement.executeQuery("select name,age from students");
		
		while(rs.next()){
			System.out.println(rs.getString("name")+","+rs.getInt("age"));
		}

	}
	

}
