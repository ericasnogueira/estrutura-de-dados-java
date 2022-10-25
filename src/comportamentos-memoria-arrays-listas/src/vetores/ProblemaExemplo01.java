package vetores;

import java.util.Locale;
import java.util.Scanner;

public class ProblemaExemplo01 {
    public static void main(String[] args) {
        /*
        Fazer um programa para ler um n�mero inteiro e altura de n pessoas. Armazene as N
        alturas em um vetor. Em seguinda,mostrar a altura m�dia dessas pessoas.
         */
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        //criando vetor
        // tipo // [] vetor // nomedoVetor = new //tipo novamente [tamanhodoVetor]
        double []vect = new double[n];

        //percorrendo o vetor
        for(int i = 0; i<n; i++){
            //o vetor na posi��o i ira receber o input
            vect[i] = input.nextDouble();
        }

        //calculando a media
        double soma = 0;

        //1 - percorrendo o vetor e somando os numeros
        for (int i =0;i<n;i++){
            soma += vect[i];
        }

        double media = soma /n;

        System.out.printf("MEDIA : %.2f", media);

        input.close();
    }
}
