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

        //diagonal principal //obs :  os valores da linha e da coluna são os mesmo (pelo menos nesse exemplo)
        System.out.println("Diagonal principal : ");
        for(int i =0;i<n;i++){
            //liha i e coluna i
            System.out.print(matriz[i][i] + " ");
        }
        int negativo = 0;
        //percorrendo linhas(i) e colunas(j)
        for(int i =0;i<matriz.length; i++){//na quantidade de linhas pode fazer assim
            for (int j=0;j<matriz[i].length;j++){//na quantidade de colunas pode fazer assim
                if(matriz[i][j]< 0){ //if algum numero da linha i e coluna j for negativo
                    negativo ++;
                }
            }
        }
        System.out.println();
        System.out.println("Quantidade de Numeros Negativos : " + negativo);
    }
}
