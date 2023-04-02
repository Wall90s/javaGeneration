package aula_05;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {

		Queue<String> fila = new LinkedList<String>();

		fila.add("Rafael Queiróz");
		fila.add("Rony");
		fila.add("Rafael Gouvea");
		fila.add("Danilo");
		fila.add("Lucas");

		System.out.println("Elementos da fila: ");
		Iterator<String> interadorFila = fila.iterator();
		while (interadorFila.hasNext()) {
			System.out.println(interadorFila.next());
		}

		System.out.println("\nRetirar o primeiro elemento da fila: ");
		System.out.println(fila.poll());

		System.out.println("\nElementos da fila atualizado: ");
		
		for (String elemento : fila) {
			System.out.println(elemento);
		}

	}

}
