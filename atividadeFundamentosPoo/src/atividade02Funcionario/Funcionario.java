package atividade02Funcionario;

public class Funcionario {

	private String nome;
	private int idade;
	private String email;
	private String telefone;
	private int categoria;
	private double salario;

	public Funcionario(String nome, int idade, String email, String telefone, int categoria, double salario) {
		this.nome = nome;
		this.idade = idade;
		this.email = email;
		this.telefone = telefone;
		this.categoria = categoria;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public int getCategoria() {
		return categoria;
	}

	public void setCategoria(int categoria) {
		this.categoria = categoria;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public void visualizar() {
		System.out.println("\n - Dados do Funcionário -");
		System.out.println("Nome: " + this.nome);
		System.out.println("Idade: " + this.idade + " anos");
		System.out.println("E-mail: " + this.email);
		System.out.println("Telefone: " + this.telefone);
		System.out.println("Categoria: " + this.categoria);
		System.out.printf("Salário: R$ %.2f", this.salario);
		System.out.println();
	}

}
