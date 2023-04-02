package atividadeLacoRepeticao;

import java.util.Scanner;

public class Lista03_ex02 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		int numero;
		float soma = 0, entradas = 0;

		do {
			System.out.println("Digite um número: ");
			numero = leia.nextInt();

			if (numero % 3 == 0 && numero != 0) {
				soma = numero + soma;
				entradas++;
			}
		} while (numero != 0);

		System.out.println("A média de todos os números múltiplos de 3 é: " + (soma / entradas));

		leia.close();
	}

}
