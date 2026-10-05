package atividade04;

import java.util.Scanner;

public class atividade04 {
    public static void main(String[] args){
        String usuarioCorreto = "Vitor";
        int senhaCorreta = 123456;
        String usuarioDigitado = "";
        int senhaDigitada = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o seu usuario: ");
        usuarioDigitado = sc.nextLine();

        System.out.println("Digite a sua senha: ");
        senhaDigitada = sc.nextInt();

        if(usuarioDigitado.equals(usuarioCorreto) && senhaDigitada == senhaCorreta){
            System.out.println("Acesso correto");
        }else{
            System.out.println("Acesso incorreto");
        }

    }
}
