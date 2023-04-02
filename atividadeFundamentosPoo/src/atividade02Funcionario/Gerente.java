package atividade02Funcionario;

public class Gerente extends Funcionario{
	
	private int quantidadeEquipes;

	public Gerente(String nome, int idade, String email, String telefone, int categoria, double salario, int quantidadeEquipes) {
		super(nome, idade, email, telefone, categoria, salario);
		this.quantidadeEquipes = quantidadeEquipes;
	}

	public int getQuantidadeEquipes() {
		return quantidadeEquipes;
	}

	public void setQuantidadeEquipes(int quantidadeEquipes) {
		this.quantidadeEquipes = quantidadeEquipes;
	}
	
	public void visualizar() {
		super.visualizar();
		System.out.println("Quantidade de Equipes: " + this.quantidadeEquipes);
	}

}
