package Arrays_e_Collections.Arrays.Desafios;

import java.util.Locale;
import java.util.Scanner;

public class Desafio01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);


        System.out.print("Quantas notas você quer informar aos orgãos ?");
        int qtdNotas = entrada.nextInt();

        double [] notas = new double[qtdNotas];

        //armazenando as notas no array
        for(int i = 0;i< qtdNotas;i++){
            System.out.printf("Digite a nota %d :", i + 1);
            notas[i] = entrada.nextDouble();
        }

        double soma =0;

        for (double i : notas) {
            soma += i;
        }

        System.out.printf("A media foi : %.1f", soma / qtdNotas);
    }
}
