package atividadeCollections;

import java.util.ArrayList;
import java.util.Scanner;

public class Exe02 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int numero;
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		
		numeros.add(2);
		numeros.add(5);
		numeros.add(1);
		numeros.add(3);
		numeros.add(4);
		numeros.add(9);
		numeros.add(7);
		numeros.add(8);
		numeros.add(10);
		numeros.add(6);
		
		System.out.println("Digite o número que você deseja encontar:");
		numero = leia.nextInt();
		
		if (numeros.contains(numero)) {
			System.out.println("O número " + numero + " está localizado na posição: " + numeros.indexOf(numero));
		} else {
			System.out.println("O número " + numero + " não foi encontrado!");			
		}
		
		leia.close();
	}

}
