package lista04;

import java.util.Scanner;

public class PreenchimentoDeVetor2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int numeros[] = new int[1000], numero;
		
		numero = leia.nextInt();
		
		int contador = 0;
		for (int indice = 0; indice < numeros.length; indice++) {
			if (contador < numero) {
				numeros[indice] = contador;
				contador++;
			} else {
				contador = 1;
				numeros[indice] = 0;
			}
		}
		
		for (int indice = 0; indice < numeros.length; indice++) {
			System.out.println("N[" + indice +"] = " + numeros[indice]);
		}
		
		leia.close();
	}

}
