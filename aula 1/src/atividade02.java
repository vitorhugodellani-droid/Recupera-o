import java.util.Scanner;

public class atividade02 {

    public static void main(String[] args){

        int primeiroValor = 0;
        int segundoValor = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o primeiro valor");
        primeiroValor = sc.nextInt();

        System.out.println("Informe o segundo valor");
        segundoValor = sc.nextInt();

        int soma = primeiroValor + segundoValor;
        int subtracao = primeiroValor - segundoValor;
        double divisao = primeiroValor / segundoValor;
        int multiplicacao = primeiroValor * segundoValor;

        System.out.println("Soma : " +soma);
        System.out.println("Subtração : " +subtracao);
        System.out.println("Divisão : " +divisao);
        System.out.println("Multiplicação : " +multiplicacao);
    }
}