import java.util.Scanner;

public class Exe04_verificaQuadradoPerfeito {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        verificaQuadradoPerfeito(leia.nextInt());

        leia.close();
    }

    public static void verificaQuadradoPerfeito(int numero) {
        double raiz = Math.sqrt(numero);

        if (raiz % 1 == 0) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
