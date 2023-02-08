package atv01_exe02;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		float nota1, nota2, nota3, nota4;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Informe a primeira nota: ");
		nota1 = leia.nextFloat();
		System.out.println("Informe a segunda nota: ");
		nota2 = leia.nextFloat();
		System.out.println("Informe a terceira nota: ");
		nota3 = leia.nextFloat();
		System.out.println("Informe a quarta nota: ");
		nota4 = leia.nextFloat();
		
		System.out.println("A média do participante é : " + (nota1 + nota2 + nota3 + nota4)/4);
		
	}

}
