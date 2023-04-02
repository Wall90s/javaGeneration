package lista02;

import java.util.Scanner;

public class TiposDeTriangulo {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		float num1, num2, num3;

		num1 = leia.nextFloat();
		num2 = leia.nextFloat();
		num3 = leia.nextFloat();

		float a = 0, b = 0, c = 0;

		if (num1 >= num2) {
			if (num1 >= num3) {
				if (num2 >= num3) {
					a = num1;
					b = num2;
					c = num3;
				} else {
					a = num1;
					b = num3;
					c = num2;
				}
			}
		}

		if (num2 >= num1) {
			if (num2 >= num3) {
				if (num1 >= num3) {
					a = num2;
					b = num1;
					c = num3;
				} else {
					a = num2;
					b = num3;
					c = num1;
				}
			}
		}

		if (num3 >= num1) {
			if (num3 >= num2) {
				if (num1 >= num2) {
					a = num3;
					b = num1;
					c = num2;
				} else {
					a = num3;
					b = num2;
					c = num1;
				}
			}
		}

		if (a >= (b + c)) {
			System.out.println("NAO FORMA TRIANGULO");
		} else if ((a * a) > ((b * b) + (c * c))) {
			System.out.println("TRIANGULO OBTUSANGULO");
		} else if ((a * a) == ((b * b) + (c * c))) {
			System.out.println("TRIANGULO RETANGULO");
		} else if ((a * a) < ((b * b) + (c * c))) {
			System.out.println("TRIANGULO ACUTANGULO");
		}
		if (a == b && a == c && b == c) {
			System.out.println("TRIANGULO EQUILATERO");
		} else if (a == b || a == c || b == c) {
			System.out.println("TRIANGULO ISOSCELES");
		}

		leia.close();

	}

}
