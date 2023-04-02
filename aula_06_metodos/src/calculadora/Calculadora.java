package calculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		double numero1, numero2;
		int opcao;
		Calculos calc = new Calculos();

		do {
			System.out.println("1 - Soma");
			System.out.println("2 - Subtração");
			System.out.println("3 - Multiplicação");
			System.out.println("4 - Divisão");
			System.out.println("0 - Sair");
			System.out.println("Digite o número da operação: ");
			opcao = leia.nextInt();

			if (opcao == 0) {
				System.out.println("| encerrando programa |");
				leia.close();
				System.exit(0);
			}

			System.out.println("Digite o primeiro número:");
			numero1 = leia.nextDouble();
			System.out.println("Digite o segundo número:");
			numero2 = leia.nextDouble();

			switch (opcao) {
			case 1 -> System.out.println("Soma = " + calc.soma(numero1, numero2));
			case 2 -> System.out.println("Subtração = " + calc.subtracao(numero1, numero2));
			case 3 -> System.out.println("Multiplicação = " + calc.multiplicacao(numero1, numero2));
			case 4 -> System.out.println("Divisão = " + calc.divisao(numero1, numero2));
			default -> System.out.println("Soma = " + calc.soma(numero1, numero2));
			}

		} while (true);

	}

}
