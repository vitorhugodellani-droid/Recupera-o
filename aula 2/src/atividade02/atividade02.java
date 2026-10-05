package atividade02;

import java.util.Scanner;

public class atividade02 {
    public static void main(String[] args) {

        double nota = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe um Valor");
        nota = sc.nextDouble();
        double mod = nota % 2;
        
        if (mod == 1){
            System.out.println("Impar");
        } else {
            System.out.println("Par");
        }
    }
}
