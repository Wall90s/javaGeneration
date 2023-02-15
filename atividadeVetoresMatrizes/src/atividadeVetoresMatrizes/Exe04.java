package atividadeVetoresMatrizes;

import java.util.Scanner;

public class Exe04 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		float notas[][] = new float[10][4];
		float medias[] = new float[10];
		float quantidadeNotas = 4;

		for (int linha = 0; linha < notas.length; linha++) {
			for (int coluna = 0; coluna < notas[linha].length; coluna++) {
				System.out.println("Informe a " + (coluna + 1) + "ª nota do " + (linha + 1) + "º participante: ");
				notas[linha][coluna] = leia.nextFloat();
			}
		}

		float soma = 0f;
		for (int linha = 0; linha < notas.length; linha++) {
			for (int coluna = 0; coluna < notas[linha].length; coluna++) {
				soma += notas[linha][coluna];
			}
			medias[linha] = (soma / quantidadeNotas);
			soma = 0f;
		}

		System.out.println();
		for (float media : medias) {
			System.out.printf("%.1f", media);
			System.out.print(" ");
		}

		leia.close();
	}

}
