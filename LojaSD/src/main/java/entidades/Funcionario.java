package entidades;

public class Funcionario {
	double matricula, salario;
	String cpf, nome, cargo;
	String login, senha;
	public double getMatricula() {
		return matricula;
	}
	public void setMatricula(double matricula) {
		this.matricula = matricula;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public Funcionario(double matricula, double salario, String cpf, String nome, String cargo, String login,
			String senha) {
		super();
		this.matricula = matricula;
		this.salario = salario;
		this.cpf = cpf;
		this.nome = nome;
		this.cargo = cargo;
		this.login = login;
		this.senha = senha;
	}
	
	

}
