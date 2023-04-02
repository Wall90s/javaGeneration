package atividadeLacoCondicional;

import java.util.Scanner;

public class Lista01_ex04 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		String animal;

		System.out.println("Informe o tipo de animal: ");
		leia.skip("\\R?");
		animal = leia.nextLine();

		if (animal.equalsIgnoreCase("Vertebrado")) {
			System.out.println("Informe o tipo de animal: ");
			animal = leia.nextLine();
			if (animal.equalsIgnoreCase("Ave")) {
				System.out.println("Informe o tipo de animal: ");
				animal = leia.nextLine();
				if (animal.equalsIgnoreCase("Carnivoro")) {
					System.out.println("Águia");
				} else {
					System.out.println("Pomba");
				}
			}
			if (animal.equalsIgnoreCase("Mamifero")) {
				System.out.println("Informe o tipo de animal: ");
				animal = leia.nextLine();
				if (animal.equalsIgnoreCase("Herbivoro")) {
					System.out.println("Vaca");
				} else {
					System.out.println("Homem");
				}
			}
		}

		if (animal.equalsIgnoreCase("Invertebrado")) {
			System.out.println("Informe o tipo de animal: ");
			animal = leia.nextLine();
			if (animal.equalsIgnoreCase("Inseto")) {
				System.out.println("Informe o tipo de animal: ");
				animal = leia.nextLine();
				if (animal.equalsIgnoreCase("Herbivoro")) {
					System.out.println("Lagarta");
				} else {
					System.out.println("Pulga");
				}
			}
			if (animal.equalsIgnoreCase("Anelideo")) {
				System.out.println("Informe o tipo de animal: ");
				animal = leia.nextLine();
				if (animal.equalsIgnoreCase("Hematofago")) {
					System.out.println("Sanguessuga");
				} else {
					System.out.println("Minhoca");
				}
			}
		}

		leia.close();
	}

}
