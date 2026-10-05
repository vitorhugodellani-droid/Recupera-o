package Atividade03;

import java.util.Scanner;

public class atividade03 {
    public static void main(String[] args) {

        String user = "";
        int senha = 0;
        String userc = "Vitor";
        int senhac = 12345;

        Scanner sc = new Scanner(System.in);

        System.out.println("Nome do Usuario");
        user = sc.nextLine();

        System.out.println("Senha do usuario");
        senha = sc.nextInt();

        if (user.equals(userc) && senha == senhac) {
            System.out.println("Senha correta");
        } else {
            System.out.println("Senha Incorreta");
        }

    }
}
