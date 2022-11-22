package Matriz.application;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        //exercicio de exemplo sobre matriz
        Scanner entrada = new Scanner(System.in);

        int n = entrada.nextInt();

        //criando uma matriz (n por n )

        //tipo// arranjo bidimensionais (2 - [] []) // nome da matriz // [linhas][colunas]
        int [][] matriz = new int[n][n];

        //percorrendo a matriz inteira
        for(int i =0;i <n;i++){//percorrendo as linhas da matriz
            //para cada linha vou ter um outro for percorrendo a coluna
            for(int j=0;j<n;j++){
                //matriz[i]-linha i[j] coluna j
                matriz[i][j] = entrada.nextInt(); // adicionando na linha e na coluna da matriz
            }
        }
    }
}
