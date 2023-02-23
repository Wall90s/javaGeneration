package aula_07_meiosTransporte;

public class Transporte {
	
	private int capacidade;

	public Transporte(int capacidade) {
		this.capacidade = capacidade;
	}

	public int getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}
	
	public void visualizar() {
		System.out.println("\tMeios de Transporte");
		System.out.println("Capacidade: " + this.capacidade);
	}

}
