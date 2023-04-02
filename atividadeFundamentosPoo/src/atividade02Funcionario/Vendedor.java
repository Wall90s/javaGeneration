package atividade02Funcionario;

public class Vendedor extends Funcionario{
	
	private int quantidadeVendas;

	public Vendedor(String nome, int idade, String email, String telefone, int categoria, double salario, int quantidadeVendas) {
		super(nome, idade, email, telefone, categoria, salario);
		this.quantidadeVendas = quantidadeVendas;
	}

	public int getQuantidadeVendas() {
		return quantidadeVendas;
	}

	public void setQuantidadeVendas(int quantidadeVendas) {
		this.quantidadeVendas = quantidadeVendas;
	}
	
	public void visualizar() {
		super.visualizar();
		System.out.println("Quantidade de Vendas no mês: " + this.quantidadeVendas);
	}

}
