package lista04;

import java.util.Scanner;

public class LinhaNaMatriz {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		float numeros[][] = new float[12][12];
		float soma = 0;
		int indiceLinha;
		String operacao;
		
		indiceLinha = leia.nextInt();
		
		leia.skip("\\R?");
		operacao = leia.nextLine();
		
		for (int linha = 0; linha < numeros.length; linha++) {
			for (int coluna = 0; coluna < numeros.length; coluna++) {
				numeros[linha][coluna] = leia.nextFloat();
			}
		}

		for (int coluna = 0; coluna < numeros.length; coluna++) {
			soma += numeros[indiceLinha][coluna];
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
