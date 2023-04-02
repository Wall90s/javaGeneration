package atividade03LojaGames;

public class Produto {
	
	private int id;
	private String nome;
	private double valor;
	private int categoria;
	private String marca;
	
	public Produto(int id, String nome, double valor, int categoria, String marca) {
		this.id = id;
		this.nome = nome;
		this.valor = valor;
		this.categoria = categoria;
		this.marca = marca;
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

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public int getCategoria() {
		return categoria;
	}

	public void setCategoria(int categoria) {
		this.categoria = categoria;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public void visualizar () {
		System.out.println("\n- Dados do Produto -");
		System.out.println("ID: " + this.id);
		System.out.println("Nome: " + this.nome);
		System.out.printf("Valor: R$ %.2f", this.valor);
		System.out.println();
		System.out.println("Categoria: " + this.categoria);
		System.out.println("Marca: " + this.marca);
	}
	
}
