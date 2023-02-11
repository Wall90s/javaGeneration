package atividadeLacoRepeticao;

import java.util.Scanner;

public class Lista02_ex02 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		int idade, sexo, categoria;
		int backend = 0, frontend = 0, mobile = 0, fullstack = 0;
		String continuar = "S";

		while (!continuar.equalsIgnoreCase("n")) {
			System.out.println("Digite a Idade: ");
			idade = leia.nextInt();
			System.out.println("Digite o Sexo: ");
			sexo = leia.nextInt();
			System.out.println("Digite a Categoria: ");
			categoria = leia.nextInt();

			if (categoria == 1) {
				backend++;
			}
			if (sexo == 2 && categoria == 2) {
				frontend++;
			}
			if (sexo == 1 && categoria == 3 && idade > 40) {
				mobile++;
			}
			if (sexo == 2 && categoria == 4 && idade < 30) {
				fullstack++;
			}

			System.out.println("Deseja continuar? (S/N)");
			leia.skip("\\R?");
			continuar = leia.nextLine();
		}

		System.out.println("Total de pessoas desenvolvedoras Backend: " + backend);
		System.out.println("Total de mulheres desenvolvedoras Frontend: " + frontend);
		System.out.println("Total de homens desenvolvedores Mobile maiores de 40 anos: " + mobile);
		System.out.println("Total de mulheres desenvolvedoras FullStack menores de 30 anos: " + fullstack);

		leia.close();
	}

}
