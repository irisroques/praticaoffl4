package servidor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import util.ConectorBD;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//conexão com o banco de dados
        try {
            Class.forName("org.postgresql.Driver");
        }
        catch (java.lang.ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
        
        try {
			ConectorBD.getConexao();
			System.out.println("conexão bem sucedida");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				   
		   //fim da conexão do banco de dados
		   
		   
		  
	}

}
