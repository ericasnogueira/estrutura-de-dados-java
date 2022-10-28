package vetores.exercicio;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        /*
        Fazer um programa para ler um vetor de N n�meros inteiros. Em seguinda, mostrar na tela a m�dia
        aritm�tica somente dos n�meros pares lidos, com uma casa decimal. Se nenhum n�mero par for digitado, mostrar
        a mensagem "NENHUM NUMERO PAR"
         */
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = entrada.nextInt();

        int [] vetor = new int[n];

        //adicionando no vetor
        for(int i =0;i<n;i++){
            System.out.print("Digite um numero: ");
            vetor[i] = entrada.nextInt();
        }

        double soma =0;
        double mediaN = 0;
        for(int i =0;i<n;i++){
            if(vetor[i] % 2 ==0){
                soma += vetor[i];
                mediaN = mediaN +1;
            }
        }
        double mediaTotal = soma / mediaN;
        if(soma > 0){
            System.out.printf("MEDIA DOS PARES = %.1f%n", mediaTotal);
        } else {
            System.out.println("NENHUM NUMERO PAR ");
        }
    }
}
