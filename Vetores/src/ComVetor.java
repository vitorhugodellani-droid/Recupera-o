import java.util.Scanner;

public class ComVetor {
    public static void main(String[] args) {

        String[] nomes = new String[3];
        nomes[0] = String.valueOf(1);
        nomes[1] = String.valueOf(2);
        nomes[2] = String.valueOf(3);

        Double[] precos = new Double[3];

        Double[] quantidades = new Double[3];


        Double[] subtotal = new Double[3];



        double totalfinal = 0;



        Scanner sc = new Scanner(System.in);


        System.out.println("Qual o nome do primeiro produto?");
        nomes[0] = sc.nextLine();
        System.out.println("Qual o nome do segundo produto?");
        nomes[1] = sc.nextLine();
        System.out.println("Qual o nome do terceiro produto?");
        nomes[2] = sc.nextLine();

        System.out.println("Qual o preço do primeiro produto?");
        precos[0] = sc.nextDouble();
        System.out.println("Qual o preço do segundo produto?");
        precos[1] = sc.nextDouble();
        System.out.println("Qual o preço do terceiro produto?");
        precos[2] = sc.nextDouble();

        System.out.println("Qual a quantidade do primeiro produto?");
        quantidades[0] = sc.nextDouble();
        System.out.println("Qual a quantidade do segundo produto?");
        quantidades[1] = sc.nextDouble();
        System.out.println("Qual a quantidade do terceiro produto?");
        quantidades[2] = sc.nextDouble();

        subtotal[0] = precos[0] * quantidades[0];
        subtotal[1] = precos[1] * quantidades[1];
        subtotal[2] = precos[2] * quantidades[2];
        totalfinal = subtotal[0] + subtotal[1] + subtotal[2];

        System.out.println("O produto " + nomes[0] + " possui o subtotal de: " + subtotal[0]);
        System.out.println("O produto " + nomes[1] + " possui o subtotal de: " + subtotal[1]);
        System.out.println("O produto " + nomes[2] + " possui o subtotal de: " + subtotal[2]);
        System.out.println("O valor total da compra é: " + totalfinal);





    }
}