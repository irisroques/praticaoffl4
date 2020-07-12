package servidor;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

import dao.RoupaDAO;
import dao.RoupaDAOImpl;
import entidades.Roupa;
import entidades.TipoProduto;


public class Main {

	public static void main(String[] args) {
		
		System.setProperty("java.rmi.server.hostname", "127.0.0.1");
		
		try {
			
			RoupaDAOImpl refObjRemoto = new RoupaDAOImpl();
			RoupaDAO skeleton = (RoupaDAO) UnicastRemoteObject.exportObject(refObjRemoto,0);
			
			LocateRegistry.createRegistry(10001);
			
			Registry registro = LocateRegistry.getRegistry(10001);
			
			registro.bind("RoupaDAO", skeleton);
			
			System.err.println("servidor pronto");
			

		} catch(Exception e) {
			System.err.println("Server Exception" + e.toString());
			e.printStackTrace();
		}
		   

		  
	}

}
