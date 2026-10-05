import java.util.Scanner;

public class ATV11 {
    public static void main(String[] args) {

        int quantidadeAlunos =0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos alunos sao?");
        quantidadeAlunos = sc.nextInt();

        double[] notas = new double[quantidadeAlunos];

        int opcao = -1;

        while(opcao != 0){

            System.out.println("Escolha a opção desejada");
            System.out.println("1 - Cadastrar");
            System.out.println("2 - Listar Notas");
            System.out.println("3 - Calcular regra");
            System.out.println("4 - Maior e menor notas");
            System.out.println("5 - Consultar Nota");
            System.out.println("0 - Sair");
            opcao = sc.nextInt();
            switch (opcao){

                case 0 :
                    System.out.println("FINALIZADO");
                    break;
                case 1 :
                    for (int i = 0; i < quantidadeAlunos; i++) {
                        System.out.println("Informe qual a nota do aluno");
                        notas[i] = sc.nextDouble();
                    }
                    break;
                case 2 :
                    for (int i = 0; i < quantidadeAlunos; i++) {
                        System.out.println("Nota" + (i + 1) + "é" + notas[i]);
                    }
                    break;
                case 3 :
                    double somaNotas =0;
                    for(int i = 0; i<quantidadeAlunos; i++){
                        somaNotas = somaNotas + (notas[i]);
                    }
                    double media = somaNotas / quantidadeAlunos;

                    System.out.println("A média é: " + media);

                case 4 :

                    double maiorNotaAtual = -1;
                    double menorNotaAtual = 100;

                    for(int i = 0; i < quantidadeAlunos; i++){

                        if (notas[i] > maiorNotaAtual) {
                            maiorNotaAtual = notas[i];
                        }
                        if (notas[i] < menorNotaAtual){
                            menorNotaAtual = notas[i];

                        }

                        System.out.println("Menor nota é" + menorNotaAtual);
                        System.out.println("Maior nota é" + maiorNotaAtual);
                    }
                    break;
                case 5 :
                    System.out.println("Qual posição?");
                    int posicao = sc.nextInt();

                    System.out.println("Nota da posição é" + notas[posicao]);
                    break;
                default:
                    System.out.println("Opção Invalida");
                    break;

            }
        }
    }
}
