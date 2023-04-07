import java.util.Scanner;

public class Exe06_tempoParaSegundos {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        tempoParaSegundos(leia.nextInt(), leia.nextInt(), leia.nextInt());

        leia.close();
    }

    public static void tempoParaSegundos(int horas, int minutos, int segundos) {
        segundos += horas * 3600;
        segundos += minutos * 60;
        
        System.out.println(segundos);
    }
}