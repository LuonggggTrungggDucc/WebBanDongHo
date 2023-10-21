package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connectDB {
	public connectDB(){
		super();
	}
	public static Connection getConnect(){
		Connection connection = null;
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			connection=DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=QLbandongho;user=sa;password=sa;useUnicode=true;characterEncoding=UTF-8");
			System.out.println("Ket noi thanh cong!");
		} catch (SQLException | ClassNotFoundException e) {
			System.out.println("Ket noi that bai!"+e.getMessage());
		}
		return connection;
	}
	public static void main(String[] args) {
		System.out.println(getConnect());
	}
}