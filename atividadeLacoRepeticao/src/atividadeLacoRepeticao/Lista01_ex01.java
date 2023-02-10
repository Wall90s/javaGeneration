package atividadeLacoRepeticao;

import java.util.Scanner;

public class Lista01_ex01 {

	public static void main(String[] args) {

		int valor1, valor2;
		Scanner leia = new Scanner(System.in);

		System.out.println("Informe o primeiro número: ");
		valor1 = leia.nextInt();
		System.out.println("Informe o segundo número: ");
		valor2 = leia.nextInt();

		if (valor1 < valor2) {
			for (int contador = valor1; contador <= valor2; contador++) {
				if (contador % 3 == 0 && contador % 5 == 0) {
					System.out.println(contador + " é múltiplo de 3 e 5");
				}
			}
		} else {
			System.out.println("Intervalo inválido!");
		}

		leia.close();
	}

}
