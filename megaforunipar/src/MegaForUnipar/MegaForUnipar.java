package MegaForUnipar;

import java.util.Scanner;

public class MegaForUnipar {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe quantos numeros voce quer no jgo: ");
        int numeroJogo = sc.nextInt();

        int[] jogo = new int[numeroJogo];
        int[] resultado = {10,20,30,40,50,60};

        for(int i = 0; i < numeroJogo; i++) {
            // i é igual a posiçãp atual

            System.out.println("informe o valor");
            jogo[i] = sc.nextInt();
        }

        System.out.println("O jogo escolhido é: ");

        for(int i = 0; i < numeroJogo; i++) {
            System.out.print(" " + jogo[i] + " ");
        }

        //Validar o resutado
        int acertos = 0;

        for (int i = 0; i < numeroJogo; i++){
            //For responsavel por pecorrer o jogo do user

            for(int j = 0; j < 6; j++){

                if(jogo[i] == resultado[j]){
                    acertos++;
                }
            }

        }
        System.out.println(" Quabntidade de acertos; " + acertos);

    }
}
