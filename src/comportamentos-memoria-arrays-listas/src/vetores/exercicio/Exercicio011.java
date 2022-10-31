package vetores.exercicio;

import javax.swing.text.html.HTMLDocument;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio011 {
    public static void main(String[] args) {
        /*
        Tem-se um conjunto de dados contendo a altura e o gênero(M,F) de N pessoas. Fazer um programa que
        calcule e escreva a maior e a menor altura do grupo, a média de altura das Mulheres, e o número de homens.
         */
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        System.out.print("Quanas pessoas serao digitadas ? ");
        int n = entrada.nextInt();

        double [] altura = new double[n];
        char [] genero = new char[n];


        for(int i=0;i<n;i++){
            System.out.printf("Altura da %da pessoa: ", i + 1);
            altura[i] = entrada.nextDouble();
            System.out.printf("Genero da %da pessoa: " ,i + 1);
            genero[i] = entrada.next().charAt(0);
        }
        double maiorAltura, menorAltura;
        maiorAltura = altura[0];
        menorAltura = altura[0];


        for(int i =0;i<n;i++){
            if(altura[i] > maiorAltura){
                maiorAltura = altura[i];
            }
            if(altura[i] < menorAltura){
                menorAltura = altura[i];
            }
        }
        System.out.println("Menor altura = " + menorAltura);
        System.out.println("Maior altura = " + maiorAltura);

        int quantidadeHomens, quantidadeMulheres;
        double alturaFeMedia, alturaFemTotal;

        quantidadeHomens =0;
        quantidadeMulheres =0;
        alturaFemTotal =0;

        for (int i =0;i<n;i++){
            if(genero[i] == 'm'){
                quantidadeHomens = quantidadeHomens +1;
            } else {
                quantidadeMulheres++;
                alturaFemTotal = alturaFemTotal + altura[i];
            }
        }
        alturaFeMedia = alturaFemTotal / quantidadeMulheres;

        System.out.printf("Media das alturas das mulheres = %.2f\n", alturaFeMedia);
        System.out.printf("Numero de homens = %d\n", quantidadeHomens);

    }
}
