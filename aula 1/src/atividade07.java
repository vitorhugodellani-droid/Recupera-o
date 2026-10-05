import java.util.Scanner;

public class atividade07 {

    public static void main(String[] args) {

        String nome = "";
        double litros = 0;
        double distancia = 0;
        double consumo = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Nome do Motorista:  ");
        nome = sc.nextLine();

        System.out.println("Quanto de combustivel em litros: ");
        litros = sc.nextInt();

        System.out.println("Distancia em Quilometros: ");
        distancia = sc.nextInt();

        consumo = distancia / litros;

        System.out.println (nome);
        System.out.println ("Calculo do consumo: " + consumo + " km/l");

    }
}