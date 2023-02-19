package atividade04Farmacia;

public class TestaFarmacia {

	public static void main(String[] args) {
		
		Farmacia p1 = new Farmacia(1, 
													"Analgésico Dorflex Sanofi 50 Comprimidos", 
													21.99, 
													1, 
													true);
		
		Farmacia p2 = new Farmacia(2, 
													"Neosaldina Dip 1g 10 Comprimidos", 
													11.99, 
													1, 
													true);
		
		p1.visualizar();
		p2.visualizar();

	}

}
