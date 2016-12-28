package application.util;
import java.sql.*;

//import com.sun.rowset.CachedRowSetImpl;
public class PostgresConnection {
	//Declare JDBC Driver
	private static final String JDBC_DRIVER = "org.postgresql.Driver";
	//Connection
	private static Connection con = null;
	
	private static String dburl = "jdbc:postgresql://127.0.0.1:5432/tubebaby2";
	private static String user = "postgres";
	private static String password = "123456";
	public static Connection Connector() {
		try{
			Class.forName("org.postgresql.Driver");
			Connection conn = DriverManager.getConnection(dburl, user, password);
			return conn;
		}catch(Exception e) {
			System.out.println(e);
			return null;
		}
	}
	public static Connection Connector(String user2, String pass2) {
		try{
			Class.forName("org.postgresql.Driver");
			Connection conn = DriverManager.getConnection(dburl, user2, pass2);		
			return conn;
		}catch(Exception e) {
			System.out.println(e);
			return null;
		}
	}
	//Connect to DB
    public static void dbConnect() throws SQLException, ClassNotFoundException {
        //Setting Postgres JDBC Driver
        try {
            Class.forName(JDBC_DRIVER);
        } catch (ClassNotFoundException e) {
            System.out.println("Where is your Postgres JDBC Driver?");
            e.printStackTrace();
            throw e;
        }
 
        System.out.println("Postgres JDBC Driver Registered!");
 
        //Establish the Oracle Connection using Connection String
        try {
            con = DriverManager.getConnection(dburl, user, password);
        } catch (SQLException e) {
            System.out.println("Connection Failed! Check output console" + e);
            e.printStackTrace();
            throw e;
        }
    }
    //Close Connection
    public static void dbDisconnect() throws SQLException {
        try {
            if (con != null && !con.isClosed()) {
                con.close();
            }
        } catch (Exception e){
           throw e;
        }
    }
    /*
  //DB Execute Query Operation
    public static ResultSet dbExecuteQuery(String queryStmt) throws SQLException, ClassNotFoundException {
        //Declare statement, resultSet and CachedResultSet as null
        Statement stmt = null;
        ResultSet resultSet = null;
        CachedRowSetImpl crs = null;
        try {
            //Connect to DB (Establish Postgres Connection)
            dbConnect();
            System.out.println("Select statement: " + queryStmt + "\n");
 
            //Create statement
            stmt = con.createStatement();
 
            //Execute select (query) operation
            resultSet = stmt.executeQuery(queryStmt);
 
            //CachedRowSet Implementation
            //In order to prevent "java.sql.SQLRecoverableException: Closed Connection: next" error
            //We are using CachedRowSet
            crs = new CachedRowSetImpl();
            crs.populate(resultSet);
        } catch (SQLException e) {
            System.out.println("Problem occurred at executeQuery operation : " + e);
            throw e;
        } finally {
            if (resultSet != null) {
                //Close resultSet
                resultSet.close();
            }
            if (stmt != null) {
                //Close Statement
                stmt.close();
            }
            //Close connection
            dbDisconnect();
        }
        //Return CachedRowSet
        return crs;
    }
    */
    //DB Execute Update (For Update/Insert/Delete) Operation
    public static void dbExecuteUpdate(String sqlStmt) throws SQLException, ClassNotFoundException {
        //Declare statement as null
        Statement stmt = null;
        try {
            //Connect to DB (Establish Postgres Connection)
            dbConnect();
            //Create Statement
            stmt = con.createStatement();
            //Run executeUpdate operation with given sql statement
            stmt.executeUpdate(sqlStmt);
        } catch (SQLException e) {
            System.out.println("Problem occurred at executeUpdate operation : " + e);
            throw e;
        } finally {
            if (stmt != null) {
                //Close statement
                stmt.close();
            }
            //Close connection
            dbDisconnect();
        }
    }
}

