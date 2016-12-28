package application.model;

import java.sql.Connection;
import java.sql.SQLException;

import application.util.PostgresConnection;


public class IndexModel {
	Connection con;
	public IndexModel() {
		con = PostgresConnection.Connector();
		if(con == null) {
			System.out.println("Connection Not successful!");
			System.exit(1);
		}
	}
	public IndexModel(String user, String pass) {
		con = PostgresConnection.Connector(user, pass);
		if(con == null) {
			System.out.println("Connection Not successful!");
			System.exit(1);
		}
	}
	public boolean isDbConnected() {
		try {
			return !con.isClosed();
		}catch(SQLException e) {
			e.printStackTrace();
			return false;
		}
	}
	public boolean executeQuery(String query) {
		try {
			PostgresConnection.dbExecuteUpdate(query);
			return true;
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}
}
