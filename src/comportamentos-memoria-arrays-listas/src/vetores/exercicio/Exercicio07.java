package vetores.exercicio;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        /*
        Fazer um programa para ler um n�mero inteiro N e depois um vetor de N n�meros reais.
        Em seguida, mostrar na tela a m�dia aritm�tica de  todos elementos com tr�s casas decimais.
        Despois mostrar todos os elementos do vetor que estejam abaixo da m�dia, com uma casa decimal cada.
         */
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor ? ");
        int n = entrada.nextInt();

        double []vetor = new double[n];

        //adicionando
        for(int i=0;i<n;i++){
            System.out.print("Digite um numero: ");
            vetor[i] = entrada.nextDouble();
        }
        double soma = 0;
        for(int i =0 ;i <n ;i++){
            soma += vetor[i];
        }
        System.out.println();
        double media = soma/n;
        System.out.printf("MEDIA DO VETOR = %.3f%n", media);
        System.out.println("ELEMENTOS ABAIXO DA M�DIA: ");

        //pegando os elementos abaixo da media
        for (int i=0;i<n;i++){
            if(vetor[i] < media){
                System.out.println(vetor[i]);
            }
        }

    }
}
