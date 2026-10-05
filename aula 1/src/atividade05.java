import java.util.Scanner;

public class atividade05 {

    public static void main(String[] args) {

        String nome = "";
        double horasTrabalhadas= 0;
        double valorHora= 0;
        double salario = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Nome do funcionario: ");
        nome = sc.nextLine();

        System.out.println("Suas horas trabalhada: ");
        horasTrabalhadas = sc.nextInt();

        System.out.println("Valor da suas horas: ");
        valorHora = sc.nextInt();

        salario = valorHora * horasTrabalhadas;

        System.out.println (nome);
        System.out.println ("Calculo do Salário: " + salario);

    }
}