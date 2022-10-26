package vetores.exercicio;

import java.util.Locale;
import java.util.Scanner;

public class Exercicios002 {
    public static void main(String[] args) {
        /*
        Faça um programa que leia N números reais e armazene-os em um vetor. Em seguinda :
        - imprimir todos os elementos do vetor
        - mostrar na tela a soma e a média dos elementos do vetor
         */
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);
        System.out.print("Quantos numeros voce vai digitar ? ");
        int n = entrada.nextInt();

        //criando o vetor
        double [] vetor = new double[n];

        //adicionadno os numeros no vetor
        for(int i =0; i< n;i++){
            System.out.print("Digite um numero : ");
            vetor[i] = entrada.nextDouble();
        }

        System.out.print("VALORES = ");
        //vendo se foi adicionado os numeros
        for (int i =0; i< vetor.length; i++){
            System.out.print(vetor[i] + "  ");
        }

        double soma =0;
        for (int i= 0;i< vetor.length;i++){
            soma += vetor[i];
        }
        System.out.println();
        System.out.printf("SOMA =  %.2f" , soma);

        System.out.println();
        double media = soma /n;
        System.out.printf("MEDIA = %.2f", media);
    }
}
