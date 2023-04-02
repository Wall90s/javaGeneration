package atividadeLacoRepeticao;

import java.util.Scanner;

public class Lista03_ex01 {

	public static void main(String[] args) {

		int numero, soma = 0;
		Scanner leia = new Scanner(System.in);

		do {
			System.out.println("Por favor informe um número: ");
			numero = leia.nextInt();

			if (numero > 0)
				soma = soma + numero;

		} while (numero != 0);

		System.out.println("A soma dos números positivos é: " + soma);

		leia.close();
	}

}
