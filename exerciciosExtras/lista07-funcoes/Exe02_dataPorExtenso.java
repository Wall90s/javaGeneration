import java.util.Scanner;

public class Exe02_dataPorExtenso {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        dataPorExtenso(leia.nextLine());

        leia.close();

    }

    public static int selecionaDia(String data) {
        String dia = Character.toString(data.charAt(0));
        dia += Character.toString(data.charAt(1));
        return Integer.valueOf(dia);
    }

    public static int selecionaMes(String data) {
        String mes = Character.toString(data.charAt(3));
        mes += Character.toString(data.charAt(4));
        return Integer.valueOf(mes);
    }

    public static String selecionaAno(String data) {
        String ano = Character.toString(data.charAt(6));
        ano += Character.toString(data.charAt(7));
        ano += Character.toString(data.charAt(8));
        ano += Character.toString(data.charAt(9));
        return ano;
    }

    public static void dataPorExtenso(String data) {
        int dia = selecionaDia(data);
        int mes = selecionaMes(data);
        String ano = selecionaAno(data);

        String nomeMes = "";
        switch (mes) {
            case 1:
                nomeMes = "janeiro";
                break;
            case 2:
                nomeMes = "fevereiro";
                break;
            case 3:
                nomeMes = "março";
                break;
            case 4:
                nomeMes = "abril";
                break;
            case 5:
                nomeMes = "maio";
                break;
            case 6:
                nomeMes = "junho";
                break;
            case 7:
                nomeMes = "julho";
                break;
            case 8:
                nomeMes = "agosto";
                break;
            case 9:
                nomeMes = "setembro";
                break;
            case 10:
                nomeMes = "outubro";
                break;
            case 11:
                nomeMes = "novembro";
                break;
            case 12:
                nomeMes = "dezembro";
                break;
            default:
                nomeMes = "(valor do mês inválido)";
                break;
        }

        System.out.println(dia + " de " + nomeMes + " de " + ano);

    }

}
