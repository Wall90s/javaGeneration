package atividadeFilaPilha;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Exe01 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		Queue<String> clientes = new LinkedList<String>();
		int opcao = 6;
		boolean continuar = true;

		do {
			System.out.println("1 - Adicionar Clientes na Fila");
			System.out.println("2 - Listar todos os Clientes");
			System.out.println("3 - Retirar Cliente da Fila");
			System.out.println("0 - Sair");
			System.out.println("Entre com a opção desejada:");
			opcao = leia.nextInt();

			switch (opcao) {
			case 1:
				System.out.println("\n - Adicionando Cliente na Fila - ");
				System.out.println("Digite o nome:");
				leia.skip("\\R?");
				clientes.add(leia.nextLine());
				System.out.println("Novo cliente adicionado com sucesso!\n");
				break;
			case 2:
				if (clientes.isEmpty()) {
					System.out.println("\nA fila está vazia!");
				} else {
					System.out.println("\n - Listando todos os clientes - ");
					for (String cliente : clientes) {
						System.out.println(cliente);
					}
				}
				System.out.println();
				break;
			case 3:
				if (clientes.isEmpty()) {
					System.out.println("\nNão há clientes na fila\n");
				} else {
					String clienteAtendido = clientes.peek();
					clientes.poll();
					if (clientes.isEmpty()) {
						System.out.println("\nNão há mais clientes na fila");
						System.out.println("O Cliente " + clienteAtendido + " foi Chamado!\n");
					} else {
						System.out.println("\n - Listando próximos clientes - ");
						for (String cliente : clientes) {
							System.out.println(cliente);
						}
						System.out.println("O Cliente " + clienteAtendido + " foi Chamado!\n");
					}
				}
				break;
			case 0:
				System.out.println("\n - Encerrando programa - \n");
				continuar = false;
				break;
			default:
				System.out.println("\nOpção inválida!\n");
				break;
			}

		} while (continuar == true);

		leia.close();
	}

}
