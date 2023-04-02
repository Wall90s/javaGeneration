package aula_03;

import java.util.Scanner;

public class tabuada {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		int numero;
		String resposta;
		boolean continuar = true;

		do {
			System.out.println("Por favor informe a tabuada que deseja calcular: ");
			numero = leia.nextInt();
			
			do {
				if (numero < 1 || numero > 10) {
					System.out.println("Por favor informe um número entre 1 e 10");
					numero = leia.nextInt();
				} else {
					continuar = false;
					for (int base = 0; base < 11; base++) {
						System.out.println(numero + " x " + base + " = " + (numero * base));
					}
				}
				
			} while (continuar == true);

			System.out.println("Quer calcular outra tabuada? (S/N)");
			leia.skip("\\R?");
			resposta = leia.nextLine();

		} while (resposta.equalsIgnoreCase("S"));

		leia.close();
	}

}
