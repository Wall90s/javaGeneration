package lista03;

import java.util.Scanner;

public class QuadradoDePares {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int n = 0;

		n = leia.nextInt();

		for (int contador = 1; contador <= n; contador++) {
			if (contador % 2 == 0) {
				System.out.println(contador + "^2 = " + contador * contador);
			}
		}

		leia.close();

	}

}
