package aula_05;

import java.util.Stack;

public class Pilha {

	public static void main(String[] args) {

		Stack<String> pilha = new Stack<String>();

		pilha.push("Rafael Queiróz");
		pilha.push("Rony");
		pilha.push("Rafael Gouvea");
		pilha.push("Danilo");
		pilha.push("Lucas");
		
		System.out.println("Elementos da pilha:");
		for (String elemento : pilha) {
			System.out.println(elemento);
		}
		
		System.out.println("\nRemover 1 elemento da pilha: ");
		pilha.pop();
		for (String elemento : pilha) {
			System.out.println(elemento);
		}
		
		System.out.println("\nTopo da pilha: ");
		System.out.println(pilha.peek());

	}

}
