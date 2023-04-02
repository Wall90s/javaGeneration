import java.util.Scanner;

public class Exe03_verificaPositivoNegativo {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        verificaPositivoNegativo(leia.nextInt());

        leia.close();
    }

    public static void verificaPositivoNegativo(int numero) {
        if (numero > 0) {
            System.out.println(1);
        } else if (numero < 0) {
            System.out.println(-1);
        } else {
            System.out.println(0);
        }

    }
}
