package atividade07;

import java.util.Scanner;

public class atividade07 {

    public static void main(String[]args){

        double numeroUm = 0;
        double numeroDois = 0;
        double resultado = 0;

        Scanner sc = new Scanner(System.in);;

        System.out.println("Informe o primeiro numero: ");
        numeroUm = sc.nextDouble();

        System.out.println("Informe o segundo numero: ");
        numeroDois = sc.nextDouble();

        resultado = numeroUm+numeroDois;
        resultado = numeroUm-numeroDois;
        resultado = numeroUm*numeroDois;
        resultado = numeroUm/numeroDois;

        System.out.println(("SOMA == " + numeroUm+numeroDois));;
        System.out.println(("SUBTRAÇÃO == " + (numeroUm-numeroDois)));;
        System.out.println(("MULTIPLICAÇÃO == " + numeroUm*numeroDois));;
        System.out.println(("DIVISÃO == " + numeroUm/numeroDois));;
    }
}
