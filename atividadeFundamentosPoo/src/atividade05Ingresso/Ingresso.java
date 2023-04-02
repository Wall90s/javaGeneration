package atividade05Ingresso;

public class Ingresso {

	private int id;
	private String evento;
	private String titular;
	private int categoria;
	private double preco;

	public Ingresso(int id, String evento, String titular, int categoria, double preco) {
		this.id = id;
		this.evento = evento;
		this.titular = titular;
		this.categoria = categoria;
		this.preco = preco;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEvento() {
		return evento;
	}

	public void setEvento(String evento) {
		this.evento = evento;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public int getCategoria() {
		return categoria;
	}

	public void setCategoria(int categoria) {
		this.categoria = categoria;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public void visualizar() {
		String categoria;
		switch (this.categoria) {
			case 1 -> categoria = "meia entrada";
			case 2 -> categoria = "entrada solidária";
			case 3 -> categoria = "inteira";
			default -> categoria = "categoria não registrada";
		}

		System.out.println("\n\t- Dados do Ingresso -");
		System.out.println("ID: " + this.id);
		System.out.println("Evento: " + this.evento);
		System.out.println("Titular: " + this.titular);
		System.out.println("Categoria: " + categoria);
		System.out.printf("Preço: R$ %.2f", this.preco);
		System.out.println();
	}

}
