package lista01;

import java.util.Scanner;

public class SomaSimples {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		int numero1, numero2, total = 0;

		numero1 = leia.nextInt();
		numero2 = leia.nextInt();

		total = numero1 + numero2;

		System.out.println("SOMA = " + total);

		leia.close();

	}

}
