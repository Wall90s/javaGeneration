package atividade01Cliente;

public class Cliente {
	
	private String nome;
	private int idade;
	private String telefone;
	private String email;
	private int id;
	
	public Cliente(String nome, int idade, String telefone, String email, int id) {
		this.nome = nome;
		this.idade = idade;
		this.telefone = telefone;
		this.email = email;
		this.id = id;
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

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public void visualizar() {
		System.out.println("\n- Dados do Cliente -");
		System.out.println("Nome: " + this.nome);
		System.out.println("Idade: " + this.idade + " anos");
		System.out.println("Telefone: " + this.telefone);
		System.out.println("E-mail: " + this.email);
		System.out.println("ID: " + this.id);
	}

}
