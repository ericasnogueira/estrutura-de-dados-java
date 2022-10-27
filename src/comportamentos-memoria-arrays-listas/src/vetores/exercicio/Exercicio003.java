package vetores.exercicio;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio003 {
    public static void main(String[] args) {
        /*
        Faça um programa para ler nome, idade e altura de N pessoas, conforme exemplo.Depois, mostrar
        na tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos,
        bem como os nomes dessas pessas caso houver.
         */
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);
        System.out.print("Quantas pessoas serao digitadas ? ");
        int n = entrada.nextInt();

        //criando os vetores
        String[] nome = new String[n];
        int [] idade = new int[n];
        double [] altura = new double[n];

        //adicionando nos vetores
        for (int i = 0; i <n; i++) {
            //d é onde irá ficar o numero
            System.out.printf("dados da %da pessoa: ", i + 1);
            System.out.print("nome : ");
            nome[i] = entrada.next();
            System.out.print("Idade : ");
            idade[i] = entrada.nextInt();
            System.out.print("Altura :");
            altura[i] = entrada.nextDouble();
        }

        double soma = 0;
        for (int i =0; i < altura.length; i++){
            soma += altura[i];
        }
        double media = soma / n;
        System.out.println();
        System.out.printf("Altura média : %.1f\n", media);

        double porcentualMenores;
        double menores =0;
        for(int i =0; i<n;i++){
            if(idade[i] < 16){
                menores++;
            }
        }
        porcentualMenores = (menores / n) *100.0;
        System.out.printf("Pessoas com menos de 16 anos : %.2f%%\n", porcentualMenores);

        for(int i = 0; i < n; i++){
            if(idade[i] < 16 ){
                System.out.println(nome[i]);
            }
        }

    }
}
