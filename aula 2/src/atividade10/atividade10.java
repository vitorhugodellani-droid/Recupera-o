package atividade10;

import java.util.Scanner;

public class atividade10 {
    public static void main(String[]args){

        double compra = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o quanto gastou: ");
        compra = sc.nextDouble();

        if(compra > 500){
            System.out.println("Desconto de 20%!!");
        }else if(compra >= 500){
            System.out.println("Desconto de 10%!!");
        }else if(compra >= 200) {
            System.out.println("Desconto de 10%!!");
        }else if(compra >= 199){
            System.out.println("Desconto de 5%!!");
        }else if(compra >= 100){
            System.out.println("Desconto de 5%!!");
        }else{
            System.out.println("Sem desconto");
        }



    }


}
