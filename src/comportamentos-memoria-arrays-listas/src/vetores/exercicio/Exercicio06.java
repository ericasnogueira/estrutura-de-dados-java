package vetores.exercicio;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        /*
        Faça um programa para ler dois vetores A e B, contendo N elementos cada.
        Em seguida, gere um terceiro vetor C onde cada elemnto de C é a soma dos elementos
        correspondentes de A e B. Imprima o vetor C gerado.
         */

        Scanner entrada = new Scanner(System.in);

        System.out.print("Quantos valores vai ter cada vetor ? ");
        int n = entrada.nextInt();

        int [] vetorA = new int[n];
        int [] vetorB = new int[n];

        System.out.println("Digite os valores do vetor A :");
        //adicionando no vetor A
        for(int i =0; i<n; i++){
            vetorA[i] = entrada.nextInt();
        }

        System.out.println("Digite os valores do vetor B :");
        for (int i =0 ; i < n; i++){
            vetorB [i] = entrada.nextInt();
        }

        // somando os vetores A e B e adicionando no vetor C
        int [] vetorC = new int[n];
        for (int  i = 0; i < n; i++) {
            vetorC[i] = vetorA[i] + vetorB[i];
        }
        System.out.println("VETOR RESULTANTE : ");
        for (int i = 0 ; i < n; i ++){
            System.out.println(vetorC[i]);
        }

    }
}
