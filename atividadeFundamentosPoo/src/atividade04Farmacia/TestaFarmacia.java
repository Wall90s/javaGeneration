package atividade04Farmacia;

public class TestaFarmacia {

	public static void main(String[] args) {
		
		/*Farmacia p1 = new Farmacia(1, 
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
		p2.visualizar();*/
		
		Medicamento m1 = new Medicamento(3,
										"Levotiroxina Sódica 25mcg 30 Comprimidos", 
										9.86,
										1,
										false,
										"Vermelha",
										true);
		
		Medicamento m2 = new Medicamento(4,
										"Neo Loratadin Loratadina 10mg 12 comprimidos", 
										7.90,
										1,
										true,
										"MIP",
										false);
		
		m1.visualizar();
		m2.visualizar();
	}

}
