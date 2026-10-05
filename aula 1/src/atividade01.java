import java.util.Scanner;

import static java.lang.System.in;

public class atividade01 {

    public static void main(String[] args) {

        //Inicialização de variavel
        String nome = "";
        String curso = "";
        int periodo = 0;
        int idade = 0;

        // Scaner é um objeto
        // sc é o nome do objeto
        // new instancia (criar) um objeto
        // new Scanner indica o tipo do objeto criado
        // (System.in) é um parametro
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual é o seu nome?");
        nome = sc.nextLine();

        System.out.println("Qual é o seu curso?");
        curso = sc.nextLine();

        System.out.println("Qual é o seu periodo?");
        periodo = sc.nextInt();

        System.out.println("Qual é a sua idade?");
        idade = sc.nextInt();


        System.out.println("O nome é " + nome);
        System.out.println("O curso é " + curso);
        System.out.println("O periodo é " + periodo);
        System.out.println("O idade é " + idade);


    }

}
