package atividadeLacoCondicional;

import java.util.Scanner;

public class Lista01_ex03 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		String nome;
		int idade;
		boolean primeiraVez;
		
		System.out.println("Por favor informe seu nome: ");
		leia.skip("\\R?");
		nome = leia.next();
		System.out.println("Por favor informe sua idade: ");
		idade = leia.nextInt();
		System.out.println("Por favor informe se é sua primeira doação: ");
		primeiraVez = leia.nextBoolean();
		
		if (idade >= 60 && idade >= 69) {
			System.out.println("Por favor informe sua idade: ");
		}
		
		leia.close();

	}

}
