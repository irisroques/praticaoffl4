package servidor;

import java.sql.SQLException;

import dao.RoupaDAOImpl;
import entidades.Roupa;
import entidades.TipoProduto;
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
		   
		   Roupa roupa = new Roupa("roupinha", 1234, 43.23, TipoProduto.ROUPA, "M" , 3);
		   RoupaDAOImpl roupadao = new RoupaDAOImpl();
		   roupadao.adicionar(roupa);
		  
	}

}
