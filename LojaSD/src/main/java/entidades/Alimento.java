package entidades;

import java.util.Date;

public class Alimento extends Produto{
	
    public Alimento(String nome, int codigo, double preco, TipoProduto tipo, Date validade, int quantidade) {
		super(nome, codigo, preco, tipo, quantidade);
		// TODO Auto-generated constructor stub
		this.validade = validade;
	}

	Date validade;

	public Date getValidade() {
		return validade;
	}

	public void setValidade(Date validade) {
		this.validade = validade;
	}
}