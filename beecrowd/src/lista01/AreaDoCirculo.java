package lista01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class AreaDoCirculo {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		DecimalFormat formatacao = new DecimalFormat(".0000");
		double r, a;
		String resultadoString;

		r = leia.nextDouble();

		a = 3.14159 * (r * r);

		resultadoString = formatacao.format(a);

		System.out.println("A=" + resultadoString);

		leia.close();
	}

}
