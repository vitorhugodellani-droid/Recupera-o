package atividade01;

import java.util.Scanner;

public class AtividadeNotes {

    public static void main(String[] args) {

        double nota = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe Sua Nota");
        nota = sc.nextDouble();

        if (nota >= 0 && nota <= 10){

        }else{
            System.err.println("Nota Invalida");
        }

        //Nota >= 9: Excelente
        //Nota >= 7: Bom
        //Nota >= 5: Satisfatório
        //Nota < 5: Insatisfatório

        if (nota >= 9){
            System.out.println("Exelente");
        } else if (nota >=7) {
            System.out.println("Bom");
        } else if (nota >=5){
            System.out.println("Satisfatório");
        } else if (nota < 5) {
            System.out.println("Insastifatório");
        } else {
            System.out.println("Nota Invalida");
        }
    }



}

