package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConectorBD {
	

	 static String url = "jdbc:postgresql://hansken.db.elephantsql.com:5432/lnukqknr";
	 static String user = "lnukqknr";
	 static String password = "JhpISOBwY-dMXnSId6e6Ct7ae6b_2bms";
	 static Connection con;

	public static Connection getConexao() throws SQLException {
		try {
			Class.forName("org.postgresql.Driver");
			if(con == null){
				con = (Connection) DriverManager.getConnection(url, user, password);
			}
			return con;
		}catch(ClassNotFoundException e) {
			throw new SQLException(e.getMessage());
		}
	}

			
}