package vetores.exercicio;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio010 {
    public static void main(String[] args) {
        /*Fazer um programa para ler um conjunto de N nomes de alunos, bem como as notas que eles tiraram no 1º e 2º
        semestres. Cada uma dessas informações deve ser armazenada em um vetor. Depois, imprimir os nomes dos alunos
        apravdos, considerando aprovados aquales cuja média das notas seja maior ou igual a 6.0(seis).
         */
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        System.out.print("Quantos alunos serao digitados? ");
        int n = entrada.nextInt();

        String [] nome = new String[n];
        double [] primeiroSemestre = new double[n];
        double [] segundoSemestre = new double[n];

        double media;

        for(int i=0;i<n;i++){
            System.out.printf("Digite nome, primeira e segunda nota do %do aluno \n", i +1);
            entrada.nextLine(); // quebraLinha
            nome[i] = entrada.nextLine();
            primeiroSemestre[i] = entrada.nextDouble();
            segundoSemestre[i] = entrada.nextDouble();
        }

        System.out.println("Alunos aprovados : ");
        for(int i=0;i<n;i++){
            media =(primeiroSemestre[i] + segundoSemestre[i]) / 2;

            if(media >= 6.0){
                System.out.printf("%s \n", nome[i]);
            }
        }
    }
}

