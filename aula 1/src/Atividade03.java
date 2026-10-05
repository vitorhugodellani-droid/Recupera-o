import java.util.Scanner;

public class Atividade03 {

    public static void main(String[] args) {

        String nome = "";
        double nota1= 0;
        double nota2= 0;
        double nota3= 0;
        double media= 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Qual é o seu nome?");
        nome = sc.nextLine();

        System.out.println("Informe o primeiro valor");
        nota1 = sc.nextInt();

        System.out.println("Informe o segundo valor");
        nota2 = sc.nextInt();

        System.out.println("Informe o terceiro valor");
        nota3 = sc.nextInt();

        media = (nota1 + nota2 + nota3) / 3;

        System.out.println (nome);
        System.out.println (media);






    }
}
