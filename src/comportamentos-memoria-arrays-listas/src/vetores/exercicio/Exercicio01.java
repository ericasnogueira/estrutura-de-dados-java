package vetores.exercicio;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        /*
        Fa�a um programa que leia um n�mero inteiro positivo N(m�ximo = 10) e depois N n�meros inteiros e armazene-os
        em um vetor. Em seguinda, mostrar na tela todos os n�meros negativos lidos.
         */
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int tamanho = entrada.nextInt();

        //criando um vetor
        int [] vetor = new int[tamanho];

        //adicionando os numeros no vetor
        for(int i =0;i < tamanho; i++){
            // adicionando os numeros no vetor
            System.out.print("Digite um numero: ");
            vetor[i] = entrada.nextInt();
        }

        System.out.println("NUMEROS NEGATIVOS : ");
        for (int i = 0; i< vetor.length;i ++){// percorrendo a lista toda
            //System.out.println(vetor[i]);
            if(vetor[i] < 0){
                System.out.println(vetor[i]);
            }
        }

    }
}
