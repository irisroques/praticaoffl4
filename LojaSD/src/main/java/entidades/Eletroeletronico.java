package entidades;

public class Eletroeletronico extends Produto{
    public Eletroeletronico(String nome, int codigo, double preco, TipoProduto tipo, String marca) {
		super(nome, codigo, preco, tipo);
		// TODO Auto-generated constructor stub
		this.marca = marca;
	}

	String marca;

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
}