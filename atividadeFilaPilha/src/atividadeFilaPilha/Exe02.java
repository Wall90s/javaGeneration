package atividadeFilaPilha;

import java.util.Scanner;
import java.util.Stack;

public class Exe02 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		Stack<String> livros = new Stack<String>();
		int opcao = 6;
		boolean continuar = true;

		do {
			System.out.println("1 - Adicionar Livros na pilha");
			System.out.println("2 - Listar todos os Livros");
			System.out.println("3 - Retirar Livro da pilha");
			System.out.println("0 - Sair");
			System.out.println("Entre com a opção desejada:");
			opcao = leia.nextInt();

			switch (opcao) {
			case 1:
				System.out.println("Digite o nome:");
				leia.skip("\\R?");
				livros.add(leia.nextLine());
				System.out.println("\nPilha:\n");
				for (String livro : livros) {
					System.out.println(livro);
				}
				System.out.println("\nLivro adicionado!\n");
				break;
			case 2:
				if (livros.isEmpty()) {
					System.out.println("\nA Pilha está vazia!");
				} else {
					System.out.println("\nLista de Livros na Pilha:\n");
					for (String cliente : livros) {
						System.out.println(cliente);
					}
				}
				System.out.println();
				break;
			case 3:
				if (livros.isEmpty()) {
					System.out.println("\nA Pilha está vazia!\n");
				} else {
					String livroRetirado = livros.peek();
					livros.pop();
					if (livros.isEmpty()) {
						System.out.println("\nA Pilha está vazia!");
						System.out.println("\nO Livro " + livroRetirado + " foi retirado!\n");
					} else {
						System.out.println("\nLista de Livros na Pilha");
						for (String livro : livros) {
							System.out.println(livro);
						}
						System.out.println("\nO livro " + livroRetirado + " foi retirado!\n");
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
