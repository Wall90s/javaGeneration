package aula_05;

import java.util.ArrayList;
import java.util.Scanner;

public class Lista {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		ArrayList<Double> notas = new ArrayList<Double>();
		int opcao = 0;
		double nota;

		/*
		 * notas.add(9.0); notas.add(15.0); notas.add(3.7);
		 */

		do {
			System.out.println("1 - Cadastrar nota");
			System.out.println("2 - Listar todas as notas");
			System.out.println("3 - Buscar uma nota");
			System.out.println("4 - Remover uma nota");
			System.out.println("5 - Atualizar uma nota");
			System.out.println("6 - Encerrar programa");
			System.out.println("Digite a opção desejada:");

			opcao = leia.nextInt();

			switch (opcao) {
			case 1:
				System.out.println("Digite uma nota entre 1 e 10:");
				nota = leia.nextDouble();
				notas.add(nota);
				break;
			case 2:
				if (notas.isEmpty()) {
					System.out.println("Lista de notas vazia");
				} else {
					System.out.println("Todas as notas armazenadas:");
					notas.forEach(System.out::println);					
				}
				/*
				 * Forma de imprimir utilizando Laço For 
				 * 		for (Double listaNota : notas) {
				 * 		System.out.println(listaNota); 
				 * 		}
				 */
				break;
			case 3:
				System.out.println("Informe a nota a ser pesquisada: ");
				nota = leia.nextDouble();
				System.out.println("A nota " + nota + " existe? " + notas.contains(nota));
				if (notas.contains(nota) == true) {
					System.out.println("O indíce da minha nota é: " + notas.indexOf(nota));
				}
				break;
			case 4:
				System.out.println("Informe a nota para ser removida: ");
				nota = leia.nextDouble();
				notas.remove(nota); // Para procurar pelo elemento
				// notas.remove(notas.indexOf(notas)); Para procurar pelo indice
				System.out.println("Nota " + nota + " removida com sucesso!");
				break;
			case 5:
				System.out.println("Digite a nota atual:");
				nota = leia.nextDouble();
				System.out.println("Digite a nova nota:");
				Double novaNota = leia.nextDouble();
				notas.set(notas.indexOf(nota), novaNota);
				System.out.println("Nota " + nota + " atualizada para " + novaNota + " com sucesso!");
				break;
			case 6:
				System.out.println("\n| Programa encerrado |");
				break;
			default:
				System.out.println("Opção inválida!");
				break;
			}

		} while (opcao != 6);

		leia.close();
	}

}
