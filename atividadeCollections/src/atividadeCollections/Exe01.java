package atividadeCollections;

import java.util.ArrayList;
import java.util.Scanner;

public class Exe01 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		ArrayList<String> cores = new ArrayList<String>();
		int quantidade = 5;

		for (int contador = 0; contador < quantidade; contador++) {
			System.out.println("Digite uma cor:");
			leia.skip("\\R?");
			cores.add(leia.nextLine());
		}

		System.out.println("Listar todas as cores:");
		cores.forEach(System.out::println);
		
		System.out.println("\nOrdenar as cores:");
		cores.sort(null);
		cores.forEach(System.out::println);

		leia.close();

	}

}
