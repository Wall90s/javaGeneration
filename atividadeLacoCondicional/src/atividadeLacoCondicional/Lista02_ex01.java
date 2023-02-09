package atividadeLacoCondicional;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Lista02_ex01 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int codigo;
		float total, quantidade, preco = 0;
			
		System.out.println("Por favor informe o código do produto: ");
		codigo = leia.nextInt();
		System.out.println("Por favor informe a quantidade de produtos: ");
		quantidade = leia.nextInt();
		
		switch (codigo) {
		case 1:
			preco = 10;
			System.out.println("Produto: Cachorro Quente");
			break;
		case 2:
			preco = 15;
			System.out.println("Produto: X-Salada");
			break;
		case 3:
			preco = 18;
			System.out.println("Produto: X-Bacon");
			break;
		case 4:
			preco = 12;
			System.out.println("Produto: Bauru");
			break;
		case 5:
			preco = 8;
			System.out.println("Produto: Refrigerante");
			break;
		case 6:
			preco = 13;
			System.out.println("Produto: Suco de laranja");
			break;
		default:
			System.out.println("Código de produto inválido");
			break; 
		} 
		
		if (preco !=  0 && quantidade > 0) {
			total = preco * quantidade;
			System.out.printf("Valor total: R$ %.2f", total);
		} else {
			System.out.println("Quantidade inválida");
		}
				
		leia.close();
	}

}
