package aula_04;

import java.util.Scanner;

public class Matrizes {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		int matrizInteiros[][] = { { 10, 15, 35 }, { 70, 120, 140 }, { 50, 100, 150 } };

		for (int linha = 0; linha < matrizInteiros.length; linha++) {
			for (int coluna = 0; coluna < matrizInteiros.length; coluna++) {
				System.out.println(matrizInteiros[linha][coluna]);
			}
		}

		float matrizFloat[][] = new float[2][2];

		for (int linha = 0; linha < matrizFloat.length; linha++) {
			for (int coluna = 0; coluna < matrizFloat.length; coluna++) {
				System.out.println("Digite um valor real: ");
				matrizFloat[linha][coluna] = leia.nextFloat();
			}
		}

		for (float[] vetor : matrizFloat) {
			for (var elemento : vetor) {
				System.out.println(elemento);
			}
		}

		leia.close();
	}
}
