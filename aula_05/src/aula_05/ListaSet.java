package aula_05;

import java.util.HashSet;
import java.util.Set;

public class ListaSet {

	public static void main(String[] args) {

		Set<Double> notas = new HashSet<Double>();

		notas.add(5.3);
		notas.add(5.0);
		notas.add(4.0);
		notas.add(6.0);
		notas.add(5.0);
		notas.add(20.0);
		
		System.out.println("Listando todas as notas:");
		notas.forEach(System.out::println);

		System.out.println("\nRemovendo uma nota:");
		notas.remove(20.0);
		notas.forEach(System.out::println);
		
		System.out.println("\nA nota 4 existe: " + notas.contains(4.0));
		
		System.out.println("\nHash codes gerados: ");
		for (var nota : notas) {
			System.out.println(notas.hashCode());
		}
		
	}

}
