package cliente;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.List;
import java.util.Scanner;

import dao.RoupaDAO;
import entidades.Produto;
import entidades.Roupa;
import entidades.TipoProduto;

public class Cliente {
	/*
	 * lembrar de falar com chico da ração e da patinha de arduina
	 * */
	
	private Cliente() {}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o endereço do servidor");
		String host = sc.nextLine();
		
		try {
			Registry registro = LocateRegistry.getRegistry(host, 10001);
			RoupaDAO<Roupa> stub = ((RoupaDAO<Roupa>) registro.lookup("RoupaDAO"));
			
			System.out.println(" Lojinha Sistemas Distribuidos \n Digite 0 para sair");
			
			System.out.println(" 1) Adicionar Produto \n 2) Deletar Produto \n 3) Listar Produtos ");
			System.out.println(" 4) Pesquisar por nome \n 5) Pesquisar por codigo");
			
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
						//new Roupa("blusinha", 222, 43.23, TipoProduto.ROUPA, "M" , 3)
						stub.adicionar(r);
						break;
					case "2": 
						int codigo = sc.nextInt();
						stub.remove(codigo);
						break;
					case "3": 
						List<Roupa> lista = stub.listarTudo();
						break;
					case "4": break;
					case "5": 
						int codigo5 = sc.nextInt();
						
						String nome = stub.listarAlimento(codigo5);
						System.out.println(nome);
						break;
					case "0": break;
					default: System.out.println("Digite uma opcao valida"); break; 
				}
			
			
			
			
			//roupadao.adicionar(roupa);
			
			sc.close();
		} catch(Exception e) {
			System.err.println("Client exception: "+ e.toString());
			e.printStackTrace();
		}
	}

}
