package atividade11;

import java.util.Scanner;

public class atividade11 {
    public static void main(String[] args) {

        double salario = 0;
        double bonus = 0;
        double imposto = 0;
        double salarioLiquido = 0;
        int anos = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o salário bruto: ");
        salario = sc.nextDouble();

        System.out.println("Informe quantos anos trabalhou na empresa: ");
        anos = sc.nextInt();

        if (anos > 10) {
            bonus = salario * 0.10;
            System.out.println("Bônus de 10%!!");
        } else if (anos >= 5) {
            bonus = salario * 0.05;
            System.out.println("Bônus de 5%!!");
        } else {
            bonus = 0;
            System.out.println("Sem bônus");
        }

        if (salario > 5000) {
            imposto = salario * 0.27;
            System.out.println("Imposto de 27%!!");
        } else if (salario >= 3000) {
            imposto = salario * 0.18;
            System.out.println("Imposto de 18%!!");
        } else {
            imposto = salario * 0.10;
            System.out.println("Imposto de 10%!!");
        }

        salarioLiquido = salario + bonus - imposto;

        System.out.println();
        System.out.println("RESULTADO");
        System.out.println("Salário bruto: R$ " + salario);
        System.out.println("Bônus recebido: R$ " + bonus);
        System.out.println("Imposto descontado: R$ " + imposto);
        System.out.println("Salário líquido: R$ " + salarioLiquido);
    }
}
