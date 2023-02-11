package atividadeLacoRepeticao;

import java.util.Scanner;

public class Lista01_ex02 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		int numero, pares = 0, impares = 0;

		for (int contador = 0; contador < 10; contador++) {
			System.out.println("Digite o " + (contador + 1) + "º número: ");
			numero = leia.nextInt();

			if (numero % 2 == 0) {
				pares++;
			} else {
				impares++;
			}
		}
		
		System.out.println("Total de números pares: " + pares);
		System.out.println("Total de números ímpares: " + impares);

		leia.close();
	}

}
