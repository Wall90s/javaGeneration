package atividade03LojaGames;

public class Jogo extends Produto{
	
	private String genero;
	private String tipoMidia;
	
	public Jogo(int id, String nome, double valor, int categoria, String marca, String genero, String tipoMidia) {
		super(id, nome, valor, categoria, marca);
		this.genero = genero;
		this.tipoMidia = tipoMidia;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getTipoMidia() {
		return tipoMidia;
	}

	public void setTipoMidia(String tipoMidia) {
		this.tipoMidia = tipoMidia;
	}
	
	public void visualizar() {
		super.visualizar();
		System.out.println("Gênero: " + this.genero);
		System.out.println("Tipo de Mídia: " + this.tipoMidia);
	}

}
