package atividade04Farmacia;

public class Perfumaria extends Farmacia {

	private String cor;

	public Perfumaria(long id, String nome, double preco, int categoria, boolean entrega, String cor) {
		super(id, nome, preco, categoria, entrega);
		this.cor = cor;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public void visualizar() {
		super.visualizar();
		System.out.println("Cor: " + this.cor);
	}

}
