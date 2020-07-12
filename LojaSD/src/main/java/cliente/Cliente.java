package cliente;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

import dao.RoupaDAO;
import entidades.Roupa;
import entidades.TipoProduto;

public class Cliente {
	
	private Cliente() {}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o endereço do servidor");
		String host = sc.nextLine();
		
		try {
			Registry registro = LocateRegistry.getRegistry(host, 10001);
			RoupaDAO<Roupa> stub = ((RoupaDAO<Roupa>) registro.lookup("RoupaDAO"));
			
			//Roupa roupa = ;
			
			stub.adicionar(new Roupa("roupinha", 10, 43.23, TipoProduto.ROUPA, "M" , 3));
			
			//roupadao.adicionar(roupa);
			
			sc.close();
		} catch(Exception e) {
			System.err.println("Client exception: "+ e.toString());
			e.printStackTrace();
		}
	}

}
