package vetores.exercicio;

import java.util.Scanner;

public class Exercicio004 {
    public static void main(String[] args) {
        /*
        Faça um programa que leia N números inteiros e armazene-os em um vetor. Em seguinda,
        mostre na tela todos os numeros pares, e tambem a quantidade de números pares.
         */
        Scanner entrada = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar ?");
        int n = entrada.nextInt();

        int [] vetor = new int[n];


        for(int i =0; i< n; i++){
            System.out.print("Digite um numero : ");
            vetor[i] = entrada.nextInt();
        }
        System.out.println();
        int soma = 0;
        System.out.println("NUMEROS PARES: ");
        // vendo quais são pares
        for(int i =0 ; i< vetor.length; i++){
            if(vetor[i] % 2 == 0 ){
                System.out.printf(vetor[i] + "  ");
                soma += 1;
            }
        }
        System.out.println();
        System.out.println();
        System.out.print("QUANTIDADE DE PARES = " + soma);

    }
}
