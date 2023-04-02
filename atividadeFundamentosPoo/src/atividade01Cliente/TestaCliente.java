package atividade01Cliente;

public class TestaCliente {

	public static void main(String[] args) {
		
		Cliente c1 = new Cliente("Erick Ferreira", 
												71,
												"(67) 3563-0383",
												"ericksamuelferreira@aspxsistemas.com.com.br", 
												1);
		
		Cliente c2 = new Cliente("Adriana Almada", 
												70,
												"(75) 3920-1292",
												"adrianaandreiaalmada@adiretoria.com.br", 
												2);
		
		c1.visualizar();
		c2.visualizar();

	}

}
