package lista03;

import java.util.Scanner;

public class QuadradoEAoCubo {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		int n;

		n = leia.nextInt();

		if (n > 1 && n < 1000) {
			for (int contador = 1; contador < n + 1; contador++) {
				System.out.println(contador + " " + (contador * contador) + " " + (contador * (contador * contador)));
			}
		}

		leia.close();

	}

}
