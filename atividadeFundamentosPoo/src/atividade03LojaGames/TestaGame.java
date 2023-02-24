package atividade03LojaGames;

public class TestaGame {

	public static void main(String[] args) {
		
		/*Produto p1 = new Produto(1, 
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
		p2.visualizar();*/
		
		Jogo j1 = new Jogo(3,
						  "Shadow Of The Colossos",
						   180,
						   1,
						   "Sony",
						   "aventura",
						   "física");
		
		Jogo j2 = new Jogo(4,
						  "A Short Hike",
						  16.59,
						  1,
						  "adamgryu",
						  "aventura",
						  "digital");
		
		j1.visualizar();
		j2.visualizar();

		System.out.println();
		
		Console c1 = new Console(5,
								"Nintendo Wii U 32 GB Deluxe",
								1430,
								2,
								"Nintendo",
								"Japão",
								false);
		
		Console c2 = new Console(6,
								"Nintendo DS Lite",
								799,
								2,
								"Nintendo",
								"Livre",
								true);
		
		c1.visualizar();
		c2.visualizar();
		
	}

}
