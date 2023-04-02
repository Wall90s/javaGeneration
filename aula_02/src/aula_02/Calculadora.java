package aula_02;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {

		double n1, n2;
		Scanner leia = new Scanner(System.in);
		DecimalFormat formatacao = new DecimalFormat();

		System.out.println("Digite o primeiro número: ");
		n1 = leia.nextDouble();
		System.out.println("Digite o segundo número: ");
		n2 = leia.nextDouble();

		System.out.println("O número " + n1 + " somado com " + n2 + " é igual a " + (n1 + n2));
		System.out.println("O número " + n1 + " subtraído por " + n2 + " é igual a " + (n1 - n2));
		System.out.println("O número " + n1 + " multiplicado por " + n2 + " é igual a " + (n1 * n2));
		
		if (n2 != 0)
			System.out.println("O número " + n1 + " dividido por " + n2 + " é igual a " + (n1 / n2));
		else
			System.out.println("Não é possível dividr por zero");

		System.out.println("\nO número " + n1 + " elevado a " + n2 + " é igual a " + Math.pow(n1, n2));

		System.out.println("\nA raíz quadrada do número " + n1 + " é igual a " + formatacao.format(Math.sqrt(n1)));
		leia.close();

		System.out.println("\nPré incremento: ");
		System.out.println(n2);
		System.out.println(++n2);
		System.out.println(n2);

		System.out.println("\nPós incremento: ");
		System.out.println(n1);
		System.out.println(n1++);
		System.out.println(n1);

		n1 += n2;
		System.out.println("Somando n1 com n2 e atribuindo o valor a n1 temos: " + n1);


	}

}
