package Matriz.Exercicio.application;

import java.util.Arrays;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        /*
        Fazer um programa para ler dois números inteiros M e N, e depois ler uma matriz de M linhas e N colunas contendo
        número inteiros, podendo haver repetições. Em seguida, ler um número inteiro x que pertence à matriz. Para
        cada ocorrência de x, mostrar os valores à esquerda, acima, à direita e a abaixo de X, quando houver.
         */

        Scanner entrada = new Scanner(System.in);
        System.out.print("Quantidade de linhas: ");
        int m = entrada.nextInt();//linhas
        System.out.print("Quantidades de colunas :");
        int n = entrada.nextInt();//colunas



        int [][] matriz = new int[m][n];

        //percorrendo a matriz para adicionar os numeros
        for(int i =0;i<matriz.length;i++){//percorrendo as linhas
            for(int j =0; j< matriz[i].length;j++){//percorrendo colunas
                matriz[i][j] = entrada.nextInt();
            }
        }

//        //mostrando a matriz
//        for(int i =0;i<matriz.length;i++){//percorrendo as linhas
//            for(int j =0; j< matriz[i].length;j++){//percorrendo colunas
//                System.out.print(matriz[i][j] + " ");
//            }
//            System.out.println(" ");//mudar de linha
//        }

        System.out.print("Qual o numero que deseja ver a posição : ");
        int x = entrada.nextInt();

        //percorrendo a matriz e pegando a sua posição com o numero escolhido mostrando qual linha e coluna está
        for(int i=0;i< matriz.length;i++){
            for (int j =0;j< matriz[i].length;j++){
                if(matriz[i][j] == x){
                    //System.out.println("Posição = " + i + "," + j);
                    System.out.println("Posição = " + "Linha : " + i + "," +"Coluna : " + j);

                    //mostrando se tem outros numeros perto deles
                    if(j > 0 ){// se for maior significa que tem numero x tem outro numero a esquerda dele
                        System.out.println("Esquerda : " + matriz[i][j -1]);
                    }
                    if(i > 0){//se i for maior, significa que x tem um numero acima dele
                        System.out.println("Acima : " + matriz[i -1] [j]);
                    }
                    if(j < matriz[i].length -1){// se j for menor que o numero de colunas menos um, segnifica que o x verificado tem outro numero no lado
                        System.out.println("Direita : " + matriz[i][j+1]);
                    }
                    if (i < matriz.length -1 ){//se i for menor que o numero de linhas menos um, significa que x tem outro numero abaixo dele
                        System.out.println("Abaixo: "+ matriz[i +1] [j]);
                    }
                }
            }
        }

    }
}
