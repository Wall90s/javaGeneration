package atividadeVariaveisOperadores;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		float salario, abono, novoSalario;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o valor do salário: ");
		salario = leia.nextFloat();
		System.out.println("Digite o valor do abono: ");
		abono = leia.nextFloat();
		
		novoSalario = salario + abono;
		
		System.out.println("O novo valor do salário é: " + novoSalario);
		
		leia.close();
	}

}
