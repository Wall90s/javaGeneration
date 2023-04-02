package atividadeVariaveisOperadores;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		float salarioBruto, adicionalNoturno, horasExtras, descontos;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Informe o Salário Bruto: ");
		salarioBruto = leia.nextFloat();
		System.out.println("Informe o Adicional Noturno: ");
		adicionalNoturno = leia.nextFloat();
		System.out.println("Informe as Horas Extras: ");
		horasExtras = leia.nextFloat();
		System.out.println("Informe os Descontos: ");
		descontos = leia.nextFloat();
		
		System.out.println("O valor do Salário Líquido é: " + (salarioBruto + adicionalNoturno+ (horasExtras* 5) - descontos));
		
		leia.close();
	}

}
