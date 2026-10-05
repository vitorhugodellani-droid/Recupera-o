package atividade01;

import java.util.Scanner;

public class atividade01 {

    public static void main(String[] args) {

        double idade = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe Sua idade" + "");
        idade = sc.nextDouble();

        if (idade >= 0 && idade <= 200){

        }else{
            System.err.println("idade Invalida");
        }


        if (idade >=18) {
            System.out.println("Adulto");
        } else if (idade >=13){
            System.out.println("Adolecente");
        } else if (idade < 12) {
            System.out.println("Criança");

    }

    }

}