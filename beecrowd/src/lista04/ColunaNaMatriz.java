package lista04;

import java.util.Scanner;

public class ColunaNaMatriz {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		float numeros[][] = new float[12][12];
		float soma = 0;
		int indiceLinha;
		String operacao;
		
		indiceLinha = leia.nextInt();
		
		leia.skip("\\R?");
		operacao = leia.nextLine();
		
		for (int coluna = 0; coluna < numeros.length; coluna++) {
			for (int linha = 0; linha < numeros.length; linha++) {
				numeros[linha][coluna] = leia.nextFloat();
			}
		}

		for (int linha = 0; linha < numeros.length; linha++) {
			soma += numeros[linha][indiceLinha];
		}
		
		if(operacao.equalsIgnoreCase("S")) {
			System.out.println(soma);
		}
		
		if(operacao.equalsIgnoreCase("M")) {
			System.out.println(soma / numeros.length);
		}

		leia.close();

	}

}
