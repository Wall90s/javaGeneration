package aula_01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Variaveis {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		DecimalFormat formatacao = new DecimalFormat ("###.###");
			
		int numero = 10;
		String nome = "Wallace Brito";
		double decimal = 734.67164137182;
		
		System.out.println("Digite um nome: ");
		leia.skip("\\R?"); //Remove o paragrafo para salvar na variavel 
		nome = leia.nextLine();
		
		System.out.println("O participante se chama: " + nome);
		System.out.println("O número é: " + numero);
		System.out.printf("O número decimal é: %.2f", decimal); 
		System.out.println("O número decimal formato: " + formatacao.format(decimal));
		
		leia.close();
	}

}