package aula_07_meiosTransporte;

public class Terrestre extends Transporte {

	private int numeroRodas;
	private float velocidade;

	public Terrestre(int capacidade, int numeroRodas, float velocidade) {
		super(capacidade);
		this.numeroRodas = numeroRodas;
		this.velocidade = velocidade;
	}

	public int getNumeroRodas() {
		return numeroRodas;
	}

	public void setNumeroRodas(int numeroRodas) {
		this.numeroRodas = numeroRodas;
	}

	public float getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(float velocidade) {
		this.velocidade = velocidade;
	}
	
	public void visualizar() {
		super.visualizar();
		System.out.println("Número de Rodas: " + this.numeroRodas);
		System.out.printf("Velocidade: %.2f", this.velocidade, "km/h\n");
	}
	
}
