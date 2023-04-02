import java.util.Scanner;

public class Exe01_dobraValor {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        dobraValor(leia.nextInt());

        leia.close();
    }

    public static void dobraValor(int numero) {
        System.out.println(numero * 2);
    }
}

