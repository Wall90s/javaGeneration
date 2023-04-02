package atividadeLacoRepeticao;

import java.util.Scanner;

public class Lista02_ex01 {

	public static void main(String[] args) {

		int idade = 0, menores21 = 0, maiores50 = 0;
		Scanner leia = new Scanner(System.in);

		while (idade >= 0) {
			System.out.println("Informe a idade: ");
			idade = leia.nextInt();

			if (idade < 21 && idade >= 0) {
				menores21++;
			}
			if (idade > 50 && idade >= 0) {
				maiores50++;
			}

			System.out.println("Total de pessoas menores de 21 anos: " + menores21);
			System.out.println("Total de pessoas maiores de 50 anos: " + maiores50);
		}

		leia.close();
	}

}
