package atividade06;

import java.util.Scanner;


class atividade06 {

    public static void main(String[] args) {

        double nota = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a nota: ");
        nota = sc.nextDouble();

        if (nota >= 7) {
            System.out.println("Aprovado");
        } else if (nota >= 6) {
            System.out.println("Media");
        } else {
            System.out.println("Reprovado");
        }
    }
}
