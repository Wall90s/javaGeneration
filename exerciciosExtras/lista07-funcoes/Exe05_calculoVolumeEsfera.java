import java.util.Scanner;
import java.text.DecimalFormat;

public class Exe05_calculoVolumeEsfera {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        

        System.out.println(calculoVolumeEsfera(leia.nextDouble()));

        leia.close();
    }

    public static double calculoVolumeEsfera(double raio) {
        double volume = (4 * Math.PI * Math.pow(raio, 3)) / 3;

        DecimalFormat df = new DecimalFormat(",##");
        volume = Double.valueOf(df.format(volume));

        return volume;
    }
}
