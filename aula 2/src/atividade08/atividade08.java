package atividade08;

import java.util.Scanner;

public class atividade08 {
    public static void main(String[]args){

        double temperatura = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a temperatura: ");
        temperatura = sc.nextDouble();

        if(temperatura >= 30){
            System.out.println("Pelando");
        }else if(temperatura >= 29){
            System.out.println("ameno");
        }else if(temperatura >= 15){
            System.out.println("ameno");
        }else{
            System.out.println("Frio");
        }



    }


}
