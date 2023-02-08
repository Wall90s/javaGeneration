package aula_01;

import java.text.DecimalFormat;
import java.util.Scanner;


public class Variaveis {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(Scanner.in);
		
		int numero = 10;
		String nome = "Wallace Brito";
		double decimal = 734.67164137182;
		DecimalFormat formatacao = new DecimalFormat ("##/##/##");
		
		System.out.println("O participante se chama: " + nome);
		System.out.println("O número é: " + numero);
		System.out.printf("O número decimal é: %.2f", decimal);
		System.out.println("O número decimal formato: " + formatacao.format(decimal));

	}

}