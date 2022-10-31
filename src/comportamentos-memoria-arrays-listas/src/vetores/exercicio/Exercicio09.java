package vetores.exercicio;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        /*
        Fazer um programa para ler um conjubti de nomes de pessoas e suas respectivas idades. Os nomes devem ser
        armazenados em um vetor, e as idades em um outro vetor. Despois, mostrar na tela o nome da pessoa mais velha.
         */
        Scanner entrada = new Scanner(System.in);

        System.out.print("Quantas pessoas voce vai digitar? ");
        int n = entrada.nextInt();

        String [] nome = new String[n];
        int [] idade = new int[n];

        //adicionando no vetores
        for(int i=0;i<n;i++){
            System.out.printf("Dados da %d pessoas %n" , i +1);
            System.out.print("Nome : ");
            nome[i] = entrada.next();
            System.out.print("Idade :");
            idade[i] = entrada.nextInt();
        }

        int maiorIdade, posicaoMaior;
        maiorIdade = idade[0];
        posicaoMaior = 0;

        for (int i =0; i<n;i++){
            if(idade[i] > maiorIdade){
                maiorIdade = idade[i];
                posicaoMaior = i;
            }
        }
        System.out.println("PESSOA MAIS VELHAR : " + nome[posicaoMaior]);

    }
}
