package atividade09;

import java.util.Scanner;

public class atividade09 {
    public static void main(String[]args){

        double numero = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o numero: ");
        numero = sc.nextDouble();

        if(numero > 0){
            System.out.println("positivo");
        }else if(numero < 0){
            System.out.println("negativo");
        }else{
            System.out.println("Zero");
        }




    }
}
