package entidades;

public class Roupa extends Produto{
    public Roupa(String nome, int codigo, double preco, TipoProduto tipo, char tamanho) {
		super(nome, codigo, preco, tipo);
		this.tamanho = tamanho;
		// TODO Auto-generated constructor stub
	}

	char tamanho;

	public char getTamanho() {
		return tamanho;
	}

	public void setTamanho(char tamanho) {
		this.tamanho = tamanho;
	}

	@Override
	public String getNome() {
		// TODO Auto-generated method stub
		return super.getNome();
	}

}