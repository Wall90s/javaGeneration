package atividadeVetoresMatrizes;

import java.util.Scanner;

public class Exe02 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		int vetor[] = new int[10];
		int soma = 0;

		for (int indice = 0; indice < vetor.length; indice++) {
			System.out.println("Informe o valor [" + indice + "]:");
			vetor[indice] = leia.nextInt();
		}

		System.out.println("\nElementos nos índices ímpares:");
		for (int indice = 0; indice < vetor.length; indice++) {
			if (indice % 2 != 0) {
				System.out.print(vetor[indice] + " ");
			}
		}

		System.out.println("\n\nElementos pares:");
		for (int indice = 0; indice < vetor.length; indice++) {
			if (vetor[indice] % 2 == 0) {
				System.out.print(vetor[indice] + " ");
			}
			soma += vetor[indice];
		}

		System.out.println("\n\nSoma: " + soma);

		float media = (float) soma / vetor.length;
		System.out.printf("\n\nMédia: %.2f", media);

		leia.close();
	}

}
