package lista04;

import java.util.Scanner;

public class TrocaEmVetor1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int numeros[] = new int[20];

		for (int indice = 0; indice < numeros.length; indice++) {
			numeros[indice] = leia.nextInt();
		}

		int decrescente = numeros.length - 1;
		for (int indice = 0; indice < (numeros.length / 2); indice++) {
			int copia;
			copia = numeros[decrescente];
			numeros[decrescente] = numeros[indice];
			numeros[indice] = copia;
			decrescente--;
		}
		
		for (int indice = 0; indice < numeros.length; indice++) {
			System.out.println("N[" + indice +"] = " + numeros[indice]);
		}

		leia.close();
	}

}
