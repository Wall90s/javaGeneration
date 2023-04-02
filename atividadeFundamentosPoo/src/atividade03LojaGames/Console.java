package atividade03LojaGames;

public class Console extends Produto{
	
	private String regiao;
	private boolean portatil;
	
	public Console(int id, String nome, double valor, int categoria, String marca, String regiao, boolean portatil) {
		super(id, nome, valor, categoria, marca);
		this.regiao = regiao;
		this.portatil = portatil;
	}

	public String getRegiao() {
		return regiao;
	}

	public void setRegiao(String regiao) {
		this.regiao = regiao;
	}

	public boolean isPortatil() {
		return portatil;
	}

	public void setPortatil(boolean portatil) {
		this.portatil = portatil;
	}
	
	public void visualizar() {
		super.visualizar();
		System.out.println("Região: " + this.regiao);
				
		String portatil;
		if(this.portatil) {
			portatil = "sim";
		} else {
			portatil = "não";
		}
		
		System.out.println("Portátil: " + portatil);
	}

}
