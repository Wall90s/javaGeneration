package atividade04Farmacia;

public class Farmacia {

	private int id;
	private String nome;
	private double preco;
	private int categoria;
	private boolean entrega;

	public Farmacia(int id, String nome, double preco, int categoria, boolean receita) {
		this.id = id;
		this.nome = nome;
		this.preco = preco;
		this.categoria = categoria;
		this.entrega = receita;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getCategoria() {
		return categoria;
	}

	public void setCategoria(int categoria) {
		this.categoria = categoria;
	}

	public boolean isReceita() {
		return entrega;
	}

	public void setReceita(boolean receita) {
		this.entrega = receita;
	}

	public void visualizar() {
		String entrega;
		if (this.entrega) {
			entrega = "sim";
		} else {
			entrega = "não";
		}

		System.out.println("\n\t - Informações do Produto -");
		System.out.println("ID: " + this.id);
		System.out.println("Nome: " + this.nome);
		System.out.printf("Preço: R$ %.2f", this.preco);
		System.out.println();
		System.out.println("Categoria: " + this.categoria);
		System.out.println("Disponível para entrega: " + entrega);
	}

}
