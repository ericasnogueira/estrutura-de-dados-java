package vetores.exercicio;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        /*
        Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida, mostrar na tela o maior número
        do vetor(supor não haver empates). Mostrar também a posição do maior elemento, considerando a
        primeira posição como 0(zero).
         */
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar ?");
        int n = entrada.nextInt();

        //criando o vetor
        double [] vetor = new double[n];

        //adicionando os numeros no vetor
        for(int i =0; i <n;i++){
            System.out.printf("Digite um numero :");
            vetor[i] = entrada.nextDouble();
        }
        System.out.println();
        int posicaoMaior;
        double maior;

        maior = vetor[0];
        posicaoMaior = 0;

        // pegando o maior valor e a sua posição
        for(int i = 0; i< n; i++){
            if(vetor[i] > maior){
                maior = vetor[i];
                posicaoMaior = i;
            }
        }

        System.out.printf("MAIOR VALOR = %.2f%n", maior);
        System.out.println("POSIÇÃO DO MAIOR VALOR = " + posicaoMaior);

    }
}
