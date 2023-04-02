package atividadeLacoCondicional;

import java.util.Scanner;

public class Lista01_ex02 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int numero;
		
		System.out.println("Por favor informe o número: ");
		numero = leia.nextInt();
		
		if (numero % 2 == 0) {
			if (numero > -1) {
				System.out.println("O número " + numero + " é par e positivo!");
			} else if (numero == 0) {
				System.out.println("O número " + numero + " é par e neutro!");
			} else {
				System.out.println("O número " + numero + " é par e negativo!");				
			}
		} else {
			if (numero > -1) {
				System.out.println("O número " + numero + " é ímpar e positivo!");
			} else {
				System.out.println("O número " + numero + " é ímpar e negativo!");				
			}
		}
		
		leia.close();

	}

}
