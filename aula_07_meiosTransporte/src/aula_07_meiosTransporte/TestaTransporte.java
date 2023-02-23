package aula_07_meiosTransporte;

public class TestaTransporte {

	public static void main(String[] args) {
		
		Transporte t1 = new Transporte(5);
		
		Terrestre tr1 = new Terrestre(5, 4, 200);
		
		Automovel a1 = new Automovel(5, 4, 200, "Vermelho", 4, "xyz-3050", 5);
		
		t1.visualizar();
		System.out.println();
		
		tr1.visualizar();
		System.out.println();

		a1.visualizar();
		System.out.println();
		
		a1.mensagem();
		a1.mensagem("Acabou o Carnaval!");
	}

}
