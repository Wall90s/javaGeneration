package lista02;

import java.text.DecimalFormat;
import java.util.Scanner;

public class AumentoDeSalario {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		float salario, novoSalario, ganho, reajuste = 0f;

		DecimalFormat monetario = new DecimalFormat(".00");
		DecimalFormat percentual = new DecimalFormat("");

		salario = leia.nextFloat();

		if (salario >= 0 && salario <= 400) {
			reajuste = 15f;
		} else if (salario >= 400.01 && salario <= 800) {
			reajuste = 12f;
		} else if (salario >= 800.01 && salario <= 1200) {
			reajuste = 10f;
		} else if (salario >= 1200.01 && salario <= 2000) {
			reajuste = 7f;
		} else if (salario > 2000) {
			reajuste = 4f;
		} else {
			System.out.println("Valor do salário inválido");
		}

		if (salario >= 0) {
			novoSalario = salario + ((reajuste / 100) * salario);
			ganho = novoSalario - salario;

			System.out.println("Novo salário: " + monetario.format(novoSalario));
			System.out.println("Reajuste ganho: " + monetario.format(ganho));
			System.out.println("Em percentual: " + percentual.format(reajuste) + " %");
		}

		leia.close();

	}

}
