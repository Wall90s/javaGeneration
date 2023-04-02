package aula_02;

import java.util.Scanner;

public class PlanoSaude_V2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int faixa;

		System.out.println("Digite a faixa etária do paciente: ");
		faixa = leia.nextInt();
		
		switch (faixa) {
		case 1:
			System.out.println("O valor do plano é R$100,00");
			break;
		case 2:
			System.out.println("O valor do plano é R$200,00");			
			break;
		case 3:
			System.out.println("O valor do plano é R$300,00");
			break;
		case 4:
			System.out.println("O valor do plano é R$500,00");
			break;
		case 5:
			System.out.println("O valor do plano é R$600,00");
			break;
		case 6:
			System.out.println("O valor do plano é R$1000,00");
			break;
		default:
			System.out.println("Faixa etária inválida");
			break;
		}
		
		leia.close();
	}

}
