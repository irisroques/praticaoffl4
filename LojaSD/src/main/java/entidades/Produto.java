package entidades;

public abstract class Produto{
  private  String nome;
  private  int codigo;
  private  double preco;
  private  TipoProduto tipo;
  private int quantidade;
    
	public Produto(String nome, int codigo, double preco, TipoProduto tipo, int quantidade) {
		this.nome = nome;
		this.codigo = codigo;
		this.preco = preco;
		this.tipo = tipo;
		this.quantidade = quantidade;
	}
	


	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public String getTipo() {
		return tipo.toString();
	}
	public void setTipo(TipoProduto tipo) {
		this.tipo = tipo;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
    
    

    /* generate getters and setters*/
}