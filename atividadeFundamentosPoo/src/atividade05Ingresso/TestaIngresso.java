package atividade05Ingresso;

public class TestaIngresso {

	public static void main(String[] args) {
		
		Ingresso ingres1 = new Ingresso(4019, 
														"Primavera Sound - São Paulo", 
														"Manuel Arthur Tiago Mendes", 
														1, 
														700.00);
		
		Ingresso ingres2 = new Ingresso(2228, 
														"Primavera Sound - São Paulo", 
														"Carolina Fabiana Assis", 
														3, 
														1400.00);
		
		ingres1.visualizar();
		ingres2.visualizar();
		
	}

}
