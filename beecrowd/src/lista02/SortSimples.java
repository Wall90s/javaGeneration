package lista02;

import java.util.Scanner;

public class SortSimples {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		int num1, num2, num3;

		num1 = leia.nextInt();
		num2 = leia.nextInt();
		num3 = leia.nextInt();

		if (num1 > num2) {
			if (num1 > num3) {
				if (num2 > num3) {
					System.out.println(num3 + "\n" + num2 + "\n" + num1);
					System.out.println();
					System.out.println(num1 + "\n" + num2 + "\n" + num3);
				} else {
					System.out.println(num2 + "\n" + num3 + "\n" + num1);
					System.out.println();
					System.out.println(num1 + "\n" + num2 + "\n" + num3);
				}
			}
		}

		if (num2 > num1) {
			if (num2 > num3) {
				if (num1 > num3) {
					System.out.println(num3 + "\n" + num1 + "\n" + num2);
					System.out.println();
					System.out.println(num1 + "\n" + num2 + "\n" + num3);
				} else {
					System.out.println(num1 + "\n" + num3 + "\n" + num2);
					System.out.println();
					System.out.println(num1 + "\n" + num2 + "\n" + num3);
				}
			}
		}
		
		if (num3 > num1) {
			if (num3 > num2) {
				if (num1 > num2) {
					System.out.println(num2 + "\n" + num1 + "\n" + num3);
					System.out.println();
					System.out.println(num1 + "\n" + num2 + "\n" + num3);
				} else {
					System.out.println(num1 + "\n" + num2 + "\n" + num3);
					System.out.println();
					System.out.println(num1 + "\n" + num2 + "\n" + num3);
				}
			}
		}

		leia.close();
	}

}
