import java.util.Scanner;

public class atividade06 {

    public static void main(String[] args) {

        String nome = "";
        double comprimento= 0;
        double largura = 0;
        double area = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Nome do proprietario: ");
        nome = sc.nextLine();

        System.out.println("Comprimento da area: ");
        comprimento = sc.nextInt();

        System.out.println("Largura da area: ");
        largura = sc.nextInt();

        area = largura * comprimento;

        System.out.println (nome);
        System.out.println ("Calculo da area: " + area);

    }
}