package aula_08_interfaces;

public class TestaAtleta {

	public static void main(String[] args) {

		Triatleta at1 = new Triatleta("Fernando");
		Triatleta at2 = new Triatleta("Wallace");
		
		at1.aquecer();
		at1.correr();
		System.out.println();
		
		at2.aquecer();
		at2.pedalar();
		at2.nadar();
		
	}

}
