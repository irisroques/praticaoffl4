package cliente;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import dao.RoupaDAO;
import entidades.Produto;
import entidades.Roupa;
import entidades.TipoProduto;

public class Cliente {
	
	private Cliente() {}
	
/*	synchronized Registry auth(String host, String login, String senha) {
		Registry registro = null;
		if(login == "usuario" && senha=="1234") {
			
			try {
				registro = LocateRegistry.getRegistry(host, 10001);
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}

		return registro;
	}
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o endereço do servidor");
		String host = sc.nextLine();
		
		try {
			Registry registro = LocateRegistry.getRegistry(host, 10001);
			RoupaDAO<Roupa> stub = ((RoupaDAO<Roupa>) registro.lookup("RoupaDAO"));
			
			//stub.adicionar(new Roupa("camisa", 14, 79.99, TipoProduto.ROUPA, "G",1));// ok 
			// stub.remove(14);// ok
			
			
			// stub.listarRoupa(11);			
			do {
			
			System.out.println(" Lojinha Sistemas Distribuidos \n Digite 0 para sair");
			
			System.out.println(" 1) Adicionar Produto \n 2) Deletar Produto \n 3) Listar Produtos ");
			System.out.println(" 4) Pesquisar por nome \n 5) Pesquisar por codigo \n Update Roupa");
			
			String opcao = sc.next();
			
				switch(opcao) {
	
					case "1": 
						Roupa r = new Roupa();
						System.out.println("Digite o nome do item: ");
						r.setNome(sc.next());
						System.out.println("Digite o código do item: ");
						r.setCodigo(sc.nextInt());
						System.out.println("Digite o preço do item: ");
						r.setPreco(sc.nextDouble());
						r.setTipo(TipoProduto.ROUPA);
						System.out.println("Digite o tamanho do item: ");
						r.setTamanho(sc.next());
						System.out.println("Digite a quantidade: ");
						r.setQuantidade(sc.nextInt());
						stub.adicionar(r);
						break;
					case "2": 
						int codigo = sc.nextInt();
						stub.remove(codigo);
						break;
					case "3": 
						System.out.println("A lista contém: " + stub.listarTudo().size() + " items");
						
						for(int i = 0; i < stub.listarTudo().size(); i++) {
							System.out.println(stub.listarTudo().get(i).getNome());
						}
						break;
					case "4": 
						System.out.println("Digite o nome do produto");
						String codigo4 = sc.nextLine();
						List<Roupa> lista4 = stub.listar(codigo4);
						
						for(int i = 0; i < lista4.size(); i++) {
							System.out.println(lista4.get(i).getNome() + lista4.get(i).getQuantidade());
						}
						
						
						break;
					case "5": 
						System.out.println("Digite o codigo do produto");
						int codigo5 = sc.nextInt();
						List<Roupa> lista5 = stub.listarRoupa(codigo5);
						
						for(int i = 0; i < lista5.size(); i++) {
							System.out.println(lista5.get(i).getNome() + lista5.get(i).getQuantidade());
						}
						break;
						
					case "6": 
							System.out.println("Update da roupa, digite o codigo");
							Roupa roupa6 = new Roupa();
							roupa6.setCodigo(sc.nextInt());
							System.out.println("Digite o nome, tamanho, preco e quantidade da roupa");
							roupa6.setNome(sc.nextLine());
							roupa6.setTamanho(sc.nextLine());
							roupa6.setPreco(sc.nextDouble());
							roupa6.setQuantidade(sc.nextInt());
							roupa6.setTipo(TipoProduto.ROUPA);
							
							stub.update(roupa6);
						break;
					case "0": break;
					default: System.out.println("Digite uma opcao valida"); break; 
				}
			
			}while(sc.nextInt() != 0);
			
			sc.close();
		} catch(Exception e) {
			System.err.println("Client exception: "+ e.toString());
			e.printStackTrace();
		}
		
		
	}

}
