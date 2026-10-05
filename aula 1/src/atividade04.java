import java.util.Scanner;

public class atividade04 {

    public static void main(String[] args) {

        String nome = "";
        int ano1= 0;
        int ano2= 0;
        int idade= 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Qual é o seu nome?");
        nome = sc.nextLine();

        System.out.println("Qual o ano que nasceu?");
        ano1 = sc.nextInt();

        System.out.println("Qual o ano atual?");
        ano2 = sc.nextInt();

        idade= ano2 - ano1;

        System.out.println (nome);
        System.out.println ("Voce tem aproximadamente: " + idade + " anos");






    }
}