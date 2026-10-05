import java.util.Scanner;

public class SemVetor {
    public static void main(String[] args) {

        String nomep1 = "";
        String nomep2 = "";
        String nomep3 = "";
        double preco1 = 0;
        double preco2 = 0;
        double preco3 = 0;
        double quantidade1 = 0;
        double quantidade2 = 0;
        double quantidade3 = 0;
        double subtotal1 = 0;
        double subtotal2 = 0;
        double subtotal3 = 0;
        double totalfinal = 0;

        Scanner sc = new Scanner(System.in);


        System.out.println("Qual o nome do primeiro produto?");
        nomep1 = sc.nextLine();
        System.out.println("Qual o nome do segundo produto?");
        nomep2 = sc.nextLine();
        System.out.println("Qual o nome do terceiro produto?");
        nomep3 = sc.nextLine();

        System.out.println("Qual o preço do primeiro produto?");
        preco1 = sc.nextDouble();
        System.out.println("Qual o preço do segundo produto?");
        preco2 = sc.nextDouble();
        System.out.println("Qual o preço do terceiro produto?");
        preco3 = sc.nextDouble();

        System.out.println("Qual a quantidade do primeiro produto?");
        quantidade1 = sc.nextDouble();
        System.out.println("Qual a quantidade do segundo produto?");
        quantidade2 = sc.nextDouble();
        System.out.println("Qual a quantidade do terceiro produto?");
        quantidade3 = sc.nextDouble();

        subtotal1 = preco1 * quantidade1;
        subtotal2 = preco2 * quantidade2;
        subtotal3 = preco3 * quantidade3;
        totalfinal = subtotal1 + subtotal2 + subtotal3;

        System.out.println("O produto " + nomep1 + " possui o subtotal de: " + subtotal1);
        System.out.println("O produto " + nomep2 + " possui o subtotal de: " + subtotal2);
        System.out.println("O produto " + nomep3 + " possui o subtotal de: " + subtotal3);
        System.out.println("O valor total da compra é: " + totalfinal);





    }
}