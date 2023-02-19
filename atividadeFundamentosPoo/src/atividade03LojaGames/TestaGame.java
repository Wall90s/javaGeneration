package atividade03LojaGames;

public class TestaGame {

	public static void main(String[] args) {
		
		Produto p1 = new Produto(1, 
												"Animal Crossing™: New Horizons", 
												299.00, 
												1, 
												"Nintendo");

		Produto p2 = new Produto(2, 
												"Estátua do personagem Kirby do jogo de Nintendo", 
												113.05, 
												4, 
												"Nintendo");
		
		p1.visualizar();
		p2.visualizar();
		
	}

}
