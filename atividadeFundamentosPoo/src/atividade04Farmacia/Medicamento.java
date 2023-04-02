package atividade04Farmacia;

public class Medicamento extends Farmacia{
	
	private String tarja;
	private boolean receita;
	
	public Medicamento(long id, String nome, double preco, int categoria, boolean entrega, String tarja, boolean receita) {
		super(id, nome, preco, categoria, entrega);
		this.tarja = tarja;
		this.receita = receita;
	}

	public String getTarja() {
		return tarja;
	}

	public void setTarja(String tarja) {
		this.tarja = tarja;
	}

	public boolean isReceita() {
		return receita;
	}

	public void setReceita(boolean receita) {
		this.receita = receita;
	}
	
	public void visualizar() {
		String receita;
		if (this.receita) {
			receita = "sim";
		} else {
			receita = "não";
		}
		
		super.visualizar();
		System.out.println("Tarja: " + this.tarja);
		System.out.println("Receita: " + receita);
		
	}

}
