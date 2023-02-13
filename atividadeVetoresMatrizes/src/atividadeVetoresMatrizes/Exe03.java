package atividadeVetoresMatrizes;

import java.util.Scanner;

public class Exe03 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		int matriz[][] = new int[3][3];
		int colunaPrincipal[] = new int[3];
		int colunaSecundaria[] = new int[3];
		int somaPrincipal = 0, somaSecundaria = 0;

		for (int linha = 0; linha < matriz.length; linha++) {
			for (int coluna = 0; coluna < matriz.length; coluna++) {
				System.out.println("Digite da linha [" + linha + "] coluna [" + coluna + "]:");
				matriz[linha][coluna] = leia.nextInt();
			}
		}

		for (int linha = 0; linha < matriz.length; linha++) {
			for (int coluna = 0; coluna < matriz.length; coluna++) {
				if (linha == coluna) {
					colunaPrincipal[linha] = matriz[linha][coluna];
				}
			}
		}
		System.out.println("\nElementos da Diagonal Principal:");
		for (int elemento : colunaPrincipal) {
			System.out.print(elemento + " ");
			somaPrincipal += elemento;
		}

		for (int linha = 0; linha < matriz.length; linha++) {
			for (int coluna = 0; coluna < matriz.length; coluna++) {
				if ((linha + coluna) == (matriz.length - 1)) {
					colunaSecundaria[linha] = matriz[linha][coluna];
				}
			}
		}
		System.out.println("\n\nElementos da Diagonal Secundária:");
		for (int elemento : colunaSecundaria) {
			System.out.print(elemento + " ");
			somaSecundaria += elemento;
		}

		System.out.println("\n\nSoma dos Elementos da Diagonal Principal:");
		System.out.println(somaPrincipal);

		System.out.println("\nSoma dos Elementos da Diagonal Secundária:");
		System.out.println(somaSecundaria);

		leia.close();
	}

}
