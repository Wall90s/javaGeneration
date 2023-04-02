package atividadeLacoCondicional;

import java.util.Scanner;

public class Lista02_ex04 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		int operacao;
		float saldo = 1000f, transacao;

		System.out.println("Informe a operação: ");
		operacao = leia.nextInt();

		switch (operacao) {
		case 1:
			System.out.println("Operação - Saldo");
			System.out.printf("Saldo: R$ %.2f", saldo);
			break;
		case 2:
			System.out.println("Informe o valor do Saque: ");
			transacao = leia.nextFloat();

			if (transacao > saldo) {
				System.out.println("\nOperação - Saque");
				System.out.println("Saldo insuficiente!");
			} else if (transacao < 0) {
				System.out.println("\nOperação - Saque");
				System.out.println("Transação inválida!");
			} else {
				System.out.println("\nOperação - Saque");
				System.out.printf("Novo Saldo: R$ %.2f", (saldo - transacao));
			}
			break;
		case 3:
			System.out.println("Informe o valor do Saque: ");
			transacao = leia.nextFloat();

			if (transacao < 0) {
				System.out.println("\nOperação - Saque");
				System.out.println("Transação inválida!");
			} else {
				System.out.println("\nOperação - Depósito");
				System.out.printf("Novo Saldo: R$ %.2f", (saldo + transacao));
			}
			break;
		default:
			System.out.println("Operação Inválida!");
			break;
		}

		leia.close();
	}

}
