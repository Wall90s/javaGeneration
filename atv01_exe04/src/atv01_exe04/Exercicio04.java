package atv01_exe04;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		int n1, n2, n3, n4;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Informe o primeiro número: ");
		n1 = leia.nextInt();
		System.out.println("Informe o segundo número: ");
		n2 = leia.nextInt();
		System.out.println("Informe o terceiro número: ");
		n3 = leia.nextInt();
		System.out.println("Informe o quarto número: ");
		n4 = leia.nextInt();
		
		System.out.println("O valor do cálculo é : " + ((n1 * n2) - (n3 * n4)));

	}

}
