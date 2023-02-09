package atividadeLacoCondicional;

import java.util.Scanner;

public class Lista02_ex02 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		String nome;
		int cargo;
		float novoSalario, salario;
		float reajuste = 0;

		System.out.println("Por favor informe  seu nome: ");
		leia.skip("\\R?");
		nome = leia.next();
		System.out.println("Por favor informe o cargo: ");
		cargo = leia.nextInt();
		System.out.println("Por favor informe o salário: ");
		salario = leia.nextFloat();

		System.out.println("Nome do colaborador: " + nome);

		switch (cargo) {
		case 1:
			reajuste = 10;
			System.out.println("Cargo: Gerente");
			break;
		case 2:
			reajuste = 7;
			System.out.println("Cargo: Vendedor");
			break;
		case 3:
			reajuste = 9;
			System.out.println("Cargo: Supervisor");
			break;
		case 4:
			reajuste = 6;
			System.out.println("Cargo: Motorista");
			break;
		case 5:
			reajuste = 5;
			System.out.println("Cargo: Estoquista");
			break;
		case 6:
			reajuste = 8;
			System.out.println("Cargo: Técnico de TI");
			break;
		default:
			System.out.println("Código de cargo inválido");
			break;
		}

		novoSalario = salario + (reajuste * salario);
		System.out.println("Salário: " + novoSalario);

		leia.close();
	}

}
