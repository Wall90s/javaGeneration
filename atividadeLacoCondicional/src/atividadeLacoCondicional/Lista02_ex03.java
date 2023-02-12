package atividadeLacoCondicional;

import java.util.Scanner;

public class Lista02_ex03 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		float numero1, numero2, total;
		int operacao;
		boolean entradaInvalida;

		do {
			entradaInvalida = false;
			
			System.out.println("Digite o 1º número: ");
			numero1 = leia.nextFloat();
			System.out.println("Digite o 2º número: ");
			numero2 = leia.nextFloat();
			System.out.println("Informe a operação: ");
			operacao = leia.nextInt();

			switch (operacao) {
			case 1:
				total = numero1 + numero2;
				System.out.println(numero1 + " + " + numero2 + " = " + total);
				break;
			case 2:
				total = numero1 - numero2;
				System.out.println(numero1 + " - " + numero2 + " = " + total);
				break;
			case 3:
				total = numero1 * numero2;
				System.out.println(numero1 + " * " + numero2 + " = " + total);
				break;
			case 4:
				if (numero2 == 0) {
					entradaInvalida = true;
					System.out.println("Não é possível dividir por zero\n");
				} else {
					total = numero1 / numero2;
					System.out.println(numero1 + " / " + numero2 + " = " + total);
				}
				break;
			default:
				entradaInvalida = true;
				System.out.println("Operação inválida!\n");
				break;
			}

		} while (entradaInvalida == true);

		leia.close();
	}

}
