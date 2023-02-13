package aula_04;

import java.util.Arrays;
import java.util.Scanner;

public class Vetores {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		int vetorInteiros[] = { 1, 2, 3, 4, 5 };

		for (int indice = 0; indice < vetorInteiros.length; indice++) {
			System.out.println("Posição " + indice + " = " + vetorInteiros[indice]);
		}

		float[] vetorFloat = new float[5];

		for (int indice = 0; indice < vetorFloat.length; indice++) {
			System.out.println("Digite um valor para a posição [" + indice + "]");
			vetorFloat[indice] = leia.nextFloat();
		}

		Arrays.sort(vetorFloat);

		for (float indice : vetorFloat) {
			System.out.println(indice);
		}

		leia.close();
	}

}
