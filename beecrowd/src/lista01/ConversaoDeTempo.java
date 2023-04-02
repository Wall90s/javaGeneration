package lista01;

import java.util.Scanner;

public class ConversaoDeTempo {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int n = leia.nextInt();

		int segs = n % 60;
		int mins = (n / 60) % 60;
		int hors = (n / 60) / 60;

		System.out.println(hors + ":" + mins + ":" + segs);

		leia.close();
	}

}
