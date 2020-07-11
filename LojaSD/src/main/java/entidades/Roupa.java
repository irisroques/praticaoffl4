package entidades;

public class Roupa extends Produto{
    public Roupa(String nome, int codigo, double preco, TipoProduto tipo, String tamanho, int quantidade) {
		super(nome, codigo, preco, tipo, quantidade);
		this.tamanho = tamanho;
		// TODO Auto-generated constructor stub
	}



	String tamanho;

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

	@Override
	public String getNome() {
		// TODO Auto-generated method stub
		return super.getNome();
	}

}