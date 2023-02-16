package atividadeCollections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Exe03 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		Set<Integer> numeros = new HashSet<Integer>();
		int quantidade = 10;
		
		for (int contador = 0; contador < quantidade; contador++) {
			System.out.println("Digite um número:");
			leia.skip("\\R?");
			numeros.add(leia.nextInt());
		}
		
		Iterator<Integer> iteradorFila = numeros.iterator();
		
		while (iteradorFila.hasNext()) {
			System.out.println(iteradorFila.next());
		}
		
		leia.close();
	}

}
