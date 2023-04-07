import java.util.Scanner;

public class Exe07_celsiusParaFahrenheit {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        celsiusParaFahrenheit(leia.nextDouble());

        leia.close();
    }
    public static void celsiusParaFahrenheit(double celsius) {
        double fahrenheit = celsius * (9.0/5.0) + 32.0;
        System.out.println(fahrenheit);
    }
}