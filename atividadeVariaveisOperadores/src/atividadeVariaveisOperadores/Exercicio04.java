package atividadeVariaveisOperadores;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		float n1, n2, n3, n4, resultado;
		Scanner leia = new Scanner(System.in);

		System.out.println("Informe o primeiro número: ");
		n1 = leia.nextFloat();
		System.out.println("Informe o segundo número: ");
		n2 = leia.nextFloat();
		System.out.println("Informe o terceiro número: ");
		n3 = leia.nextFloat();
		System.out.println("Informe o quarto número: ");
		n4 = leia.nextFloat();

		resultado = (n1 * n2) - (n3 * n4);

		System.out.printf("O valor do cálculo é:  %.0f", resultado);

		leia.close();
	}

}
