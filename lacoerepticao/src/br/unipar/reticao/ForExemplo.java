package br.unipar.reticao;

import java.util.Scanner;

public class ForExemplo {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Qual o valor que deseja saber?");
        int numero = sc.nextInt();

        System.out.println("Deseja ir até qual numero?");
        int ateondeir = sc.nextInt();

            //for (incio; condicao; incremento)
            //1 - executa uma vez no comeco
            //2 - executa toda vez antes de executa
            //3 - executa toda vez ao terminar

            //++ é a mesma coisa que contador = contador +1
        for(int contador = 0; contador < ateondeir; contador++){
            System.out.println("numero x" + contador + "=" + (contador * numero));
        }
    }
}
