package tubebaby_java_gui;
import java.sql.*;
public class PostgresConnection {
	public static Connection Connector() {
		try{
			String dburl = "jdbc:postgresql://127.0.0.1:5432/tubebaby";
			String user = "postgres";
			String password = "123456";
			Class.forName("org.postgresql.Driver");
			Connection con = DriverManager.getConnection(dburl, user, password);
			return con;
		} catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
