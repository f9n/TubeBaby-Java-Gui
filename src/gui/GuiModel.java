package tubebaby_java_gui;
import java.sql.*;
public class GuiModel {
	Connection con;
	public boolean isDbConnected() {
		try {
			return !con.isClosed();
		} catch(Exception e) {
			e.printStackTrace();
			return false;
		}
	}
}
