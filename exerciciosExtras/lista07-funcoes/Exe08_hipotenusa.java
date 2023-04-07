import java.util.Scanner;
import java.lang.Math;

public class Exe08_hipotenusa {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        celsiusParaFahrenheit(leia.nextFloat(), leia.nextFloat());

        leia.close();
    }

    public static void celsiusParaFahrenheit(double a, double b) {
        double hipotenusa = Math.sqrt((a * a) + (b * b));
        System.out.println(hipotenusa);
    }
}