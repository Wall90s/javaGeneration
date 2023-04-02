package lista01;

import java.util.Scanner;

public class Cedulas {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int n = leia.nextInt();

		int cem = n / 100;
		int subtotal = n - (cem * 100);
		int cinquenta = (subtotal / 50) % 50;
		subtotal = subtotal - (cinquenta * 50);
		int vinte = (subtotal / 20) % 20;
		subtotal = subtotal - (vinte * 20);
		int dez = (subtotal / 10) % 10;
		subtotal = subtotal - (dez * 10);
		int cinco = (subtotal / 5) % 5;
		subtotal = subtotal - (cinco * 5);
		int dois = (subtotal / 2) % 2;
		subtotal = subtotal - (dois * 2);
		int um = (subtotal / 1);

		System.out.println(n);
		System.out.println(cem + " nota(s) de R$ 100,00");
		System.out.println(cinquenta + " nota(s) de R$ 50,00");
		System.out.println(vinte + " nota(s) de R$ 20,00");
		System.out.println(dez + " nota(s) de R$ 10,00");
		System.out.println(cinco + " nota(s) de R$ 5,00");
		System.out.println(dois + " nota(s) de R$ 2,00");
		System.out.println(um + " nota(s) de R$ 1,00");

		leia.close();
	}

}
