package lista03;

import java.util.Scanner;

public class ValidacaoDeNota {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int notasValidas = 0, quantidadeNotas = 2;
		float nota, soma = 0;
		
		while (notasValidas < quantidadeNotas) {
			nota = leia.nextFloat();
			if(nota >= 0f && nota <= 10f) {
				soma += nota;
				notasValidas++;
			} else {
				System.out.println("nota invalida");
			}
		}
		
		System.out.println("media = " + (soma / quantidadeNotas));
		
		leia.close();
	}

}
